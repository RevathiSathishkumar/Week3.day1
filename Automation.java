
 public class Automation extends AutomationExtends implements TestTool,Language {
	 
	 public static void main(String[] args) {
		
		 Automation automation = new Automation();
		 
		 automation.Selenium("Test");
		 automation.Java("Concept");
		 automation.Course(53);
		 automation.NewTopic();	 
		 
	}

	//implementing this method from Test tool interface
	 //used final method
	final public void Selenium(String name) {
		
		System.out.println("learn selenium concepts");
		}

	//implementing this method from Language interface
    public void Java(String java) {
		
		System.out.println("learn java concepts");
		
	}
    
    //Creating one extra method which not mentioned in interface
    
    public void Course(int id)
    {
    	System.out.println("Course id as Java");
    }
    
    //using a same method from parent class
    public void NewTopic() {
    	
    	//used this keyword for current class object
    	
		this.Course(454);
		
		//used super keyword for super class object
		super.Topic();
		
		
	} 
    
	
	
	
	
}
