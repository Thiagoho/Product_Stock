package entities;

public record Product(String name, double price, int quantity) {
	public double totalValueStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;

	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	
	/* vamos criar o toString ai para  deixar o main legível*/
	public String toString() {
		return name
				+ "," 
				+ String.format("%.2f, price)" //Tramento de exceção 
						+ ", "
						+ quantity
						+ "units, Total: $"
						+ String.format("%.2f", totalValueStock()));//Tramento de exceção 
	}
}