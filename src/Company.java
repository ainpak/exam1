public class Company {

        private static String companyName = "Default Company";


        public static void printCompanyName() {
            System.out.println("Company Name: " + companyName);
        }


        public static void changeCompanyName(String newName) {
            companyName = newName;
        }
}
