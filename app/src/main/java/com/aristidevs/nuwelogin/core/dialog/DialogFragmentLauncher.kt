package com.aristidevs.nuwelogin.core.dialog

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Lifecycle.State.RESUMED
import androidx.lifecycle.LifecycleObserver
import com.aristidevs.nuwelogin.core.delegate.weak
import javax.inject.Inject

class DialogFragmentLauncher @Inject constructor() : LifecycleObserver {

    private var activity: FragmentActivity? by weak()
    private var dialogFragment: DialogFragment? by weak()

    fun show(dialogFragment: DialogFragment, activity: FragmentActivity) {
        if (activity.lifecycle.currentState.isAtLeast(RESUMED)) {
            dialogFragment.show(activity.supportFragmentManager, null)
        } else {
            this.activity = activity
            this.dialogFragment = dialogFragment
            activity.lifecycle.addObserver(this@DialogFragmentLauncher)
        }
    }

}

