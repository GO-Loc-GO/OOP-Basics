package oop_labs;

public class Lab3 {
	public static void pattern1() {
		int i,j;
		for(i=0;i<8;i++) {
			for(j=0;j<i;j++) {
			System.out.print('*');
			}
			System.out.print('\n');
		}
	}
    
	public static void pattern2() {
		for (int i = 7; i >= 1; i--){
			 for (int j = 1; j <= i; j++){
			 System.out.print(" * ");
			 }
			 System.out.println(); 
		}
	}
	
	public static void pattern3() {
		int i,j;
		for(i=1;i<6;i++) {
			System.out.print(i);
			System.out.print(' ');
			for(j=1;j<i;j++) {
			System.out.print(i+j);
			System.out.print(' ');
			}
			System.out.print('\n');
		}
	}
	
	public static void pattern4() {
		int i,j;
		for(i=0;i<6;i++){
			for(j=0;j<5-i;j++) {
				System.out.print(' ');
			}
			for(j=0;j<i;j++) {
				System.out.print('*');
				System.out.print(' ');
			}
			System.out.print('\n');
		}
		for(i=0;i<6;i++){
			for(j=0;j<i;j++) {
				System.out.print(' ');
			}
			for(j=0;j<5-i;j++) {
				System.out.print('*');
				System.out.print(' ');
			}
			System.out.print('\n');
		}
	}
	
	public static void extension1() {
		int i,j;
		for(i=0;i<8;i++) {
			int k=i;
			for(j=0;j<8-i;j++) {
				System.out.print(' ');
				System.out.print(' ');
			}
			for(j=0;j<i+1;j++) {
				System.out.print(k);
				System.out.print(' ');
				k--;
			}
			System.out.print('\n');
		}
	}
	
	public static void extension2() {
		int i,j,k,n=1;
		int set_of_spaces=2;
		int count=1;
		for(i=0;i<3;i++) {
	        for(k=0;k<set_of_spaces;k++) {
	        	System.out.print(' ');
	        	System.out.print(' ');
	        }
			for(j=0;j<i+n;j++) {
				System.out.print(count);
				System.out.print(' ');
				count++;
			}
			System.out.print('\n');
			set_of_spaces--;
			n=n+1;
		}
	    for(i=0;i<2;i++) {
	    	System.out.print(' ');
	    }
	    count=2;
	    for(i=0;i<3;i++) {
	    	System.out.print(count);
	    	System.out.print(' ');
	    	count++;
	    }
	    System.out.print('\n');
	    for(i=0;i<4;i++) {
	    	System.out.print(' ');
	    }
	    System.out.print(1);
	    
	}
	
	public static void extension3() {
		int i,j;
		for(i=1;i<6;i++) {
			for(j=1;j<i+1;j++) {
				if(i*j<10) {
					System.out.print('0'+String.valueOf(i*j));
					System.out.print(' ');
				}else {
					System.out.print(i*j);
					System.out.print(' ');
				}
			}
			System.out.print('\n');
		}
	}
	public static void main(String[] args) {
		extension3();
        
	}

}
