package parkingLotSD;

import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TestParking 
{

   public static void main(String[] args) throws FileNotFoundException, IOException
	   {
		   //int count=0;
		   /*ReadFile input = new ReadFile();
		   input.openFile();
		   input.readFile();
		   input.closeFile();*/
		   
/////////////////////to read only first line and convert to string then send to constructor//////////////////////
		   BufferedReader num = new BufferedReader(new FileReader("file1.txt"));
	       String text = num.readLine();
	       int result = Integer.parseInt(text);
	       //System.out.println(result);
	       ParkingLot pl = new ParkingLot(result);
	       
	      
	////////////////to skip first line and sent other lines to linked list//////////////////////////////
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Lot Capacity = "+ pl.getCapacity());
	       System.out.println("\n");
	       BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
	       reader.readLine(); 
	       String line1=null;
	       while ((line1 = reader.readLine()) != null)
	       { //loop will run from 2nd line
	    	   pl.parkACar(line1);
	              //count++;
	       }
	       //System.out.println(count);
	   //////////////////////////////////////////////////////////////////////////////////////    
     
	   
	      
	       sc.close();
	       num.close();
	       reader.close();
	   }

}
	

