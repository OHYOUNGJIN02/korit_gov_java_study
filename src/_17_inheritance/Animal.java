package _17_inheritance;

public class Animal {
    private String animalName;
    private int animalAge;

    //AllArg 생성자 하나 생성하시고 getter/setter 다 만들고
    //메소드에 move 만들기
    //움직입니다. 출력

    public Animal(){


    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void move(){
        System.out.println(animalName + " 이 움직입니다 ");
    }
}
