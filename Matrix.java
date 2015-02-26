import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class Matrix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matrix
{

    private String[] tokens = new String[1000];
    private int tokenLength = 0;
    private int[][] a = new int[1000][1000];
    private int[][] b = new int[1000][1000];
    private int[] rowCount = new int[2];
    private int[] colCount = new int[2];

    /**
     * Constructor for objects of class Matrix
     */
    public Matrix(String filename) throws FileNotFoundException
    {
        // Comment 1...
        Scanner sc = new Scanner(new File(filename));
        while (sc.hasNext()) {
            tokens[tokenLength] = sc.next();
            tokenLength++;
        }
    }

    public void load() {
        int [][] matrix = null;
        int matrixIndex = -1;

        for (int i=0; i<tokenLength; i++) {

            // Comment 2...
            if (tokens[i].equals("matrix")) {
                if (matrix == null) {
                    matrix = a;
                } else if (matrix.equals(a)) {
                    matrix = b;
                }
                if (matrixIndex > -1) {
                    rowCount[matrixIndex]++;
                }
                matrixIndex++;
                rowCount[matrixIndex] = -1;

            // Comment 3...
            } else if (tokens[i].equals("row")) {
                rowCount[matrixIndex]++;
                colCount[matrixIndex] = 0;
            
            // Comment 4...
            } else {
                matrix[rowCount[matrixIndex]][colCount[matrixIndex]] = Integer.parseInt(tokens[i]);
                colCount[matrixIndex]++; 
            }
        }

        // Comment 5...
        rowCount[matrixIndex]++;
    }

    // multiply method goes here
    //    public int[][] multiply() {
    //        return new int[10][10];
    //    }
}
