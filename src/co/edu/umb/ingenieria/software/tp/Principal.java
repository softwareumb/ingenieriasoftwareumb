package co.edu.umb.ingenieria.software.tp;

public class Principal {

	public static void main(String[] args) {
		
		 Empresa e = Empresa.getEmpresa("858585-1", "Lilis S.A", "Lili engeniers", "calle falsa 123", 2565281);
		 
		 System.out.println(e.getNit());
		 Mujeres
		 System.out.println(e.getNombre());
		 System.out.println(e.getRazonComercial());
		 System.out.println(e.getDireccion());
		 System.out.println(e.getTelefono());

	}

}
