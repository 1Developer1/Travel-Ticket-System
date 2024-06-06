package prolab2.proje;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ProLab2Proje {
    public static void main(String[] args) {    
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
        BaslangıcPanel baslangıcPanel = new BaslangıcPanel();
        baslangıcPanel.setVisible(true);   
    }
}
