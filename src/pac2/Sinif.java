package pac2;

public class Sinif {

	public int seviye;
	public String ad;
	
	public Sinif(int seviye, String ad){
		this.seviye = seviye;
		this.ad = ad;
	}
	
	public void sinifYaz(){
		System.out.println("Seviye: "+this.seviye);
		System.out.println("Sinif adi: "+this.ad);
	}

}
