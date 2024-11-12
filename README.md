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
   Очистите кэш и перезапустите IDE: Выберите File → Invalidate Caches / Restart. 
4. java-app\src\main\java и java-app\src\main\kotlin отметить как "Source Root".   
```
Перед переключением на другую ветку:
```txt
1. Удалить все файлы, не содержащиеся в commit: Maven → otus-kotlin-dev-pro → Lifecycle → clean
```

### java-app
```txt
1. pom.xml: spring-boot-starter-web 3.3.5
            kotlin-stdlib-jdk8      2.0.21  
            kotlin-maven-plugin     2.0.21
            maven-compiler-plugin   3.8.1   
2. Структура java-app\src\main\java
                              \kotlin  
3. Браузер, Java ("/v1"):   
                    localhost:8080\v1\hello
                    localhost:8080\v1\user?id=1  (существует)
                    localhost:8080\v1\user?id=10 (не найден)
4. java-app\src\main\kotlin
                           \domain\User
                           \repository\UserRepository
                           \service\UserService 
                           \controller\Controller 

5. Перезапустить проект, Браузер, Kotlin ("/v2"): 
                     localhost:8080\v2\hello
                     localhost:8080\v2\user?id=1  (существует)
                     localhost:8080\v2\user?id=10 (не найден)

```