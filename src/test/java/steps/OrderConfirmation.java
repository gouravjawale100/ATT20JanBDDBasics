package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmation {
	
	AddingProduct addingProduct;
	static String prdId;

	public OrderConfirmation(AddingProduct addingProduct)
	{
		this.addingProduct	= addingProduct;
	}
	
	@When("I click on place order button")
	public void i_click_on_place_order_button() {
	   System.out.println("Clicked on place order button");
	}

	@Then("order should get confirmed")
	public void order_should_get_confirmed() {
	
		System.out.println("Order id generated");
		
	 prdId = addingProduct.getProductId();
		
		System.out.println("Received product id is "+prdId);
		
		AddingProduct ap = new AddingProduct();
		System.out.println(ap.testValue);
		
	}
	
	@When("I click on the shipped button")
	public void getData()
	{
				
		System.out.println("Received product id from scenario 2 is "+prdId);
	}


}
