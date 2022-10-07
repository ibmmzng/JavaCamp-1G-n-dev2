
public class Main {

	public static void main(String[] args) {
		System.out.println("Merhaba JAVA!..");
		
		//Variables
		int ogrenciSayýsý= 20;
		String mesaj="Öðrenci sayým:";
		System.out.println(mesaj + ogrenciSayýsý);
		System.out.println(mesaj + ogrenciSayýsý);
		System.out.println("Öðrenci sayým: " + ogrenciSayýsý);
		
		// Conditionals
		int sayý=25;
		if(sayý<20) {
			System.out.println("Sayý 20 den küçüktür.");
		}else if(sayý==20) {
			System.out.println("Sayý 20 ye eþittir.");
		}
		else {
			System.out.println("Sayý 20den büyüktür.");
		}
		// Camp Demo1
		int sayý1=20; int sayý2=25; int sayý3=2;
		int enBuyuk=sayý1;
		if(enBuyuk<sayý2) {
			enBuyuk=sayý2;
		}
		else if(enBuyuk<sayý3) {
			enBuyuk=sayý3;
		}
		System.out.println("En büyük sayý: " +enBuyuk);
		
		// Switch Case
		char grade='A';
		
		switch(grade) {
		     case'A':
		    	 System.out.println("Mükemmel. Geçtiniz.");
		    	 break;
		     case'B':
		    	 System.out.println("Çok Güzel. Geçtiniz.");
		    	 break;
		     case'C':
		    	 System.out.println("Ýyi. Geçtiniz.");
		    	 break;
		     case'D':
		    	 System.out.println("Fena Deðil. Geçtiniz.");
		    	 break;
		     case'F':
		    	 System.out.println("Maalesef. Kaldýnýz.");
		    	 break;
		    	 default:
		    		 System.out.println("Geçersiz not girdiniz.");
		    		 break;
		}
		// FOR Döngüsü
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti.");
		// While
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While döngüsü bitti.");
		// Dizilerle çalýþmak
		String[] ogrenciler= new String[3];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		for(int j=0;j<ogrenciler.length;j++) {
			System.out.println(ogrenciler[j]);
		}
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		//********* Mini Deneme-1(Asal Sayý)***************
		int number=11;
		int remainder= number % 2;
		System.out.println("-----Mini Deneme-1(Asal Sayý)-------");
		boolean isPrime= true;
		for(int k=2; k<=number;k++) {
			if(number%k == 0)
				isPrime= false;
		}
		if(isPrime) {
			System.out.println("Sayý asaldýr.");
		}else 
			System.out.println("Sayý asal deðildir.");
		if(number==1)
			System.out.println("Sayý asal deðildir.");
		if(number<1)
			System.out.println("Geçersiz sayý girdiniz.");
		
		//********* Mini Deneme-2(Sesli Harfler)***************
		
		char harf='A';
		
		switch (harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalýn sesli harf");
				break;
				default:
					System.out.println("Ýnce sesli harf");
				
		}
		//********* Mini Deneme-3(Mükemmel Sayý)***************
		int numb=28;
		int top=0;
		for(int m=1;m<numb;m++) {
			if(numb % m ==0 )
				top=top+m;
		}
		System.out.println("-----Mükemmel Sayý-------");
		if(numb==top)
			System.out.println(numb+" sayýsý Mükemmel Sayýdýr.");
		else
			System.out.println(numb+" Mükemmel Sayý Deðildir.");
		//********* Mini Deneme-4(Arkadaþ Sayýlar)***************
		System.out.println("-----Arkadaþ Sayýlar-------");
		int say1=220; int say2=284;
		int top1=0; int top2=0;
		for(int x=1;x<say1;x++) {
			if(say1 % x ==0 )
				top1=top1+x;
		}
		for(int y=1;y<say2;y++) {
			if(say2 % y ==0 )
				top2=top2+y;
		}
		if(say1==top2 & say2==top1) {
			System.out.println(say1+" ve "+say2+" Arkadaþ sayýlardýr.");
		}else
			System.out.println(say1+" ve "+say2+" Arkadaþ sayý DEÐÝLLERDÝR.");
		//********* Mini Deneme-5(Sayý Bulma)***************
		System.out.println("-----Sayý Bulma-------");		
		int[] sayýlar1=new int[] {1,2,7,5,9,0};
		int aranacak=5;
		boolean varMý=false;
		for(int s:sayýlar1) {
			if(s==aranacak)
				varMý=true;
			break;
		}
		if(varMý)
			System.out.println("Sayý Mevcuttur.");
		else 
			System.out.println("Sayý mevcut deðildir.");
		
	}

}
