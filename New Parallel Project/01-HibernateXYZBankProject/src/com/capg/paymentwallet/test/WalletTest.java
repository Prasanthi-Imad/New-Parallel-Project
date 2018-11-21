/*package com.capg.paymentwallet.test;

import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capg.paymentwallet.bean.CustomerBean;
import com.capg.paymentwallet.service.AccountServiceImpl;
import com.capg.paymentwallet.service.IAccountService;

public class WalletTest {
	CustomerBean bean = new CustomerBean();
	private static IAccountService service;

	@BeforeClass
	public static void createInstance() {
		service = new AccountServiceImpl();
	}

	@Test
	public void testPhoneNumberForLength() {
		bean.setFirstName("Prasanthi");
		bean.setLastName("Pinjarla");
		bean.setEmailId("prasanthi@gmail.com");
		bean.setPhoneNo("89456712");
		boolean result = service.validate(bean);
		assertFalse(false);
	}

}
*/