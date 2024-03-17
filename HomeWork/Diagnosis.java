package HomeWork;

public enum Diagnosis {

    DISLOCATION_1("Вывих"),
    COLD_2("Простуда"),
    HEMORRHOIDS_3("Геморой"),
    FRACTURE_4("Перелом");

    private final String value;

    public String getDiagnosis() {
        return value;
    }

    Diagnosis(String value) {
        this.value = value;
    }


}
