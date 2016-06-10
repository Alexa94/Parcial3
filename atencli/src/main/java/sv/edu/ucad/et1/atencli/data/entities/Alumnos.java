package sv.edu.ucad.et1.atencli.data.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
@Access(value=AccessType.PROPERTY) //acceso a traves de getters
public class Alumnos {
	private int codalu;
	private String nomalu;
	private String apealu;
	private String carnetalu;
	private String cicloalu;
	private String cuealu;
	private String clavealu;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codalu", updatable=false)		
	public int getCodalu() {
		return codalu;
	}
	public void setCodalu(int codalu) {
		this.codalu = codalu;
	}
	
	@Column(name="nomalu", nullable=false)			
	public String getNomalu() {
		return nomalu;
	}
	public void setNomalu(String nomalu) {
		this.nomalu = nomalu;
	}
	
	@Column(name="apealu", nullable=false)			
	public String getApealu() {
		return apealu;
	}
	public void setApealu(String apealu) {
		this.apealu = apealu;
	}
	
	@Column(name="carnetalu", nullable=false)			
	public String getCarnetalu() {
		return carnetalu;
	}
	
	@Column(name="cicloalu", nullable=false)		
	public String getCicloalu() {
		return cicloalu;
	}
	public void setCicloalu(String cicloalu) {
		this.cicloalu = cicloalu;
	}
	
	public void setCarnetalu(String carnetalu) {
		this.carnetalu = carnetalu;
	}
	
	@Column(name="cuealu", nullable=false)			
	public String getCuealu() {
		return cuealu;
	}
	public void setCuealu(String cuealu) {
		this.cuealu = cuealu;
	}
	
	@Column(name="clavealu", nullable=false)			
	public String getClavealu() {
		return clavealu;
	}
	public void setClavealu(String clavealu) {
		this.clavealu = clavealu;
	}
}