/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 系统日志注解
 *
 * @author Mark sunlightcs@gmail.com
 */
@Target(ElementType.METHOD)//作用地点
@Retention(RetentionPolicy.RUNTIME)//保存时间
@Documented//
public @interface SysLog {//@syslog注解 属性

	String value() default "";
}
