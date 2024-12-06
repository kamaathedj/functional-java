package genericBuilder;

import java.util.function.Consumer;

public class Mailer {
    private Mailer(){}

    public Mailer From(String mail) {
        System.out.println(mail);
        return this;
    }

    public Mailer To(String mail) {
        System.out.println(mail);
        return this;
    }

    public Mailer Subject(String code) {
        System.out.println(code);
        return this;
    }

    public Mailer Body(String body) {
        System.out.println(body);
        return this;
    }

    public static void send(Consumer<Mailer> mailerConsumer) {
        //Mailer mailer = new Mailer("me@me.com", "builder@builder.com", "code", "it sucks nigga");
        Mailer mailer = new Mailer();
        mailerConsumer.accept(mailer);
    }
}


