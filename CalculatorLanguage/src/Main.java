import CalculatorLanguageInterpreter.CalculatorLanguageBaseVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import CalculatorLanguageInterpreter.CalculatorLanguageParser;
import CalculatorLanguageInterpreter.CalculatorLanguageLexer;

import java.util.ArrayList;


public class Main extends CalculatorLanguageBaseVisitor<Long> {
    public double result;

    ArrayList<String> equation = new ArrayList<>();


    public Main(String input) {
        CalculatorLanguageLexer lexer = new CalculatorLanguageLexer(CharStreams.fromString(input));
        CalculatorLanguageParser parser = new CalculatorLanguageParser(new CommonTokenStream(lexer));
        lexer.removeErrorListeners();
        var x = parser.start();
        this.visitStart(x);
//        walkTree(x);
        result = solve(equation);
    }

    public static void main(String[] args) {
        new Main("1+2");
    }

    @Override
    public Long visitOpenParenthese(CalculatorLanguageParser.OpenParentheseContext ctx) {
        equation.add(ctx.getText());
        return super.visitOpenParenthese(ctx);
    }

    @Override
    public Long visitCloseParenthese(CalculatorLanguageParser.CloseParentheseContext ctx) {
        equation.add(ctx.getText());
        return super.visitCloseParenthese(ctx);
    }

    @Override
    public Long visitNumber(CalculatorLanguageParser.NumberContext ctx) {
        equation.add(ctx.getText());
        return super.visitNumber(ctx);
    }

    @Override
    public Long visitMultiply(CalculatorLanguageParser.MultiplyContext ctx) {
        equation.add(ctx.getText());
        return super.visitMultiply(ctx);
    }

    @Override
    public Long visitDivide(CalculatorLanguageParser.DivideContext ctx) {
        equation.add(ctx.getText());
        return super.visitDivide(ctx);
    }

    @Override
    public Long visitAdd(CalculatorLanguageParser.AddContext ctx) {
        equation.add(ctx.getText());
        return super.visitAdd(ctx);
    }

    @Override
    public Long visitSubtract(CalculatorLanguageParser.SubtractContext ctx) {
        equation.add(ctx.getText());
        return super.visitSubtract(ctx);
    }


    public double solve(ArrayList<String> equation) {
        double result;

//        parentheses(equation);

        exponent(equation);

        divideMultiply(equation);

        addSub(equation);

        result = Double.parseDouble(equation.get(0));
        return result;
    }

    private void addSub(ArrayList<String> equation) {
        for (int i = 0; i < equation.size(); i++) {
            if (equation.get(i).equals("+")) {
                double newValue = Double.parseDouble(equation.get(i - 1)) + Double.parseDouble(equation.get(i + 1));

                equation.set(i - 1, Double.toString(newValue));
                equation.remove(i);
                equation.remove(i);
                addSub(equation);
            } else if (equation.get(i).equals("-")) {
                double newValue = (Double.parseDouble(equation.get(i - 1)) - Double.parseDouble(equation.get(i + 1)));

                equation.set(i - 1, Double.toString(newValue));
                equation.remove(i);
                equation.remove(i);
                addSub(equation);
            }
        }
    }

    private void divideMultiply(ArrayList<String> equation) {
        for (int i = 0; i < equation.size(); i++) {
            if (equation.get(i).equals("*")) {
                double newValue = Double.parseDouble(equation.get(i - 1)) * Double.parseDouble(equation.get(i + 1));

                equation.set(i - 1, Double.toString(newValue));
                equation.remove(i);
                equation.remove(i);
                divideMultiply(equation);
            } else if (equation.get(i).equals("/")) {
                double newValue = Double.parseDouble(equation.get(i - 1)) / Double.parseDouble(equation.get(i + 1));

                equation.set(i - 1, Double.toString(newValue));
                equation.remove(i);
                equation.remove(i);
                divideMultiply(equation);
            }
        }
    }

    private void exponent(ArrayList<String> equation) {
        for (int i = 0; i < equation.size(); i++) {
            if (equation.get(i).equals("^")) {
                double newValue = Math.pow(Double.parseDouble(equation.get(i - 1)), Double.parseDouble(equation.get(i + 1)));

                equation.set(i - 1, Double.toString(newValue));
                equation.remove(i);
                exponent(equation);
            }
        }
    }
}
//
//    private void parentheses(ArrayList<String> equation) {
//        int numOfOpenParentheses = 0, numOfCloseParentheses = 0, currentClose = 0, currentOpen = 0;
//        int openParenthesesIndex = -1, closeParenthesesIndex = -1;
//        boolean firstLoopCheck = false;
//        ArrayList<String> newArr = new ArrayList<>();
//
//        for (String s : equation) {
//            if (s.equals("(")) {
//                numOfOpenParentheses++;
//            } else if (s.equals(")")) {
//                numOfCloseParentheses++;
//            }
//        }
//
//        if(numOfOpenParentheses > 0 && numOfCloseParentheses > 0) {
//
//            for (int i = 0; i < equation.size(); i++) {
//                if (equation.get(i).equals("(")) {
//                    currentOpen++;
//                }
//
//                if (equation.get(i).equals("(") && openParenthesesIndex == -1) {
//                    openParenthesesIndex = i;
//                }
//
//                if (equation.get(i).equals(")")) {
//                    currentClose++;
//                }
//
//                if (equation.get(i).equals(")") && currentClose == currentOpen && !firstLoopCheck) {
//                    closeParenthesesIndex = i;
//                    firstLoopCheck = true;
//                }
//            }
//
//            currentClose = 0;
//            currentOpen = 0;
//
//            secondaryParentheses(newArr, openParenthesesIndex, closeParenthesesIndex, currentClose, currentOpen);
//        }
//        else if(numOfOpenParentheses < numOfCloseParentheses) {
//            System.out.println("NO OPEN PARENTHESES TO MATCH CLOSE PARETHESE(S)");
//            System.exit(0);
//        }
//        else if(numOfOpenParentheses > numOfCloseParentheses) {
//            System.out.println("NO CLOSE PARENTHESES TO MATCH OPEN PARETHESE(S)");
//            System.exit(0);
//        }
//    }
//
//    void secondaryParentheses(ArrayList<String> equation, int openParenthesesIndex, int closeParenthesesIndex, int currentClose, int currentOpen) {
//        for (int i = openParenthesesIndex + 1; i < closeParenthesesIndex; i++) {
//
//            if(equation.get(i).equals("(")) currentOpen++;
//            else if(equation.get(i).equals(")")) currentClose++;
//
//            equation.add(equation.get(i));
//        }
//        System.out.println(equation);
//        System.out.println(currentClose);
//        System.out.println(currentOpen);
//    }
//}
