package com.invoiceproccesing.server.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceproccesing.server.Entity.Invoice;
import com.invoiceproccesing.server.Respository.InvoiceRepository;
import com.invoiceproccesing.server.Service.InvoiceService;
@Service
public class InvoiceServiceImpl implements InvoiceService{

	@Autowired
	
	private InvoiceRepository invoicerepository;
	@Override
	public Invoice addInvoice(Invoice invoice) {
		invoicerepository.save(invoice);
		return invoice;
	}
	@Override
	public List<Invoice> getallData() {
		return invoicerepository.findAll();
	}
	
	

}
