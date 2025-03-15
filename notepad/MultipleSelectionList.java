import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MultipleSelectionList {
	public static void main (String args[]) {
	MSL selection = new MSL();
	selection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	selection.setSize(200, 300);
	selection.setVisible(true);
	System.out.println("Hi!");
}
}

class MSL extends JFrame {
	private JList LL;
	private JList RL;
	private JButton MB;
	private static String[] chocolates = {"mars bars", "big hit", "twix"};
	public MSL () {
	super("Title");
	setLayout(new FlowLayout());

	LL = new JList(chocolates);
	LL.setVisibleRowCount(3);
	LL.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	add(new JScrollPane(LL));

	MB = new JButton("Move -->");
	MB.addActionListener(
	new ActionListener () {
	public void actionPerformed (ActionEvent event) {
	RL.setListData(LL.getSelectedValues());
}
}
);
	add(MB);

	RL = new JList();	
	RL.setVisibleRowCount(3);
	RL.setFixedCellWidth(59);
	RL.setFixedCellHeight(17);
	add(new JScrollPane(RL));
}
}