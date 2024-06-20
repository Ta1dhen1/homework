import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Repeatable_Annotations {
    Repeatable_Annotation[] value();
}
