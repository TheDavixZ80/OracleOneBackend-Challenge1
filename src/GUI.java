import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI extends JFrame {

    private JLabel item1;
    private JComboBox item2;
    private JButton item3;
    private JButton button1;
    private JComboBox comboBox1;


    public GUI(){
        super("Challenge Java #1");
        setLayout(new FlowLayout());

        item1 = new JLabel("Seleccione una opción de conversión");
        add(item1);

        item2 = new JComboBox();
        item2.addItem("Conversor de moneda");
        item2.addItem("Conversor de temperatura");
        add(item2);

        item3 = new JButton("Seleccionar");
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(item2.getSelectedItem());

                GUIConversor newGUI2 = new GUIConversor();
                newGUI2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                newGUI2.setSize(220,300);
                newGUI2.setResizable(false);
                newGUI2.setVisible(true);

            }
        });
        add(item3);
        //asddsa

    }
}
