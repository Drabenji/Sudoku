import javax.swing.*;
import java.awt.*;

/**
* La classe LanceJeuAuto permet de lancer le mode de résolution automatique.
* @version 1.1
* @author Benjamin Bribant, Nell Telechea
*/

public class LanceJeuAuto extends JPanel{

    /**
    *Variable qui va recevoir le bouton "mode manuel"
    */
    private JButton existant;

    /**
    *Fenêtre précédente
    */
    private JFrame fenetre;

    /**
    *Constructeur de la classe LanceJeuAuto.
    */
    public LanceJeuAuto() {       
        super();
		this.fenetre = new JFrame("SUDOKU");
        FlowLayout gestionnaire = new FlowLayout(FlowLayout.CENTER);
        this.fenetre.setLayout(gestionnaire);
    
    	this.fenetre.setSize(500, 500);
    	this.fenetre.setLocation(100, 100);
    	this.fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        

        this.existant = new JButton("Charger une grille");                          //Création du bouton pour charger une grille.
        this.fenetre.add(this.existant);
        
        ListenerButtonAuto listener = new ListenerButtonAuto(this.existant);        //Observateur du bouton.
        this.existant.addActionListener(listener);
		this.fenetre.setVisible(true);
    }
}