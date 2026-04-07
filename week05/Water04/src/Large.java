public class Large extends Customer{
    public Large(String name, String waterNo) {
        super(name, waterNo);
        type = new Type("큰공장", 80, 3.5f, "");
    }
}
