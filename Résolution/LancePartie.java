import javax.swing.*;
import java.awt.*;

/**
 * La classe LancePartie va ouvrir une fenêtre qui donne le choix entre une grille initialisée vide ou remplie à partir d'un fichier.
 * @version 1.1
 * @author Benjamin Bribant, Nell Telechea
 */

public class LancePartie extends JPanel {
    /**
    * Bouton pour choisir de résoudre automatiquement.
    */
    private JButton vide;

    /**
    * Bouton pour choisir de résoudre manuellement.
    */
    private JButton existant;

    /**
    * Fenêtre de choix.
    */
    private JFrame fenetre;

    /**
    * Constructeur de la classe LancePartie qui va ouvrir la fenêtre avec les boutons.
    */
    public LancePartie() {
        
        super();
		this.fenetre = new JFrame("SUDOKU");
        FlowLayout gestionnaire = new FlowLayout(FlowLayout.CENTER);
        this.fenetre.setLayout(gestionnaire);
    
    	this.fenetre.setSize(500, 500);
    	this.fenetre.setLocation(100, 100);
    	this.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        this.vide = new JButton("Mode automatique");            //Création du bouton mode automatique.
        this.existant = new JButton("Mode manuel");             //Création du bouton mode manuel.
        this.fenetre.add(this.vide);
        this.fenetre.add(this.existant);
        
        ListenerMode listener = new ListenerMode(this.vide, this.existant);         //Observateur des boutons et de la fenêtre.
        //this.fenetre.addWindowListener(listener);
        this.vide.addActionListener(listener);
        this.existant.addActionListener(listener);
		this.fenetre.setVisible(true);
    }
}