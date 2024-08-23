/*Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount.
*/



class Discount{
	public static void main(String args[]){
		
		int price = 121;
		double total;
		boolean membership = false;
		
		if(price>=1000){
			if(membership == true)
			{
				total = price * 0.25;   //20%
				System.out.println("Total : " + total);
			}else{
				total = price * 0.2;
				System.out.println("Total : " + total);
			}
		}else if(price>=500 && price<=999) //10%
		{
			if(membership == true){
				total = price * 0.15;
				System.out.println("Total : " + total);
			}else{
				total = price * 0.1;
				System.out.println("Total : " + total);
			}
		}else if(price<500)    //5%
		{
			if(membership == true){
				total = price * 0.1;
				System.out.println("Total : " + total);
			}else{
				total = price * 0.05;
				System.out.println("Total : " + total);
				}
				}
				}
}