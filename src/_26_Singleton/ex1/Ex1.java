package _26_Singleton.ex1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Ex1 {
    private static Ex1 instance;

    private String Example;
    private String Example2;

    private Ex1(){
        this.Example = "DEFAULT";
        this.Example2 = "DEFAULT2";
    }

    public static Ex1 getInstance() {
        if (instance == null){
            instance = new Ex1();
        }
        return instance;
    }


}
