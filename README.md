# JVM is Admin

[![Build Status](https://travis-ci.org/lionants02/JvmIsAdmin.svg?branch=master)](https://travis-ci.org/lionants02/JvmIsAdmin.ini) [![Release](https://jitpack.io/v/lionants02/JvmIsAdmin.svg)](https://jitpack.io/#lionants02/JvmIsAdmin)  
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)

[Ref: https://stackoverflow.com/questions/4350356/detect-if-java-application-was-run-as-a-windows-admin](https://stackoverflow.com/questions/4350356/detect-if-java-application-was-run-as-a-windows-admin)

เพิ่ม JitPack repository ที่ build script
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

เพิ่ม dependency
```
dependencies {
    implementation "com.github.lionants02:JvmIsAdmin:$latestVersion"
}
```

ใช้
```kotlin
    if(JvmIsAdmin().isAdmin()){
        println("is Admin")
    }else {
        println("is not Admin")
    }
```
