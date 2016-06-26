package org.jetbrains.spek.api.meta

/**
 * Any public API with this annotation is considered to be experimental. It can be subject
 * to incompatible changes, or even removal, in future releases.
 *
 * @author Ranie Jade Ramiso
 * @since 1.0
 */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY)
annotation class Experimental
