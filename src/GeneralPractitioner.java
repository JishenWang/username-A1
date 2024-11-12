public class GeneralPractitioner extends HealthProfessional{
    private final String  clinic;

    // Constructor
    public GeneralPractitioner() {
        super();
        this.clinic = "Default clinic";
    }

    // Constructor with parameters
    public GeneralPractitioner(int id, String name, String profession, String clinic) {
        super(id, name, profession);
        this.clinic = clinic;
    }

    // Override printDetails method
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("clinic: " + clinic);
    }
}
