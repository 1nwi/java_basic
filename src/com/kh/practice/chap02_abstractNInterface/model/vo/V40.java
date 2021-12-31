package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{

    public V40() {
        setMaker("LG");
    }

    @Override
    public String Picture() {
        return "1200, 1600만 화소 트리플 카메라";
    }

    @Override
    public String Charge() {
        return "고속충전, 고속 무선 충전";
    }

    @Override
    public boolean bluetoothPen() {
        return false;
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
        return null;
    }

    @Override
    public String touch() {
        return "정전식";
    }
}
