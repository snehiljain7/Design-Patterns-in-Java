package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class User
{
	//All final attributes
	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional
	private User(UserBuilder userBuilder) {
		super();
		this.firstName = userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.age = userBuilder.age;
		this.phone = userBuilder.phone;
		this.address = userBuilder.address;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}


	public static class UserBuilder{
		private final String firstName; 
		private final String lastName; 
		private int age; 
		private String phone; 
		private String address;
		public UserBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public UserBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		public UserBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			validateUserObject(user);
			return user;
		}
		
		public void validateUserObject(User user) {
			System.out.println("Validating user object ...");
		}
		
	}
	
	public static void main(String[] args) 
	{
		User user1 = new User.UserBuilder("Lokesh", "Gupta")
		.setAge(30)
		.setPhone("1234567")
		.setAddress("Fake address 1234")
		.build();

		System.out.println(user1);

		User user2 = new User.UserBuilder("Jack", "Reacher")
		.setAge(40)
		.setPhone("5655")
		//no address
		.build();

		System.out.println(user2);

		User user3 = new User.UserBuilder("Super", "Man")
		//No age
		//No phone
		//no address
		.build();

		System.out.println(user3);
	}
	
}