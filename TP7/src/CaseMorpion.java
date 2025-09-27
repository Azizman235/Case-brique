import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaseMorpion {
    
    private JButton B;
    private Game G;
    private int x;
    private int y;
    private JOptionPane O;
    private static java.util.List<JButton> allButtons = new java.util.ArrayList<>();
    public CaseMorpion(int x,int y,Game G)
    {
        this.x=x;
        this.y=y;
        this.G=G;
        this.B=new JButton("");
        this.O=new JOptionPane();
        allButtons.add(B);
        B.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                G.jouer(x,y);
                if(G.getIndiquateur()==1)
                {
                    B.setText("X");
                }
                if(G.getIndiquateur()==2)
                {
                    B.setText("O");
                }
                if(G.matchNull() || G.gagner()){
                    finPartie();
                }
                if(G.matchNull()){
                    O.showMessageDialog(null,"le Match est null");
                }
                else if(G.gagner()){
                    O.showMessageDialog(null,"Le joueur 1 a gangés !");
                }
               /* else if(G.gagner() && G.getIndiquateur()==1){
                    O.showMessageDialog(null,"le joueur 2 a gangné !");
                }*/
                B.setEnabled(false);
            }
        });
       
    }
    public JButton getB() {
        return B;
    }

    /**
     * Desactives tous les cases du booto stockées dans le variable static allButons
     */
    public void finPartie() {
        for (JButton Bouton: allButtons) {
           Bouton.setEnabled(false);
        }
    }
}
