/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steve
 */
public class ColorTop {

    /**
     * @param args the command line arguments
     * Get a value and the interpreted color from the color sensor and 
     * display both on the output device (screen)
     */
    public static void main(String[] args) {
        double colorValue;
        String color;
        
        // create an instance of the ColorSense object
        ColorSensor clrSense1 = new ColorSensor();
        
        // Initialize the class with the current color sensor data
        clrSense1.readColor();
        
        // Get the value returned by the color sensor (between 0 and 1)
        colorValue = clrSense1.getColorNumber();
        System.out.printf("Color value detected is %.3f\n", colorValue);
        //System.out.print("Color value detected is " + colorValue + "\n");
        
        // Get the color detected by the color sensor, binned into nearest primary colors (RGB)
        color = clrSense1.getColor();
        //System.out.printf("Color detected is %s\n", color);
        System.out.print("Color detected is " + color + "\n");

    }
    
}
