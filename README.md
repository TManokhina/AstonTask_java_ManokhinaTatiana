**AstonTask_java_ManokhinaTatiana** - содержит решения для задания 2 на стажировку QA Engineer Java от Aston

**Описание.**

Проект написан на Java 11 и включает три отдельных класса для выполнения подзадач.

1. NumberOperations.java:

Программа принимает два целых числа от пользователя, сравнивает их (выводит "a > b", "a < b" или "a = b"),
и выполняет операции сложения, вычитания, умножения и деления с выводом результатов в консоль.

2. StringComparison.java:

Программа принимает две строки от пользователя и сравнивает их, выводя "Строки идентичны" или "Строки неидентичны".

3. EvenNumbers.java:

Программа выводит все чётные числа из заданного массива [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].


**Установка**

1. Клонируйте репозиторий: git clone https://github.com/AstonTask_java_ManokhinaTatiana.git
2. Откройте проект в IntelliJ IDEA (если используете IDE).
3. Убедитесь, что JDK 11 настроена в проекте.


**Как запустить**

* **Через IntelliJ IDEA**

1. Откройте файл класса (например, NumberOperations.java).
2. Правой кнопкой мыши на классе > Run 'NumberOperations.main()'.
3. В консоли IDEA следуйте подсказкам (введите числа/строки).

* **Через командную строку (без Maven)**

1. Перейдите в папку src/main/java
2. Скомпилируйте: javac NumberOperations.java
(аналогично для StringComparison.java и EvenNumbers.java).
3. Запустите: java NumberOperations
4. (Введите данные в консоль).

* **Через Maven**

1. В корне проекта: mvn clean compile.
2. Запустите:mvn exec:java -Dexec.mainClass=manokhina.java.task.NumberOperations