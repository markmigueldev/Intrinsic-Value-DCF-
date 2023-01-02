import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GUI2 extends JFrame {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 frame = new GUI2();
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
	public GUI2() {
		setTitle("Average Free Cash Flow Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 200);
		getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(82, 47, 50, 25);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(142, 47, 50, 25);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(202, 47, 50, 25);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(262, 47, 50, 25);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(564, 47, 50, 25);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(504, 47, 50, 25);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(444, 47, 50, 25);
		getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(384, 47, 50, 25);
		getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(322, 47, 50, 25);
		getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(624, 47, 50, 25);
		getContentPane().add(textField_10);
		
		JLabel lblNewLabel = new JLabel("-10");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(82, 11, 50, 25);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Year");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(10, 11, 50, 25);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("FCF");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setBounds(10, 47, 50, 25);
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("-9");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(142, 11, 50, 25);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("-8");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(202, 11, 50, 25);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("-7");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(262, 11, 50, 25);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("-6");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(322, 11, 50, 25);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("-5");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(382, 11, 50, 25);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("-4");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(442, 11, 50, 25);
		getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("-3");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(502, 11, 50, 25);
		getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_6 = new JLabel("-2");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(564, 11, 50, 25);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_1_2 = new JLabel("-1");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(624, 11, 50, 25);
		getContentPane().add(lblNewLabel_1_2);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Calculator c = new Calculator();
					double avg = c.averageFreeCashFlow(Double.parseDouble(textField_1.getText().trim()), Double.parseDouble(textField_2.getText().trim()), Double.parseDouble(textField_3.getText().trim()), Double.parseDouble(textField_4.getText().trim()), Double.parseDouble(textField_5.getText().trim()), Double.parseDouble(textField_6.getText().trim()), Double.parseDouble(textField_7.getText().trim()), Double.parseDouble(textField_8.getText().trim()), Double.parseDouble(textField_9.getText().trim()), Double.parseDouble(textField_10.getText().trim()));
					textField.setText(Double.toString(avg));
					
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Input must be valid!");
				}
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCalculate.setBounds(684, 47, 90, 25);
		getContentPane().add(btnCalculate);
		
		JLabel lblNewLabel_6_1 = new JLabel("Average Free Cash Flow : ");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_1.setBounds(10, 83, 230, 30);
		getContentPane().add(lblNewLabel_6_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(202, 88, 472, 25);
		getContentPane().add(textField);
		
		JButton btnUse = new JButton("USE");
		btnUse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					//check
					Double.parseDouble(textField.getText().trim());
					
					//open log in GUI
					GUI frame = new GUI();
					
					//set fcf
					frame.setFCF(Double.parseDouble(textField_1.getText().trim()), Double.parseDouble(textField_2.getText().trim()), Double.parseDouble(textField_3.getText().trim()), Double.parseDouble(textField_4.getText().trim()), Double.parseDouble(textField_5.getText().trim()), Double.parseDouble(textField_6.getText().trim()), Double.parseDouble(textField_7.getText().trim()), Double.parseDouble(textField_8.getText().trim()), Double.parseDouble(textField_9.getText().trim()), Double.parseDouble(textField_10.getText().trim()));
					//set avgFCF
					frame.setAverage(textField.getText().trim());
					frame.setAvgFCF(textField.getText().trim());
					
					//test
					System.out.println(Arrays.toString(frame.getFCF())+ "\r\n" + frame.getAvgFCF());
					
					//Close JPanel window
					JComponent comp = (JComponent) e.getSource();
					Window win = SwingUtilities.getWindowAncestor(comp);
					win.dispose();
					
					frame.setVisible(true);
					
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Input must be valid!");
				}
			}
				
		});
		btnUse.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnUse.setBounds(684, 89, 90, 25);
		getContentPane().add(btnUse);
	}
}
