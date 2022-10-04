
public interface Write 
{
	void writting(String font,int size);

}
class Book implements Write
{
	public void writting(String font,int size)
	{
		System.out.println("The font of writting is:"+font+"The size is"+size);
	}
}
interface Read
{
	void reading(String bookName);
}
class NewsPaper implements Read,Write
{
	void publishNews()
	{
		
	}
	public void writting(String font,int size)
	{
		System.out.println("The font of writting is:"+font+"The size is"+size);
	}
	public void reading(String b)
	{
		System.out.println("i am reading the newspaper"+b);	
	}
	
}
class ComicBook extends Book implements Read
{
	public void reading(String b)
	{
		System.out.println("i am reading the book in comic book class"+b);	
	}
	
	
}
interface Calculator
{
	void add(int a,int b);
	float division(int a,int b);
	void multiplication(int a,float b);
}
interface Scicalculator extends Calculator
{
	 void showsqRoot(double d);
	 void showSin(double angle);
}
class Mathslab implements Scicalculator
{
	public void add(int a,int b)
	{
		int add=a+b;
		System.out.println("Addition is:"+add);
	}
	public float division(int a,int b)
	{
		int div=a/b;
		return +div;
	}
	public void multiplication(int a,float b)
	{
		float multi=a*b;
		System.out.println("Multiplication is:"+multi);
	}
	public void showsqRoot(double d)
	{
		double SqRoot=Math.sqrt(4.0d);
		System.out.println("Square root is:"+SqRoot);
	}
	public void showSin(double angle )
	{
		double ang=Math.sin(50d);
		System.out.println("The sin value is:"+ang);
		
	}
}
interface Edit extends Read,Write
{
	
}
class Magazine implements Edit
{
	public void writting(String font,int size)
	{
		System.out.println("The font of writting is:"+font+"The size is"+size);
	}
	public void reading(String b)
	{
		System.out.println("i am reading the book in comic book class"+b);	
	}
}

	






