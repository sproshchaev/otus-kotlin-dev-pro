[![Kotlin](https://img.shields.io/badge/Kotlin-FFFFFF??style=for-the-badge&logo=Kotlin)](https://kotlinlang.org/)
# otus-kotlin-dev-pro

Шаблон приложения на Kotlin (Gradle) https://github.com/sproshchaev/otus-kotlin-dev-pro/tree/live-gradle
Шаблон приложения на Kotlin (Maven)  https://github.com/sproshchaev/otus-kotlin-dev-pro/tree/live-maven

Для подготовки проекта Maven:
```txt
1. Удалить .gradle          (если есть) 
2. Удалить .idea\gradle.xml (если есть)  
Открыть файл kotlin-app\pom.xml, правой кнопкой - Maven - Reload project  
3. Если в классах отображаются ошибки в IDE (методы выделены красным), но проект запускается, то 
   Очистить кэш и перезапустите IDE: File → Invalidate Caches → [Invalidate and Restart]. 
4. java-app\src\main\java и java-app\src\main\kotlin отметить как "Source Root".   
```
Перед переключением на другую ветку:
```txt
1. Удалить все файлы, не содержащиеся в commit: Maven → otus-kotlin-dev-pro → Lifecycle → clean
```

### java-app (Java 17)
```txt
1. pom.xml (root) kotlin.compiler.jvmTarget 17
2. pom.xml: spring-boot-starter-web 3.3.5
            kotlin-stdlib-jdk8      2.0.21  
            kotlin-maven-plugin     2.0.21, jvmTarget 17
            maven-compiler-plugin   3.8.1
3. Структура java-app\src\main\java
                              \kotlin  
4. Браузер, Java ("/v1"):   
                    localhost:8080\v1\hello
                    localhost:8080\v1\user?id=1  (существует)
                    localhost:8080\v1\user?id=10 (не найден)
5. java-app\src\main\kotlin
                           \domain\User
                           \repository\UserRepository
                           \service\UserService 
                           \controller\Controller 

6. Перезапустить проект, Браузер, Kotlin ("/v2"): 
                     localhost:8080\v2\hello
                     localhost:8080\v2\user?id=1  (существует)
                     localhost:8080\v2\user?id=10 (не найден)

7. Изменить точку входа на java-app\src\main\kotlin\MainKt.kt
```