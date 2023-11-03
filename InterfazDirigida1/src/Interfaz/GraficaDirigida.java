package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

public class GraficaDirigida {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("Galleta");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraficaDirigida window = new GraficaDirigida();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GraficaDirigida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 64));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[65px][9px][][48px][47px][101px]", "[14px][][14px][][][23px][][][][][]"));
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cancel");
			}
		});
		
		JLabel lblNewLabel = new JLabel("Me llamo Rodrigo Jimenez");
		frame.getContentPane().add(lblNewLabel, "cell 3 3,alignx center,aligny top");
		
		JLabel lblNewLabel_1 = new JLabel("Viernes 17:10");
		frame.getContentPane().add(lblNewLabel_1, "cell 3 4,alignx right,aligny top");
		btnNewButton.setBackground(new Color(128, 128, 255));
		frame.getContentPane().add(btnNewButton, "cell 2 9,alignx left,aligny top");
		
		JButton btnNewButton_1 = new JButton("Galleta del Dia");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Galleta");
			}
		});
		btnNewButton_1.setBackground(new Color(128, 128, 255));
		frame.getContentPane().add(btnNewButton_1, "cell 4 9,alignx left,aligny top");
	}
}
