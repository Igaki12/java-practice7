import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int num = 0;
		String str = ""; 
		System.out.println("�R�[�h����͂��Ă�������");
		Scanner scan = new Scanner(System.in);
		operate ope = new operate();
		
		while(num != 9) {
		    try {
				str = scan.next();
		    	num = Integer.parseInt(str);
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
		    catch (NumberFormatException e) {
		    	System.out.println("0~4���邢��9�̔��p��������͂��Ă�������"); 
		    }
		
		    
		    
		    
	    }
		System.out.println("�v���O�������I�����܂���");
		scan.close();

    }
}
