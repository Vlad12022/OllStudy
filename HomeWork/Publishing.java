package HomeWork;

public enum Publishing {
    BLOOMSBURY("����������"),
    AST("���");

    private final String  value ;

    public String getPublishing(){
        return value;
    }

    Publishing(String value){
        this.value = value;
    }


}
