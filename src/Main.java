import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int num = 0;
		System.out.println("コードを入力してください");
		Scanner scan = new Scanner(System.in);
		operate ope = new operate();
		
		while(num != 9) {
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
		System.out.println("プログラムを終了しました");

    }
}
