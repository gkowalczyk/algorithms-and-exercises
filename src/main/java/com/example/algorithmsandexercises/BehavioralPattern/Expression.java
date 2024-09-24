package com.example.algorithmsandexercises.BehavioralPattern;
///Cel: Umożliwia reprezentację gramatyki języka i rozwiązywanie wyrażeń w tym języku.
interface Expression {
   boolean interpreter(String context);

} class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String context) {
        return context.contains(data);
    }
}

class OrExpression implements Expression {

    private Expression expression1;
    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpreter(String context) {
        return expression1.interpreter(context) || expression2.interpreter(context);
    }

    public static void main(String[] args) {
        Expression expression1 = new TerminalExpression("A");
        Expression expression2 = new TerminalExpression("B");
        Expression orExpression = new OrExpression(expression1, expression2);

        System.out.println(orExpression.interpreter("A"));
        System.out.println(orExpression.interpreter("B"));
        System.out.println(orExpression.interpreter("C"));
    }
}
