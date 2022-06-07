package lab_06;

public class checkURL {

    public static void main(String[] args) {

        String url = "https://google.com";
        String[] splitString = url.split("://google");
        String validateURL = splitString[0];

        if (validateURL.equals("https")) {
            System.out.println("This URL contain https");
        } else
            System.out.println("This url contain " + validateURL);

        String domainName = splitString[1];
        if (domainName.equals(".com")) {
            System.out.println("This URL contain .com");
        } else System.out.println("This URL contain " +domainName);
    }
}



