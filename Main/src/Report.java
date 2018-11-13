import java.util.Date;

public class Report {

    private String title;
    private static String password;
    private static String serverName;
    private static String username;
    private String[] params;
    private String theOutput;
    private String nameOnReport;

    public Report(String title) {
        this.title = title;
    }

    public static boolean isServerActive() {
        return Math.random() < 0.5;
    }

    public static void setPassword(String password) {
        Report.password = password;
    }

    public static void setServerName(String serverName) {
        Report.serverName = serverName;
    }

    public static void setUserName(String username) {
        Report.username = username;
    }

    public void setNumParameters(int n) {
        this.params = new String[n];
    }

    public void setOutputType(String outputType) {
        theOutput = outputType;
    }

    public void setParameter(int i, String value) {
        if (i < this.params.length) {
            this.params[i] = value;
        } else {
            System.out.println("[WARNING] " + this.title + " value is past the valid length, please try again");
        }
    }

    public void setReportSystemName(String nameOfReport) {
        nameOnReport = nameOfReport;
    }

    public String generateReport() {

        String output = "";

        output += this.title;
        output += "\n";

        for (int i = 0; i < this.params.length; i++) {
            output += "\t\tparameter -->";
            output += params[i];
            output += "\n";
        }

        output += "\t\twill print on --> " + Report.serverName + " with credentials: " + Report.username + "|" + Report.password + "\n";
        output += "\t\tReport is named " + this.nameOnReport + " on the server \n";
        output += "\t\tReport will be output as a "+this.theOutput +" file \n";
        Date d2 = new Date();
        output += "\t\tReport was generated on " + d2.toString();

        return output;
    }
}
