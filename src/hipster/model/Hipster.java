package hipster.model;

public class Hipster
{
	private String name;
	private String[] hipsterPhrases;
	private Book [] hipsterBooks;

	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That is way too mainstream.";
		hipsterPhrases[1] = "Your pants are too baggy for a hipster.";
		hipsterPhrases[2] = "I was into gaming before it was cool.";
		hipsterPhrases[3] = "You've played through several dating sims and read the twilight series? You must be so knowledgeable about life and love.";
	}

	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		
		firstBook = new Book();
		firstBook.setAuthor("Eoin Colfer");
		firstBook.setTitle("And Another Thing");
		firstBook.setSubject("Hitchhiker's guide tthe galaxy");
		firstBook.setPageCount(350);
		firstBook.setPrice(15.99);
		
		secondBook = new Book();
		secondBook.setAuthor("Stephen King");
		secondBook.setTitle("The Once and Future King");
		secondBook.setSubject("King Arthur");
		secondBook.setPageCount(500);
		secondBook.setPrice(24.99);
		
		thirdBook = new Book(384, "Mikhail", "The Devil", "The Master and Margarita", 19.99);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
	}

	public Hipster(String name)
	{
		
	}
			
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}
	
	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

}
