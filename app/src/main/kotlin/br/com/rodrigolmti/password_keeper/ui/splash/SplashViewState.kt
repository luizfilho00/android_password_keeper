package br.com.rodrigolmti.password_keeper.ui.splash

import br.com.rodrigolmti.core_android.SingleLiveEvent
import javax.inject.Inject

internal class SplashViewState @Inject constructor() {

    val action: SingleLiveEvent<Action> = SingleLiveEvent()

    sealed class Action {
        object KeyGenerationSucceeded : Action()
        object KeyGenerationError : Action()
    }
}