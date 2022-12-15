package it.addvalue.testsocket.dto;

/**
 * @author Add Value S.p.A. by diego.rigo
 * @version Dec  15, 2022
 * @since 8.3.0
 */
public class HelloMessage {

    private String name;

    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
