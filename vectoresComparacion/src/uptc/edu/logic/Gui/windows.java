package uptc.edu.logic.Gui;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.handler.MessageContext.Scope;

public class windows extends JFrame {

	
	private JScrollPane scroll;
	private JTable tabla;
	private DefaultTableModel modelo;

	
	public windows(){
		
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setBounds(400, 200, 400, 400);;
		this.setVisible(true);
		beginComponents();
		addComponents();
		clean();
	}
	
	
	public void beginComponents(){
		
		modelo = new DefaultTableModel();
		tabla = new JTable(modelo);
		
	}
	
	
	public void addComponents(){	
		String [] encabezado = {"fdsfd","assdf"};
		modelo.setColumnIdentifiers(encabezado);
		this.add(tabla);
	}
	
	public void clean(){
		int files=tabla.getRowCount();
		
		for (int i = 0; i < files; i++) {
			modelo.removeRow(0);
		}
	}
	
	public static void main(String[] args) {
		
		
		windows w = new windows();
	}

}
