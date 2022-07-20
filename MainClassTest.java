import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {

        int a = this.getLocalNumber();
        System.out.println(getLocalNumber());

        if (a == 14) {
            System.out.println("The right answer");
        } else {
            System.out.println("The error message");
        }
    }
}