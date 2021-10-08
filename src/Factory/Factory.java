package Factory;

public interface Factory {
	public Heroe getHeroe(String nombre, int vida);
	
	public Villano getVillano(String nombre, int vida);
	}
