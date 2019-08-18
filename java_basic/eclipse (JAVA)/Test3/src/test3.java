
public class test3 {
	
	public String warna = "putih";

	public static void main(String[] args) 
	{
		//Methode void 
		test3 jalan = new test3();
		jalan.berjalan();
		jalan.kereta("tut tut tuuuut...", 20);
		
		System.out.println("----------");
		
		//Methode Return = mengembalikan nilai
		test3 kembali = new test3();
		System.out.println(kembali.test());
		
		System.out.println("----------");
		
		//Methode set
		test3 atur = new test3();
		System.out.println(atur.warna);
		atur.setWarna("Hitam");
		System.out.println(atur.warna);
		
		System.out.println("-------------");
		
		//Methode get
		test3 ambil = new test3();
		System.out.println(ambil.warna);
		
		ambil.setWarna("Biru");
		System.out.println(ambil.getWarna());
		System.out.println(ambil.getAngka());
		
	}
	
	void berjalan() {
		System.out.println("Berjalan prak prok");
	}	
	void kereta(String suara, int angka) {
		System.out.println("Naik Kereta Api "+ suara + " " + angka);
	}
	
	//methode return
	//tipeData namaMethode(){  return;}
	String test() {
		return warna;
	}
	
	//methode SET & GET	
	//methode set = methode void nilai atau logika nya langsung diisi dan diatur
	void setWarna(String warnaParameter) {
		warna = warnaParameter;
	}
	//methode get = methoden return harus ada return untuk mengembalikan nilai
	String getWarna() {
		return warna;
	}
	
	int getAngka() {
		return 3000;
	}
}