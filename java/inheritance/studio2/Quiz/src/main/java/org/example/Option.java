package org.example;

public class Option {
    private final String content;
    private final boolean isCorrect;

    public Option(String content, boolean isCorrect) {
        this.content = content;
        this.isCorrect = isCorrect;
    }
    public Option(String content){
        this(content,false);
    }

    public String getContent() {
        return content;
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}
