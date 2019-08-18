package Kedua;
import Pertama.Binatang;

class luar{
	
	private String x = "Maya";
	
	class dalam{
		void kata() {
			System.out.println("hei... " + x);
		}
	}
	void tampilkan() {
		dalam d = new dalam();
		d.kata();
	}
	
}

public class Karnivora {
	
	public static void main(String[] args) {
		Binatang b = new Binatang();
		System.out.println(b.tinggi);
		
		System.out.println("=============");
		luar l = new luar();
		l.tampilkan();	
	}

}
