package Abstract;
import Entities.Customer;

public interface CustomerService {
	  void saveToDb(Customer customer) throws Exception;
}
