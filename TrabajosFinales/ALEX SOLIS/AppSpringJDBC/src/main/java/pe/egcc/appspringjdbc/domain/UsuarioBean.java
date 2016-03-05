package pe.egcc.appspringjdbc.domain;

public class UsuarioBean {

	private String id;
	private String uapaterno;
	private String uamaterno;
	private String uanombres;
	private String usuario;
	private String clave;
	private Integer cargo_id;
	private String dni;
	private String correo;
	private String equipo;
	private String ruta;

	public UsuarioBean() {
	}

	public UsuarioBean(String id, String uapaterno, String uamaterno, String uanombres, String usuario, String clave,
			Integer cargo_id, String dni, String correo, String equipo, String ruta) {
		super();
		this.id = id;
		this.uapaterno = uapaterno;
		this.uamaterno = uamaterno;
		this.uanombres = uanombres;
		this.usuario = usuario;
		this.clave = clave;
		this.cargo_id = cargo_id;
		this.dni = dni;
		this.correo = correo;
		this.equipo = equipo;
		this.ruta = ruta;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUapaterno() {
		return uapaterno;
	}

	public void setUapaterno(String uapaterno) {
		this.uapaterno = uapaterno;
	}

	public String getUamaterno() {
		return uamaterno;
	}

	public void setUamaterno(String uamaterno) {
		this.uamaterno = uamaterno;
	}

	public String getUanombres() {
		return uanombres;
	}

	public void setUanombres(String uanombres) {
		this.uanombres = uanombres;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Integer getCargo_id() {
		return cargo_id;
	}

	public void setCargo_id(Integer cargo_id) {
		this.cargo_id = cargo_id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}


}
