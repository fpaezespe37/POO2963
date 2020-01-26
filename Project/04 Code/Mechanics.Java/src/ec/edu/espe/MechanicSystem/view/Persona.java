 
package ec.edu.espe.MechanicSystem.view;

import java.util.ArrayList;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;

public class Persona {
 
    
	private String nombre;
	private String apellidos;
	private Integer edad;
	private ArrayList<String> demarcacion;
	private Boolean activo;

	public Persona() {
	}
        public Persona(String name){
            this.nombre = name;
        }
	public Persona(String nombre, String apellidos, int edad, ArrayList<String> demarcacion, Boolean estadoActivo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.demarcacion = demarcacion;
		this.activo = estadoActivo;
	}

	// Transformo un objecto que me da MongoDB a un Objecto Java
	public Persona(BasicDBObject toDBObjectPersonas) {
		this.nombre = toDBObjectPersonas.getString("nombre");
		this.apellidos = toDBObjectPersonas.getString("apellidos");
		this.edad = toDBObjectPersonas.getInt("edad");

		// Cuidado cuando trabajamos con Arrays o Listas
		BasicDBList listDemarcaciones = (BasicDBList) toDBObjectPersonas.get("demarcacion");
		this.demarcacion = new ArrayList<String>();
		for (Object demarc : listDemarcaciones) {
			this.demarcacion.add(demarc.toString());
		}

		this.activo = toDBObjectPersonas.getBoolean("estadoActivo");
	}

	public BasicDBObject toDBObjectPersonas() {

		// Creamos una instancia BasicDBObject
		BasicDBObject dBObjectPersona = new BasicDBObject();

		dBObjectPersona.append("nombre", this.getNombre());
		dBObjectPersona.append("apellidos", this.getApellidos());
		dBObjectPersona.append("edad", this.getEdad());
		dBObjectPersona.append("demarcacion", this.getDemarcacion());
		dBObjectPersona.append("estadoActivo", this.getestadoActivo());

		return dBObjectPersona;
	}
        public BasicDBObject toDBObjectProvitors() {

		// Creamos una instancia BasicDBObject
		BasicDBObject dBObjectProvitors = new BasicDBObject();

		dBObjectProvitors.append("provitor", this.getNombre());
		

		return dBObjectProvitors;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public ArrayList<String> getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(ArrayList<String> demarcacion) {
		this.demarcacion = demarcacion;
	}

	public Boolean getestadoActivo() {
		return activo;
	}

	public void setestadoActivo(Boolean estadoActivo) {
		this.activo = estadoActivo;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + " " + this.getApellidos() + " / Edad: " + this.edad + " / Demarcación: " + this.demarcacion.toString() + " / estadoActivo: " + this.activo;
	}
}
