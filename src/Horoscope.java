import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String starSign = JOptionPane.showInputDialog("What's your zodiac sign?");
	if (starSign.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "Here is your horoscope for today:");
		JOptionPane.showMessageDialog(null, "Show those who don't believe it that you can learn something new and be good at it today.\nThere are those around you who dont believe you can learn something new and be good at it.\nWhatever this is and whatever area of your life this refers to, show them how wrong they are today!\nApart from how great it will be to see the looks of amazement on their faces, you'll be getting a lot out of this personally.\nYou'll be learning a new skill and opening up new doors.");
	} else 
	if (starSign.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "Here is your horoscope for today:");
		JOptionPane.showMessageDialog(null, "You'll be feeling vulnerable and sensitive today and this could lead you to be clingy with someone.\nTry to redirect your feelings into something positive and deal with your vulnerability as best you can.\nIf you act possessive with this person you are going to drive them away from you, so find the trust you have and give them some space to breathe.");
	} else
	if (starSign.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "Here is your horoscope for today:");
		JOptionPane.showMessageDialog(null, "Today youll work well with children and others will notice how natural you are in this role.\nYou'll earn the respect and admiration of those around you today when you take the lead in an initiative and you show how natural you are at working with children.\nThis could be in a learning capacity or in a more commercial way, or even personal, but whatever it is, you feel happy and comfortable in this role.\nMake sure you are attracting supportive people to be around you.");
	} else
	if (starSign.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "Here is your horoscope for today:");
		JOptionPane.showMessageDialog(null, "Two pairs of hands will be better than one today and having someone beside you will take the pressure off.\nWhatever you are doing today, working with someone and having another pair of hands will really take the pressure off you and help you to relax more.\nThis is true in your work life where a partnership will make your work better, and also in your personal life where having someone alongside you will make you feel cushioned, supported, and helped.");
	} else
	if (starSign.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null, "Here is your horoscope for today:");
		JOptionPane.showMessageDialog(null, "While the Sun focuses your attention on money, Venus urges you to follow your heart today.\nEnergy from the Sun in your house is focusing your mind on money matters today and you can make some great financial advancements if you concentrate on this.\nAt the same time, Venus is nudging energy over from your neighbor, Virgo, and urging you to follow your heart.\nThese two things don't have to be exclusive and can work together to create great results.");
	} else
	if (starSign.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null, "Here is your horoscope for today:");
		JOptionPane.showMessageDialog(null, "You're preparing for big things to come in your career, but you can have some fun along the way.\nWhile the focus is very much on your work life today, Venus will bring you some distractions that you will like that will bring an element of playfulness to everything you do.\nThere's a lot of energy in your career and you'll be preparing for big things to come in this area, but while you are doing that remember to maintain balance in your life and have some fun.");
	} else
	if (starSign.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "Here is your horoscope for today:");
		JOptionPane.showMessageDialog(null, "If you think your slow energy makes it a bad time to leap into new activities, just go for it and find out.\nYou may feel that your energy has slowed down today and although you know doors are opening and new opportunities are arriving, it doesn't feel like the time to be making big moves.\nIn fact, it's exactly the right time to be jumping into new things and seeing where they go.\nYour slow energy makes you chilled and your disposition is perfect for new avenues.");
	} else
	if (starSign.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Here is your horoscope for today:");
		JOptionPane.showMessageDialog(null, "Don't worry about the details today; ask the big questions in your life and you'll find answers.\nIt's not a day for worrying about details today or for focusing on the small things; that will come another day.\nFor now, spend your time and energy asking the bigger questions and seeking answers to the wider issues in your life.\nYour energy is right for this and you'll be able to find your way to some interesting resolutions and revelations.");
	} else
	if (starSign.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "Here is your horoscope for today:");
		JOptionPane.showMessageDialog(null, "When a casual conversation turns serious today, find a positive way forward by sharing your thoughts.\nWhat at first seems like a lighthearted conversation with a casual acquaintance will turn into something much heavier today.\nWhatever this is, don't let it weigh on your mind or it will distract you form what you need to do.\nTry to move forward with this issue and share your thoughts and ideas about it - you can always find a positive way forward no matter what.");
	} else
	if (starSign.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, "Here is your horoscope for today:");
		JOptionPane.showMessageDialog(null, "When you struggle to understand something today, don't waste your energy; just let it settle.\nYou'll hear about something today or some information will come your way that you can't understand.\nThis is going to be difficult for you to navigate and get your brain around, so the best advice is to not keep pushing yourself to get to grips with something that's confusing you this much.\nIt's wasting your energy. Instead, let it bake for a while and you'll see clearly.");
	} else
	if (starSign.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Here is your horoscope for today:");
		JOptionPane.showMessageDialog(null, "No matter how tempting, don't dive into something today without asking yourself some questions.\nYou are extra vulnerable to temptation today, Aquarius, so if something seems very shiny and new and you want it, stop and ask yourself some questions before you dive in.\nIs this really all it appears to be? Are there consequences?\nIf there are, you need to consider these carefully and take some time to make sure you know what you are doing first.");
	} else
	if (starSign.equalsIgnoreCase("Pices")) {
		JOptionPane.showMessageDialog(null, "Here is your horoscope for today:");
		JOptionPane.showMessageDialog(null, "When someone asks you to do something you feel is wrong today, go with your conscience; you have to live with it.\nYou'll be put in a difficult position today when someone asks you to do something you feel is wrong.\nThis could be a question of ethics or morals and it could take place in your work life or personal life, but whatever it is, do what your conscience tells you.\nYou need to feel comfortable with your decision and whatever you do, you have to live with it, so do the right thing.");
	} else {
		JOptionPane.showMessageDialog(null, "Hey, that isn't a zodiac sign!");
	}
}
}
