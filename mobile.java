public class InvalidMobileNumberException extends Exception {
    public InvalidMobileNumberException(String message) {
        super(message);
    }
}

public class MobileNumberValidator {
    public static void validateMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
        if (mobileNumber.length() != 10) {
            throw new InvalidMobileNumberException("Mobile Number should be 10 digits");
        }
        if (!mobileNumber.matches("[6-9]\\d{9}")) {
            throw new InvalidMobileNumberException("Mobile Number should start with either 6, 7, 8 or 9");
        }
    }
}

// Example usage
public static void main(String[] args) {
    try {
        String mobileNumber = "9876543210";
        MobileNumberValidator.validateMobil…