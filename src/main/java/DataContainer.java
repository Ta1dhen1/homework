import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public  class DataContainer {
    private String data;
    private int number;
}

@Inherited_Annotation(dayOfWeek=2)
abstract class ParentClass {
    public void someMethod() {}
}

class ChildClass1 extends ParentClass{
    @Repeatable_Annotation(description = "Goodbuy", priority = 1, hours = 4)
    public void someMethod(@NonNull String data, @NonNull int num) {
        System.out.println("Hello World!!!");
    }
}

@Inherited_Annotation(dayOfWeek=1)
class ChildClass2 extends ParentClass{
    @Repeatable_Annotation(description = "Some text", priority = 1000, hours = 8)
    public void someMethod(@NonNull String data, @NonNull int num) {
        System.out.println("Hello World!!!");
    }
}