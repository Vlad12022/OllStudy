package HomeWork;

public enum Faculty {

    ECONOMIC("�������������"),
    ENGINEERING("����������"),
    JURIDICAL("�����������"),
    JOURNALISTIC("������������"),
    PHILOLOGICAL("������������"),
    LINGUISTICS("���������������");

    private final String  value ;

    public String getFaculty(){
        return value;
    }

    Faculty(String value){
        this.value = value;
    }


}
