object ApplicationId {
    const val id = "br.com.rodrigolmti.password_keeper"
}

object Versions {
    const val kotlin = "1.3.71"
    const val gradle = "3.6.1"
    const val buildTools = "29.0.3"
    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29
}

object Releases {
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Modules {
    const val app = ":app"
    const val coreAndroid = ":core-android"
    const val dashboard = ":dashboard"
    const val injector = ":injector"
    const val navigator = ":navigator"
    const val uiKit = ":ui-kit"
    const val database = ":database"
    const val userPreferences = ":user-preferences"
    const val security = ":security"
    const val authentication = ":authentication"
}

object Kotlin {
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val junit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
}

object Lifecycle {
    object Versions {
        const val lifecycle = "2.2.0"
    }

    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
}

object Dagger {
    object Versions {
        const val dagger = "2.25.4"
    }

    const val core = "com.google.dagger:dagger:${Versions.dagger}"
    const val compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val android = "com.google.dagger:dagger-android-support:${Versions.dagger}"
}

object Navigation {
    object Versions {
        const val navigationVersion = "2.3.0-alpha04"
    }

    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"
    const val navigationArgs =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigationVersion}"
}

object Firebase {
    object Versions {
        const val analytics = "17.0.0"
        const val crashlytics = "17.0.0-beta04"
    }

    const val analytics = "com.google.firebase:firebase-core:${Versions.analytics}"
    const val crashlytics = "com.google.firebase:firebase-crashlytics:${Versions.crashlytics}"
}

object AndroidX {
    object Versions {
        const val ktx = "1.2.0"
        const val appcompat = "1.1.0"
        const val support = "1.0.0"
        const val fragment = "1.2.2"
        const val room = "2.2.5"
    }

    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val design = "com.google.android.material:material:${Versions.support}"
    const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomExt = "  androidx.room:room-ktx:${Versions.room}"
}

object JUnit {
    object Versions {
        const val junit = "4.12"
    }

    const val core = "junit:junit:${Versions.junit}"
}

object MockK {
    object Versions {
        const val mockk = "1.9.3"
    }

    const val core = "io.mockk:mockk:${Versions.mockk}"
    const val android = "io.mockk:mockk-android:${Versions.mockk}"
}

object Libraries {
    object Versions {
        const val lottie = "3.4.0"
    }

    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"
}

object Layout {
    object Versions {
        const val constraintLayout = "1.1.3"
    }

    const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
}