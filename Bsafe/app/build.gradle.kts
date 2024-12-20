plugins {
    alias(libs.plugins.androidApplication)
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.bsafe"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.bsafe"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation("androidx.core:core-ktx:+")
    implementation(libs.firebase.database)
    implementation(libs.firebase.auth)
    implementation("com.google.firebase:firebase-auth:21.0.6")
    implementation(platform("com.google.firebase:firebase-bom:32.8.0"))
    implementation("com.google.firebase:firebase-analytics")
    // Import the BoM for the Firebase platform

    // Declare the dependencies for the desired Firebase products without specifying versions
    // For example, declare the dependencies for Firebase Authentication and Cloud Firestore
    implementation ("com.google.firebase:firebase-auth")
    implementation ("com.google.firebase:firebase-firestore")
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

}
