import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window;

@SuppressWarnings("serial")
public class GUI extends JFrame {
	
	private static double[] CF;
	private static String averageFCF;
	
	//private static double[] DF;
	//private static double[] DFCF;

	private JPanel contentPane;
	private JTextField one;
	private JTextField two;
	private JLabel lblNewLabel_1;
	private JTextField three;
	private JLabel lblNewLabel_2;
	private JTextField five;
	private JLabel lblNewLabel_4;
	private JTextField six;
	private JLabel lblNewLabel_5;
	private JButton btnCalculate;
	private JTextField eight;
	private JLabel lblNewLabel_8;
	private JLabel lblEnterCompanyTicker;
	private JTextField ticker;
	private JButton findButton;
	private JTextField four;
	private JButton btnAverageFreeCash;
	private JButton btnAverageGrowthRate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		CF = new double[10];
		setTitle("Intrinsic Value Calculator (Earnings Method)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Average Free Cash Flow ($):");
		lblNewLabel.setBounds(10, 102, 225, 30);
		contentPane.add(lblNewLabel);
		
		one = new JTextField();
		one.setBounds(10, 132, 464, 30);
		contentPane.add(one);
		one.setColumns(10);
		
		two = new JTextField();
		two.setColumns(10);
		two.setBounds(10, 203, 464, 30);
		contentPane.add(two);
		
		lblNewLabel_1 = new JLabel("Average Growth Rate (%):");
		lblNewLabel_1.setBounds(10, 173, 225, 30);
		contentPane.add(lblNewLabel_1);
		
		three = new JTextField();
		three.setColumns(10);
		three.setBounds(10, 272, 464, 30);
		contentPane.add(three);
		
		lblNewLabel_2 = new JLabel("Growth Years (Use 10 years):");
		lblNewLabel_2.setBounds(10, 244, 464, 30);
		contentPane.add(lblNewLabel_2);
		
		five = new JTextField();
		five.setColumns(10);
		five.setBounds(10, 410, 464, 30);
		contentPane.add(five);
		
		lblNewLabel_4 = new JLabel("Percentage Growth into Perpuity after the 10th year (Recommended is 3% or lower):");
		lblNewLabel_4.setBounds(10, 382, 464, 30);
		contentPane.add(lblNewLabel_4);
		
		six = new JTextField();
		six.setColumns(10);
		six.setBounds(10, 479, 464, 30);
		contentPane.add(six);
		
		lblNewLabel_5 = new JLabel("Shares Outstanding:");
		lblNewLabel_5.setBounds(10, 451, 464, 30);
		contentPane.add(lblNewLabel_5);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//average free cash flow
				double avgCF = Double.parseDouble(one.getText().trim());
				//average growth rate
				double avgG = Double.parseDouble(two.getText().trim());
				//discount rate
				double rate = Double.parseDouble(four.getText().trim());
				//percentage growth after 10th Year in perpuity.
				double pRate = Double.parseDouble(five.getText().trim());
				//shares outstanding
				double shares = Double.parseDouble(six.getText().trim());
				
				double[] FCF = new double[] {avgCF*Math.pow(1+avgG/100, 1), avgCF*Math.pow(1+avgG/100, 2), avgCF*Math.pow(1+avgG/100, 3), avgCF*Math.pow(1+avgG/100, 4), avgCF*Math.pow(1+avgG/100, 5), avgCF*Math.pow(1+avgG/100, 6), avgCF*Math.pow(1+avgG/100, 7), avgCF*Math.pow(1+avgG/100, 8), avgCF*Math.pow(1+avgG/100, 9), avgCF*Math.pow(1+avgG/100, 10)};
				double[] DFCF = new double[] {FCF[0]/Math.pow(1+rate/100, 1), FCF[1]/Math.pow(1+rate/100, 2), FCF[2]/Math.pow(1+rate/100, 3), FCF[3]/Math.pow(1+rate/100, 4), FCF[4]/Math.pow(1+rate/100, 5), FCF[5]/Math.pow(1+rate/100, 6), FCF[6]/Math.pow(1+rate/100, 7), FCF[7]/Math.pow(1+rate/100, 8), FCF[8]/Math.pow(1+rate/100, 9), FCF[9]/Math.pow(1+rate/100, 10)};
				
				
				double sumDFCF = Arrays.stream(DFCF).sum();
				
				//present value of the sum of perpetual cash flows
				double numerator = FCF[9]*(1+pRate/100);
				double denominator = (rate-pRate)*Math.pow(1+rate/100, 10);
				double pValue = numerator/(denominator/100);
				
				double intrinsicValue = (sumDFCF + pValue)/shares;
				
				eight.setText(Double.toString(intrinsicValue));
				System.out.println(Arrays.toString(CF) + "\r\n"+Arrays.toString(FCF) + "\r\n"+Arrays.toString(DFCF) + "\r\n" + sumDFCF + "\r\n" + pValue + "\r\n" + shares + "\r\n" + intrinsicValue);
				
				
				
				
				/**
				try {
					double a1 = Double.parseDouble(five.getText().trim());
					double a2 = Double.parseDouble(six.getText().trim());
					double a3 = Double.parseDouble(seven.getText().trim());
					int a4 = Integer.parseInt(eight.getText().trim());
					double a5 = Double.parseDouble(nine.getText().trim());
					
					BookValueMethod c = new BookValueMethod();
					ten.setText(Double.toString(c.IntrinsicValue(a1, a2, a4, a5, a3)));
					
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Input must be valid!");
				}
				*/
				
				/**
				 MESSAGE OUTPUT:
						The intrinsic value per share is 49.22 at 10% annual discount rate.
						At the current price of 75.02 the company may yield 7.76 annually.
				 */
				
			}
		});
		btnCalculate.setBounds(10, 520, 130, 40);
		contentPane.add(btnCalculate);
		
		eight = new JTextField();
		eight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		eight.setColumns(10);
		eight.setBounds(10, 612, 464, 40);
		contentPane.add(eight);
		
		lblNewLabel_8 = new JLabel("Intrinsic Value ($):");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(10, 571, 464, 30);
		contentPane.add(lblNewLabel_8);
		
		lblEnterCompanyTicker = new JLabel("COMPANY TICKER SYMBOL:");
		lblEnterCompanyTicker.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnterCompanyTicker.setBounds(10, 11, 225, 30);
		contentPane.add(lblEnterCompanyTicker);
		
		ticker = new JTextField();
		ticker.setColumns(10);
		ticker.setBounds(10, 40, 225, 40);
		contentPane.add(ticker);
		
		findButton = new JButton("Find");
		findButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = "https://financials.morningstar.com/ratios/r.html?t=";
				String last = "&region=usa&culture=en-US&ownerCountry=USA";
				String symbol = ticker.getText().trim();
				if (symbol.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Field is Empty!");
				}
				else {
					String url = first+symbol+last;
					
					try {
						  Desktop desktop = java.awt.Desktop.getDesktop();
						  //URI oURL1 = new URI("https://www.treasury.gov/resource-center/data-chart-center/interest-rates/Pages/TextView.aspx?data=yield");
						  //desktop.browse(oURL1);
						  URI oURL = new URI(url);
						  desktop.browse(oURL);
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, "Input must be valid!");
						}
				}
			}
		});
		findButton.setBounds(249, 40, 225, 40);
		contentPane.add(findButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("Discount Rate (%):");
		lblNewLabel_2_1.setBounds(10, 313, 464, 30);
		contentPane.add(lblNewLabel_2_1);
		
		four = new JTextField();
		four.setColumns(10);
		four.setBounds(10, 341, 464, 30);
		contentPane.add(four);
		
		btnAverageFreeCash = new JButton("Average Free Cash Flow Calculator");
		btnAverageFreeCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Close JPanel window
				JComponent comp = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(comp);
				win.dispose();
				//open log in GUI
				GUI2 frame = new GUI2();
				frame.setVisible(true);
			}
		});
		btnAverageFreeCash.setBounds(249, 102, 225, 30);
		contentPane.add(btnAverageFreeCash);
		
		btnAverageGrowthRate = new JButton("Average Growth Rate Calculator");
		btnAverageGrowthRate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Close JPanel window
				JComponent comp = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(comp);
				win.dispose();
				//open log in GUI
				GUI3 frame = new GUI3();
				frame.setFCF(CF);
				frame.setAvgFCF(averageFCF);
				frame.setVisible(true);
			}
		});
		btnAverageGrowthRate.setBounds(249, 173, 225, 30);
		contentPane.add(btnAverageGrowthRate);
		
	}
	
	public void setFCF(double f10,double f9,double f8,double f7,double f6,double f5,double f4,double f3,double f2,double f1) {
		CF = new double[]{ f10, f9, f8, f7, f6, f5, f4, f3, f2, f1};
	}
	public void setFCF(double[] f) {
		CF = Arrays.copyOf(f, f.length);
	}
	public double[] getFCF() {
		return CF;
	}
	public void setAverage(String avg) {
		one.setText(avg);
	}
	public void setAvgFCF(String string) {
		averageFCF = string;
	}
	public String getAvgFCF() {
		return averageFCF;
	}
	public void setAvgGrowthRate(String avg) {
		two.setText(avg);
	}
}
