//import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Morpion {
    public static void main(String[] args) {
        Game Jeu=new Game(2);
        JFrame J=new JFrame();
        J.setSize(700,300);
        JPanel G=new JPanel(new GridLayout(3,3));
        for(int i=0;i<3;++i)
        {
            for(int j=0;j<3;++j)
            {
                CaseMorpion Case= new CaseMorpion(i, j, Jeu);
                G.add(Case.getB());
     
            }
        }
        
        J.add(G);
        J.setVisible(true);
        
        /*  Jeu.jouer(0,0);
        Jeu.jouer(2,2);
        Jeu.jouer(0,1);
        Jeu.jouer(1,2);
        Jeu.jouer(0,2);
        Jeu.jouer(2,1);
        Jeu.jouer(1,1);
        Jeu.jouer(1,0);
        //Jeu.jouer();
        Jeu.gagner();*/

    }
}
