/**
 * 
 */
package org.kanisorn.tdd.mockup;

/**
 * @author kanisorn
 *
 */
public class InvoiceManager {
	private EmailService emailService = null;
	private PrinterService printerService = null;

	// Dependency Injection
	public InvoiceManager(EmailService emailService, PrinterService printerService) {
		this.emailService = emailService;
		this.printerService = printerService;
	}
	
	public void handleInvoice(Customer customer, Invoice invoice) {
		if (customer.getPreferEmail()) {
			this.emailService.send(invoice, customer);
		} else {
			this.printerService.print(invoice, customer);
		}
	}

}
