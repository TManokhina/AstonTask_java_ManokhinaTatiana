**AstonTask_java_ManokhinaTatiana** - содержит решения для задания 2 на стажировку QA Engineer Java от Aston

**Описание.**

Проект написан на Java 11 и включает три отдельных класса для выполнения подзадач.

1. NumberOperations.java:

Программа принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.


2. StringComparison.java:

Программа принимает на вход две строки (a и b) и сравнивает их. В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"

3. EvenNumbers.java:

Программа выводит все чётные числа из заданного массива целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10].


**Установка**

1. Клонируйте репозиторий: git clone https://github.com/AstonTask_java_ManokhinaTatiana.git
2. Откройте проект в IntelliJ IDEA (если используете IDE).
3. Убедитесь, что JDK 11 настроена в проекте.


**Как запустить**

* **Через Maven**

1. В корне проекта: mvn clean compile.
2. Запустите:mvn exec:java -Dexec.mainClass=manokhina.java.task.NumberOperations
3. Запустите:mvn exec:java -Dexec.mainClass=manokhina.java.task.EvenNumbers
4. Запустите:mvn exec:java -Dexec.mainClass=manokhina.java.task.StringComparison