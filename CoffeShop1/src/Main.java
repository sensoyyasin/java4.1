import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
public class Main {

		 public static void main(String[] args) throws Exception {
		        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		        customerManager.saveToDb(new Customer(1,"Yasin", "Þensoy", LocalDate.of(2001,15,13),"12345678901"));
	}




	}

