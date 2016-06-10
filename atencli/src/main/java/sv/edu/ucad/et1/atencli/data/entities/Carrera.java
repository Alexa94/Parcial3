package sv.edu.ucad.et1.atencli.data.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="carrera")
@Access(value=AccessType.PROPERTY) //acceso a traves de getters

public class Carrera {
	private int codcar;
	private String nomcar;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codcar", updatable=false)			
	public int getCodcar() {
		return codcar;
	}
	public void setCodcar(int codcar) {
		this.codcar = codcar;
	}
	
	List<Alumnos> alumnos = new ArrayList<Alumnos>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="codcar", nullable=false)	
	public List<Alumnos> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Alumnos> alumnos) {
		this.alumnos = alumnos;
	}
	
	
	@Column(name="nomcar", nullable=false)				
	public String getNomcar() {
		return nomcar;
	}
	public void setNomcar(String nomcar) {
		this.nomcar = nomcar;
	}
}