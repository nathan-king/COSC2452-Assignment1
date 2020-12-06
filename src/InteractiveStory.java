import java.awt.*;

public class InteractiveStory {
    public static void main(String[] args) {

        GTerm gt = new GTerm(1000, 600);
        gt.setFontSize(15);
        gt.setFontName(Font.SANS_SERIF);
        gt.setFontColor(255, 200, 200);
        gt.setBackgroundColor(0, 0, 0);


        gt.setXY(600, 100);
        gt.addImageIcon("src/wizard.png");
        gt.setXY(100, 100);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            gt.println("Error: Main thread interrupted");
        }

        gt.println("Hello, I am Irazabah");
        gt.println("I have a few questions for you, traveller!\n\n");


        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            gt.println("Error: Main thread interrupted");
        }

        String userName = "";

        while (userName.length() == 0)
        {
            userName = gt.getInputString("What is your name?");
        }

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            gt.println("Error: Main thread interrupted");
        }

        String ageString = gt.getInputString("And what is your age, " + userName + "?");


        int userAge = Integer.parseInt(ageString);

        if (userAge < 30)
        {
            gt.println("Wow, you are quite young, " + userName + "!");
        } else if (userAge < 50)
        {
            gt.println("Indeed " + userName + ", you have lived for some time but are\nlacking the wisdom of age!");
        } else
        {
            gt.println("Your experience is worthy of praise, " + userName + "!");
        }


    }
}
