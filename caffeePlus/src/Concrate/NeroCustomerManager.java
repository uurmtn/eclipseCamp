package Concrate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void Save(Customer customer) throws Exception {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Kiþi bilgileri geçerli deðil.");
		}

	}

}
