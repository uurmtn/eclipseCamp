
import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Adapters.MernisCheckManager;
import Concrate.NeroCustomerManager;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setId(1);
		customer.setNationalityId(0000000000000);
		customer.setFirstName("UÐUR");
		customer.setLastName("METÝN");
		customer.setDateOfBirth(19910812);

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisCheckManager());
		customerManager.save(customer);

	}
}
