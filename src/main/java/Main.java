public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 №444444";
        post.patronymic = "Иванович";
        post.phone = "+79999999999";
        post.surname = "Иванов";
        post.subscription = String.valueOf(true);


        System.out.println(post);
    }
}