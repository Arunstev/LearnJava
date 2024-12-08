import edu.duke.*;

public class Test {
    public static void main(String[] args) {
        FileResource fr = new FileResource();
        for (String line : fr.lines()) {
            System.out.println(line);
        }
    }
}