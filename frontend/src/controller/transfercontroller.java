package controller;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import model.transfer;

@ManagedBean(name = "TransferController")
@SessionScoped

public class transfercontroller {

	@ManagedProperty(value ="#{Transfer}")
	private transfer Transfer;
	
	
	
	public transfer getTransfer() {
		return Transfer;
	}

	public void setTransfer(transfer transfer) {
		Transfer = transfer;
	}

	public void AddNewtransfer()
	{
		
		
	}
}
