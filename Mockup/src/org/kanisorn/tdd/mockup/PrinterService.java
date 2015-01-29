/**
 * 
 */
package org.kanisorn.tdd.mockup;

/**
 * @author kanisorn
 *
 */
public class PrinterService {
	public void print(Invoice invoice, Customer customer) {
		System.out.println("Print invoice from a real printer:" + "\nInvoice ID: " + invoice.getId() + 
							"\nCustomer Name: " + customer.getName() + "\nAmount:" + invoice.getAmount());
	}
}
