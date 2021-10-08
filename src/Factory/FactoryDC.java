package Factory;

public class FactoryDC implements Factory{

	@Override
	public Heroe getHeroe(String nombre, int vida) {
		// TODO Esbozo de método generado automáticamente
		return new HeroeDC("Shazam", 100);
	}

	@Override
	public Villano getVillano(String nombre, int vida) {
		// TODO Esbozo de método generado automáticamente
		return new VillanoDC("Dark Seid", 100);
	}

}
