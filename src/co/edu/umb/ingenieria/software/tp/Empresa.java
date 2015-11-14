package co.edu.umb.ingenieria.software.tp;

public class Empresa {
	 private String nit;
	 private String nombre;
	 private String razonComercial;
	 private String direccion;
	 private String Mujeres;
	 private int telefono;
	 private static Empresa miEmpresa;
	 
	 public  static Empresa getEmpresa(String nit,String nombre, String razonComercial, String direccion, int telefono) {
	 
	 if (miEmpresa==null) {
	 
		 miEmpresa=new Empresa(nit, nombre, razonComercial, direccion, telefono);
	 }
	 return miEmpresa;
	 }
	 
	 private Empresa(String nit,String nombre, String razonComercial, String direccion, int telefono)
	 {
	 
	 this.nit=nit;
	 this.nombre=nombre;
	 this.razonComercial=razonComercial;
	 this.direccion=direccion;
	 this.telefono=telefono;
	 
	 }

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonComercial() {
		return razonComercial;
	}

	public void setRazonComercial(String razonComercial) {
		this.razonComercial = razonComercial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	 
}
