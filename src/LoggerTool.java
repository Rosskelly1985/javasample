import java.io.BufferedWriter;
import java.io.FileWriter;


public class LoggerTool {
	
	
int UniqueIdNumber = 0;
	
/**@param message this variable is used to describe the bug in message form
 * 
 * 
 */
public void errorType1(String message) {
	
	
	
	UniqueIdNumber++;
	System.out.println("BugId"+UniqueIdNumber);
	System.out.println("Message"+ message);


try{
	BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Ross\\Desktop\\ErrorLog.txt"));
	
		out.write("BugId"+"UniqueIdNumber");
		out.write("Message"+ message);
	}catch(Exception e) {System.out.print("Something went wrong!!");
	
	}
}

/**@param message this variable is used to describe the bug in message form
 * 
 * 
 */
public void errorType2(String message) {
	
	
	
	
	UniqueIdNumber++;
	
	System.out.println("BugId"+"UniqueIdNumber");
	System.out.println("Message"+ message);
	
	long epoch = System.currentTimeMillis()/1000;
	System.out.println("TimeEpochFormat"+ "Epoch");
	
	try{
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Ross\\Desktop\\ErrorLog.txt"));
		
			out.write("BugId"+"UniqueIdNumber");
			out.write("Message"+ message);
		}catch(Exception e) {System.out.print("Something went wrong!!");
		
		}
	
	 
}

/**@param message, class name, package name, this variable is used to describe the bugs message, class name and package name
 * 
 * 
 */
public void errorType3(String message,String classname, String packagename) {
	
	
	
	
	
	UniqueIdNumber++;
	System.out.println("BugId"+"UniqueIdNumber");
	System.out.println("Message"+ message);
	
	long epoch = System.currentTimeMillis()/1000;
	System.out.println("TimeEpochFormat"+ "Epoch");
	
	System.out.println("class"+classname);
	System.out.println("Package"+packagename);

	try{
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Ross\\Desktop\\ErrorLog.txt"));
		
			out.write("BugId"+"UniqueIdNumber");
			out.write("Message"+ message);
		}catch(Exception e) {System.out.print("Something went wrong!!");
		
		}
	
	
	
	
}

/**@param message, class name, package name, this variable is used to describe the bugs message, class name, package name and warning type message
 * 
 * 
 */
public void errorType4(String message,String classname, String packagename, String WarningTypeMessage) {
	
	
	
	
	
	UniqueIdNumber++;
	
	try{
	BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Ross\\Desktop\\ErrorLog.txt"));
	
		out.write("BugId"+"UniqueIdNumber");
		out.write("Message"+ message);
	}catch(Exception e) {System.out.print("Something went wrong!!");
	
	}
	
}


/**@param message, class name, package name, this variable is used to describe the bugs message, class name, package name and error type message
 * 
 * 
 */
public void errorType5(String message,String classname, String packagename, String ErrorTypemessage) {
	
	
	
	
	
	UniqueIdNumber++;
	try{
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Ross\\Desktop\\ErrorLog.txt"));
		
			out.write("BugId"+"UniqueIdNumber");
			out.write("Message"+ message);
		}catch(Exception e) {System.out.print("Something went wrong!!");
		
		}
}

/**@param message, class name, package name, this variable is used to describe the bugs message, class name, package name and severe error type message
 * 
 * 
 */
public void errorType6(String message,String classname, String packagename, String SevereErrorTypemessage) {
	
	
	
	
	UniqueIdNumber++;
	try{
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Ross\\Desktop\\ErrorLog.txt"));
		
			out.write("BugId"+"UniqueIdNumber");
			out.write("Message"+ message);
		}catch(Exception e) {System.out.print("Something went wrong!!");
		
		}
}
}
