package semana4.GUI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazConBoton extends JFrame {
    static InterfazConBoton ventana = new InterfazConBoton();
    static JPanel miPanel = new JPanel(new GridLayout(4, 1));
    static JLabel resultado = new JLabel();
    static int numero = 0;
    static JTextField entradaTexto = new JTextField();

    private static ActionListener evento = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                numero = Integer.parseInt(entradaTexto.getText());
                numero = numero * numero;
                resultado.setText(String.valueOf(numero));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(
                    ventana,
                    ex.toString(),
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            
        }
    };

    private static void crearLabel() {
        JLabel jLabel = new JLabel("Ingrese numero");
        // jLabel.setLocation(20, 20);
        miPanel.add(jLabel);
    }

    private static void crearEntradaTexto() {
        // entradaTexto.setLocation(120, 140);
        miPanel.add(entradaTexto);
    }

    private static void crearBoton() {
        JButton boton = new JButton("Calcular cuadrado");
        boton.addActionListener(evento);
        miPanel.add(boton);
    }

    private static void mostrarVentana() {
        // miPanel.setLayout(new BoxLayout(ventana, BoxLayout.X_AXIS));
        miPanel.setSize(500, 300);
        crearLabel();
        crearEntradaTexto();
        crearBoton();
        miPanel.add(resultado);
        ventana.add(miPanel);
        ventana.setSize(500, 300);
        ventana.setTitle("Grupo 80 - Ciclo 2");
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // ventana.pack();
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        mostrarVentana();
    }
}
