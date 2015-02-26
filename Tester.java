import java.io.*;

/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester  
{

    public static void main(String[] args) {
        try {
            Matrix matrix = new Matrix("MatrixData.txt");
            matrix.load();
//            matrix.multiply();
        } catch(FileNotFoundException e) {
            System.out.println("Oops... File not found!");
        }
    }

}
