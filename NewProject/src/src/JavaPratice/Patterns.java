package JavaPratice;

public class Patterns {

	public static void main(String[] args) {
		//int i,j;
		//i=rows j= columns
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				
				if(i==3 && j==2 ) {
					System.out.print("A");
					
				}
				else if( i==3&&j==3){
					System.out.print("N");
				}else if( i==3&&j==4) {
					System.out.print("U");
				}
				else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
	
}
	
		
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {				//&&&
//				if(i==3 && j==3) {
//					System.out.print("@");
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//	}
//}
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(i==3 || j==3) {
//					System.out.print("@");				//|||
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//	}
//}