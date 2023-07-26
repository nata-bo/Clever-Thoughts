import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter("./res/output.txt", true));
            String answer1 = "да";
            while (answer1.equals("да")) {
                System.out.println("Хотите записать еще одну умную мысль?");
                answer1 = reader.readLine();
                if (answer1.equals("да")) {
                    System.out.println("Какую?");
                    writer.write(reader.readLine()+"\n");

                }
            }
            reader.close();
            writer.close();

    }
}