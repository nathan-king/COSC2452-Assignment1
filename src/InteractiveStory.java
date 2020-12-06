public class InteractiveStory {
    public static void main(String[] args) {

        GTerm gt = new GTerm(1000, 600);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            gt.println("Main thread interrupted.");
        }

        gt.println("Hello, I am Irazabah");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            gt.println("Main thread interrupted.");
        }

        gt.println("What is your name?");
    }
}
