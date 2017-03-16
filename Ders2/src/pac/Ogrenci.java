package pac;

import pac2.Sinif;

public class Ogrenci {

	private String ad;
	private String soyad;
	private int yas;
	private double boy;
	public Sinif snf;
	
	//Constructor Example
	public Ogrenci(String ad, String soyad, int yas, double boy,Sinif snf){
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.boy = boy;
		this.snf = snf;
	}
	
	//Method Example
	public void yaz() {
		System.out.println("Ad: "+ad);
		System.out.println("Soyad: "+soyad);
		System.out.println("Yas: "+yas);
		System.out.println("Boy: "+boy);
		snf.sinifYaz();
		
	}

	//Getter Example
	public int getYas() {
		return yas;
	}
	
	//Setter Example
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	public void casting(String str){
		this.boy = Double.parseDouble(str);
	}
	
	

}
