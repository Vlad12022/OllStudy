package HomeWork;

public enum Color {
    RED("�������"),
    GREEN("�������"),
    BLUE("�����");
    private final String value;

    public String getColor(){
        return value;
    }

    Color(String value){
        this.value = value;
    }


}
