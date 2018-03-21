import java.util.Scanner;
public class integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[] names=new String[3];	
		
	Scanner R=new Scanner(System.in);
	System.out.println("Type three words");
		
	names[0]=R.nextLine();	
	names[1]=R.nextLine();	
	names[2]=R.nextLine();	
	
	
	for(int i=0;i<=2;i++){
		
	System.out.println(names[i]);	
		
	}
	
		
		
	}

}
