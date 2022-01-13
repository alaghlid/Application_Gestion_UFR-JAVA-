package Presentation;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class HomeWindow extends JFrame {
	
	JButton parcoursScolaire,personnel, doctorats, publications, soutenances, formations, modules, statistiques ;
	JPanel innerPanel, containerPanel;
	final JLabel header = new JLabel("Menu principal\n Panneau de gestion de l'UFR") ;
	public HomeWindow() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
		
		this.setLayout(new BorderLayout());
		parcoursScolaire = new JButton("Parcours Scolaire des étudiants");
		personnel = new JButton("Personnel");
		doctorats = new JButton("Doctorats");
		publications = new JButton("Publications");
		soutenances = new JButton("Soutenances");
		formations = new JButton("Formations");
		modules = new JButton("Modules");
		
		innerPanel = new JPanel();
		innerPanel.setLayout(new GridLayout(4,2));
		innerPanel.add(parcoursScolaire);
		innerPanel.add(personnel);
		innerPanel.add(doctorats);
		innerPanel.add(publications);
		innerPanel.add(soutenances);
		innerPanel.add(formations);
		innerPanel.add(modules);
		
		
		containerPanel = new JPanel();
		containerPanel.setLayout(new BorderLayout());
		containerPanel.add(innerPanel, BorderLayout.CENTER);
		statistiques = new JButton("Statistiques");
		containerPanel.add(statistiques, BorderLayout.SOUTH);
		
		this.add(containerPanel, BorderLayout.CENTER);
		this.add(header, BorderLayout.NORTH);
		this.setSize(700, 250);
	    this.setVisible(true);
	    
	    //this.actionAjouter();
	}/*   
	    private void actionAjouter() {
		   this.ajouterButton.addActionListener(new ActionListener() {
	
		    	@Override
		    	public void actionPerformed(ActionEvent e) {
		    		// TODO Auto-generated method stub

		    		Etudiant etudiant = new Etudiant(prenom.getText(), nom.getText(), Integer.parseInt(numero.getText()), email.getText(), Boolean.parseBoolean(sexe.getText()));
		    		c.ajouterEtudiant2(etudiant);
		    		dispose();
		    	}
		    });
	    }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HomeWindow f = new HomeWindow();
		

	}
	
}
