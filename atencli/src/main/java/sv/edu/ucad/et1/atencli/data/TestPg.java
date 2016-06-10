package sv.edu.ucad.et1.atencli.data;

import org.hibernate.Session;

public class TestPg {
   public static void main(String[] args){
	Session sesion = hibernateUtil.getSessionFactory().openSession();
	sesion.beginTransaction();
	sesion.close();
     }
}