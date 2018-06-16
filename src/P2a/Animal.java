package P2a;

public class Animal {
	
		private  String name;
		private  String especie;
		private  String alimentacion;
		private  String crecimiento;
		private  String habitat;
		private int idacuario;
		
		public Animal(String name, String especie, String alimentacion, String crecimiento, String habitat, int idacuario) {	
			this.name = name;
			this.especie = especie;
			this.alimentacion = alimentacion;
			this.crecimiento = crecimiento;
			this.habitat = habitat;
			this.idacuario = idacuario;
		}
		public int getIdAcuario() {
			return idacuario;
		}
		public  String getName() {
			return name;
		}
		public  String getEspecie() {
			return especie;
		}
		public  String getAlimentacion() {
			return alimentacion;
		}
		public  String getCrecimiento() {
			return crecimiento;
		}
		public  String getHabitat() {
			return habitat;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAlimentacion(String alimentacion) {
			this.alimentacion = alimentacion ;
		}
		public void setEspecie(String especie) {
			this.especie = especie;
		}
		public void setCrecimiento(String crecimiento) {
			this.crecimiento = crecimiento;
		}
		public void setHabitat(String habitat) {
			this.habitat = habitat;
		}
		
		public String getTotalInfo() {
		    return ("Nombre: " + this.name + " Alimentacion: " + this.alimentacion
		    		+ " Especie: " + this.especie + " Crecimiento: " + this.crecimiento + " Habitat Natural: "
		    		+ this.habitat);
		} 
		

}
