package semana4.GUI;

import javax.swing.*;

public class Tabla extends JFrame {
    public Tabla() {
        setTitle("Tabla de medalleria juegos olimpicos Tokyo 2020");
        String[] encabezados = { "Pais", "Oro", "Plata", "Bronce" };
        String[][] valores = { { "China", "29", "17", "16" }, { "Estados Unidos", "22", "25", "17" },
                { "Japon", "17", "6", "10" } };
        JTable table = new JTable(valores, encabezados);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Tabla();
    }
}