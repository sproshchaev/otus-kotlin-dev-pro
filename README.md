[![Kotlin](https://img.shields.io/badge/Kotlin-FFFFFF??style=for-the-badge&logo=Kotlin)](https://kotlinlang.org/)
# otus-kotlin-dev-pro

Шаблон приложения на Kotlin (Gradle) https://github.com/sproshchaev/otus-kotlin-dev-pro/tree/live-gradle
Шаблон приложения на Kotlin (Maven)  https://github.com/sproshchaev/otus-kotlin-dev-pro/tree/live-maven

Для подготовки проекта:
```txt
1. Открыть файл kotlin-app\build.gradle.kts, Меню Gradle - Reload All Gradle Project  
2. Если в классах отображаются ошибки в IDE (методы выделены красным), но проект запускается, то 
   Очистите кэш и перезапустите IDE: Выберите File → Invalidate Caches → [Invalidate And Restart]. 
3. Дождаться переиндексации проекта и проверить kotlin-app\src\main\kotlin\Main.kt.   
```
Перед переключением на другую ветку:
```txt
1. Удалить все файлы, не содержащиеся в commit: Gradle → otus-kotlin-dev-pro → Tasks → build → clean
```