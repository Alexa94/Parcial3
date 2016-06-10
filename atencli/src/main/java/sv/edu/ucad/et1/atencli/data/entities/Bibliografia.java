package sv.edu.ucad.et1.atencli.data.entities;

import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.persistence.Transient;

@Entity
@Table(name="bibliografia")
//accesso atraves de los get
@Access(value=AccessType.PROPERTY)

public class Bibliografia {
//Declaracion de campos de la tabla bibliografia
        private int codbiblio;
        private String lugimbiblio;
		private Date fecimbiblio;
		
//Tabla asociada
		public Autor apa;
			//public Bibliografia biblio;
//Asociacion UnoaUno Unidireccional
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="codaut")
		public Autor getApa() {
					return apa;
				}
				public void setApa( Autor apa) {
					this.apa = apa;
				}
//------------Fin de asociacion------------------------
				
//Propiedad bandera que se declara con la anotacion
				
		        private boolean estado;
		       // @Transient
 boolean isEstado() {
			return estado;	
			}
		        public void setEstado(boolean estado) {
				this.estado = estado;
			}
//--------Fin de propiedad declarada-----------------
		
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
		
//--------Inicio metodos get y set-------------------		
@Column(name="codbiblio", updatable=false) 
    public int getCodbiblio() {
	return codbiblio;
}
    public void setCodbiblio(int codbiblio) {
	this.codbiblio = codbiblio;
}
//----------------------------------------------------
@Column(name="lugimbiblio", nullable=false)
     public String getLugimbiblio() {
	    return lugimbiblio;
}
     public void setLugimbiblio(String lugimbiblio) {
	    this.lugimbiblio = lugimbiblio;
}
//----------------------------------------------------	
@Column(name="fecimbiblio")
     public Date getFecimbiblio() {
     	return fecimbiblio;
}
     public void setFecimbiblio(Date date) {
	    this.fecimbiblio = date;
}
//----------fin de metodo get y set-------------------
     
     
}//Fin de la clase Bibliografia
