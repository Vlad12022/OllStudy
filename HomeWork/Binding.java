package HomeWork;

public enum Binding {
    SOFT("������"),
    SOLID("�������");

 private final String value ;

 public String getBinding(){
    return value;}

 Binding(String value){
     this.value = value;
 }

}
