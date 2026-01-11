public class Guest {
    private String name;
    private String contactInfo;

    public Guest(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public void updateInfo(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}
