package firstfloor;

public class BBlock extends CBlock implements ABlock, CSection{
public void bookHistory() {
	System.out.println("History");
}
public void bookScience() {
	System.out.println("Science");
}	
public void bookSocial() {
	System.out.println("Social");
}

@Override
public void bookTamil() {
	System.out.println("Tamil");
	
}
@Override
public void Ablock() {
	System.out.println("English");
	
}	

@Override
public void Cblock() {
	System.out.println("Red");
}
public void Bird() {
	System.out.println("Bird");
}

public static void main(String[]args) {
	BBlock B=new BBlock();
	B.bookHistory();
	B.bookScience();
	B.bookSocial();
	B.bookTamil();
	B.Ablock();
	B.Cblock();
	B.Bird();
	
	
	
	
	

	





}	
}