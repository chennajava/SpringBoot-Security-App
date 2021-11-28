package in.chennait.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WecomeRestController {

	@GetMapping("/welcome")
	public String getMsg() {
		String msg = "Welcome to Chenna IT...!!";
		return msg;
	}

	@GetMapping("/balance")
	public String getbalance() {
		String balance = "Your remaining balance is:4532 INR";
		return balance;
	}

	@GetMapping("/statement")
	public String getStatement() {
		String statement = "Your statement will be sent my your email id soon";
		return statement;
	}

	@GetMapping("/myLoan")
	public String getMyLoad() {
		String statement = "Your Loan amount will be pending is :8,42,000.0 INR";
		return statement;
	}

	@GetMapping("/contact")
	public String getContact() {
		String contact = "Thank you for contacting we will be call you back soon";
		return contact;
	}
	
}
