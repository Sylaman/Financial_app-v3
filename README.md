# Задача 1/2 

Замените список expenses в классе ExpensesManager на хеш-таблицу expensesByCategories. Ключами в ней станут названия категорий, а значениями — списки трат. После этого нужно поменять логику работы методов:
1. Сделайте так, чтобы при добавлении траты теперь учитывалась её категория. В метод saveExpense добавьте параметр category. Наличие категории нужно проверить. Если она есть, в её список должна добавляться новая трата. В противном случае нужно создать новый список трат и добавить его вместе с названием категории в таблицу.
2. Для прохода по содержимому хеш-таблиц в цикле используют два вложенных цикла. В первом вы должны выполнить проход по ключам .keySet(). Во втором цикле вам потребуется получить значение по конкретному ключу, что содержится в переменной первого цикла.
3. Замените имя метода printAllExpenses() на printAllExpensesByCategories(). Исправьте его функционал. Он должен печатать категории и расходы в них. Пример того, как это может выглядеть:
```java 
Дом
200.30
122.65
302.87
33.97
Здоровье
700.40
Еда
1300.56
800.00
```
4. Имя метода findMaxExpense() замените на findMaxExpenseInCategory(). Этот метод должен принимать в качестве аргумента название категории. Если категория есть в таблице, то метод должен найти в её списке максимальную трату. Если нет — то сообщить об этом пользователю.
5. Исправьте код в методе removeAllExpenses().

После рефакторинга ExpensesManager поменяйте вызов методов в основном классе. Мы уже внесли нужные изменения в меню и добавили печать вопросов. Задание непростое, но у вас всё получится!

# Задача 2/2

асширьте функциональность финансового приложения. Добавьте в класс ExpensesManager новые методы:    
- Метод getExpensesSum() должен возвращать сумму всех трат в таблице. Используйте для этого вложенные циклы.    
- Метод removeCategory() должен удалять категорию по запросу пользователя. 
- Метод getMaxCategoryName() должен возвращать название категории, в которой самый большой размер сохранённых трат. Для этого вам также понадобятся два цикла: внешний для того, чтобы проходить по всем ключам в таблице, а внутренний для подсчёта суммарного количества трат в категории. Для сохранения промежуточных значений сумм трат по категориям и их названий используйте переменные maxCategorySum и maxCategoryName. В конце в них будет сохранён результат. 

Допишите код в классе Practicum. Вызовите в нём новые методы.
