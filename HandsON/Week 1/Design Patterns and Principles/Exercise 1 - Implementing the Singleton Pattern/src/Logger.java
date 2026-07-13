package src;

public class Logger{

    //static means -> belongs to a class
    //if the Variable is made static the class only inherit that particular obj means only one copy is there
    private static Logger instance;

    //to prevent the creation of the more object the Logger Constructor is Made private
    private Logger(){
        System.out.println("Logger Created");
    }


    //after the creation the memory becomes
    //Logger.instance = null
    //when the first getInsatance is called if the obj == null. then the oboj is created
    //for the second time the instance became != null so same object is returned

    public static Logger getInstance(){
        if(instance == null)
        {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }
}