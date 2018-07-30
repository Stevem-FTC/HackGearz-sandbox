/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steve
 * method definitions:
 *  void readColor() initializes the local colorValue variable to the simulated color sensor output value
 * 
 *  double getColorNumber() returns the double precision colorValue initialized by a call to readColor()
 * 
 * String getColor() returns the color corresponding to the colorValue initialized by a call to readColor()
 * The colors are in spectral order from Red (0) to blue (1) apportioned equally
 */
public class ColorSensor {
    private double colorValue = 0.0;
    
    // simulate color sensor read
    // How can we change these methods so we don't havae to call readColor() before each get?
    public void readColor()
    {
        colorValue = Math.random();
    }
   
    public double getColorNumber()
    {
        return colorValue;
    
    }
    
    public String getColor()
    {
        // what happens if we add "Yellow" to the mix?
        String colors[] = {"Red", "Green", "Blue"};
        int colorIndex;
        
        colorIndex = (int) (colorValue * 3);
        //colorIndex = (int) (colorValue * colors.length);
        
        return colors[colorIndex];
    }
    
}
