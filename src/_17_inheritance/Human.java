package _17_inheritance;
/*
* Animal 클래스의 상속을 받고
* AllArgs 생성자를 만드시오
* 고유 필드 속성으로 lauguage 라는 속성 추가
* setter들을 이용해서 각 속성의 값을 주입
* get animalName을 재정의 하여 호출 했을때
* " 안녕하세요 " 제 이름은 ___ 입니다, " 라고 출력할 수 있도록 코드를 작성
* getAnimalAge를 재정의 하여 호출했을때
* " 올해 제 나이는 **살 입니다, 내년에는 ** + 1살이 됩니다 " 라고 출력
* move를 재정의 하여 사람이 두 발로 걷습니다. 라고 재정의
* 고유 메소드로 read() 선언하는데 파라미터로 bookName을 받음
* 호출시 파라미터로 받은 bookName을 이용하여 bookName을 읽는 중 입니다 출력
*
* */
public class Human extends Animal{

    private String language;

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public int getAnimalAge(){
        System.out.println("올해 제 나이는 23살 입니다, 내년에 제 나이는 " + (getAnimalAge() + 1) + " 살이 됩니다");
        return super.getAnimalAge();
    }



    @Override
    public void move(){
        System.out.println("두 발로 걷습니다.");
    }

    @Override
    public String getAnimalName(){
        System.out.println(" 제 이름은 "+ getAnimalName() + " 입니다. " );
        return super.getAnimalName();
    }



    public void read(String bookName) {
        System.out.println(bookName + " 책을 읽는 중 입니다.");
    }
}
