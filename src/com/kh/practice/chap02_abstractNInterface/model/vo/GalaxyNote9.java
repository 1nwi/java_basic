package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{

    public GalaxyNote9() {
        setMaker("삼성");
    }

    @Override
    public String Picture() {
        return "1300만 듀얼 카메라";
    }

    @Override
    public String Charge() {
        return "고속 충전, 고속 무선 충전";
    }

    @Override
    public boolean bluetoothPen() {
        return true;
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름";
    }

    @Override
    public String takeCall() {
        return "전화받기 버튼을 누름";
    }

    @Override
    public String printInformation() {
        return String.format("갤럭시 노트9은 %s에서 만들어졌고 제원은 다음과 같다.\n",this.getMaker());
    }

    @Override
    public String touch() {
        return "정전식, 와콤펜 지원";
    }
}
