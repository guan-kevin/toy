package org.example;

public class Bar {
    public String first(String name, int age, boolean flag) {
        StringBuilder builder = new StringBuilder();
        second(builder, name);
        third(builder, age);
        builder.append(fifth(builder, flag));
        return summary(builder);
    }

    public void second(StringBuilder builder, String name) {
        builder.append("My name is ").append(name).append(". ");
    }

    public void third(StringBuilder builder, int age) {
        fourth(builder, age + 10);
    }

    public void fourth(StringBuilder builder, int age) {
        builder.append("I am ").append(age).append(" years old. ");
    }

    public String fifth(StringBuilder builder, boolean flag) {
        String msg = flag ? "I like banana" : "I don't like banana";
        builder.append("Also, ");
        return msg;
    }

    private String summary(StringBuilder builder) {
        builder.append("!");
        return builder.toString();
    }
}
