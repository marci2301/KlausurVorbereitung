import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class KundenTableModel extends AbstractTableModel {
	
	String[] columnNames = {"Kundennr.", "Name", "Kundenkarte"};
	ArrayList<Kunde> kundenliste = new ArrayList<Kunde>();
	
	public KundenTableModel(ArrayList<Kunde> kundenliste) {
		this.kundenliste = kundenliste;		
	}
	
	public String getColumnName(int col) {
		return columnNames[col];
	}
	
	@Override
	public int getRowCount() {
		return kundenliste.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int row, int col) {
		
		switch(col) {
		case 0: return kundenliste.get(row).getKundenNr();
		case 1: return kundenliste.get(row).getName();
		case 2: return kundenliste.get(row).isHatKundenkarte();
		}
		return null;
	}
	
	public void setValueAt(Object value, int row, int col) {
		
		Kunde k = kundenliste.get(row);
		
		switch(col) {
		
		case 0: k.setKundenNr((Integer)value);
				break;
		case 1: k.setName((String)value);
				break;
		case 2: k.setHatKundenkarte((Boolean)value);
				break;
		}
		
	}
	
	public Class getColumnClass(int col) {
		return getValueAt(0, col).getClass();
	}
	
	public boolean isCellEditable(int row, int col) {
		if(col == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void addKunde(Kunde k) {
		kundenliste.add(k);
	}
	
	public void addKunde(int kundennr, String name, boolean kundenkarte) {
		kundenliste.add(new Kunde(kundennr, name, kundenkarte));
		this.fireTableDataChanged();
	}
	
	public void removeKunde(int row) {
		kundenliste.remove(row);
		this.fireTableDataChanged();
	}
}
