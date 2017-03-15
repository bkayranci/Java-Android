package pac;

import pac2.Sinif;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sinif snf = new Sinif(1, "M-205");
		
		Ogrenci ogr = new Ogrenci("Turkalp Burak", "Kayrancioglu", 19, 1.78,snf);
		ogr.yaz();
		
		//1 sene sonra 
		ogr.setYas(20);
		ogr.yaz();
		
		//Boyu string olarak vermek istiyorum. Private oldugu icin method ile yapıyorum.
		ogr.casting("1.95");
		ogr.yaz();
	}
	
	

}
