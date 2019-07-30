package pages;

public abstract class BasePage {
    public void waitSeconds(long delay) {
        try {
            Thread.sleep(delay * 1000);
        } catch (InterruptedException ie) {
           ie.printStackTrace();
        }
    }
}
