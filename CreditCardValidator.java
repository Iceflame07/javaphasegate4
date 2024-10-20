import java.util.Scanner;
  public class CreditCardValidator {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your card sixteen(16) digit:");
	int number = input.nextInt();

	int[] VisaCard = {4};
	int[] MasterCard = {5};
	int[] AmericanExpress = {37};
	int[] DiscoverCard = {6};
	int[] cardnumber = {16};
	int[] counter = {0};
	int[] odd = {1,3,5,7,9};
	int[] even = {2,4,6,8,10};

	for(int count = 0; count < number.length; count++);

	   number = odd + even;

	 if(VisaCard % 4 == 0){
	     System.out.println("CreditCard is VisaCard");
      }
         else if(MasterCard % 5 == 0){
		System.out.println("CreditCard is MasterCard");
      }
         else if(AmericanExpress % 37 == 0){
		System.out.println("CreditCard is AmericanExpress");
      }
	 else if(DiscoverCard % 6 == 0){
		System.out.println("CreditCard is DiscoverCard");
      }  else {
		System.out.print("Invalid CreditCard,try again");
      }

  }

}




