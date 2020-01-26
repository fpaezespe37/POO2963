 
package ec.edu.espe.MechanicSystem.view;

import java.util.ArrayList;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;

public class Persona {
 
    
	private String nombre;
	private String apellidos;
	private Integer edad;
        private String servicio;
	private ArrayList<String> demarcacion;
        private ArrayList<String> sexo;
	private Boolean activo;
        private String codigo;
       // private Boolean sexo;

	public Persona() {
	}
        //Crea provitors
        public Persona(String name){
            this.nombre = name;
        }
        //Crea servicios
        public Persona(String name, String servicio){
            this.nombre = name;
            this.servicio = servicio;
        }
        // Crea Personal
        public Persona(String name, String apellido, ArrayList<String> sexo, String codigo){
            this.nombre = name;
            this.apellidos = apellido;
            this.sexo = sexo;
            this.codigo = codigo;
        }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<String> getSexo() {
        return sexo;
    }

    public void setSexo(ArrayList<String> sexo) {
        this.sexo = sexo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
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
                
                // Cuidado cuando trabajamos con Arrays o Listas
		BasicDBList listPersonal = (BasicDBList) toDBObjectPersonas.get("sexo");
		this.sexo = new ArrayList<String>();
		for (Object demarc : listDemarcaciones) {
			this.sexo.add(demarc.toString());
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
        
        public BasicDBObject toDBObjectCompras() {

		// Creamos una instancia BasicDBObject
		BasicDBObject dBObjectCompras = new BasicDBObject();

		dBObjectCompras.append("nombre", this.getNombre());
		dBObjectCompras.append("servicio", this.getServicio());
		

		return dBObjectCompras;
	}
        
        public BasicDBObject toDBObjectPersonal() {

		// Creamos una instancia BasicDBObject
		BasicDBObject dBObjectPersonal = new BasicDBObject();

		dBObjectPersonal.append("nombre", this.getNombre());
		dBObjectPersonal.append("apellidos", this.getApellidos());
		dBObjectPersonal.append("sexo", this.getSexo());
		dBObjectPersonal.append("codigo", this.getCodigo());
	

		return dBObjectPersonal;
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
