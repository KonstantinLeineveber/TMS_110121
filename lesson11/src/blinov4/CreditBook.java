package blinov4;

class CreditBook {
//4. Создать класс Зачетная Книжка с внутренним классом,
//с помощью объектов которого можно хранить информацию о сессиях, зачетах, экзаменах.


    private Grades grades;


    public class Grades {
        private String[] disciplineExam;
        private String[] disciplineCredit;
        private int[] disciplineExamGrades;
        private String[] disciplineCreditGrades;

        public void setDisciplineExam(String[] disciplineExam) {
            this.disciplineExam = disciplineExam;
        }

        public void setDisciplineCredit(String[] disciplineCredit) {
            this.disciplineCredit = disciplineCredit;
        }

        public void setDisciplineExamGrades(int[] disciplineExamGrades) {
            this.disciplineExamGrades = disciplineExamGrades;
        }

        public void setDisciplineCreditGrades(String[] disciplineCreditGrades) {
            this.disciplineCreditGrades = disciplineCreditGrades;
        }
    }


    public void nameDisciplineExam(String[] disciplineExam) {
        grades = new Grades();
        grades.setDisciplineExam(disciplineExam);
    }

    public void nameDisciplineCredit(String[] disciplineCredit) {

        grades.setDisciplineCredit(disciplineCredit);
    }

    public void nameDisciplineExamGrades(int[] disciplineExamGrades) {
        grades.setDisciplineExamGrades(disciplineExamGrades);
    }

    public void nameDisciplineCreditGrades(String[] disciplineCreditGrades) {
        grades.setDisciplineCreditGrades(disciplineCreditGrades);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Зачеты:" + "\n");
        for (int j = 0; j < grades.disciplineCredit.length; j++) {
            s.append(grades.disciplineCredit[j] + " - " + grades.disciplineCreditGrades[j] + "\n");
        }
        s.append("Экзамены:" + "\n");
        for (int i = 0; i < grades.disciplineExam.length; i++) {
            s.append(grades.disciplineExam[i] + " - " + grades.disciplineExamGrades[i] + "\n");
        }
        return s.toString();
    }

}