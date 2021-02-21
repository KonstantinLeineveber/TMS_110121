package blinov4;

class Runner {
    public static void main(String[] args) {

        CreditBook sessia1 = new CreditBook();
        sessia1.nameDisciplineExam(new String[]{"Математика", "Физика", "Химия", "Биология"});
        sessia1.nameDisciplineCredit(new String[]{"Информатика", "Топочка", "Военная подготовка", "Эпидемиология"});
        sessia1.nameDisciplineExamGrades(new int[]{8, 7, 6, 5});
        sessia1.nameDisciplineCreditGrades(new String[]{"Зачтено", "Зачтено", "Не зачтено", "Зачтено"});
        System.out.println(sessia1);
    }
}
