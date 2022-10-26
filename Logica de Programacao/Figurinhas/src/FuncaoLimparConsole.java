import java.io.IOException;
import java.util.*;

public class FuncaoLimparConsole {
    public void Console() throws InterruptedException, IOException {

        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            new ProcessBuilder("clear").inheritIO().start().waitFor();
    }

}
