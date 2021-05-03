package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerService;
import Entities.Customer;

public class NeroCustomerManager  extends BaseCustomerManager{
	 @Override
	    public void saveToDb(Customer customer) throws Exception {
	        super.saveToDb(customer);
	    }
}
