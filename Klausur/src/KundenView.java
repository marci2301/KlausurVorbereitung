import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class KundenView extends JFrame {
	
	private static final long serialVersionUID = 6145906262167854647L;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;
	private JButton btnAdd;
	private JButton btnDelete;
	private JButton btnEnd;
	private JTable table;
	private KundenTableModel ktm;
	private static ArrayList<Kunde> kundenliste;
	
	public KundenView() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		menuBar = new JMenuBar();
		menu = new JMenu("About");
		menuItem = new JMenuItem("Über...");
		
		menu.add(menuItem);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "\u00a9 Marcel Müller", "Copyright", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		btnAdd = new JButton("Add");
		panel.add(btnAdd);
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ktm.addKunde(000000, "-", false);
			}
		});
		
		btnDelete = new JButton("Delete");
		panel.add(btnDelete);
		
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				kundenliste.remove(table.getSelectedRow());
				ktm.fireTableDataChanged();
			}
		});
		
		btnEnd = new JButton("End");
		panel.add(btnEnd);
		
		btnEnd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		kundenliste = new ArrayList<Kunde>();
		ktm = new KundenTableModel(kundenliste);
		table.setModel(ktm);
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		super.setVisible(true);
	}

	/**
	 * 
	 */

	public static void main(String[] args) {
		
		KundenView kv = new KundenView();
		kundenliste.add(new Kunde(123, "name", true));	
		
	}

}
