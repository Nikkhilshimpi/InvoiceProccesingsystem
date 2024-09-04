package com.invoiceproccesing.server.Service;

import java.util.List;

import com.invoiceproccesing.server.Entity.Invoice;

public interface InvoiceService {
	
	public Invoice addInvoice(Invoice invoice);

	public List<Invoice> getallData();
	

}
