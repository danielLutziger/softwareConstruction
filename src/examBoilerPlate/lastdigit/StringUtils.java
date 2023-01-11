package examBoilerPlate.lastdigit;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtils {
    public static String toSnakeCase(String text){
        if (text == null) throw new NullPointerException("text == null");
        String snake = text;
        Pattern p = Pattern.compile("([A-Z])");
        for (;;){
            Matcher m = p.matcher(snake);
            if (!m.find()) break;
            snake = m.replaceFirst("_" + m.group(1).toLowerCase());
        }
        return snake.replaceFirst("^_", "");
    }

    @Test
    public void testToSnakeCaseUpperCase(){
        assertEquals("a_s_d_faaa", toSnakeCase("ASDFaaa")) ;
    }
    @Test
    public void testToSnakeCaseFail(){
        try {
            toSnakeCase("");
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }
}
