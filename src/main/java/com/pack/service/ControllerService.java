package com.pack.service;

import java.io.*;
import java.util.*;

import com.pack.model.Person;

public class ControllerService {

	ArrayList<Person> people = new ArrayList<Person>();
	
	//dosyay� bilgisayara kendi olu�turup �zerine yaz�yor.
	File file = new File("people.txt");
	
	
	//Dosyaya kaydetme
	public void register(Person person) {
		
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));
			pw.append("\n"+person.getIsim().replace(" ", "")+" "+person.getSoyisim().replace(" ", "")+" "+person.getKangrubu().replace(" ", "")+" "+person.getTelefon().replace(" ", "")+" "+ person.getAdres().replace(" ", ""));
			pw.close();
		}catch (Exception e) {
		
		}
		
		//people.add(person);
		//bu �ekilde arrayliste kaydedip listeleyince program kapand���nda kay�tl� ki�iler siliniyor.
		//alt taraftaki gibi dosyadan okuma i�lemi yap�l�rsa her input tek kelime olarak al�nabiliyor o y�zden replace methodu ile bo�luklar� kald�rd�m. Buna ��z�m bulamad�m o y�zden bu �ekilde b�rakt�m.
		
	}
	//Dosyada bulunan ki�ileri listeleme
	public ArrayList<Person> listeleme() {
			people.clear();
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {
				Person per = new Person();
				per.setIsim(scanner.next());
				per.setSoyisim(scanner.next());
				per.setKangrubu(scanner.next());
				per.setTelefon(scanner.next());
				per.setAdres(scanner.next());
				
				people.add(per);
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return people;
		
		
	

	}
}
