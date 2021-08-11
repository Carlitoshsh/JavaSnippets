package semana4.GUI;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class InterfazGrafica {

    public static void mostrarVentana() {
        JFrame jFrame = new JFrame("Mi ventana");
        jFrame.setVisible(true);
        jFrame.setSize(450, 450);
        // Centrar ventana
        // Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // jFrame.setLocation(
        // dim.width/2-jFrame.getSize().width/2,
        // dim.height/2-jFrame.getSize().height/2
        // );
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Creo un nuevo panel y lo agrego al frame
        JPanel jpanel = new JPanel(new GridLayout(3, 3));
        jpanel.setBackground(new Color(178, 236, 255));
        JPanel jpanel2 = new JPanel();
        jpanel2.setBackground(Color.LIGHT_GRAY);
        JPanel jpanel3 = new JPanel();
        jpanel3.setBackground(new Color(178, 255, 236));
        JPanel jpanel4 = new JPanel();
        jpanel4.setBackground(new Color(255, 198, 178));
        JPanel jpanel5 = new JPanel();
        jpanel5.setBackground(Color.WHITE);
        jpanel.add(jpanel2);
        jpanel.add(jpanel3);
        jpanel.add(jpanel4);
        jpanel.add(jpanel5);
        jFrame.add(jpanel);

        JLabel jlabel = new JLabel("Hola mundo!");
        jpanel5.add(jlabel);

        JLabel jlabel4 = new JLabel("Panel4");
        jpanel4.add(jlabel4);

        JLabel jlabel2 = new JLabel("Panel 2");
        JTextField jtextField = new JTextField("Mundo");
        jpanel2.add(jlabel2);
        jpanel2.add(jtextField);

        JLabel jlabel3 = new JLabel("Panel 3");
        JTextArea jTextArea = new JTextArea("Hola");
        jpanel3.add(jlabel3);
        jpanel3.add(jTextArea);
    }

    public static void main(String[] args) {
        mostrarVentana();
    }
}
