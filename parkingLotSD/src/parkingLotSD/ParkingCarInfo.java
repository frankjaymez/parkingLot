package parkingLotSD;
import java.sql.Timestamp;

public class ParkingCarInfo {
   private String driver;//drivers name
	   private Timestamp timestamp; //timestamp given to driver
	  

	   public ParkingCarInfo(String driver)
	   {
	       this.driver = driver;
	       this.timestamp = new Timestamp(System.currentTimeMillis());
	   }

	   
	   public String toString()
	   {
	       return "Driver: " + driver + "\n" + "Timestamp: " + timestamp + "\n";
	   }
	}
