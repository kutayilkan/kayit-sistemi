package com.pack.service;

import java.io.*;
import java.util.*;

import com.pack.model.Person;

public class ControllerService {

	ArrayList<Person> people = new ArrayList<Person>();
	
	//dosyayý bilgisayara kendi oluþturup üzerine yazýyor.
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
		//bu þekilde arrayliste kaydedip listeleyince program kapandýðýnda kayýtlý kiþiler siliniyor.
		//alt taraftaki gibi dosyadan okuma iþlemi yapýlýrsa her input tek kelime olarak alýnabiliyor o yüzden replace methodu ile boþluklarý kaldýrdým. Buna Çözüm bulamadým o yüzden bu þekilde býraktým.
		
	}
	//Dosyada bulunan kiþileri listeleme
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
