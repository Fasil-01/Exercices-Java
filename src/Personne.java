package src;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import components.buttons.Btn;

class Personne extends JFrame{
    private JPanel contentPane;
    private JTextField nom;
    private JLabel labelNom;
    private JButton btn = new Btn("Inscrire");
    
    public Personne() {
      this.initComponents();
    }

    private void initComponents() {
      this.contentPane = new JPanel();
      this.nom = new JTextField();
      this.setSize(400, 700);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 

      GridBagLayout layout = new GridBagLayout();
      GridBagConstraints gbc = new GridBagConstraints();
      contentPane.setLayout(layout);
      gbc.insets = new Insets(2,10,10,10);
      labelNom = new JLabel("Nom");
      gbc.gridx =0;
      gbc.gridy = 0;
      contentPane.add(labelNom, gbc);
      gbc.gridx =1;
      gbc.gridy = 0;
      gbc.weightx =1;
      gbc.fill  = GridBagConstraints.BOTH;
      
      contentPane.add(nom, gbc);

        gbc.gridx =0;
        gbc.gridy = 1;
        gbc.gridwidth =2;
        btn.setText("Inscrire");
       contentPane.add(btn,gbc);
       this.add(contentPane);

    }
    
    public static void main(String[] args) {
        Personne p = new Personne();
        java.awt.EventQueue.invokeLater(() -> {
            p.setVisible(true);
        });
    } 
}