import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUIConversor extends JFrame {

    private JPanel mainPanel;
    private JLabel labelTitulo1, labelTitulo2;
    private JComboBox<String> comboboxMoneda1, comboboxMoneda2;
    private JLabel labelCantidad, labelValorConvertido, labelMonedaConvertida;
    private JTextField jTextFieldCantidadMoneda, item4;
    private JButton btnConvertir;


    public GUIConversor(){
        super("Conversor de monedas");

        labelTitulo1 = new JLabel("Convertir");
        add(labelTitulo1);

        comboboxMoneda1 = new JComboBox<>();
        comboboxMoneda1.addItem("Pesos Colombianos");
        comboboxMoneda1.addItem("Dolares");
        comboboxMoneda1.addItem("Euros");
        comboboxMoneda1.addItem("Libras");
        comboboxMoneda1.addItem("Yen Japones");
        comboboxMoneda1.addItem("Won Surcoreano");
        comboboxMoneda1.setMaximumSize(new Dimension(Integer.MAX_VALUE,
                comboboxMoneda1.getMinimumSize().height));
        add(comboboxMoneda1);

        labelTitulo2 = new JLabel("a");
        labelTitulo2.setBounds(20,2,20,2);
        add(labelTitulo2);

        comboboxMoneda2 = new JComboBox<>();
        comboboxMoneda2.addItem("Pesos Colombianos");
        comboboxMoneda2.addItem("Dolares");
        comboboxMoneda2.addItem("Euros");
        comboboxMoneda2.addItem("Libras");
        comboboxMoneda2.addItem("Yen Japones");
        comboboxMoneda2.addItem("Won Surcoreano");
        comboboxMoneda2.setMaximumSize(new Dimension(Integer.MAX_VALUE, comboboxMoneda2.getMinimumSize().height));
        add(comboboxMoneda2);

        // Que cambie solo dependiendo de la seleccion
        labelCantidad = new JLabel("Cantidad a convertir:", SwingConstants.CENTER);
        labelCantidad.setMaximumSize(new Dimension(Integer.MAX_VALUE, labelCantidad
                .getPreferredSize().height));
        add(labelCantidad);

        jTextFieldCantidadMoneda = new JTextField("");
        jTextFieldCantidadMoneda.setMaximumSize(new Dimension(Integer.MAX_VALUE,
                jTextFieldCantidadMoneda.getMinimumSize().height));
        add(jTextFieldCantidadMoneda);

        btnConvertir = new JButton("Convertir");
        btnConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String moneda1Seleccionada = String.valueOf
                        (comboboxMoneda1.getSelectedItem());
                String moneda2Seleccionada = String.valueOf
                        (comboboxMoneda2.getSelectedItem());

                int cantidadMoneda = 0;
                try {
                    cantidadMoneda = Integer.parseInt(jTextFieldCantidadMoneda.getText());
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Ingresa una cantidad valida a convertir");
                }

                labelValorConvertido.setText("$" + String.valueOf
                        (Conversor.convertirA(moneda1Seleccionada, moneda2Seleccionada,
                                cantidadMoneda)));
                labelMonedaConvertida.setText((String) comboboxMoneda2.getSelectedItem());
            }
        });
        btnConvertir.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnConvertir.setMaximumSize(new Dimension(Integer.MAX_VALUE, btnConvertir
                .getPreferredSize().height));
        add(btnConvertir);

        labelValorConvertido = new JLabel(" " ,SwingConstants.CENTER);
        add(labelValorConvertido);

        labelMonedaConvertida = new JLabel("");
        labelMonedaConvertida.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        add(labelMonedaConvertida);

        // Deberia poner otro pero si no este es el que sirve
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    }

    public int devolverValor() {

        return 5;
    }
}
