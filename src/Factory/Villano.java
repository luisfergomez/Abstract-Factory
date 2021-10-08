package Factory;

public abstract class Villano {
	private String nombre;
	private int vida;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public Villano(String nombre, int vida) {
		this.nombre=nombre;
		this.vida=vida;	
	}
}
