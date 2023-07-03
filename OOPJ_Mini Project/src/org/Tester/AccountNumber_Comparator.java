package org.Tester;
import java.util.Comparator;

import org.domain.Bank;

public class AccountNumber_Comparator implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		
		return o1.getAccount_no()-o2.getAccount_no();
	}
	

}

