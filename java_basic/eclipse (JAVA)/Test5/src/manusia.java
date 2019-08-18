class hewan{
	
	//final int umur = 20; //kata final berarti nilai variabel tidak dapat di ganti lagi
	int umur;
	String warna;
}

class manusia extends hewan{

	public static void main(String[] args)
	{
		manusia h = new manusia();
		
		h.umur = 20;
		System.out.println(h.umur);
		
		h.set_umur();
		System.out.println(h.get_umur());
		
		h.set_umua(15);
		System.out.print(h.umur + " || "); System.out.println(h.get_umur());
		
		h.set_test(5);
		
		h.get_test2(10); 
		//int a = h.get_test2(10); // kalau ingin mengisi nilai get ke variable a
	}
	
	
	int get_umur() {
		return umur;
	}
	
	void set_umur() {
		umur = 18;
	}

	void set_umua(int umur) {
		this.umur = umur;
	}
	
	void set_test(int n) //methode void
	{
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	int get_test2 (int x)  //methode return
	{
		for(int i=1; i<=x; i++) {
			for(int j=i; j<=x; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return x;
	}
}
