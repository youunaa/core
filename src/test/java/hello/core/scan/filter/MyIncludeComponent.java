package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // TYPE은 class레벨에 붙는것
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
    //MyIncludeComponent가 붙은건 컴포넌트 스캔에 추가할것이다.
}
