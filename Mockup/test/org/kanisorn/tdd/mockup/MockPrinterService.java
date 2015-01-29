/**
 * 
 */
package org.kanisorn.tdd.mockup;

/**
 * @author kanisorn
 *
 */
class MockPrinterService extends PrinterService {
	private boolean wasInvoicePrinted = false;
	
	public boolean getWasInvoicePrinted() {
		return this.wasInvoicePrinted;
	}
	
	@Override
	public void print(Invoice invoice, Customer customer) {
		System.out.println("Print invoice from a mockup printer:" + "\nInvoice ID: " + invoice.getId() + 
				"\nCustomer Name: " + customer.getName() + "\nAmount:" + invoice.getAmount());
		this.wasInvoicePrinted = true;
	}
}
