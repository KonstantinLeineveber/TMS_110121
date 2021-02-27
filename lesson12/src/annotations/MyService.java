package annotations;

@Version(num = 7.1, nameVersion = "Nougat")
public class MyService {
    private double version = 7.1;
    private String nameVersion = "Nougat";
    private String dataVersion = "16.01.2021";

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getNameVersion() {
        return nameVersion;
    }

    public void setNameVersion(String nameVersion) {
        this.nameVersion = nameVersion;
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
        return "Версия: " + getVersion() + '\n'
                + "Название версии: " + getNameVersion() + '\n'
                + "Хэшкод: " + hashCode();

    }
}
