
public class Class3 {
	 int a;
	 int b;
	 int c;
		public Class3(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		int d() {
			return ((b*b-(4*(a*c))));
		}
		int d0() {
			return 4;
		}
	
		public static void main(String[] args) {
			Class3 d2 = new Class3(-3,-4,-4);
			
			
			System.out.println(d2.d0());
		}
}
