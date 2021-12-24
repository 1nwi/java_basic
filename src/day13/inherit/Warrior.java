package day13.inherit;

public class Warrior extends Player {


    public int rage;


    public Warrior(String name) {
        //super();  // 자식 생성자에 숨어있는 코드
        super(name);
        System.out.println("Warrior 객체 성공!");

        this.rage = 100;
    }

    @Override // 오버라이딩 룰 검증
    public void info() {
        super.info();
        System.out.println(("# 분노: " + rage));
    }

    public void fireRush() {

    }

}
