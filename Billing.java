/* Page 224 #2

	8-1-19
*/

public class Billing
{
	public static void main(String[] args)
	{
		//vars and consts
		
		double onlyBook = 5.40;
		double moreBooks = 10.80;
		double couponBook = 8.80;
		
		computeBill(onlyBook);
		computeBill(onlyBook, moreBooks);
		computeBill(onlyBook, moreBooks, couponBook);
	}
	
	public static void computeBill(double onlyBook)
	{
		System.out.println("Your book is $5 plus tax. Your order total is $" + onlyBook);
	}
	
	public static void computeBill(double onlyBook, double moreBooks)
	{
		System.out.println("Your book is $5 plus tax which is $" + onlyBook + " You ordered two books so your total is $" + moreBooks);
	}
	
	public static void computeBill(double onlyBook, double moreBooks, double couponBook)
	{
		System.out.println("Your book is $5 plus tax which is $" + onlyBook + " You ordered two books which is $" + moreBooks + " and with your coupon your total is $" + couponBook);
	}
}