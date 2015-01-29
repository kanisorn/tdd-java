/**
 * 
 */
package org.kanisorn.tdd.mockup;

/**
 * @author kanisorn
 *
 */
class MockEmailService extends EmailService{
	private boolean wasEmailSent = false;
	
	public boolean getWasEmailSent() {
		return this.wasEmailSent;
	}
	
	@Override
	public void send(Invoice invoice, Customer customer) {
		System.out.println("Send invoice to noone:" + "\nInvoice ID: " + invoice.getId() + 
							"\nCustomer Name: " + customer.getName() + "\nAmount:" + invoice.getAmount());
		this.wasEmailSent = true;
	}
}
