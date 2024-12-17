import com.github.javafaker.Faker;

public class FakerExp1 {

	public static void main(String[] args) {
		
		Faker faker = new Faker();

		String name = faker.name().fullName(); // Miss Samanta Schmidt
		String firstName = faker.name().firstName(); // Emory
		String lastName = faker.name().lastName(); // Barton
		
		
		String password=faker.internet().password();
		String emailaddress=faker.internet().safeEmailAddress();
		String phonenumber=faker.phoneNumber().cellPhone();
		
		
		
		

		String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
		System.out.println(name);
		System.out.println(firstName);
		System.out.println(streetAddress);
		System.out.println(emailaddress);
		

	}

}
