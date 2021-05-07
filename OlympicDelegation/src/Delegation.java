
public class Delegation {
private String country;


public static void main(String[] args) {
	Player one= new Player("Mo Salah", "England");            // Composition relationship between Player Class and Delegation
	Coach onec=new Coach("Klob","Liverpool");                 // Composition relationship between Coach Class and Delegation
	System.out.println(one + "is trained by "+ onec);         // Association relationship between the coach and the player 
	
}

public String getCountry() {
	return country;
}
public void setCountry(String s) {
	country=s;
}
}
