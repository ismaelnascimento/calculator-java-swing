package caculator_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class AppCalculator {

	private JFrame fCalc;
	private JTextField display;
	String symbol;
	double num1, num2, res;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppCalculator window = new AppCalculator();
					window.fCalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public static Double div(Double n1, Double n2) {
		return n1 / n2;
	}
	
	private void initialize() {
		fCalc = new JFrame();
		fCalc.setTitle("Calculadora");
		fCalc.getContentPane().setFont(new Font("Segoe UI Semibold", Font.BOLD, 11));
		fCalc.getContentPane().setLayout(null);
		
		JTextField display = new JTextField();
		display.setEditable(false);
		display.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		display.setText("");
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setBounds(0, 0, 334, 70);
		fCalc.getContentPane().add(display);
		display.setColumns(10);
		
		//
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText()+e.getActionCommand();
				display.setText(num);
			}
		});
		btn_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_7.setBounds(10, 150, 70, 65);
		fCalc.getContentPane().add(btn_7);
		//
		JButton btn_ac = new JButton("AC");
		btn_ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
			}
		});
		btn_ac.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_ac.setBounds(10, 81, 70, 65);
		fCalc.getContentPane().add(btn_ac);
		//
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText()+e.getActionCommand();
				display.setText(num);
			}
		});
		btn_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_4.setBounds(10, 220, 70, 65);
		fCalc.getContentPane().add(btn_4);
		//
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText()+e.getActionCommand();
				display.setText(num);
			}
		});
		btn_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_1.setBounds(10, 290, 70, 65);
		fCalc.getContentPane().add(btn_1);
		
		//
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText()+e.getActionCommand();
				display.setText(num);
			}
		});
		btn_0.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_0.setBounds(10, 360, 150, 65);
		fCalc.getContentPane().add(btn_0);
		
		//
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText()+e.getActionCommand();
				display.setText(num);
			}
		});
		btn_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_2.setBounds(90, 290, 70, 65);
		fCalc.getContentPane().add(btn_2);
		
		//
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText()+e.getActionCommand();
				display.setText(num);
			}
		});
		btn_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_5.setBounds(90, 220, 70, 65);
		fCalc.getContentPane().add(btn_5);
		
		//
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText()+e.getActionCommand();
				display.setText(num);
			}
		});
		btn_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_8.setBounds(90, 150, 70, 65);
		fCalc.getContentPane().add(btn_8);
		
		//
		JButton btn_percentage = new JButton("%");
		btn_percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(display.getText().replace(",", "."));
				display.setText("");
				symbol = e.getActionCommand();
			}
		});
		btn_percentage.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_percentage.setBounds(90, 81, 70, 65);
		fCalc.getContentPane().add(btn_percentage);
		
		//
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText()+e.getActionCommand();
				display.setText(num);
			}
		});
		btn_9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_9.setBounds(170, 150, 70, 65);
		fCalc.getContentPane().add(btn_9);
		
		//
		JButton btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(display.getText().replace(",", "."));
				display.setText("");
				symbol = e.getActionCommand();
			}
		});
		btn_div.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_div.setBounds(170, 81, 70, 65);
		fCalc.getContentPane().add(btn_div);
		
		//
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText()+e.getActionCommand();
				display.setText(num);
			}
		});
		btn_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_6.setBounds(170, 220, 70, 65);
		fCalc.getContentPane().add(btn_6);
		
		//
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText()+e.getActionCommand();
				display.setText(num);
			}
		});
		btn_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_3.setBounds(170, 290, 70, 65);
		fCalc.getContentPane().add(btn_3);
		
		//
		JButton btn_point = new JButton(",");
		btn_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numInput = Double.parseDouble((!display.getText().isEmpty()) ? display.getText() : "0");
				double resto = numInput - Math.floor(numInput);
				
				String num;
				if (resto != 0.0){
					num = display.getText()+e.getActionCommand();
				} else {
					num = "0,";
				}
				
				display.setText(num);
			}
		});
		btn_point.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_point.setBounds(170, 360, 70, 65);
		fCalc.getContentPane().add(btn_point);
		
		//
		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(display.getText().replace(",", "."));
				display.setText("");
				symbol = e.getActionCommand();
			}
		});
		btn_sub.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_sub.setBounds(250, 150, 70, 65);
		fCalc.getContentPane().add(btn_sub);
		
		//
		JButton btn_mult = new JButton("*");
		btn_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(display.getText().replace(",", "."));
				display.setText("");
				symbol = e.getActionCommand();
			}
		});
		btn_mult.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_mult.setBounds(250, 81, 70, 65);
		fCalc.getContentPane().add(btn_mult);
		//
		JButton btn_add = new JButton("+");
		btn_add.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_add.setBounds(250, 220, 70, 65);
		fCalc.getContentPane().add(btn_add);
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(display.getText().replace(",", "."));
				display.setText("");
				symbol = e.getActionCommand();
			}
		});
		//
		JButton btn_result = new JButton("=");
		btn_result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(display.getText().replace(",", "."));
				
				switch(symbol) {
				   case "+":
					  res = num1 + num2;
				      break;
				   case "-":
					  res = num1 - num2;
					  break;
				   case "*":
					  res = num1 * num2;
					  break;
				   case "/":
					  res = num1 / num2;
					  break;
				   case "%":
					  res = (num1 * num2) / 100.0;
					  break;
				   default:
					  res = 0.0;
				}
				 
				display.setText(String.format("%.2f", res));
			}
		});
		btn_result.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_result.setBounds(250, 290, 70, 135);
		fCalc.getContentPane().add(btn_result);
		//
		fCalc.setBounds(100, 100, 350, 480);
		fCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
