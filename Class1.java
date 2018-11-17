
public class Class1 {
 int width;
 int height;
	public Class1(int width, int height) {
		this.width = width;
		this.height = height; 
	} 
	int c() {
		return width*height;
	}
	int c1() {
		return 2*(width+height);
	}
	 static int f(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * f(n-1));    
	 }	
		  
	
	
	
	public static void main(String[] args) {
		Class1 mak = new Class1(15,2);
		System.out.println(mak.c());
		
		
		 int f1=1;  
		  int number=7;   
		  f1 = f(number);   
		  System.out.println(f1); 
	}
}

