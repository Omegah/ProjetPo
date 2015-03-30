package affichage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BoolFrame extends JFrame{

	public BoolFrame() throws IOException {
			BufferedImage myImage;
	        myImage = ImageIO.read(new File("/home/b/berthiey/git/ProjetPo/ProjetPo/bin/bg2.png"));
	        this.setContentPane(new Panel(myImage));
	        this.setTitle("Projet Bool");
	        this.setSize(500, 462);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	        this.setVisible(true);
	        
	        JTextArea Text= new JTextArea();
	        Text.setOpaque(false);
	        Text.setForeground(new Color(102, 153, 255));
	        Text.setBounds(90,130, 320, 180);
	        Text.setBorder(BorderFactory.createMatteBorder(
                    1, 1, 1, 1, new Color(102, 153, 255)));
	        Text.setVisible(true);
	       
	        final JButton BQuit = new JButton("Execution");
	        BQuit.setBounds(180, 350, 130, 50);
	        BQuit.setBackground(new Color(0, 51, 102));
	        BQuit.setForeground(new Color(102, 153, 255));
	        BQuit.setVisible(true);

	        this.add(Text);
	        this.add(BQuit);

	        
	        this.repaint();
	}

}
