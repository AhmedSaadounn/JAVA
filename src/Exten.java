import java.util.Scanner;
import java.time.LocalDate;
public class Exten{
	
	static void Welcom()
	{
		System.out.print("\t Welcom to Gaming Center");
	}
	public static void main(String[] args) {
		 Welcom();
		
		try (/*                ÃßÊÈ ÈÑäÇãÌ  íÍÓÈ æíØÈÚ ÊßáÝíÉ ÇáÂáÚÇÈ Ýí ãÊÌÑ ÇáÚÇÈ ßÊÇáí/*
				 * 1ÊßáÝÉ ßá áÚÈÉ ãÏÎáÉ ãä ÇáãÓÊÎÏã(""áÕÇÍÈ ÇáãÍá"") /*
				 */
			
		Scanner S = new Scanner(System.in)) {
			LocalDate myObj = LocalDate.now();
			 System.out.println(""+ myObj);
			
			 System.out.print( "please, enter game id:");
			 int id = S.nextInt();
			 double totalPrice=0;
			 int num =0;
	
			 while(id !=-1) {
				 System.out.print( "Please, enter the price of next game:");
				 double price = S.nextDouble();
				 totalPrice +=price;
				 num++;
					System.out.print("Pleas,enter game id:");
					id = S.nextInt();
			 }
			 double discount = 0 ;
			 if(num >2) {
			   discount =20.0 / 100;
			 }
			 System.out.println("Total price before discount:"+totalPrice+"SR");
			 System.out.println("Your discount is: " + (totalPrice - (totalPrice *(1 - discount))) + "SR");
			 totalPrice *=(1- discount);
			 System.out.println("Total price after discount" + totalPrice+"SR");
			
			 
		}
	      
	     
	}

}

