public class UserDetails {
    private int userId;
    private int id;
    private String title;
    private String body;

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
