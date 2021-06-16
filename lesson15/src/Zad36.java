import java.io.File;

public class Zad36 {
    public static void main(String[] args) {
//        Задание 36
//        Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
//        должны быть распечатаны отдельно.
        File pathFAD;
        String[] pathFilesAndDir;
        File pathDOF;
        try {
            pathFAD = new File("d:/tms/TMS_110121/lesson15/");
            pathFilesAndDir = pathFAD.list();
            for (String path : pathFilesAndDir) {
                pathDOF = new File("d:/tms/TMS_110121/lesson15/" + path);
                if (pathDOF.isDirectory()) {
                    System.out.println("Директории - " + path);
                }
            }
            System.out.println();
            for (String path : pathFilesAndDir) {
                pathDOF = new File("d:/tms/TMS_110121/lesson15/" + path);
                if (pathDOF.isFile()) {
                    System.out.println("Файлы - " + path);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
