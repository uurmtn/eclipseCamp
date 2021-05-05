package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		 
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy(); 
		try { 
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					customer.getNationalityId(),					
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth()); 
		}
	    catch (RemoteException e) { 
			result = false; 
			e.printStackTrace(); 
		}
		
		return result;
	}boolean result;

}
