package Concrete;

import Abstract.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Entities.Customer;
public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkCustomer(Customer customer) {
		
		return true;
	}

}
