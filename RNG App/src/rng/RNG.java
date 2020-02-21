/**
 * This Java Application/Applet is just a simple little side project of mine.
 * Not intended to be taken seriously so I figured I'd have as much fun that I can with this
 *  while still trying to practice proper coding etiquette and technique with documentation.
 *  
 *  As for this purpose of the Applet itself, just intended to be a simple RNG machine with
 *   perhaps a few easter-eggs sprinkled about intended for friends.
 *   
 *  P.S. Universe if you're in here reading this shit get out you fuck.
 * 
 * @author NES
 */

package rng;

import secretes.*; 
import noapplet.NoApplet;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
//import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;

import java.awt.Dimension;
//import java.awt.Graphics;
import java.net.URI;
import java.awt.Desktop;


//frame.setIconImage(
//		getImage(getClass().getClassLoader().getResource("/resources/images/dice-clipart.png")));

@SuppressWarnings("serial")
public class RNG extends NoApplet{
//	public RNGApplet(){	
//	}
	
//	public class CounterEvent extends NoApplet {
	public RNG() {
		this(new String[0]);
		}
	
	Color highlight_color = Color.CYAN;
	int in_color_button = 0;
	int in_gen_button = 0;
	
	
	public RNG(String[] params) {
		super(params);

		//creation of all components needed for this applet
		JLabel label_min = new JLabel("Min:  ");
	    JLabel label_max = new JLabel("Max:  ");
	    JTextField display_min = new JTextField(7);    //size of the text box
	    JTextField display_max = new JTextField(7);
	    JButton gen_button = new JButton("Generate");
	    
	    JPanel content = new JPanel(new BorderLayout());
	    
	    //panel with min label and min textield
	    JPanel base = new JPanel(new BorderLayout());
        base.add(label_min, BorderLayout.LINE_START);
        base.add(display_min, BorderLayout.LINE_END);
        content.add(base, BorderLayout.PAGE_START);
        
        //panel with max label and max textfield
        JPanel height = new JPanel(new BorderLayout());
        height.add(label_max, BorderLayout.LINE_START);
        height.add(display_max, BorderLayout.LINE_END);
        content.add(height, BorderLayout.CENTER);
        
        //final panel with the generate button
        JPanel for_genB = new JPanel();
        for_genB.add(gen_button);
        content.add(for_genB, BorderLayout.SOUTH);
        
        //draws the content with all pannels into the actual applet window
        add(content);
        
        JButton color_button = new JButton("Choose Highlight Color");
        add(color_button);
        
//        revalidate();
//        repaint();
        
//        content.getRootPane().setDefaultButton(gen_button);
//        gen_button.requestFocus();
        
        
        
        // mouse listener for the generate button to change colors, when you move the mouse in
        gen_button.addMouseListener(new MouseAdapter(){
        	private Color defaultColor;
        	
        	public void  mouseEntered(MouseEvent e){
        		if(defaultColor == null) 
        			defaultColor = ((JButton)e.getSource()).getBackground();
        		
        		((JButton) e.getSource()).setBackground(highlight_color); // Color change of button here
        		
        		if(dark_color(highlight_color) == true) 
        			gen_button.setForeground(Color.WHITE);
        	}
        	public void mouseExited(MouseEvent e) {
        		((JButton) e.getSource()).setBackground(defaultColor);
        		gen_button.setForeground(Color.BLACK);
        	}
        });
        
        // mouse listener to color the 'choose highlight button' too
        color_button.addMouseListener(new MouseAdapter(){
        	private Color defaultColor;
        	
        	public void  mouseEntered(MouseEvent e){
        		if(defaultColor == null) 
        			defaultColor = ((JButton)e.getSource()).getBackground();
        		
        		((JButton) e.getSource()).setBackground(highlight_color); // Color change of button here
        		
        		if(dark_color(highlight_color) == true) 
        			color_button.setForeground(Color.WHITE);
        	}
        	public void mouseExited(MouseEvent e) {
        		((JButton) e.getSource()).setBackground(defaultColor);
        		color_button.setForeground(Color.BLACK);
        	}
        });
        
        // action listner for when the generate button is clicked and will do special things for given inputs
        gen_button.addActionListener(event -> {
        	String min = display_min.getText();
        	String max = display_max.getText();
        	
        	if(min.equalsIgnoreCase("cunto") && max.equalsIgnoreCase("nes")){
        		JOptionPane.showMessageDialog(null,
        				"Ha, what a beaner! He doesnt have a dad!",
        				"NES", JOptionPane.PLAIN_MESSAGE);
        		
        		try {
        			Desktop desktop = Desktop.getDesktop();
        			desktop.browse(new URI("https://www.youtube.com/watch?v=lrqDQBdbJpk"));
        			showStatus("Trying to Find Dad...");
        		} catch (Exception e) {
        			e.printStackTrace();
        		} 
        		catch (Error e) {
        			e.printStackTrace();
        		}
        	}	
        	
        	else if(min.equalsIgnoreCase("amatts") && max.equalsIgnoreCase("929")){
        		JOptionPane.showMessageDialog(null,
        				"Meth-head catholic boy down in the taint of the US", // ok boomer clip 
        				"Amatts", JOptionPane.PLAIN_MESSAGE);
        		
        		try {
        			Desktop desktop = Desktop.getDesktop();
        			desktop.browse(new URI("https://www.youtube.com/watch?v=mqrk8twolR0"));
        			showStatus("Launching...");
        		} catch (Exception e) {
        			e.printStackTrace();
        		} 
        		catch (Error e) {
        			e.printStackTrace();
        		}
        	}
        	
        	else if(min.equalsIgnoreCase("cap") && max.equalsIgnoreCase("53")){
        		JOptionPane.showMessageDialog(null,
        				"The best embodiment for depression you can ever find but never really want",
        				"Cap", JOptionPane.PLAIN_MESSAGE);
        		
        		try {
        			Desktop desktop = Desktop.getDesktop();
        			desktop.browse(new URI("https://giphy.com/gifs/disney-skeleton-rwMofHqKKMLHW"));
        			showStatus("Launching...");
        		} catch (Exception e) {
        			e.printStackTrace();
        		} 
        		catch (Error e) {
        			e.printStackTrace();
        		}
        	}
        	
        	else if(min.equalsIgnoreCase("tv") && max.equalsIgnoreCase("junkie")){
        		JOptionPane.showMessageDialog(null,
        				"Oh you know",
        				"Tv", JOptionPane.PLAIN_MESSAGE);
        		
        		try {
        			Desktop desktop = Desktop.getDesktop();
        			desktop.browse(new URI("https://media.discordapp.net/attachments/371651981040943106/659486137500303387/image0.gif"));
        			showStatus("Launching...");
        		} catch (Exception e) {
        			e.printStackTrace();
        		} 
        		catch (Error e) {
        			e.printStackTrace();
        		}	    		   
        	}
        	
        	else if(min.equalsIgnoreCase("pigeon") && max.equalsIgnoreCase("boy")){
        		JOptionPane.showMessageDialog(null,
        				"You will never be anything more than a snack for Silvester you Tweety Bird fuck",
        				"Raven", JOptionPane.PLAIN_MESSAGE);
        		
        		try {
        			Desktop desktop = Desktop.getDesktop();
        			desktop.browse(new URI("https://giphy.com/gifs/season-14-the-simpsons-14x10-l2JdU6Tfl4R0O49vq"));
        			showStatus("Launching...");
        		} catch (Exception e) {
        			e.printStackTrace();
        		} 
        		catch (Error e) {
        			e.printStackTrace();
        		}
        	}
        	
        	else if(min.equalsIgnoreCase("universe") && max.equalsIgnoreCase("fuck")){
        		JOptionPane.showMessageDialog(null,
        				"Change your fucking profile pic!", // refer to the picture
        				"Universe", JOptionPane.PLAIN_MESSAGE);
        	
        		try {
        			Desktop desktop = Desktop.getDesktop();
        			desktop.browse(new URI("https://cdn.discordapp.com/attachments/464232471492558848/576588058737246228/image0.jpg"));
        			showStatus("Launching...");
        		} catch (Exception e) {
        			e.printStackTrace();
        		} 
        		catch (Error e) {
        			e.printStackTrace();
        		}
        	}
        	
//        	secretes.Secretes.easter_eggs(min,max);
        	
        	// actual rng element of the applet
//        	else{
        	if(min == null || max == null) {
        		JOptionPane.showMessageDialog(null, 
        				"Please make sure both entries have a value",
        				"RNG: ERROR", JOptionPane.WARNING_MESSAGE);
        	}
        	else {
        		int min_n = Integer.parseInt(min);
        		int max_n = Integer.parseInt(max);
        		
        		if(min_n > max_n) {
        			JOptionPane.showMessageDialog(null, 
        					"Please make sure the 'Min' value is less than the 'Max' value",
        					"RNG: ERROR", JOptionPane.WARNING_MESSAGE);
        		}
        		else {
        			int x = (int)(Math.random() * ((max_n-min_n)+1)) + min_n;
        			
        			if(x == 69) {
        				showStatus("Nice");
        			}
        			else if(x == 420){
        				showStatus("Blaze Dat Dank Kush Bro");
        			}
        			else if(x == 1337){
        				showStatus("Yeet! Poggers In Chat My Guy");
        			}
        			else if(x == 666){
        				showStatus("RIP and Tear");
        			}
        			else if(x != 69 || x != 420 || x != 1337 || x != 666){
        				showStatus("");
        			}
        			UIManager.put("OptionPane.minimumSize",new Dimension(25,50));
        			JLabel rng_label = new JLabel(""+x+"");
        			rng_label.setFont(new Font("Arial", Font.BOLD, 20));
//	    		   	JOptionPane.showMessageDialog(null,label,"ERROR",JOptionPane.WARNING_MESSAGE);
        			
        			JOptionPane.showMessageDialog(null, rng_label,
        					"RNG", JOptionPane.PLAIN_MESSAGE);
        		}	
        	}
        	
        	System.out.println("Random Number Generated");
        });
        

        
        // creation of the dialog box to 
        color_button.addActionListener(event -> {
        	
        	
        	Color[] color_choices = { Color.BLACK, Color.DARK_GRAY, Color.GRAY, Color.LIGHT_GRAY, 
        			Color.BLUE, Color.CYAN, Color.GREEN, Color.YELLOW, Color.ORANGE, 
        			Color.RED, Color.PINK, Color.MAGENTA, Color.WHITE};
        	
        	String[] color_string_choices = {"Black", "Dark Gray", "Gray", "Light Gray",
        			"Blue", "Cyan", "Green", "Yellow", "Orange", "Red", "Pink", "Magenta", "White"};
        	
        	String start_location = color_string_choices[0];
        	
        	String input = (String) JOptionPane.showInputDialog(null, "Color",
        			"Choose a Color", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                                // default
                                                                                // icon
        			color_string_choices, // Array of choices
        			start_location); // Initial choice
        	
        	System.out.println("color chosen: "+input);
            
            if(input.equalsIgnoreCase("black")){
            	highlight_color = color_choices[0];	
            }
            else if(input.equalsIgnoreCase("dark gray")) {
            	highlight_color = color_choices[1]; 
            }
            else if(input.equalsIgnoreCase("gray")) {
            	highlight_color = color_choices[2]; 
            }
            else if(input.equalsIgnoreCase("light gray")) {
            	highlight_color = color_choices[3]; 
            }
            else if(input.equalsIgnoreCase("blue")) {
            	highlight_color = color_choices[4];
//            	start_location = color_string_choices[4];
//            	gen_button.setForeground(Color.WHITE);
            }
            else if(input.equalsIgnoreCase("cyan")) {
            	highlight_color = color_choices[5]; 
            }
            else if(input.equalsIgnoreCase("green")) {
            	highlight_color = color_choices[6]; 
            }
            else if(input.equalsIgnoreCase("yellow")) {
            	highlight_color = color_choices[7]; 
            }
            else if(input.equalsIgnoreCase("orange")) {
            	highlight_color = color_choices[8]; 
            }
            else if(input.equalsIgnoreCase("red")) {
            	highlight_color = color_choices[9]; 
            }
            else if(input.equalsIgnoreCase("pink")) {
            	highlight_color = color_choices[10]; 
            }
            else if(input.equalsIgnoreCase("magenta")) {
            	highlight_color = color_choices[11]; 
            }
            else if(input.equalsIgnoreCase("white")) {
            	highlight_color = color_choices[12]; 
            }    
            
        });
	}
	
	public boolean dark_color(Color hl_color) {
		if(hl_color == Color.BLACK) 
			return true;
		else if(hl_color == Color.DARK_GRAY)
			return true;
		else if(hl_color == Color.BLUE)
			return true;
		else if(hl_color == Color.RED)
			return true;
		else 
			return false;
	}
	
//	public boolean colorb_dark_color(Color hl_color) {
//		if(hl_color == Color.BLACK) 
//			return true;
//		else if(hl_color == Color.DARK_GRAY)
//			return true;
//		else if(hl_color == Color.BLUE)
//			return true;
//		else if(hl_color == Color.RED)
//			return true;
//		else 
//			return false;
//	}
	
	public static void main(String[] args) {
		new RNG(new String[] {"width=200", "height=150"}).run();
//		Test Commit on PC Desktop
	}
}
