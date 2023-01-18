package myPackage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class GUI  implements ActionListener 
{

	private DossierBancaire m_dossier;
	private JTextField m_saisie_depot;
	private JTextField m_saisie_retrait;
	private JTextField m_display_solde;
	private JButton m_remunerer;
	// Constructeur
    public GUI(DossierBancaire d)
    {
    	//Dossier
    	m_dossier 			= d;
    	
    	//Element saisie depot
        m_saisie_depot = new JTextField (20);
        m_saisie_depot.addActionListener(this);
		
		//Element saisie retrait
        m_saisie_retrait = new JTextField (20);
        m_saisie_retrait.addActionListener(this);
        
        //Element declenchement remuneration
        m_remunerer = new JButton("OK");
        m_remunerer.addActionListener(this);

        
    	//Element affichage solde
        m_display_solde = new JTextField (20);
        m_display_solde.setEditable(false); //Pour eviter d'ecrire
        m_display_solde.setText(Double.toString(m_dossier.get_solde()));
        
        
        //Initialisation de la fenetre generale
        JFrame frame = new JFrame("Editeur dossier bancaire");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Geometrie de repartition des elements graphiques
        frame.setLayout(new GridLayout(4,2)); //3 lignes and 2 columns
        //First line
        frame.getContentPane().add(new JLabel("Depot"));
        frame.getContentPane().add(m_saisie_depot);
        frame.getContentPane().add(new JLabel("Remunerer"));
        frame.getContentPane().add(m_remunerer);     
        frame.getContentPane().add(new JLabel("Retrait"));
        frame.getContentPane().add(m_saisie_retrait);
        frame.getContentPane().add(new JLabel("Solde"));
        frame.getContentPane().add(m_display_solde);
        frame.pack(); //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        frame.setVisible(true); //Shows this Window
        
    }
    // Callbacks for buttons: dispatch processings
    public void actionPerformed(ActionEvent e)
    {
    	if( e.getSource() == m_saisie_depot )
    	{
    		double depot_value=Float.parseFloat(m_saisie_depot.getText());
    		m_dossier.deposer(depot_value);
    		m_saisie_depot.setText("");
    	}
    	if( e.getSource() == m_remunerer )
    	{
    		m_dossier.remunerer();
    	}
		if( e.getSource() == m_saisie_retrait )
    	{
    		double retrait_value=Float.parseFloat(m_saisie_retrait.getText());
    		try {
				
				if(m_dossier._cc.get_solde()-retrait_value<0)
				{
					JFrame jFrame = new JFrame();
					JOptionPane.showMessageDialog(jFrame, "Votre solde est insuffisant");
				}
				m_dossier.retirer(retrait_value);
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		m_saisie_retrait.setText("");
    	}
    	m_display_solde.setText(Double.toString(m_dossier.get_solde()));  	
    }
}
