
public class konstruktor {

	int angka;
	String warna = "hitam";
	
	//konstruktor
	public konstruktor(int angka, String warnaBaru) // fungsi yg pertama kali dijalankan ketika membuat objek kelas
	{
		this.angka = angka; // this untuk variabel yg sama
		warna = warnaBaru;
	}

	public static void main(String[] args)
	{
		konstruktor objek = new konstruktor(20, "Warna Biru");
		konstruktor objek2 = new konstruktor(25, "Warna Hitam");
		
		System.out.println(objek.angka + " " + objek.warna);
		System.out.println(objek2.angka + " " + objek2.warna);
	}
}
