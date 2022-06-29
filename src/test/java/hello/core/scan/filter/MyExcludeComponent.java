package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // TYPE은 class레벨에 붙는것
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
    //MyExcludeComponent 붙은건 컴포넌트 스캔에 제거할것이다.
}
