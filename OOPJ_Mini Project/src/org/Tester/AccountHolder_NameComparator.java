package org.Tester;
import java.util.Comparator;

import org.domain.Bank;

public class AccountHolder_NameComparator implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		
		return o1.getCustomer_name().compareTo(o2.getCustomer_name());
	}

}


