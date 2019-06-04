
public class Main{
    public static void main(String[] args){

	String a = args[0];
	String b = args[1];
	String c = args[2];

	double a1 = 0;
	String str1 = a;
	try
	{
		a1= Double.parseDouble(str1);	
	}
	catch (NumberFormatException e)	{ System.err.println("");}
	double b1 =0;
	String str2 = b;
	try
	{
		b1= Double.parseDouble(str2);	
	}
	catch (NumberFormatException e)	{ System.err.println("");}	
	double c1 =0;
	String str3 = c;
	try
	{
		c1= Double.parseDouble(str1);	
	}
	catch (NumberFormatException e)	{ System.err.println("");}

	 if (a1 + b1 <= c1 || a1 + c1 <= b1 || b1 + c1 <= a1 || a1 == 0 || b1 == 0 || c1 == 0)
        {
            System.out.println("Это не треугольник!");
            return;
        }
	
	double p = (a1 + b1 + c1) / 2;
        double s = Math.sqrt(p * (p - a1) * (p - b1) * (p - c1));

        System.out.println("Площадь треугольника: " + s);
    }
}
