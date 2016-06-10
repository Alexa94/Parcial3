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
@Table(name="utiles")
@Access(value=AccessType.PROPERTY)

public class Utiles {

	  private int codutil;
	    private String nomutil;
		
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="codutil", updatable=false)
		public int getCodutil() {
			return codutil;
		}
		public void setCodutil(int codutil) {
			this.codutil = codutil;
		}
		
		@Column(name="nomutil", nullable=false)
		public String getNomutil() {
			return nomutil;
		}
		public void setNomutil(String nomutil) {
			this.nomutil = nomutil;
		}
	}//Fin 

