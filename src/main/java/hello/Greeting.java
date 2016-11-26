package hello;

/**
 * Created by Vladok on 18.11.2016.
 */
public class Greeting {

    private final long id;
    private final String content;
    private final String answer;

    public Greeting(long id, String content,String answer) {
        this.id = id;
        this.content = content;
        this.answer=answer;
    }

    public String getAnswer() {
        return answer;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
