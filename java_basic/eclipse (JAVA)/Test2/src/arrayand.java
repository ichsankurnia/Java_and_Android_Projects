
public class arrayand {

	public static void main(String[] args) {
		
		int[] kotak = new int[3];		
		kotak[0]=100; kotak[1]=200; kotak[2]=300;
		
		System.out.println(kotak[0]);
		
		for(int i=0; i<kotak.length; i++){
			System.out.print(kotak[i]+" ");
		}	
		System.out.println();
		
		int[] kotak2 = {10, 20, 30, 40, 50 };
		kotak2[1]=25;
		for(int j=0; j<kotak2.length; j++){
			System.out.print(kotak2[j]+" ");
		}
		System.out.println(); System.out.println();
		
		//array 2d
		String[][] kotak3 = new String[][] {
									{"indonesia", "jakarta"},
									{"italia", "roma"},
									{"prancis", "paris"}
								};
		for(int x=0; x<kotak3.length; x++) {
			for(int y=0; y<kotak3[x].length; y++) {
				//System.out.println("x : " + kotak3.length + " y = : " + kotak3[x].length);
				System.out.println(kotak3[x][y]);
			}
			System.out.println("-----------");
		}
	}
}
