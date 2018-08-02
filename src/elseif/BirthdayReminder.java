
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 3rd";
		String dadsBirthday = "March 4th";
		String myBirthday = "May 27th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		int request = JOptionPane.showOptionDialog(null, "Which birthday do you want?", "Choose", 0, JOptionPane.QUESTION_MESSAGE, null, new String [] {"Mine", "Mom", "Dad"}, null);
		// 3. Print out what the user typed
		System.out.println(request);
		// 4. if user asked for "mom"
		if (request == 1) {
			System.out.println(momsBirthday);
		} else
			//print mom's birthday
		// 5. if user asked for "dad"
		if (request == 2) {
			System.out.println(dadsBirthday);
		} else
			// print dad's birthday
		// 6. if user asked for your name
		if (request == 0) {
			System.out.println(myBirthday);
		} else {
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		System.out.println("Sorry, i don't remember that person's birthday!");
		}
	} 
}
