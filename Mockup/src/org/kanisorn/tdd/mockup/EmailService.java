/**
 * 
 */
package org.kanisorn.tdd.mockup;

/**
 * @author kanisorn
 *
 */
public class EmailService {
	public void send(Invoice invoice, Customer customer) {
		System.out.println("Send invoice to customer email:" + "\nInvoice ID: " + invoice.getId() + 
							"\nCustomer Name: " + customer.getName() + "\nAmount:" + invoice.getAmount());
	}
}
