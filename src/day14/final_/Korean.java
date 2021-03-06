package day14.final_;

public class Korean {

    String name;  // 이름
    final String ssn;   // 주민번호

//    psf   + tap  =>  public static final
//    psfs  + tap  =>  public static final String
//    psfi  + tap  =>  public static final int
    // 상수이름규칙: 모두 대문자와 스네이크 케이스
    static final String myNation = "대한민국";   // 국적

    // 이메일 수신여부
    static final int MAIL_OK = 1;
    static final int MAIL_NO = 0;
    static final int MAIL_NOT_DECISION = -1;

    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
