package sv.edu.ucad.et1.atencli.data.entities;

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
import javax.persistence.Transient;

@Entity
@Table(name="autor")
//Acceso atraves de los get
@Access(value=AccessType.PROPERTY)

public class Autor {
//Declaracion de campos de la tabla autor
	private int codaut;
	private String nomaut;
	private String apeaut;
	private String nacaut;
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	
//--------Inicio metodos get y set-------------------	
@Column(name="codaut", updatable=false)
	public int getCodaut() {
		return codaut;
	}
	public void setCodaut(int codaut) {
		this.codaut = codaut;
	}
//----------------------------------------------------
	@Column(name="nomaut", nullable=false)
	public String getNomaut() {
		return nomaut;
	}
	public void setNomaut(String nomaut) {
		this.nomaut = nomaut;
	}
//----------------------------------------------------	
	@Column(name="apeaut", nullable=false)
	public String getApeaut() {
		return apeaut;
	}
	public void setApeaut(String apeaut) {
		this.apeaut = apeaut;
	}
//----------------------------------------------------
	@Column(name="nacaut", nullable=false)
	public String getNacaut() {
		return nacaut;
	}
	public void setNacaut(String nacaut) {
		this.nacaut = nacaut;
	}
//----------fin de metodo get y set-------------------
}//Fin de la clase Autor
