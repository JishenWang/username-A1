public class GeneralPractitioner extends HealthProfessional{
    private final String  surgeryType;

    // Constructor
    public GeneralPractitioner() {
        super();
        this.surgeryType = "Default surgeryType";
    }

    // Constructor with parameters
    public GeneralPractitioner(int id, String name, String profession, String surgeryType) {
        super(id, name, profession);
        this.surgeryType = surgeryType;
    }

    // Override printDetails method
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("surgeryType: " + surgeryType);
    }

}
