import javax.swing.*;

public class MeetingDialog{
	
//============================================================================
	public static void main(String Args[]){
		String name;
		int value;
		int flag = 0;
		
		while(flag != 1){
		name = JOptionPane.showInputDialog(null, "Please enter your name");
		value = JOptionPane.showConfirmDialog(null, "Are you sure your name is " + name, "Please Confirm", JOptionPane.YES_NO_OPTION);
		
		if(value == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "Nice to meet you " + name, "MeetingBot", JOptionPane.INFORMATION_MESSAGE);
			flag += 1;
		}
		else if(value == JOptionPane.NO_OPTION){
			
		}
		}
		
		
	}
//============================================================================

}
