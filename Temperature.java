/**
 * @author Arash
 *
 *Write a Temperature class that represents temperatures in degrees in both 
 *Celsius and Fahrenheit. 
 *
 *Use a floating-point number for the temperature and a character for the scale: 
 *either 'C' for Celsius or 'F' for Fahrenheit. 
 *
 *The class should have Four constructors: one for the number of degrees, one for the scale, 
 *one for both the degrees and the scale, and a default constructor. 
 *
 *For each of these constructors, assume zero degrees if no value is specified and Celsius 
 *if no scale is given. 
 *
 *Two accessor methods: one to return the temperature in degrees Celsius, 
 *the other to return it in degrees Fahrenheit. 
 *
 *Use the formulas from Practice Program 5 of Chapter 3 and round to the 
 *nearest tenth of a degree. 
 *
 *Degrees_C = 5(Degrees_F) - 32)/9
 *Degrees_F = (9(Degrees_C)/5) + 32) 
 *
 *Three set methods: one to set the number of degrees, 
 *one to set the scale, 
 *and one to set both. 
 *
 *Three comparison methods: one to test whether two temperatures are equal, 
 *one to test whether one temperature is greater than another, 
 *and one to test whether one temperature is less than another.
 *
 *Write a driver program that tests all the methods. Be sure to invoke each of 
 *the constructors, to include at least one true and one false case 
 *for each comparison method, and to test at least the following three 
 *temperature pairs for equality: 0.0 degrees C and 32.0 degrees F, −40.0 degrees C 
 *and −40.0 degrees F, and 100.0 degrees C and 212.0 degrees F.
 */
public class Temperature {
	//instance variables
	private double temp;
	private char scale;
	
	//constructors
	//default constructor
	public Temperature() {
		this.setTemperatureAndScale(0, 'C');
	}
	//overloaded constructors
	public Temperature(double temperature) {
		this.setTemperatureAndScale(temperature, 'C');
	}	
	public Temperature(char scale) {
		this.setTemperatureAndScale(0, scale);	
	}	
	public Temperature(double temperature, char scale) {
		this.setTemperatureAndScale(temperature, scale);
	}
	/**
	 * @return
	 */
	public double getCelsiusTemperature() {
		if(scale == 'F') {
			return 5*(temp-32)/9; 
		}
		else return temp;
	}
	/**
	 * @return 
	 */
	public double getFahrenheitTemperature() {
		if (scale == 'C') {
			return (9*(temp)/5)+32;
		}
		else return temp;
	}
	/**
	 * @return
	 */
	public char getScale() {
		return scale;
	}
	public void setTemperature(double temperature) {
		temp = temperature;
	}
	/**
	 * @param sc
	 */
	public void setScale(char scale) {
		this.scale = scale;
	}
	/**
	 * @param te
	 * @param sc
	 */
	public void setTemperatureAndScale(double temperature, char scale) {
		temp = temperature;
		this.scale = scale;		
	}
	/**
	 * @param temperature
	 * @return
	 */
	public boolean isTempatureEqual(Temperature temperature) {
		if (this.getCelsiusTemperature() == temperature.getCelsiusTemperature())
			return true;
		else return false;		
	}
	/**
	 * @param temperature
	 * @return
	 */
	public boolean isTempatureGreater(Temperature temperature) {
		if (this.getCelsiusTemperature() > temperature.getCelsiusTemperature())			
			return true;
		else return false;
	}
	/**
	 * @param temperature
	 * @return
	 */
	public boolean isTempatureLess(Temperature temperature) {
		if (this.getCelsiusTemperature() < temperature.getCelsiusTemperature())
			return true;
		else return false;
	}
	/**
	 * @return String for fahrenheit and celsius
	 */
	public String toString() {
		return "The Celsius degree is " + 
				this.getCelsiusTemperature()    + "C" + 
				".\nThe Fahrenheit degree is "+
				this.getFahrenheitTemperature() + "F" +
				".";
	}
}
