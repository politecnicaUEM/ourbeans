package ourbeans;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import eJavaBeans.EcheckBOX;
import eJavaBeans.CopyOfEbutton;
import eJavaBeans.CopyOfEcheckBOX;
import java.awt.GridLayout;
import java.awt.Color;
import eJavaBeans.Ebutton;
import eJavaBeans.ETextLabel;
import javax.swing.BoxLayout;

public class InitGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitGUI frame = new InitGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InitGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		CopyOfEcheckBOX copyOfEcheckBOX = new CopyOfEcheckBOX();
		contentPane.add(copyOfEcheckBOX);
		
		ETextLabel textLabel = new ETextLabel();
		copyOfEcheckBOX.add(textLabel);
		
		Ebutton ebutton = new Ebutton();
		copyOfEcheckBOX.add(ebutton);
	}
}
