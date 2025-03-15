import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Client extends JFrame {
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String serverIP;
	private Socket connection1;
	
	public Client (String host) {
		super("Client");
		
		serverIP = host;
		
		userText = new JTextField();
		userText.setEditable(false);
		
		userText.addActionListener(
				new ActionListener () {
					public void actionPerformed (ActionEvent event) {
						sendMessage(event.getActionCommand());
						userText.setText("");
					}
				}
				);
		add(userText, BorderLayout.NORTH);
		
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow), BorderLayout.CENTER);
		chatWindow.setEditable(false);
		
		setSize(350, 150);
		setVisible(true);
	}
	public void startRunning () {
		try {
			connectToServer();
			setupStreams();
			whileChatting();
		}
		catch (EOFException eofException) {
			showMessage("\n Client terminated exception! ");
		}
		catch (IOException ioException) {
			ioException.printStackTrace();
		}
		finally {
			closeCrap();
		}
	}
	private void connectToServer () throws IOException {
		showMessage("Waiting for someone to connect... \n");
		connection1 = new Socket(InetAddress.getByName(serverIP), 3241);
		showMessage("You are connected to " +connection1.getInetAddress().getHostName());
	}
	private void setupStreams () throws IOException {
		showMessage("\nYou aren't connected");
		output = new ObjectOutputStream(connection1.getOutputStream());
		showMessage("\nOutput has showed up");
		output.flush();
		showMessage("\nOutput has flushed");
		ableToType(true);
		input = new ObjectInputStream(connection1.getInputStream());
		showMessage("\nYou are now connected \n");
	}
	private void whileChatting () throws IOException {
		ableToType(true);
		
		do {
			try {
				message = (String) input.readObject();
				showMessage("\n" +message);
			}
			catch (ClassNotFoundException classNotFoundException) {
				showMessage("\n I don't know what the user sent!");
			}
		} while (!message.equals("CLIENT - END"));
	}
	private void closeCrap () {
		showMessage("\nClosing Connections... \n");
		ableToType(false);
		
		try {
			output.close();
			input.close();
			connection1.close();
		}
		catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
	private void sendMessage (String sentMessage) {
		try {
			output.writeObject("CLIENT - " + sentMessage);
			output.flush();
			showMessage("\nCLIENT - " + sentMessage);
		}
		catch (IOException ioException) {
			chatWindow.append("\nSomething messed up when the message was sent");
		}
	}
	private void showMessage (final String displayMessage) {
		SwingUtilities.invokeLater(
				new Runnable () {
					public void run () {
						chatWindow.append(displayMessage);
					}
				}
				);
	}
	private void ableToType (final boolean tof) {
		SwingUtilities.invokeLater(
				new Runnable () {
					public void run () {
						userText.setEditable(tof);
					}
				}
				);
	}
}