import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human male=new Human();
		Human female=new Human();
		male.Name="Faris";
		female.Name="Dayana";
		male.Sex="Male";
		female.Sex="Female";
		male.Age=19;
		female.Age=20;
		
		System.out.println("Name : " + male.Name + "\n" + "Age : "+ male.Age + "\n" + "Sex : "+male.Sex);
		male.printOperation();
		System.out.println();
		System.out.println("Name : " + female.Name + "\n" + "Age : "+ female.Age  + "\n" + "Sex : "+female.Sex);
		female.printOperation();
		System.out.println();
				

	}

}
