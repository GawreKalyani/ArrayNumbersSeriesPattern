package seriesPattern;
class Z{
	public static void main(String[] args) {
		System.out.println("Z-first");
	}
}
class X{
	public static void main(String[] args) {
	System.out.println("xxxxxx");	
	}
}
public class MultipleClassesMain {
public static void main(String[] args) {
	System.out.println("mmmmmmm");
	Z.main(args);
	X.main(args);
}
}
//Run as java--select--MultipleClassesMain
//weget mmmmmmm  Z-first  xxxxxx