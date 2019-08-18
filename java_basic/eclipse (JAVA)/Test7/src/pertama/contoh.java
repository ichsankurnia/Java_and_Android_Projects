package pertama;

class poli{
	void data() {
		System.out.println("Normal");
	}
}

class univ extends poli{
	void data() {
		System.out.println("Sangat Banyak Sekali");
	}
}

class seko extends poli{
	void data() {
		System.out.println("Lebih sedikit");
	}
}

public class contoh {
	public static void main(String[] args) {
		test t = new test();
		t.set_tinggi(25);
		System.out.println(t.get_tinggi());
		System.out.println("=============");
		
		poli p = new poli();
		p.data();
		System.out.println("=============");
		
		poli u = new univ();
		u.data();
		System.out.println("=============");
		
		poli s = new seko();
		s.data();
	}
}
