package CustomImmutableClass;

public class Address {
// Mutable class 
	private String city;
	private String zip;

	public Address(String city, String zip) {

		this.city = city;
		this.zip = zip;
	}

	public Address() {

	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", zip=" + zip + "]";
	}

}
