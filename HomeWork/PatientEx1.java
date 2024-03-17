package HomeWork;

import java.util.Scanner;

public class PatientEx1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Patient[] patients = new Patient[4];
        patients[0] = new Patient(1246, "������� ���������", "���������� 6", 375447832935L, Patient.MED_CARD_3, Diagnosis.FRACTURE_4);
        patients[1] = new Patient(1545, "������ ����", "��������", 3754434332935L, Patient.MED_CARD_2, Diagnosis.HEMORRHOIDS_3);
        patients[2] = new Patient(1243, "������� ������", "�������", 37544452935L, Patient.MED_CARD_4, Diagnosis.COLD_2);
        patients[3] = new Patient(1346, "������ ���������", "������", 37544454532935L, Patient.MED_CARD_1, Diagnosis.DISLOCATION_1);


        System.out.println("������� ��� ��������:");
        String pacientName = scan.nextLine();
        System.out.println("������� ����� ��� �����:");

        String medCart = scan.nextLine();

        for (Patient patient : patients) {
            if (patient.getName().equals(pacientName) || medCart.equals(String.valueOf(patient.getMedCard()))) {
                System.out.println("������� ��������" + " " + pacientName + " : " + patient.getDiagnosis() + "," + "��� ��� �����" + ":" + patient.getMedCard());
                break;
            }
        }


    }


}
