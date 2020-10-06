import org.spongepowered.configurate.build.core
import org.spongepowered.configurate.build.mojang

plugins {
    id("org.spongepowered.configurate.build.component")
}

repositories {
    mojang()
}

dependencies {
    api(core())
    api("com.mojang:datafixerupper:2.0.24")
    testImplementation(project(":format:gson"))
}

tasks.withType(Javadoc::class) {
    val options = this.options
    if (options is StandardJavadocDocletOptions) {
        options.links(
            "https://kvverti.github.io/Documented-DataFixerUpper/snapshot/"
        )
    }
}
