package com.aristidevs.nuwelogin.core.delegate

import java.lang.ref.WeakReference
import kotlin.reflect.KProperty

inline fun <reified T> weak() = WeakReferenceDelegate<T>()

class WeakReferenceDelegate<T> {
    private var weakReference: WeakReference<T>? = null

    operator fun getValue(thisRef: Any, property: KProperty<*>): T? = weakReference?.get()
    operator fun setValue(thisRef: Any, property: KProperty<*>, value: T?) {
        weakReference = value?.let(::WeakReference)
    }
}


