package _17_inheritance.Message;

public class Message {
    public String text;

    public Message(String text) {
        this.text = text;
    }

    protected String makePrefix(){
        return "[MSG] ";
    }

    public String format(){
        return makePrefix() + text;
    }

    public void print(){
        System.out.println(format());
    }


}
