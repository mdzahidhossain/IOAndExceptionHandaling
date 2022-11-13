package BasicJava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DataAnalyzer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataSetReader reader = new DataSetReader();

        boolean done = false;
        while (!done)
        {
            try {
                System.out.println("PLease Enter The File Name : ");
                String filename = in.next();

                double[] data =reader.readFile(filename);
                double sum = 0;
                for (double d : data ){
                    sum = sum + d;

                }
                System.out.println("The Sum Is "+sum);
                done =true;
            }
            catch (FileNotFoundException exception){
                System.out.println("File Not Found. ");
            }
            catch (BadDataException exception){
                System.out.println("Bad data :"+exception.getMessage());
            }
            catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }
}
