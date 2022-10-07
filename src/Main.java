
public class Main {

	public static void main(String[] args) {
		System.out.println("Merhaba JAVA!..");
		
		//Variables
		int ogrenciSay�s�= 20;
		String mesaj="��renci say�m:";
		System.out.println(mesaj + ogrenciSay�s�);
		System.out.println(mesaj + ogrenciSay�s�);
		System.out.println("��renci say�m: " + ogrenciSay�s�);
		
		// Conditionals
		int say�=25;
		if(say�<20) {
			System.out.println("Say� 20 den k���kt�r.");
		}else if(say�==20) {
			System.out.println("Say� 20 ye e�ittir.");
		}
		else {
			System.out.println("Say� 20den b�y�kt�r.");
		}
		// Camp Demo1
		int say�1=20; int say�2=25; int say�3=2;
		int enBuyuk=say�1;
		if(enBuyuk<say�2) {
			enBuyuk=say�2;
		}
		else if(enBuyuk<say�3) {
			enBuyuk=say�3;
		}
		System.out.println("En b�y�k say�: " +enBuyuk);
		
		// Switch Case
		char grade='A';
		
		switch(grade) {
		     case'A':
		    	 System.out.println("M�kemmel. Ge�tiniz.");
		    	 break;
		     case'B':
		    	 System.out.println("�ok G�zel. Ge�tiniz.");
		    	 break;
		     case'C':
		    	 System.out.println("�yi. Ge�tiniz.");
		    	 break;
		     case'D':
		    	 System.out.println("Fena De�il. Ge�tiniz.");
		    	 break;
		     case'F':
		    	 System.out.println("Maalesef. Kald�n�z.");
		    	 break;
		    	 default:
		    		 System.out.println("Ge�ersiz not girdiniz.");
		    		 break;
		}
		// FOR D�ng�s�
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("For d�ng�s� bitti.");
		// While
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While d�ng�s� bitti.");
		// Dizilerle �al��mak
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
		//********* Mini Deneme-1(Asal Say�)***************
		int number=11;
		int remainder= number % 2;
		System.out.println("-----Mini Deneme-1(Asal Say�)-------");
		boolean isPrime= true;
		for(int k=2; k<=number;k++) {
			if(number%k == 0)
				isPrime= false;
		}
		if(isPrime) {
			System.out.println("Say� asald�r.");
		}else 
			System.out.println("Say� asal de�ildir.");
		if(number==1)
			System.out.println("Say� asal de�ildir.");
		if(number<1)
			System.out.println("Ge�ersiz say� girdiniz.");
		
		//********* Mini Deneme-2(Sesli Harfler)***************
		
		char harf='A';
		
		switch (harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kal�n sesli harf");
				break;
				default:
					System.out.println("�nce sesli harf");
				
		}
		//********* Mini Deneme-3(M�kemmel Say�)***************
		int numb=28;
		int top=0;
		for(int m=1;m<numb;m++) {
			if(numb % m ==0 )
				top=top+m;
		}
		System.out.println("-----M�kemmel Say�-------");
		if(numb==top)
			System.out.println(numb+" say�s� M�kemmel Say�d�r.");
		else
			System.out.println(numb+" M�kemmel Say� De�ildir.");
		//********* Mini Deneme-4(Arkada� Say�lar)***************
		System.out.println("-----Arkada� Say�lar-------");
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
			System.out.println(say1+" ve "+say2+" Arkada� say�lard�r.");
		}else
			System.out.println(say1+" ve "+say2+" Arkada� say� DE��LLERD�R.");
		//********* Mini Deneme-5(Say� Bulma)***************
		System.out.println("-----Say� Bulma-------");		
		int[] say�lar1=new int[] {1,2,7,5,9,0};
		int aranacak=5;
		boolean varM�=false;
		for(int s:say�lar1) {
			if(s==aranacak)
				varM�=true;
			break;
		}
		if(varM�)
			System.out.println("Say� Mevcuttur.");
		else 
			System.out.println("Say� mevcut de�ildir.");
		
	}

}
