package HomeWork;

public enum Faculty {

    ECONOMIC("Ёкономический"),
    ENGINEERING("»нженерный"),
    JURIDICAL("ёридический"),
    JOURNALISTIC("∆урналисткий"),
    PHILOLOGICAL("‘илогический"),
    LINGUISTICS("Ћингвистический");

    private final String  value ;

    public String getFaculty(){
        return value;
    }

    Faculty(String value){
        this.value = value;
    }


}
