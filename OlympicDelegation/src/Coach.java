
public class Coach {
	private String cname;
	private String caddress;
	
	public Coach(String cname, String caddress) {
		 this.cname=cname;
		 this.caddress=caddress;
	}
	public String getName() {
		return cname;
	}
	public void setName(String n) {
		cname=n;
	}
	public String getAddress() {
		return caddress;
	}
	public void setAddress(String s) {
		caddress=s;

	}
}
