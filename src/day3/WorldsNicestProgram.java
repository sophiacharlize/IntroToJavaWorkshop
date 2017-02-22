package day3;

import javax.swing.JOptionPane;

public class WorldsNicestProgram {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("What is your name?");
	System.out.println(name);
	JOptionPane.showMessageDialog(null, name+ ", you are a great programmer!");
}
}
