/**
 * 
 */
package org.kanisorn.tdd.mockup;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author kanisorn
 *
 */
public class InvoiceManagerTest {

	private Customer customer = null;
	private Invoice invoice = null;
	private PrinterService printerService = null;
	private EmailService emailService = null;
	InvoiceManager invoiceManager = null;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		customer = new Customer();
		customer.setAddress("Bangkok");
		customer.setId(1);
		customer.setName("Kanisorn");
		
		invoice = new Invoice();
		invoice.setAmount(10000);
		invoice.setId(2222);
		
		printerService = new MockPrinterService();
		emailService = new MockEmailService();
		invoiceManager = new InvoiceManager(emailService, printerService);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		customer = null;
		invoice = null;
		printerService = null;
		emailService = null;
		invoiceManager=null;
	}

	@Test
	public final void testHandleInvoiceBySendingEmail() {
		customer.setPreferEmail(true);

		invoiceManager.handleInvoice(customer, invoice);
		
		assertTrue("Emailing flag should be true", ((MockEmailService)emailService).getWasEmailSent());
		assertFalse("Printing flag should be false", ((MockPrinterService)printerService).getWasInvoicePrinted());
	}
	
	@Test
	public final void testHandleInvoiceByPrinting() {
		customer.setPreferEmail(false);

		invoiceManager.handleInvoice(customer, invoice);
		
		assertFalse("Emailing flag should be false", ((MockEmailService)emailService).getWasEmailSent());
		assertTrue("Printing flag should be true", ((MockPrinterService)printerService).getWasInvoicePrinted());
	}
}
