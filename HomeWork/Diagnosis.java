package HomeWork;

public enum Diagnosis {

    DISLOCATION_1("�����"),
    COLD_2("��������"),
    HEMORRHOIDS_3("�������"),
    FRACTURE_4("�������");

    private final String value;

    public String getDiagnosis() {
        return value;
    }

    Diagnosis(String value) {
        this.value = value;
    }


}
