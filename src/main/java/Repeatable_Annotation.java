import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Repeatable_Annotations.class)
public @interface Repeatable_Annotation {
    String description() default "Hello";
    int priority() default 0;
    int hours() default 12;
}

