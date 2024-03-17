package HomeWork;

public enum Color {
    RED("Красный"),
    GREEN("Зеленый"),
    BLUE("Синий");
    private final String value;

    public String getColor(){
        return value;
    }

    Color(String value){
        this.value = value;
    }


}
