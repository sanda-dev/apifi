package org.sindaryn.apifi.annotations;

import org.sindaryn.apifi.service.EmbeddedCollectionMetaOperations;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Allows for custom business logic when pre/post mutating the state of the annotated Iterable<> field
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MetaOperations {
    @AliasFor("value")
    Class<? extends EmbeddedCollectionMetaOperations> metaOps();
    Class<? extends EmbeddedCollectionMetaOperations> value();
}
