package HomeWork;

import java.util.Objects;

public class Patient {

    private int id;
    private String name;
    private String address;
    private long number;
    private int medCard;
   private Diagnosis diagnosis;
    public static final int MED_CARD_1 = 123;
    public static final int MED_CARD_2 = 320;
    public static final int MED_CARD_3 = 98;
    public static final int MED_CARD_4 = 25;

    public Patient(int id, String name, String address, long number, int medcard, Diagnosis diagnosis) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
        this.medCard = medcard;
        this.diagnosis = diagnosis;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getMedCard() {
        return medCard;
    }

    public void setMedCard(int medCard) {
        this.medCard = medCard;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", medCard=" + medCard +
                ", diagnosis=" + diagnosis +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && number == patient.number && medCard == patient.medCard && Objects.equals(name, patient.name) && Objects.equals(address, patient.address) && diagnosis == patient.diagnosis;
    }

}
