package parkingLotSD;
import java.util.LinkedList;

public class ParkingLot {

	   private LinkedList<ParkingCarInfo> cars = null;//LL to hold curently parked cars
	   private int num = 0; //number of current parked cars
	   private int capacity = 0;//capacity of lot
	  
	   //constructor
	   public ParkingLot(int capacity)
	   {
	       this.capacity = capacity;
	       this.cars = new LinkedList<ParkingCarInfo>();
	       this.num = 0;
	   }
	  
	   public LinkedList<ParkingCarInfo> getCars()
	   {
	       return cars;
	   }

	   public int getNum()
	   {
	       return num;
	   }

	   public int getCapacity()
	   {
	       return capacity;
	   }


	   public void parkACar(String driver)
	   {
	       if(this.num == this.capacity)
	       {
	           System.out.println("Sorry lot capacity has been met");
	       }
	       
	       else
	       { 
	           ParkingCarInfo parkingCar = new ParkingCarInfo(driver);
	           cars.add(parkingCar); //new car added
	           System.out.println("New car entering the lot: ");
	           System.out.println(parkingCar);
	           this.num++;
	       }
	      
	   }
	 
	   }

	
