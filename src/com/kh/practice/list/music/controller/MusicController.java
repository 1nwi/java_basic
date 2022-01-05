package com.kh.practice.list.music.controller;

import com.kh.practice.list.music.model.vo.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicController {
    private List<Music> list = new ArrayList<>();



    public int addList(Music music) {
        list.add(music);
        return 1;
    }

    public int addAtZero(Music music) {
        list.add(0, music);
        return 1;
    }

    public List<Music> printAll () {
        return list;
    }

    public Music searchMusic(String title) {
        Music checkMusic = null;
        for (Music m : list) {
            if (m.getTitle().equals(title)) {
                checkMusic = m;
                break;
            }
        }
        return checkMusic;
    }

    public Music removeMusic(String title) {
        Music deleteMusic = null;
        for (Music m : list) {
            if (m.getTitle().equals(title)) {
                deleteMusic = m;
                list.remove(m);
                break;
            }
        }
        return deleteMusic;
    }

    public Music setMusic(String title, Music music) {
        Music changeMusic = null;
        for (Music m : list) {
            if (m.getTitle().equals(title)) {
                changeMusic = m;

            }
        }
        return changeMusic;
    }

    public int ascTitle() {
        return 1;
    }
    public int descSinger() {
        return 1;
    }

}
