package annotations;

@Version(num = 7.1, nameVersion = "Nougat")
public class MyService {
    private double fontSize = 13.5;
    private String option = "Setting";
    private String dataVersion = "16.01.2021";

    public double getFontSize() {
        return fontSize;
    }

    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public boolean equals(Object myService) {
        return super.equals(myService);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private String thisClassInfo() {
        return "Размер шрифта: " + getFontSize() + '\n'
                + "Название опции: " + getOption() + '\n'
                + "Хэшкод: " + hashCode();

    }
}
