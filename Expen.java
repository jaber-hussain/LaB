class Pen{
	String colour;
	String type;
	double size;
	
	public Pen(){
		
	}
}
public class Expen{
	public static void main(String[] args){
		
		Pen p1 = new Pen();
		p1.colour= "Black";
		System.out.println("Colour of p1 Pen is "+p1.colour);
		
		p1.type= "Gelpen";
		System.out.println("Type of p1 Pen is "+p1.type);
		
		p1.size= 4.7;
		System.out.println("Size of p1 Pen is "+p1.size+"cm");
	}
}
