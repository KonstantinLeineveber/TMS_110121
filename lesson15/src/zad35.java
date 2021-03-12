import java.io.*;
import java.util.Random;

public class zad35 {
    public static void main(String[] args) throws IOException {
//        Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//                распечатать числа и их среднее арифметическое.
        int summ = 0;
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new
                FileOutputStream("dvoi.dat")));
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int rand = random.nextInt(100);
            dos.writeInt(rand);
        }
        dos.close();

        DataInputStream dis = new DataInputStream(new BufferedInputStream(new
                FileInputStream("dvoi.dat")));
        System.out.print("20 случайных чисел  - ");
        int res = dis.readInt();
        while (true) {
            System.out.print(res + " ");
            summ += res;

            try {
                res = dis.readInt();
            } catch (EOFException e) {
                break;
            }
        }
        dis.close();
        double srArifm = summ / 20;
        System.out.print('\n' + "Среднее арифметическое = " + srArifm);
    }
}
