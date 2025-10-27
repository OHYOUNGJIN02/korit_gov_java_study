package _20_Casting.Shape;

/*
* render() => preDraw(), drawInternal(), postDraw(); 호출
* preDraw => 출력(그리기 준비)
* postDraw => 출력(그리기 마무리)
*
* 추상 메소드
* area() => double, drawInternal() protected => void
* */

public abstract class Shape {
    public void preDraw(){
        System.out.println("그리기 준비");
    }
    public void postDraw(){
        System.out.println("그리기 마무리");
    }

    public abstract double area();

    protected abstract void drawInternal();

    public void render(){
        preDraw();
        drawInternal();
        postDraw();
    }

    }






