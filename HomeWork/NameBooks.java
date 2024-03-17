package HomeWork;

public enum NameBooks {

    IT("ОНО"),
    HARRY_POTTER("Гарри Поттер"),
    GREEN_MILE("Зеленая Миля"),
    WITCHER("Ведьмак"),
    SHERLOCK_H0LMES("Шерлок Холмс");

    private final String  value;

    public String getNameBooks(){
        return value;

    }

    NameBooks(String value){
        this.value = value;
    }




}
