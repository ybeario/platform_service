//package web.controller;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//
//
////@ResponseWrapper
//@Controller
//
//public class MacBookController {
//
//	@Autowired
//	BookServiceInterface bookServiceInterface;
//
//	@PostMapping("/book")
//	public String addBook(@RequestBody @Valid BookInfoCommand command) {
//		System.out.println("book----");
//		bookServiceInterface.addBook(command);
//		return "success";
//	}
//
//	@PostMapping("/addBook")
//	public String addBook(String isbn, Integer price) {
//		System.out.println("book----");
//		BookInfoCommand command = new BookInfoCommand();
//		command.setIsbn(isbn);
//		command.setPrice(price);
//		System.out.println(command);
//		bookServiceInterface.addBook(command);
//		return "success";
//	}
//
//}
