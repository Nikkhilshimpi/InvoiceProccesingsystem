package com.invoiceproccesing.server.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invoiceproccesing.server.Entity.Invoice;
import com.invoiceproccesing.server.Service.InvoiceService;

@RestController
@CrossOrigin
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceservice;
	
	@PostMapping("/invoice")
	public Invoice addInvoice(@RequestBody Invoice invoice)
	{
		invoiceservice.addInvoice(invoice);
		return invoice;
	}
	
	@GetMapping("/invoice")
	public List<Invoice> getAllData()
	{
		invoiceservice.getallData();
		return this.invoiceservice.getallData();
	}

}
