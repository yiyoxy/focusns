

package org.focusns.web.widget.annotation;

import org.focusns.web.widget.engine.WidgetFilter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BeforeFilter {

    Class<? extends WidgetFilter> value();

}