package it.addvalue.testsocket.dto;

/**
 * @author Add Value S.p.A. by diego.rigo
 * @version Dec  15, 2022
 * @since 8.3.0
 */
public class Greeting {

    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
