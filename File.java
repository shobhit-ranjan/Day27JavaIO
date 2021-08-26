
 public class File {

	int Id;
	String userName;
	long salar;

	public File(int firstName, String lastName, long address) {
		this.Id = firstName;
		this.userName = lastName;
		this.salar = address;

	}

	public void setFirstName(int IDemp) {
		this.Id = IDemp;
	}

	public void setLastName(String lastName) {
		this.userName = lastName;
	}

	public void setAddress(long salar) {
		this.salar = salar;
	}

	public int getFirstName() {
		return Id;
	}

	public String getLastName() {
		return userName;
	}

	public long getAddress() {
		return salar;
	}

	

}
