
public abstract class Figura {
	
	public static Figura crearFigura(String type) 
	{
		if (type.equals("Circulo"))
		return new Circulo();
		if (type.equals("Triangulo"))
		return new Triangulo();
		return null;
		}
		public abstract void imprimir();

}
