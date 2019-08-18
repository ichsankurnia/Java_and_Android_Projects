package Pertama;

//public bisa dipanggil di package manapun
//protected gabisa dipanggil di lain package
//private hanya bisa diakses hanya pada kelas nya sendiri

public class Binatang {
	int ting = 25;
	public int tinggi = 10; //beda paket harus pake public
	
	int get_hitung(int a, int b) //satu paket
	{
		return a * b;
	}
	void set_itung(double a, double b) //satu paket
	{
		double c = a * b;
		System.out.println(c);
	}
}
