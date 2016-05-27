import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Graphics Interface of Othello game
 * @author Benoit Laban - Veyre Aurelien
 *
 */
public class IHM extends JFrame implements ActionListener{
		
	private  JPanel pan  = new JPanel();
	private JButton Jouer = new JButton("Jouer");
	private JButton Quitter = new JButton("Quitter");
		
	public IHM()
	{
		JFrame frame = new JFrame();
		frame.add(new JLabel(new ImageIcon("G:\\git\\miniProjetOthello\\image\\othello.png")));
		frame.setTitle("Othello");
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		//int height = (int)dimension.getHeight();
		int width  = (int)dimension.getWidth();
		frame.setSize(/*width,height*/ 600,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		pan.setLayout(null);
		pan.setBackground(Color.white);
		Jouer.setBounds(244, 330, 100, 50);
		Jouer.setBackground(Color.LIGHT_GRAY);
		Quitter.setBounds(500, 420, 75, 35);
		Quitter.setBackground(Color.LIGHT_GRAY);
		pan.add(Jouer);
		pan.add(Quitter);
		frame.add(pan);
		Quitter.addActionListener(this);
		Jouer.addActionListener(this);
		
		public void actionPerformed(ActionEvent arg0) {
			  if(arg0.getSource() == Quitter)
			    pan.setToolTipText("Vous avez cliqué sur le Quitter");

			  if(arg0.getSource() == Jouer)
				  pan.setToolTipText("Vous avez cliqué sur le Joueur");
		}
	}
}

