
/* 
import edu.duke *;
public class PerimeterRunner{
    public double getPerimeter(Shape s){
        double totalPerim = 0;
        Point pervPt = s.getLastPoint();
        for(Point currPt: s.getPoints()){
            double currDist = pervPt.distance(currPt);
            totalPerim = totalPerim + currDist;
            pervPt = currPt;
        }
        return totalPerim;
    }
    public void testPerimeter(){
        FileResource fr = new FileResource();
        Shape s = new shape(fr);
        double length = getPerimeter(s);
        System.out.println("Perimeter = " + length);
    }
    public static void main(String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PerimeterRunne{
    public static void main(String[] args){
        try{
            File file = new File("Perimeter_quiz/datatest1.txt");
            Scanner scanner = new Scanner(file);
            double totalPerim = 0.0;
            while(scanner.hasNextDouble()){
                double distance = scanner.nextDouble();
                totalPerim += distance;
                System.out.println("TotalPerimeter =" + totalPerim);
                scanner.close();
            }
        }
        catch 
            (FileNotFoundException e){
                System.out.print("File is not found" + e.getMessage());
            }
    }
}

