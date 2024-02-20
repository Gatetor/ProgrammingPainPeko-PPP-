import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        // int total = 0;
        int linecount = 1;
        int contamin = 0;
        int contamax = 0;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);

                if (c == 'a') {
                    contamin++;
                } else {
                    if (c == 'A') {
                        contamax++;
                    } else {
                        if ((c == 10) || (c == '.')) {
                            System.out.println("Linea " + linecount
                                    + " tiene: "
                                    + contamin + " a's y "
                                    + contamax + " A's");
                            linecount++;
                            contamin = 0;
                            contamax = 0;
                        }
                    }
                }

            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        // total = contamin + contamax;
        // System.out.println("Hay un total de " + total);

    }
}