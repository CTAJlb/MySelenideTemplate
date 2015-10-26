Фреймворк реализован на языке JAVA, с использованием библиотек Selenium, Selenide + TestNG. Сборка проекта осуществляется при помощи утилиты-сборщика Maven. Запуск тестов выполняется командой /mvn clean test или /mvn clean test site для формирования отчета Allure.
в корневой директории проекта (на машине должен быть установлен и прописан в переменных окружения Maven + JDK)

Фреймворк имеет следующую структуру:

/pom.xml - файл для конфигурирования Maven

/src - "Source"-директория, где хранятся все исходные .java файлы, которые логически разделены на следующие слои-фреймворка.

/src/main/java - директория где хранятся все необходимые исходные .java файлы, кроме самих тестов (файлы с тестами хранятся отдельно в директории /src/test/java).

/src/main/java/base - Директория в которой находится класс BaseTest, где мы настраиваем драйвер.

/src/main/java/pages - директория где сгруппированы Page-объекты, внутри PageObjects хранятся локаторы (которые помечены аннотацией @FindBy)

/src/main/resources - директория где хранятся файлы:
creds.properties - настройки пользователя(логин, пароль и т.д)
locators.properties - UI map, файл хранения локаторов

/src/test/java - директория, где хранятся все тесты.

