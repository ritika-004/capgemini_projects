package association;

public class car2 {
	//new Car()
		private String brand;//null
		private double price;//0.0
		
		
		private Tyre tyre;//null
		
		car2(){
			tyre=new Tyre();
		}
		
		public String getBrand() {
			return brand;
		}
		
		public double getPrice() {
			return price;
		}
		
		public Tyre getTyre() {
			return tyre;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setTyre(Tyre tyre) {
			this.tyre = tyre;
		}

}
