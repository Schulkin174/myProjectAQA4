import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IsDone {

    @Test
    public void testMainMethod() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        GetTextFromAvitoPage.main(new String[]{});

        String actual = outputStream.toString().trim();
        String expected = "Транспорт и запчасти в Санкт-Петербурге"; // Ожидаемый результат

        Assertions.assertEquals(expected, actual);
    }
}
