package genericBuilder;

public class Execute {

    public static void main(String[] args) {
        Mailer.send(mailer -> mailer
                .To("builder@gmail.com")
                .From("me@gmail.com")
                .Subject("code")
                .Body("it sucks"));
    }
}
