public class Surgeon extends HealthProfessional {
    private String surgeryType; 

    // Default constructor
    public Surgeon() {
        super();
        this.surgeryType = "General Surgery";
    }

    // Parameterized constructor
    public Surgeon(int id, String name, String profession, String surgeryType) {
        super(id, name, profession);
        this.surgeryType = surgeryType;
    }

    // Override the method for printing details
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Surgery Type: " + surgeryType);
    }

    // Getter and Setter method
    public String getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }
    

}
