package by.it.evstratov.calc;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public Var calc(String expression) throws CalcException {

        expression = expression.replaceAll("\\s","");
        String[] part = expression.split(Patterns.OPERATION, 2);

        if(part.length < 2){
            return Var.createVar(expression);
        }

        Var right = Var.createVar(part[1]);
        if(expression.contains("=")){
            return Var.saveVar(part[0], right);
        }
        Var left = Var.createVar(part[0]);

        if(Objects.nonNull(left) && Objects.nonNull(right)){
            Pattern compile = Pattern.compile(Patterns.OPERATION);
            Matcher matcher = compile.matcher(expression);
            if(matcher.find()){
                String operation = matcher.group();
                switch (operation){
                    case "+" :
                        RepoVar.saveToLog(right + " + " + left +" = "+right.addWidth(left));
                        return right.addWidth(left);
                    case "-" :
                        RepoVar.saveToLog(right + " - " + left+" = "+right.subWidth(left));
                        return right.subWidth(left);
                    case "*" :
                        RepoVar.saveToLog(right + " * " + left+" = "+right.mulWidth(left));
                        return right.mulWidth(left);
                    case "/" :
                        RepoVar.saveToLog(right + " / " + left+" = "+right.divWidth(left));
                        return right.divWidth(left);
                }
            }
        }
        return null;
    }
}
