//Kabrina Brady

public class AverageAgeBrady {
	public static void main (String[] args) {
		int bob = 5;
		int sally = 9;
		int mom = 42;
		int dad = 39;
		int numFamMembers = 4;
		
		int sumAges = bob + sally + mom + dad;
		double averageAge = (double)sumAges/numFamMembers;
		
		System.out.println("Bob is " + bob);
		System.out.println("Sally is " + sally);
		System.out.println("Mom is " + mom);
		System.out.println("Dad is " + dad);
		System.out.println("The average age in the family is " + averageAge);
	}
}