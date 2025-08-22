public class HelloWorld { 
    String name; 

    //Class constructor
    public HelloWorld(String name) { 
        this.name = name; 
    }

    //function
    public void greet() { 
        System.out.println("Hello, " + name + "!"); 
    } 

    //Main Body
    public static void main(String[] args) 
    { 
        //Construct HelloWorld Object
        HelloWorld student = new HelloWorld("Jason");

        student.greet(); 
    } 
}

//wnfwiidnnj
