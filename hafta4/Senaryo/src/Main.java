import Abstract.BaseCustomerManager;
import Entities.Customer;
import concretes.NeroCustomerManager;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer cst = new Customer(1,"berat","yıldız","1994","adsas");
		
		customerManager.Save(cst);
		

	}

}
