import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        JFrame A=new JFrame();
        A.setSize(300,100);
        A.setVisible(true);
        FlowLayout Fl=new FlowLayout();
        A.setLayout(Fl);
        JLabel label=new JLabel("What is your name?");
        JButton Bouton=new JButton("Ok");
        JTextField saisie=new JTextField(30);
        A.add(label);
        A.add(Bouton);
        A.add(saisie);
        Bouton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                System.out.println("voici le nom:"+ event.getSource());
            }
        });
    }
}
