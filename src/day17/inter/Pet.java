package day17.inter;

public interface Pet {

    // 필드는 무조건 public final 로 자동처리  ->  상수 처리
    String PLAY_GROUND = "애완동물카페";

    // 인터페이스는 기본적으로 추상메서드 선언하도록 되어 있음.
    void play(); // 애완동물이 노는 기능


}


