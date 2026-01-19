package reservationsystem;

public class Guest {
    private String name;
    private String contactInfo;

    public Guest(String name, String contactInfo) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Guest name cannot be empty");
        }
        if (contactInfo == null || contactInfo.trim().isEmpty()) {
            throw new IllegalArgumentException("Guest contact info cannot be empty");
        }
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public void updateInfo(String name, String contactInfo) {
        if (name != null && !name.trim().isEmpty()) this.name = name;
        if (contactInfo != null && !contactInfo.trim().isEmpty()) this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}
