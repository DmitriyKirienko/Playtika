package by.playtika;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {

    public Matcher get(String expression) {
        Pattern p = Pattern.compile("^(-?\\d+[.]?\\d*?)(\\+|-|/|\\*)(-?\\d+[.]?\\d*?)$");
        Matcher matcher = p.matcher(expression);
        return matcher;
    }
}
