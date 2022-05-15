package operators;

public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte maxbyte=127;
		byte minbyte=-128;
		System.out.println("min range is"+minbyte+"Max range is"+maxbyte);
		short maxshort=32767;
		short minshort=-32768;
		System.out.println("min range is"+minshort+"Max range is"+maxshort);
		int maxint= 2147483647;
		int minint=-2147483648;
		System.out.println("min range is"+minint+"Max range is"+maxint);
		long maxlong=9223372036854775807L;
		long minlong=9223372036854775807L;
		System.out.println("min range is"+minlong+"Max range is"+maxlong);
		float f=3234.141345678934f;
		double d=327687.14123456734567892347809f;
		System.out.println("float value is"+f+"double value is"+d);
	}

}
