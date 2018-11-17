
public class Class2 {
	int a;
	 int b;
	int c;
		public Class2(int a, int b, int c) {
			this.a = a;
			this.b = b; 
			this.c = c;
		}
		int volume() {
			return a*b*c;
		}
		int mean() {
			return (a+b+c)/3;
		}
		public static void main(String[] args) {
			Class2 vvv = new Class2(10,6,2);
			
			
			System.out.println(vvv.mean());
			
		}
}
