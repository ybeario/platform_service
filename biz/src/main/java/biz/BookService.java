//package biz;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import client.api.command.BookInfoCommand;
//import client.api.si.BookServiceInterface;
//
//
//
//@Service
//public class BookService implements BookServiceInterface {
//
//	@Autowired
//	BookInfoMapper mapper;
//
//	@Override
//	public void addBook(BookInfoCommand command) {
//		BookInfo bookInfo = new BookInfo();
//		bookInfo.setIsbn(command.getIsbn());
//		bookInfo.setPrice(command.getPrice());
//		// mapper.insert(bookInfo);
//		mapper.insertSelective(bookInfo);
//	}
//
//}
