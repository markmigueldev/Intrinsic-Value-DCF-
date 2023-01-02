import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Window;
import java.util.Arrays;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GUI3 extends JFrame {

	private static double[] FCF;
	@SuppressWarnings("unused")
	private static String averageFCF;
	
	private JPanel contentPane;
	private JTextField two;
	private JTextField textField_2;
	private JTextField one;
	private JTextField four;
	private JTextField three;
	private JButton btnCalculate_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI3 frame = new GUI3();
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
	public GUI3() {
		
		
		setTitle("Average Growth Rate Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Past");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(110, 11, 100, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Current");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(224, 11, 100, 25);
		contentPane.add(lblNewLabel_1);
		
		two = new JTextField();
		two.setColumns(10);
		two.setBounds(224, 47, 100, 25);
		contentPane.add(two);
		
		JLabel lblNewLabel_2_1 = new JLabel("Net Income ($):");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setBounds(10, 47, 100, 25);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Average Growth Rate :");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setBounds(10, 170, 200, 25);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 193, 314, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Year:");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2.setBounds(10, 83, 50, 25);
		contentPane.add(lblNewLabel_2_1_2);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String y2 = one.getText().trim();
					String y1 = two.getText().trim();
					String x2 = three.getText().trim();
					String x1 = four.getText().trim();
					
					
					Calculator c = new Calculator();
					//c.averageGrowthRate(FRAMEBITS, ERROR, ALLBITS, ABORT)
					double result = c.averageGrowthRate(Double.parseDouble(y1), Double.parseDouble(y2), Integer.parseInt(x1), Integer.parseInt(x2));
					textField_2.setText(Double.toString(result));
					
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Input must be valid!");
				}
			}
		});
		btnCalculate.setBounds(110, 119, 214, 40);
		contentPane.add(btnCalculate);
		
		one = new JTextField();
		one.setColumns(10);
		one.setBounds(110, 47, 100, 25);
		contentPane.add(one);
		
		four = new JTextField();
		four.setColumns(10);
		four.setBounds(224, 83, 100, 25);
		contentPane.add(four);
		
		three = new JTextField();
		three.setColumns(10);
		three.setBounds(110, 83, 100, 25);
		contentPane.add(three);
		
		btnCalculate_1 = new JButton("USE");
		btnCalculate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//check
					Double.parseDouble(textField_2.getText().trim());
					
					//Close JPanel window
					JComponent comp = (JComponent) e.getSource();
					Window win = SwingUtilities.getWindowAncestor(comp);
					win.dispose();
					//open log in GUI
					GUI frame = new GUI();
					frame.setFCF(FCF);
					frame.setAverage(averageFCF);
					frame.setAvgGrowthRate(textField_2.getText().trim());
					
					System.out.println(Arrays.toString(frame.getFCF())+ "\r\n" + frame.getAvgFCF());
					
					frame.setVisible(true);
					
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Input must be valid!");
				}
				
			}
		});
		btnCalculate_1.setBounds(10, 234, 314, 40);
		contentPane.add(btnCalculate_1);
	}
	
	public void setFCF(double[] f) {
		FCF = Arrays.copyOf(f, f.length);
	}
	public double[] getFCF() {
		return FCF;
	}
	public void setAvgFCF(String s) {
		averageFCF = s;
	}

}
