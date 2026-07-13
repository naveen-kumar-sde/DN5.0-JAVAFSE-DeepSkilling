package src;
public class SingletonTest{
    public static void main(String[] args){
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        System.out.println(log2 == log1);

        log1.log("Hey");
        log1.log("Folks");
    }
}