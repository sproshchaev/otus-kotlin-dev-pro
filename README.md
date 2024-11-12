[![Kotlin](https://img.shields.io/badge/Kotlin-FFFFFF??style=for-the-badge&logo=Kotlin)](https://kotlinlang.org/)
# otus-kotlin-dev-pro

Шаблон приложения на Kotlin (Gradle) https://github.com/sproshchaev/otus-kotlin-dev-pro/tree/live-gradle
Шаблон приложения на Kotlin (Maven)  https://github.com/sproshchaev/otus-kotlin-dev-pro/tree/live-maven

Для подготовки проекта Maven:
```txt
1. Удалить .gradle (если есть)
2. Удалить .idea\gradle.xml
3. Открыть файл kotlin-app\pom.xml, правой кнопкой - Maven - Reload project  

4. Если в классах отображаются ошибки в IDE (методы выделены красным), но проект запускается, то 
   Очистите кэш и перезапустите IDE: Выберите File → Invalidate Caches / Restart. 
5. Проверить запуск kotlin-app\src\main\kotlin\Main.kt
```
Перед переключением на другую ветку:
```txt
1. Удалить все файлы, не содержащиеся в commit: Maven → otus-kotlin-dev-pro → Lifecycle → clean
```