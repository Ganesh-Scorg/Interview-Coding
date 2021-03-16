package Features.demo;

interface Parser
{
	public String parse(String s);
}

class StringParser
{
	public static String convert(String s)
	{
		if(s.length()>3)
			return s.toUpperCase();
		else
			return s.toLowerCase();
	}
}

class MyPrinter
{
	public void print(String s, Parser p)
	{
		s = p.parse(s);
		System.out.println(s);
	}
}

public class MethodReferenceDemo_1 {

	public static void main(String[] args) 
	{
		String str = "SA";
		MyPrinter mp  = new MyPrinter();
		/*mp.print(str, new Parser() {
			@Override
			public String parse(String s) {
				return StringParser.convert(s);
			}
		});*/
		mp.print(str, s -> StringParser.convert(s));
		mp.print(str, StringParser::convert);
	}
}