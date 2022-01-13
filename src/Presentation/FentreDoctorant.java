package Presentation;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Persistance.ModelTable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Metier.Doctorant;


public class FentreDoctorant extends JFrame implements ActionListener{

	JTable doctorantTable;
	JScrollPane scrollPane;
	ModelTable doctorants;
	JButton delete;
	JButton addButton;
	JPanel buttons;
	Controleur c;
	
	public  FentreDoctorant(ArrayList<Doctorant> doctorants) {
		super("Liste des Doctorants");
		
		this.setLayout(new BorderLayout());
		buttons = new JPanel();
		buttons.setLayout(new BorderLayout());
		
		delete = new JButton("Delete");
		delete.addActionListener(this);
		
		addButton = new JButton("Add");
		addButton.addActionListener(this);
		
		etudiants = new ModelTable(list);
		etudiantTable = new JTable(etudiants);
		
		etudiantTable.setAutoCreateRowSorter(true);
		
		scrollPane = new JScrollPane(etudiantTable);
		this.add(scrollPane, BorderLayout.CENTER);
		
		buttons.add(delete, BorderLayout.EAST);
		buttons.add(addButton, BorderLayout.WEST);
		
		this.add(buttons, BorderLayout.SOUTH);
	    this.setSize(700, 250);
	    this.setVisible(true);
	    
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == delete) {
				int [] selectedRows = etudiantTable.getSelectedRows();
				for (int row : selectedRows)
					c.supprimerEtudiant(row);
			}
			
			if (e.getSource() == addButton) {

	    		c.ajouterEtudiant();
			}
		}

}
