package it.prova.esempiolambda;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MockData {
	
	public static final List<PostaDiPaese> POSTADIPAESE_LIST = new ArrayList<PostaDiPaese>();
	
	static {
		
		try {
			
			PostaDiPaese roma = new PostaDiPaese(1L, "roma", "via roma",  new SimpleDateFormat("dd-mm-yyyy").parse("10-11-2022"), 10);
			Destinatario pippoDiroma = new Destinatario(1L, "pippo", "pippo", 52,"via roma 1", true,roma);
			roma.getDestinatari().add(pippoDiroma);
			Destinatario plutoDiRoma = new Destinatario(2L, "pluto", "pluto", 62,"via roma 2", false,roma);
			roma.getDestinatari().add(plutoDiRoma);
			
			PostaDiPaese milano = new PostaDiPaese(2L, "milano", "via milano",  new SimpleDateFormat("dd-mm-yyyy").parse("10-11-2019"), 20);
			Destinatario pippoDiMilano = new Destinatario(3L, "pippo", "pippo", 96,"via milano 1", true, milano);
			roma.getDestinatari().add(pippoDiMilano);
			Destinatario plutoDiMilano = new Destinatario(4L, "pluto", "pluto", 10,"via milano 2", false, milano);
			roma.getDestinatari().add(plutoDiMilano);
			
			PostaDiPaese firenze = new PostaDiPaese(3L, "firenze", "via firenze",  new SimpleDateFormat("dd-mm-yyyy").parse("10-11-1980"), 30);
			Destinatario pippoDiFirenze = new Destinatario(5L, "pippo", "pippo", 29,"via firenze 1", true,firenze);
			firenze.getDestinatari().add(pippoDiFirenze);
			Destinatario plutoDiFirenze = new Destinatario(6L, "pluto", "pluto", 24,"via firenze 2", false,firenze);
			firenze.getDestinatari().add(plutoDiFirenze);
			
			
			POSTADIPAESE_LIST.add(roma);
			POSTADIPAESE_LIST.add(milano);
			POSTADIPAESE_LIST.add(firenze);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
