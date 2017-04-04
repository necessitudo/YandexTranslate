package ru.necessitudo.app.yandextranslate;

import io.realm.RealmObject;
import io.realm.annotations.Required;

public class HistoryRecord extends RealmObject {

    @Required
    private String word;
    private String translate;


    public void setWord(String word) {
        this.word = word;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getWord() {
        return word;
    }

    public String getTranslate() {
        return translate;
    }


}
