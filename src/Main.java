import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int num = 0;
		System.out.println("�R�[�h����͂��Ă�������");
		Scanner scan = new Scanner(System.in);
		operate ope = new operate();
		
		while(num != 9) {
	
		    try {
		    	num = scan.nextInt();
		    	switch(num) {
			    case 0:
			    	ope.display();
			    	break;
			    case 1:
				    ope.goN();
				    break;
			    case 2:
			    	ope.goE();
			    	break;
			    case 3:
			    	ope.goS();
			    	break;
			    case 4:
			    	ope.goW();
			    	break;
		    	}
		    }
		    catch (InputMismatchException e) {
		    	System.out.println("1~4���邢��9�̔��p��������͂��Ă�������"); 
		    	num = 0;
		    }
		
		    
		    
		    
	    }
		System.out.println("�v���O�������I�����܂���");
		scan.close();

    }
}
