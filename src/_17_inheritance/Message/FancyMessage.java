package _17_inheritance.Message;

public class FancyMessage extends Message{
    public FancyMessage(String text) {
        super(text);
    }

    @Override
    protected String makePrefix(){
        super.makePrefix();
        return "[FANCY]";

    }


    @Override
    public String format(){
        return makePrefix() + " ★ " + text + " ★ ";
    }

}
