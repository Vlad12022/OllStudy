package HomeWork;

public enum NameBooks {

    IT("���"),
    HARRY_POTTER("����� ������"),
    GREEN_MILE("������� ����"),
    WITCHER("�������"),
    SHERLOCK_H0LMES("������ �����");

    private final String  value;

    public String getNameBooks(){
        return value;

    }

    NameBooks(String value){
        this.value = value;
    }




}
