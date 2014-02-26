import static javax.swing.JOptionPane.*;

import javax.swing.ImageIcon;
public class Adventure {
	private ImageIcon dungeon = new ImageIcon("res/dungeon.png");
	
	public Adventure(){
		showMessage("You wake up in a haze\n"
				+ "Not knowing where you are.");
		switch(showInputMessage("You see three doors in front of you and a window above a chest by the wall.\nWhat do you do?",new String[]{"Go through door number 1","Go through door number 2","Go through door number 3","Climb over the chest out the window","Open the chest to find out whats inside"})){
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3 :
			break;
		case 4:
			break;
			default:
				showMessage("The coding monkeys got something wrong");
				break;
		}
		
		
		
	}
	
	public void showMessage(String message, ImageIcon image){
		showMessageDialog(null, message,"Castle Crawler",1,image);
	}
	public void showMessage(String message){
		showMessageDialog(null, message,"Castle Crawler",1);
	}
	public int showInputMessage(String message, String[] options){
		String input = (String) showInputDialog(null, message, "Castle Crawler", PLAIN_MESSAGE, null, options, options[0]);
		for (int i = 0; i < options.length; i++) {
			if(input.equals( options[i])){
				return i;
			}
		}
		return -1;
	}
	
	public int showInputMessage(String message, String[] options,ImageIcon image){
		String input = (String) showInputDialog(null, message, "Castle Crawler", PLAIN_MESSAGE, image, options, options[0]);
		for (int i = 0; i < options.length; i++) {
			if(input.equals( options[i])){
				return i;
			}
		}
		return -1;
	}
		
}
