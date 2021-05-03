package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{
	CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService){
	this.customerCheckService=customerCheckService;
	}
	@Override
	    public void saveToDb(Customer customer) throws Exception {
	        if (customerCheckService.checkCustomer(customer)){
	            super.saveToDb(customer);
	        }
	        else{
	            throw new Exception("Müþteri doðrulama yapýlamadý.");
	        }

}
}
