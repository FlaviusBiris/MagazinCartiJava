import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;
public class magazinCarti extends Object{
	public static int k1 = 0;
	public static int k2 = 0;
	public static int k3 = 0;
	public static int k4 = 0;
	public static int k5 = 0;
	public static int k6 = 0;
	public static int total = 0;
	public static String produse = "";
	public static String date = "";
	public static boolean isMenuOpen = false;
	public static boolean isCartOpen = false;
	public static boolean isCheckoutOpen = false;
	public static boolean isCartEmpty = true;
	public static void main(String args[]){
		JFrame frame = new JFrame("magazin");
		//MENU
		ImageIcon menujpg = new ImageIcon("D:\\Java\\MagazinCarti\\menu.png");
		Image scaledMenu = menujpg.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		JLabel menuButton = new JLabel(new ImageIcon(scaledMenu));
		
		JLabel menu = new JLabel();
		
		JButton cart = new JButton("Cart");
		cart.setBounds(0, 100, 200, 50);
		JButton checkout = new JButton("Checkout");
		checkout.setVisible(false);
		checkout.setBounds(0,150, 200, 50);
		
		JTextArea cartArea = new JTextArea("Your cart is Empty");
		cartArea.setBounds(200, 0, 560, 670);
		cartArea.setVisible(false);
		cartArea.setBackground(Color.GRAY);
		cartArea.setEditable(false);
		
		JPanel Checkout = new JPanel();
		Checkout.setBounds(200, 0, 560, 670);
		Checkout.setVisible(false);
		JButton submit = new JButton("Submit");
		JLabel name = new JLabel("Name:");
		JTextArea nameText = new JTextArea();
		name.setBounds(50, 100, 100, 50);
		nameText.setBounds(160, 100, 300, 50);
		JLabel eMail = new JLabel("E-Mail:");
		JTextArea eMailText = new JTextArea();
		eMail.setBounds(50, 160, 100, 50);
		eMailText.setBounds(160, 160, 300, 50);
		JLabel phone = new JLabel("Phone number:");
		JTextArea phoneText = new JTextArea();
		phone.setBounds(50, 220, 100, 50);
		phoneText.setBounds(160, 220, 300, 50);
		JLabel adress = new JLabel("Adress:");
		JTextArea adressText = new JTextArea();
		adress.setBounds(50, 280, 100, 50);
		adressText.setBounds(160, 280, 300, 50);
		submit.setBounds(50, 340, 200, 50);
		Checkout.add(name);
		Checkout.add(nameText);
		Checkout.add(eMail);
		Checkout.add(eMailText);
		Checkout.add(phone);
		Checkout.add(phoneText);
		Checkout.add(adress);
		Checkout.add(adressText);
		Checkout.add(adressText);
		Checkout.add(submit);
		
		
		JFrame bon = new JFrame("Bon");
		bon.setSize(300, 600);
		JTextArea finalProducts = new JTextArea();
		finalProducts.setBounds(0,0,300,600);
		bon.setVisible(false);
		bon.add(finalProducts);
		
		menu.add(cart);
		menu.add(checkout);
		
		
		Checkout.setLayout(null);
		//MENU
		
		
		
		
		
		
		
		//BOOKS
		ImageIcon jpg1 = new ImageIcon("D:\\Java\\MagazinCarti\\MonaLisa.jpg");
		Image scaledImage = jpg1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		JLabel image1 = new JLabel(new ImageIcon(scaledImage));
		JButton image1but = new JButton("Mona Lisa: 50");
		
		ImageIcon jpg2 = new ImageIcon("D:\\Java\\MagazinCarti\\BruceD.jpg");
		Image scaledImage2 = jpg2.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		JLabel image2 = new JLabel(new ImageIcon(scaledImage2));
		JButton image2but = new JButton("Ce s-a intamplat cu tine: 30");
		
		ImageIcon jpg3 = new ImageIcon("D:\\Java\\MagazinCarti\\ChrisWhitaker.png");
		Image scaledImage3 = jpg3.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		JLabel image3 = new JLabel(new ImageIcon(scaledImage3));
		JButton image3but = new JButton("Incepem cu sfarsitul: 35");
		
		ImageIcon jpg4 = new ImageIcon("D:\\Java\\MagazinCarti\\EricEmmanuel.jpg");
		Image scaledImage4 = jpg4.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		JLabel image4 = new JLabel(new ImageIcon(scaledImage4));
		JButton image4but = new JButton("Paradisuri pierdute: 30");
		
		ImageIcon jpg5 = new ImageIcon("D:\\Java\\MagazinCarti\\LisaJewell.png");
		Image scaledImage5 = jpg5.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		JLabel image5 = new JLabel(new ImageIcon(scaledImage5));
		JButton image5but = new JButton("Noaptea in care a disparut: 25");
		
		ImageIcon jpg6 = new ImageIcon("D:\\Java\\MagazinCarti\\SharonMaas.jpg");
		Image scaledImage6 = jpg6.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		JLabel image6 = new JLabel(new ImageIcon(scaledImage6));
		JButton image6but = new JButton("Fiica Lutierului: 40");
		
		frame.setSize(760, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//BOOKS
		
		
		
		//MENUBUTTONS
		cart.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(isCartOpen == false){
					isCartOpen = true;
					if(isCheckoutOpen == true){
						Checkout.setVisible(false);
						isCheckoutOpen = false;
					}
					image2.setVisible(false);
					image2but.setVisible(false);
					image3.setVisible(false);
					image3but.setVisible(false);
					image5.setVisible(false);
					image5but.setVisible(false);
					image6.setVisible(false);
					image6but.setVisible(false);
					checkout.setVisible(true);
					
					cartArea.setVisible(true);
					
					String cartText = "";
					if(isCartEmpty == true){
						cartArea.setText("Your cart is empty!");
					}
					else{
						if(k1 != 0){
							cartArea.setText(cartText + Integer.toString(k1)+" Mona Lisa \n");
							cartText = cartArea.getText();
					}
						if(k2 != 0){
							cartArea.setText(cartText+Integer.toString(k2)+" Ce s-a intamplat cu tine \n");
							cartText = cartArea.getText();
						}
						if(k3 != 0){
							cartArea.setText(cartText+Integer.toString(k3)+" Incepem cu sfarsitul \n");
							cartText = cartArea.getText();
						}
						if(k4 != 0){
							cartArea.setText(cartText+Integer.toString(k4)+" Paradisuri pierdute \n");
							cartText = cartArea.getText();
						}					
						if(k5 != 0){
							cartArea.setText(cartText+Integer.toString(k5)+" Noaptea in care a disparut \n");
							cartText = cartArea.getText();
						}
						if(k6 != 0){
							cartArea.setText(cartText+Integer.toString(k6)+" Fiica Lutierului \n");
							cartText = cartArea.getText();
						}
						cartArea.setText(cartText + "\n\n Total: " + Integer.toString(total));
						produse = cartArea.getText();
					}
				}
				else{
					isCartOpen = false;
					cartArea.setVisible(false);
					image2.setVisible(true);
					image2but.setVisible(true);
					image3.setVisible(true);
					image3but.setVisible(true);
					image5.setVisible(true);
					image5but.setVisible(true);
					image6.setVisible(true);
					image6but.setVisible(true);
					checkout.setVisible(false);
					
				}
					
			}
		});
		
		checkout.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(isCheckoutOpen == false){
					isCheckoutOpen = true;
					if(isCartOpen == true){
						isCartOpen = false;
						cartArea.setVisible(false);
					}
						image2.setVisible(false);
						image2but.setVisible(false);
						image3.setVisible(false);
						image3but.setVisible(false);
						image5.setVisible(false);
						image5but.setVisible(false);
						image6.setVisible(false);
						image6but.setVisible(false);
						Checkout.setVisible(true);
				}
				else{
						isCheckoutOpen = false;
						checkout.setVisible(false);
						image2.setVisible(true);
						image2but.setVisible(true);
						image3.setVisible(true);
						image3but.setVisible(true);
						image5.setVisible(true);
						image5but.setVisible(true);
						image6.setVisible(true);
						image6but.setVisible(true);
						Checkout.setVisible(false);
				}
			}
		});
		
		
		submit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				date = date+"\n"+nameText.getText();
				date = date+"\n"+eMailText.getText();
				date = date+"\n"+phoneText.getText();
				date = date+"\n"+adressText.getText();
				
				finalProducts.setText(produse+"\n"+date);
				bon.setVisible(true);
			}
		});
		//MENUBUTTONS
		
		
		
		//Menu
		menu.setBounds(0, 0, 200, 670);
		menu.setVisible(false);
		menu.setOpaque(true);
		menu.setBackground(Color.white);
		menuButton.setBounds(0, 0, 50, 50);
		menuButton.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				if(isMenuOpen == false){
					image1.setVisible(false);
					image1but.setVisible(false);
					image4.setVisible(false);
					image4but.setVisible(false);
					isMenuOpen = true;
					menu.setVisible(true);
					checkout.setVisible(false);
				}
				else{
					image1.setVisible(true);
					image1but.setVisible(true);
					image4.setVisible(true);
					image4but.setVisible(true);
					if(isCartOpen){
						isCartOpen = false;
						cartArea.setVisible(false);
						image2.setVisible(true);
						image2but.setVisible(true);
						image3.setVisible(true);
						image3but.setVisible(true);
						image5.setVisible(true);
						image5but.setVisible(true);
						image6.setVisible(true);
						image6but.setVisible(true);
					}
					if(isCheckoutOpen == true){
						isCheckoutOpen = false;
						Checkout.setVisible(false);
						image2.setVisible(true);
						image2but.setVisible(true);
						image3.setVisible(true);
						image3but.setVisible(true);
						image5.setVisible(true);
						image5but.setVisible(true);
						image6.setVisible(true);
						image6but.setVisible(true);
					}
					isMenuOpen = false;
					menu.setVisible(false);
					checkout.setVisible(false);
				}
			}
		});
		//Menu
		
		//Carte1
		image1.setBounds(50, 50, 150, 150);
		image1but.setBounds(50, 220, 150, 50);
		image1but.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(isCartEmpty == true){
					isCartEmpty = false;
				}
				total+=50;
				k1++;
			}
		});
		//Carte1
		
		//Carte2
		image2.setBounds(300, 50, 150, 150);
		image2but.setBounds(300, 220, 150, 50);
		image2but.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(isCartEmpty == true){
					isCartEmpty = false;
				}
				total+=30;
				k2++;
			}
		});
		//Carte2
		
		//Carte3
		image3.setBounds(550, 50, 150, 150);
		image3but.setBounds(550, 220, 150, 50);
		image3but.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(isCartEmpty == true){
					isCartEmpty = false;
				}
				total+=35;
				k3++;
			}
		});
		//Carte3
		
		//Carte4
		image4.setBounds(50, 370, 150, 150);
		image4but.setBounds(50, 540, 150, 50);
		image4but.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(isCartEmpty == true){
					isCartEmpty = false;
				}
				total+=30;
				k4++;
			}
		});
		//Carte4
		
		//Carte5
		image5.setBounds(300, 370, 150, 150);
		image5but.setBounds(300, 540, 150, 50);
		image5but.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(isCartEmpty == true){
					isCartEmpty = false;
				}
				total+=25;
				k5++;
			}
		});
		//Carte5
		
		//Carte6
		image6.setBounds(550, 370, 150, 150);
		image6but.setBounds(550, 540, 150, 50);
		image6but.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(isCartEmpty == true){
					isCartEmpty = false;
				}
				total+=40;
				k6++;
			}
		});
		//Carte6
		
		
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(menuButton);
		frame.add(image1);
		frame.add(image1but);
		frame.add(image2);
		frame.add(image2but);
		frame.add(image3);
		frame.add(image3but);
		frame.add(image4);
		frame.add(image4but);
		frame.add(image5but);
		frame.add(image5);
		frame.add(image6);
		frame.add(image6but);
		frame.add(menu);
		frame.add(cartArea);
		frame.add(Checkout);
	}
	
}