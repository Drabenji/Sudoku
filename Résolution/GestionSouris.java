import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
* Observateur GestionSouris de la souris.
* @version 1.1
* @author Benjamin Bribant, Nell Telechea
*/
public class GestionSouris implements MouseListener {

    /**
    *Variable qui va récupérer la grille de jeu
    */
    private Grille g;

    /**
    *Fenêtre précédente
    */
    private JFrame fenetre;

    /**
    * Constructeur de GestionSouris.
    *
    * @param z       La grille de jeu
    * @param fenetre Fenêtre précédente
    */
    public GestionSouris (Grille z, JFrame fenetre) {
        this.g=z;
        this.fenetre=fenetre;
    }

    public void mouseClicked(MouseEvent evenement){
        MyPanel etiquette;
        etiquette=(MyPanel)evenement.getSource();
        new ChoixData(this.g,etiquette.getI(),etiquette.getJ(), this.fenetre);
    }        //On récupère les coordonnées de la case cliquée.
    
    public void mouseEntered(MouseEvent evenement){
        MyPanel etiquette;
        etiquette=(MyPanel)evenement.getSource();
        etiquette.setBackground(Color.GRAY);      
    }        //Début du survol de la case, on change le fond en gris.
    
    public void mouseExited(MouseEvent evenement){
        MyPanel etiquette;
        etiquette=(MyPanel)evenement.getSource();
        etiquette.setBackground(Color.WHITE);       
    }        //Fin du survol, on remet le fond en blanc.
    
    public void mousePressed(MouseEvent evenement){}
    public void mouseReleased(MouseEvent evenement){}
} 
