
public class Publication {

	public static void main(String[] args) 
	{
		Book b=new Book();
		b.writting("5", 5);
		
		NewsPaper n=new NewsPaper();
		n.writting("4", 8);
		n.reading("sakal");
		
		ComicBook c=new ComicBook();
		c.reading("comic");
		c.writting("5", 2);
		
		b=new ComicBook();
		b.writting("5", 5);
		
		Mathslab m=new Mathslab();
		m.add(5, 50);
		m.division(9, 3);
		m.multiplication(12, 80f);
		m.showSin(50d);
		m.showsqRoot(49d);
		
		Magazine a=new Magazine();
		a.reading("news");
		a.writting("italic", 10);

	}

}
