package ReadingJSON;

public class Address {

	private String hno;
	private String area;
	private String block;
	private String state;
	private AddressGeo addressGeo;
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public AddressGeo getAddressGeo() {
		return addressGeo;
	}
	public void setAddressGeo(AddressGeo addressGeo) {
		this.addressGeo = addressGeo;
	}
	
	
}
