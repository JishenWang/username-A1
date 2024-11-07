public class HealthProfessional {
    private final int id;
    private final String name;
    private final String profession ;

    // Default Constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Indeterminacy";
        this.profession = "Unknown";
    }

    // Constructor with parameters
    public HealthProfessional(int id, String name, String profession) {
        this.id = id;
        this.name = name;
        this.profession = profession;
    }

    // Method to print instance variables
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Profession: " + profession);
    }

}
