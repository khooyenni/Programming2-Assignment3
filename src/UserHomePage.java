import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserHomePage frame = new UserHomePage();
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
	public UserHomePage() {
		setTitle("KYN Grocery Store");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\khooy\\Downloads\\315765f2f24666ff852e2630eef9e660.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1205, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8, true));
		panel_1.setBounds(339, 78, 402, 248);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabelGrocery = new JLabel("");
		Image photo6 = new ImageIcon(this.getClass().getResource("/Shop.gif")).getImage();
		lblNewLabelGrocery.setBounds(10, 12, 380, 225);
		lblNewLabelGrocery.setIcon(new ImageIcon(photo6));
		panel_1.add(lblNewLabelGrocery);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(120, 500, 426, 108);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton CustomerRegistrationButton = new JButton("Register");
		CustomerRegistrationButton.setBounds(10, 11, 404, 89);
		panel_2.add(CustomerRegistrationButton);
		CustomerRegistrationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration CusReg = new CustomerRegistration(); //calling another frame/window
				CusReg.setModalExclusionType(null);
	            CusReg.setVisible(true);
			}
		});
		Image photo1 = new ImageIcon(this.getClass().getResource("/cart1.png")).getImage();
		Image n1photo = photo1.getScaledInstance(80, 80, 1);
		CustomerRegistrationButton.setIcon(new ImageIcon(n1photo));
		CustomerRegistrationButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		CustomerRegistrationButton.setBackground(new Color(255, 240, 245));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setLayout(null);
		panel_3.setBounds(120, 374, 426, 108);
		contentPane.add(panel_3);
		
		JButton ProductDescriptionbutton = new JButton("Product Description");
		ProductDescriptionbutton.setBounds(11, 10, 404, 89);
		panel_3.add(ProductDescriptionbutton);
		ProductDescriptionbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDescription ProductDes = new ProductDescription(); //calling another frame/window
				ProductDes.setModalExclusionType(null);
				ProductDes.setVisible(true);
			}
		});
		Image photo2 = new ImageIcon(this.getClass().getResource("/Product.png")).getImage();
		Image n2photo = photo2.getScaledInstance(80, 80, 60);
		ProductDescriptionbutton.setIcon(new ImageIcon(n2photo));
		ProductDescriptionbutton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		ProductDescriptionbutton.setBackground(new Color(230, 230, 250));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setLayout(null);
		panel_4.setBounds(605, 374, 413, 108);
		contentPane.add(panel_4);
		
		JButton Orderbutton = new JButton("Place Order");
		Orderbutton.setBounds(12, 10, 391, 88);
		panel_4.add(Orderbutton);
		Orderbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaceOrder POrder = new PlaceOrder(); //calling another frame/window
				POrder.setModalExclusionType(null);
				POrder.setVisible(true);
			}
		});
		Image photo3 = new ImageIcon(this.getClass().getResource("/cash.png")).getImage();
		Image n3photo = photo3.getScaledInstance(50, 50, 50);
		Orderbutton.setIcon(new ImageIcon(n3photo));
		Orderbutton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		Orderbutton.setBackground(new Color(255, 240, 245));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setLayout(null);
		panel_5.setBounds(605, 500, 413, 108);
		contentPane.add(panel_5);
		
		JButton AboutButton = new JButton("About Us");
		AboutButton.setBounds(12, 10, 388, 88);
		panel_5.add(AboutButton);
		AboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground CBackground = new CompanyBackground(); //calling another frame/window
				CBackground.setModalExclusionType(null);
				CBackground.setVisible(true);
				
			}
		});
		Image photo4 = new ImageIcon(this.getClass().getResource("/FAQ.png")).getImage();
		Image n4photo = photo4.getScaledInstance(50, 50, 50);
		AboutButton.setIcon(new ImageIcon(n4photo));
		AboutButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		AboutButton.setBackground(new Color(230, 230, 250));
		

		JLabel lblBackground = new JLabel("");
		Image photo7 = new ImageIcon(this.getClass().getResource("/Background4.png")).getImage();
		Image n7photo = photo7.getScaledInstance(1092, 767, 150);
		lblBackground.setIcon(new ImageIcon(n7photo));
		lblBackground.setBounds(0, 0, 1200, 664);
		contentPane.add(lblBackground);
		
		
	}
}
