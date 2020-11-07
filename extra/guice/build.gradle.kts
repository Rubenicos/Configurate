import org.spongepowered.configurate.build.core

plugins {
    id("org.spongepowered.configurate.build.component")
}

description = "Guice support for Configurate's object mapper"

dependencies {
    implementation(core())
    // We are stuck with 4.1.0 because MC has not updated its Guava version
    implementation("com.google.inject:guice:4.1.0")
}
