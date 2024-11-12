public class AssignmentOne {
        public static void main(String[] args) {
            // Part 3 – Using classes and objects
        System.out.println("// Part 3 - Using classes and objects");

        // Create objects of GeneralPractitioner and Surgeon
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. LuHaiou", "Attending physician", "City Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. LuoLiping", "Attending physician", "City Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. LiYi", "Attending physician", "City Clinic");
        Surgeon sp1 = new Surgeon(4, "Dr. CaimouHuang", "Osteology", "Department of orthopaedics");
        Surgeon sp2 = new Surgeon(5, "Dr. ZhangRang", "Osteology", "Department of orthopaedics");

        // Print details of each health professional
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        sp1.printDetails();
        System.out.println("------------------------------");
        sp2.printDetails();
    }
}