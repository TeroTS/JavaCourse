package abstraktit_luokat;

public class testi {

	public static void main(String[] args) {
		
		//luo normaalituote
		NormaaliTuote normaaliTuote = new NormaaliTuote(20.0, "tuote1", 1111);
		System.out.println("Normaalituote: " + normaaliTuote.toString());
		//luo tarjoustuote
		TarjousTuote tarjousTuote = new TarjousTuote(20.0, "tuote2", 2222, 10.0);
		System.out.println("Tarjoustuote: " + tarjousTuote.toString());
		//luo ilmaistuote
		IlmaisTuote ilmaisTuote = new IlmaisTuote(20.0, "tuote3", 3333, "testiostos");
		System.out.println("Ilmaistuote: " + ilmaisTuote.toString());
	}

}
