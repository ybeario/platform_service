package client.api.command;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class BookInfoCommand {
	@NotBlank
	private String isbn;
	@NotNull
	private Integer price;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
