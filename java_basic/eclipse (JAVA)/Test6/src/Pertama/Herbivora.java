package Pertama;

public class Herbivora {

	public static void main(String[] args) {
		Binatang a = new Binatang();
		
		a.ting = 125;
		System.out.println(a.ting);
		
		int c = a.get_hitung(5,10);
		System.out.println(c);
		//System.out.println(a.get_hitung(5,10));
		
		System.out.println("------");
		a.set_itung(5,10);
	}

}
