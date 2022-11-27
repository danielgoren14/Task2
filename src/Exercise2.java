public class Exercise2 {
    public static void main(String[] args) {
        String myPhoneNumber = "972526990440";
        System.out.println(phoneNumber(myPhoneNumber));
    }

    public static String phoneNumber(String userPhoneNumber) {
        String rightTemplate = "012-3456789";
        char numberToChange = userPhoneNumber.charAt(2);
        char charZero = '0';
        if (userPhoneNumber.startsWith("972") && userPhoneNumber.length() == rightTemplate.length() + 1) {
            userPhoneNumber = userPhoneNumber.replace(numberToChange ,charZero);
            rightTemplate = userPhoneNumber.substring(0, 1);
            rightTemplate += "-" + userPhoneNumber.substring(3, 9);
        } else {
            if (userPhoneNumber.length() == 10 && userPhoneNumber.startsWith("05")) {
                rightTemplate = userPhoneNumber.substring(0, 3);
                rightTemplate += "-" + userPhoneNumber.substring(3, 10);
            } else {
                if (userPhoneNumber.length() == 11 && userPhoneNumber.contains("-") && userPhoneNumber.startsWith("05")) {
                    rightTemplate = userPhoneNumber;
                } else {
                    rightTemplate = "";
                }
            }
        }
        return rightTemplate;
    }
}
