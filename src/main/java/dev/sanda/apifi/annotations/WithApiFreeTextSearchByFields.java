package dev.sanda.apifi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.core.annotation.AliasFor;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface WithApiFreeTextSearchByFields {
  String[] value();

  String secured() default "";

  String[] rolesAllowed() default "";

  String preAuthorize() default "";

  String postAuthorize() default "";

  String preFilter() default "";

  String preFilterTarget() default "";

  String postFilter() default "";
}
