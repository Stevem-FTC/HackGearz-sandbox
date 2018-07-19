/*
 * HackGearz startup Java code
 */
package helloworld;

/**
 *
 * @author steve
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    static String outputString;
    
    public static void main(String[] args) {
        outputString = TextModule.getText();
        System.out.println(outputString);
    }
    
}
