import java.util.Scanner;
public class Temperature {

	private float temp;
	private char scale;
	
	public Temperature() {
		temp = 0;
		scale = 'C';
		}	
	public Temperature(float someTemp, char CorF) {
		temp = someTemp;
		scale = CorF;
		}
	
	private float getFahr(Temperature x) {
		float newTemp = 0;
		if (x.scale == 'C') {
			newTemp = (9 * (temp)/ 5) + 32;
			}	
		return newTemp;		
		}
	private float getCels(Temperature x) {
		float newTemp = 0;
		if (x.scale == 'F') {
			newTemp = 5 * (temp - 32) / 9;
			}
		return newTemp;
		}
		
	private boolean equals(Temperature x) {
		boolean equals = false;
		if (this.scale == x.scale) {
			if (this.temp == x.temp) {
				equals = true;
				}
			}
		if ((this.scale == 'C')&&(x.scale == 'F')) {			
			if (this.temp == x.getCels(x)) {
				equals = true;
				}
			}
		if ((this.scale == 'F')&&(x.scale == 'C')) {
			if (this.temp == x.getFahr(x)) {
				equals = true;
				}
			}				
		return equals;	
		}	
	private boolean lesser(Temperature x) {
		boolean lesser = false;
		if (this.scale == x.scale) {
			if (this.temp < x.temp) {
				lesser = true;
				}
			}
		if ((this.scale == 'C')&&(x.scale == 'F')) {
			if (this.temp < x.temp) {
				lesser = true;
				}
			}
		if ((this.scale == 'F')&&(x.scale == 'C')) {
			if (this.temp < x.temp) {
				lesser = true;
				}
			}
		return lesser;			
		}
	private boolean greater(Temperature x) {
		boolean greater = false;
		if (this.scale == x.scale) {
			if (this.temp > x.temp) {
				greater = true;
				}
			}
		if ((this.scale == 'C')&&(x.scale == 'F')) {
			if (this.temp > x.temp) {
				greater = true;
				}
			}
		if ((this.scale == 'F')&&(x.scale == 'C')) {
			if (this.temp > x.temp) {
				greater = true;
				}
			}
		return greater;			
		}			

	public static void main (String[] args) {
		Temperature demo = new Temperature();
		Temperature demo2 = new Temperature();
		Temperature demo3 = new Temperature(32, 'F');
		Temperature demo4 = new Temperature(1, 'C');
		System.out.println(demo4.equals(demo3));	
		System.out.println(demo4.greater(demo));
		System.out.println(demo2.lesser(demo4));
		}	
	}
