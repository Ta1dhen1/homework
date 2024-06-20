import java.lang.annotation.*;
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inherited_Annotation {
    int dayOfWeek() default 1;
}

//Создайте класс с новой аннотацией наследования и несколько его наследников, у одного из которых аннотацией наследования будет переопределена