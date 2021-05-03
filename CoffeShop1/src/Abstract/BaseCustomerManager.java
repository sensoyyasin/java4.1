package Abstract;
import Entities.Customer;
public abstract class BaseCustomerManager implements CustomerService {
	@Override
    public void saveToDb(Customer customer) throws Exception {
        System.out.println("Müþteri veri tabanýna baþarýyla eklendi : " + customer.getFirstName());
        System.out.println("Müþteri veri tabanýna baþarýyla eklendi : " + customer.getLastName());
	}
}
