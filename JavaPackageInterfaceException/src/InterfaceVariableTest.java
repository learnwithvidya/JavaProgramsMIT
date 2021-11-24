//creating constant variables under interface and using it in different classes.
//value of constant in interface does not change.
import java.util.Random;

interface SharedConstants {
    int NO = 0;
    int YES = 1;
}

class Question implements SharedConstants {
    Random rand = new Random();						//inbuilt class that provides random val
    int ask() {
        int prob = (int) (100 * rand.nextDouble());  //randomly takes double values.
        if (prob < 50) return NO;
        else return YES;
    }
}
public class InterfaceVariableTest {
    public static void main(String[] args) {
        Question q = new Question();
        for (int i = 0; i < 10; i++) {
            System.out.println(q.ask());		//for an iteration of 10, random values are taken
        }
    }
}
