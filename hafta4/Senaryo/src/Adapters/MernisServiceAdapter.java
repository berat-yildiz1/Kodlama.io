package Adapters;


import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisTest.KPSPublicSoapProxy;;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula();
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityid()), customer.getFirstname().toUpperCase(),
				customer.getLastname().toUpperCase(), Integer.parseInt(customer.getDateofbirth()));
		
	}

}
