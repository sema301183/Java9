import org.example.FormDate;
import org.example.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Иван";
        post.birthday.day = 9;
        post.birthday.month = 3;
        post.birthday.year = 1934;
        post.passport = "4444 №444444";
        post.patronymic = "Иванович";
        post.phone = "+79999999999";
        post.surname = "Иванов";
        post.subscription = true;

        System.out.println(post);
    }
}
