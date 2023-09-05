import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GUI mygui = new GUI();
        mygui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mygui.setSize(275,180);
        mygui.setResizable(false);
        mygui.setVisible(true);
    }
}