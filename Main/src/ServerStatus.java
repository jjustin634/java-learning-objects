public class ServerStatus {
    public static void main(String[] args) {

        Report.setServerName("\\\\fancyServer");
        Report.setUserName("NHAUser");
        Report.setPassword("NHAPassword");

        Report report1 = new Report("Report #1");
        Report report2 = new Report("Report #2");

        report1.setNumParameters(2);
        report2.setNumParameters(4);

        report1.setParameter(0, "01/01/1970");
        report1.setParameter(1, "01/01/2018");
        report1.setParameter(2, "pjdt");

        report2.setParameter(0, "08/01/2017");
        report2.setParameter(1, "08/01/2018");
        report2.setParameter(2, "notpjdt");
        report2.setParameter(3, "THIS IS A PARAMETER");
        report2.setParameter(4, "THIS WON'T BE ADDED");

        report1.setOutputType("pdf");
        report2.setOutputType("xls");

        report1.setReportSystemName("reportNumberOne.rdl");
        report2.setReportSystemName("reportNumberTwo.rdl");

        System.out.println(report1.generateReport());
        System.out.println("Server up is: " + Report.isServerActive());
        System.out.println(report2.generateReport());
        System.out.println("Server up is: " + Report.isServerActive());

        System.out.println("\nUpdating Server information\n");
        Report.setServerName("\\\\SercureServerName");
        Report.setUserName("SecureNHAUser");

        System.out.println(report1.generateReport());
        System.out.println("Server up is: " + Report.isServerActive());
        System.out.println(report2.generateReport());
        System.out.println("Server up is: " + Report.isServerActive());

    }
}