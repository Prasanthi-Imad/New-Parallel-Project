package com.capg.paymentwallet.service;

import com.capg.paymentwallet.bean.AccountBean;
import com.capg.paymentwallet.dao.AccountDAOImpl;
import com.capg.paymentwallet.dao.IAccountDao;
import com.capg.paymentwallet.exception.CustomerException;
import com.capg.paymentwallet.exception.CustomerExceptionMessage;

public class AccountServiceImpl implements IAccountService{
	IAccountDao dao=null;
	@Override
	public boolean createAccount(AccountBean accountBean)
			throws Exception {
		dao=new AccountDAOImpl();
		boolean result=dao.createAccount(accountBean);
		return result;
	}

	

	@Override
	public boolean deposit(AccountBean accountBean, double depositAmount)
			throws Exception {
		return dao.deposit(accountBean, depositAmount);
	}

	@Override
	public boolean withdraw(AccountBean accountBean, double withdrawAmount)
			throws Exception {
		return dao.withdraw(accountBean, withdrawAmount);
	}

	@Override
	public boolean fundTransfer(AccountBean transferingAccountBean,
			AccountBean beneficiaryAccountBean, double transferAmount) throws Exception {
		
		return dao.fundTransfer(transferingAccountBean, beneficiaryAccountBean, transferAmount);
	}

	@Override
	public AccountBean findAccount(int accountId) throws Exception {
		
		return dao.findAccount(accountId);
	}


	@Override
	public boolean validate(AccountBean bean) throws CustomerException  {
        boolean isValid = false;
        if (bean.getCustomerBean().getFirstName().trim().length() < 4) {
                        throw new CustomerException(CustomerExceptionMessage.Error_in_firstName);
        } 
        else if (bean.getCustomerBean().getLastName().trim().length() < 4) {
                        throw new CustomerException(CustomerExceptionMessage.Error_in_lastName);
        } 
        else if (!(bean.getCustomerBean().getEmailId().matches("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}"))) {
        				throw new CustomerException(CustomerExceptionMessage.Error_in_Email);
        } 
        else if (!(String.valueOf(bean.getCustomerBean().getPhoneNo())
                                        .matches("(0)?[6-9][0-9]{9}"))) {
                        throw new CustomerException(CustomerExceptionMessage.Error_in_PhoneNumber);
        } 
        else if (bean.getCustomerBean().getAddress().length() == 0) {
                        throw new CustomerException(CustomerExceptionMessage.Error_in_Address);
        } 
        else {
                        isValid = true;
        }
        return isValid;
}


}
