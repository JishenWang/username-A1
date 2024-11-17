public class Appointment {
        private final String patientName;
        String patientcall;
        private final String preferredTimeSlot;
        private final HealthProfessional selectedDoctor;
    
        // Default Constructor
        public Appointment() {
            this.patientName = "Unknown";
            this.patientcall = "000-0000-0000";
            this.preferredTimeSlot = "00:00";
            this.selectedDoctor = null;
        }
    
        // Constructor with parameters
        public Appointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional selectedDoctor) {
            this.patientName = patientName;
            this.patientcall = patientMobile;
            this.preferredTimeSlot = preferredTimeSlot;
            this.selectedDoctor = selectedDoctor;
        }
    
        // Method to print appointment details
        public void printDetails() {
            System.out.println("Patient Name: " + patientName);
            System.out.println("Call: " + patientcall);
            System.out.println("Preferred Time: " + preferredTimeSlot);
         // Calls the doctor's printDetails() method
        if (selectedDoctor != null) {
            System.out.println("Doctor Details:");
            selectedDoctor.printDetails();
        } else {
            System.out.println("No doctor assigned.");
        }
        }
}

