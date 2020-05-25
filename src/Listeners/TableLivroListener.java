package Listeners;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class TableLivroListener implements TableModelListener {

	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Oce é o bixao mesmo hein!");
		
	}

}
