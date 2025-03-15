import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Server extends JFrame {
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	
	public Server () {
		super("Instant Messenger");
		
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
		chatWindow.setEditable(false);
		add(new JScrollPane(chatWindow));
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public void startRunning () {
		try {
			server = new ServerSocket(3241, 100);
			do {
				try {
					waitforConnection();
					setupStreams();
					whileChatting();
				}
				catch (EOFException eofException) {
					showMessage("\n Server ended the connection! ");
				}
				finally {
					closeCrap();
				}
			} while (true);
		}
		catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
	private void waitforConnection () throws IOException {
		showMessage("Waiting for someone to connect... \n");
		connection = server.accept();
		showMessage("You are connected to " +connection.getInetAddress().getHostName());
	}
	private void setupStreams () throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Streams are now set up! \n");
	}
	private void whileChatting () throws IOException {
		String connected = " You are now connected ";
		sendMessage(connected);
		ableToType(true);
		
		do {
			try {
				connected = (String) input.readObject();
				showMessage("\n" +connected);
			}
			catch (ClassNotFoundException classNotFoundException) {
				showMessage("\n I don't know what the user sent!");
			}
		} while (!connected.equals("SERVER - END"));
	}
	private void closeCrap () {
		showMessage("\n Closing Connections... \n");
		ableToType(false);
		
		try {
			output.close();
			input.close();
			connection.close();
		}
		catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
	private void sendMessage (String sendMessage) {
		try {
			output.writeObject("SERVER - " +sendMessage);
			output.flush();
			
			showMessage("\nSERVER - " +sendMessage);
		}
		catch (IOException ioException) {
			chatWindow.append("\n ERROR: Unexpectedly could not send the message");
		}
	}
	private void showMessage (final String showMessage) {
		SwingUtilities.invokeLater(
				new Runnable () {
					public void run () {
						chatWindow.append(showMessage);
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