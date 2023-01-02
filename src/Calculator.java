/**
 * 
 * @author Mark
 *
 */
public class Calculator {
	public double averageFreeCashFlow(double f10,double f9,double f8,double f7,double f6,double f5,double f4,double f3,double f2,double f1) {
		return (f10+f9+f8+f7+f6+f5+f4+f3+f2+f1)/10.0;
	}
	public double averageGrowthRate(double cbv, double obv, int cy, int cp) {
		int years = cy-cp;
		double exp = 1.0/years;
		double base = cbv/obv;
		double a = Math.pow(base, exp);
		double c = 100*(a-1);
		return c;
	}
	
	public double IntrinsicValue(double averageFCF, double averageGrowthRate, int growthYears, double r, double discountRate, double pGrowthPerpuity, double sharesOutstanding, double price) {
		
		return 0;
	}
	
	public static void main(String[] s) {
		Calculator c = new Calculator();
		System.out.println(c.averageFreeCashFlow(41454, 44590, 49900, 69778, 52276, 50803, 64121, 58896, 73365, 92953));
		System.out.println(c.averageGrowthRate(94680, 41733, 2021, 2012));
	}
}
