import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataContainer {
    private String data;
    private int number;
}

@Inherited_Annotation(dayOfWeek=2)
abstract class ParentClass {
    abstract public void someMethod(String data, int num);
    abstract public DataContainer someMethod2(String data, int num);
}

class ChildClass1 extends ParentClass{
    @Override
    @Repeatable_Annotation(description = "Goodbuy", priority = 1, hours = 4)
    public void someMethod(@NonNull String data, @NonNull int num) {
        System.out.println("Hello World!!!");
    }
    @Repeatable_Annotation(description = "Some text", priority = 52, hours = 3)
    public DataContainer someMethod2(String data, int num){return new DataContainer(data, num);}
}

@Inherited_Annotation(dayOfWeek=1)
class ChildClass2 extends ParentClass{
    @Repeatable_Annotation(description = "Some text", priority = 1000, hours = 8)
    public void someMethod(@NonNull String data, @NonNull int num) {
        System.out.println("Hello World!!!");
    }
    @Repeatable_Annotation(description = "Some text", priority = 999, hours = 11)
    public DataContainer someMethod2(String data, int num){return new DataContainer(data, num);}
}