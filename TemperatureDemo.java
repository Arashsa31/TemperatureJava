/**
 * @author Arash
 *
 */
public class TemperatureDemo {

/*
 *Write a driver program that tests all the methods. Be sure to invoke each of 
 *the constructors, to include at least one true and one false case 
 *for each comparison method, and to test at least the following three 
 *temperature pairs for equality: 0.0 degrees C and 32.0 degrees F, −40.0 degrees C 
 *and −40.0 degrees F, and 100.0 degrees C and 212.0 degrees F.
 *
	 */
	public static void main(String[] args) {
		
		//can use the following print to print Temperature to 1 decimal place [System.out.printf("%.1f")]
		Temperature temp0 = new Temperature(47.4747);
		Temperature temp1 = new Temperature('F');
		
		Temperature temp2 = new Temperature(0, 'C');
		Temperature temp3 = new Temperature (32, 'F');
		Temperature temp4 = new Temperature(-40, 'C');
		Temperature temp5 = new Temperature(-40, 'F');
		Temperature temp6 = new Temperature(100,'C');
		Temperature temp7 = new Temperature(212, 'F');
		
		System.out.println(temp0.toString());
		System.out.printf("Example formatted print number: %.1fF.", temp0.getFahrenheitTemperature());
		System.out.println("\n");
		
		System.out.println(temp1.toString());
		System.out.printf("Example formatted print number: %.1fC.", temp1.getCelsiusTemperature());
		System.out.println("\n");
		
		System.out.println("Is the Temperature equal? " + temp0.isTempatureEqual(temp1));
		System.out.println("Is the Temperature Greater? " + temp0.isTempatureGreater(temp1));
		System.out.println("Is the Temperature Less than? " + temp0.isTempatureLess(temp1));
		System.out.println();
		
		System.out.println("Is the Temperature equal? " + temp1.isTempatureEqual(temp0));
		System.out.println("Is the Temperature Greater? " + temp1.isTempatureGreater(temp0));
		System.out.println("Is the Temperature Less than? " + temp1.isTempatureLess(temp0));
		for(int x=0; x<50; x++)
			System.out.print("*");
		System.out.println();
		
		System.out.println(temp2.toString());
		System.out.println("Is the Temperature equal? " + temp2.isTempatureEqual(temp3));
		System.out.println("Is the Temperature Greater? " + temp2.isTempatureGreater(temp3));
		System.out.println("Is the Temperature Less than? " + temp2.isTempatureLess(temp3));
		System.out.println();
		
		System.out.println(temp3.toString());
		System.out.println("Is the Temperature equal? " + temp3.isTempatureEqual(temp2));
		System.out.println("Is the Temperature Greater? " + temp3.isTempatureGreater(temp2));
		System.out.println("Is the Temperature Less than? " + temp3.isTempatureLess(temp2));
		System.out.println();
		for(int x=0; x<50; x++)
			System.out.print("*");
		System.out.println();
		
		System.out.println(temp4.toString());
		System.out.println("Is the Temperature equal? " + temp4.isTempatureEqual(temp5));
		System.out.println("Is the Temperature Greater? " + temp4.isTempatureGreater(temp5));
		System.out.println("Is the Temperature Less than? " + temp4.isTempatureLess(temp5));
		System.out.println(); 
		
		System.out.println(temp5.toString());
		System.out.println("Is the Temperature equal? " + temp5.isTempatureEqual(temp4));
		System.out.println("Is the Temperature Greater? " + temp5.isTempatureGreater(temp4));
		System.out.println("Is the Temperature Less than? " + temp5.isTempatureLess(temp4));
		System.out.println(); 
		for(int x=0; x<50; x++)
			System.out.print("*");
		System.out.println();
		
		System.out.println(temp6.toString());
		System.out.println("Is the Temperature equal? " + temp6.isTempatureEqual(temp7));
		System.out.println("Is the Temperature Greater? " + temp6.isTempatureGreater(temp7));
		System.out.println("Is the Temperature Less than? " + temp6.isTempatureLess(temp7));
		System.out.println();
		
		System.out.println(temp7.toString());
		System.out.println("Is the Temperature equal? " + temp7.isTempatureEqual(temp6));
		System.out.println("Is the Temperature Greater? " + temp7.isTempatureGreater(temp6));
		System.out.println("Is the Temperature Less than? " + temp7.isTempatureLess(temp6));
		System.out.println();
	}

}
