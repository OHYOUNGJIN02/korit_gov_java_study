package _17_inheritance.Message;

public class SimpleMessage extends Message {
    public SimpleMessage(String text) {
        super(text);
    }



    @Override
    protected String makePrefix(){
    super.makePrefix();
        return "[SIMPLE] ";

    }

    @Override
    public String format() {
        return makePrefix() + "내용 : " + text;

    }
    
    
}





