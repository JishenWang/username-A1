import java.util.ArrayList;

public class AppointmentManager {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("// Part 3 - Using classes and objects");
        System.out.println("------------------------------");

        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. LuHaiou", "Attending physician", "City Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. LuoLiping", "Attending physician", "City Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. LiYi", "Attending physician", "City Clinic");
        Surgeon sp1 = new Surgeon(4, "Dr. CaimouHuang", "Osteology", "Department of orthopaedics");
        Surgeon sp2 = new Surgeon(5, "Dr. ZhangRang", "Osteology", "Department of orthopaedics");

        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        sp1.printDetails();
        System.out.println("------------------------------");
        sp2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 - Collection of appointments");
        System.out.println("------------------------------");
        ArrayList<Appointment> appointmentList = new ArrayList<>();

        // Create some appointments
        createAppointment(appointmentList, "WangYao", "133-8452-7350", "10:00", gp1);
        createAppointment(appointmentList, "MingZhendong", "967-8654-3250", "11:00", gp2);
        createAppointment(appointmentList, "ShenYi", "135-783-4587", "14:00", sp1);
        createAppointment(appointmentList, "YangJingming", "438-5739-4279", "15:00", sp2);

        // Print existing appointments
        printExistingAppointments(appointmentList);

        // Cancel one of the existing appointments
        cancelBooking(appointmentList, "123-456-7890");

        // Print again existing appointments to show the updated collection
        printExistingAppointments(appointmentList);

        System.out.println("------------------------------");
    }

    public static void createAppointment(ArrayList<Appointment> appointmentList, String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        Appointment newAppointment = new Appointment(patientName, patientMobile, preferredTimeSlot, selectedDoctor);
        appointmentList.add(newAppointment);
    }

    public static void printExistingAppointments(ArrayList<Appointment> appointmentList) {
        if (appointmentList.isEmpty()) {
            System.out.println("There are no existing appointments.");
        } else {
            for (Appointment appointment : appointmentList) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    public static void cancelBooking(ArrayList<Appointment> appointmentList, String patientMobile) {
        boolean found = false;
        for (int i = 0; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).patientcall.equals(patientMobile)) {
                appointmentList.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The mobile phone number was not found in the existing appointments.");
        }
    }
}