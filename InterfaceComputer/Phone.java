package InterfaceComputer;

import java.time.LocalDate;

public class Phone extends PortableDevice {
    public Phone(String brand, String model, String operatingSystem, int storage, String color, LocalDate releaseDate) {
        super(brand, model, operatingSystem, storage, color, releaseDate);
    }
    private Boolean screenBroken;
  private Boolean releasedIos;
   public void iosVersion(Boolean releasedIos){
       if(releasedIos){
           System.out.println("� ��� ����������� ��������� ������ Ios");
       }else {
           System.out.println("�������� ���������� Ios");
       }
   }
 public void screenBroke(Boolean screenBroken){
       if(screenBroken){
           System.out.println("����� ������, ���������� ������");
       }else {
           System.out.println("����� � ������� ���������");
       }
 }



}
