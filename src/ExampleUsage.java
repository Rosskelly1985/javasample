
public class ExampleUsage {

	
	public ExampleUsage() {
		
		 LoggerTool Tool = new LoggerTool();
		 Tool.errorType1("This is an example error");
		 Tool.errorType2("Error2");
		 Tool.errorType3("Error3","Example.java","Default");
	}
	
	

 public static void main(String[]args){
	 
  new ExampleUsage();
}
}