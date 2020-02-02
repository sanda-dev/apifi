package dev.sanda.apifi.annotations;


import dev.sanda.datafi.annotations.finders.FindAllBy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@FindAllBy
public @interface GetAllBy {
}