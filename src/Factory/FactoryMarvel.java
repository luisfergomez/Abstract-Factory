package Factory;

public class FactoryMarvel implements Factory {

	@Override
	public Heroe getHeroe(String nombre, int vida) {
		// TODO Esbozo de método generado automáticamente
		return new HeroeMarvel("Ironman", 100);
	}

	@Override
	public Villano getVillano(String nombre, int vida) {
		// TODO Esbozo de método generado automáticamente
		return new VillanoMarvel("Thanos", 100);
	}

}
