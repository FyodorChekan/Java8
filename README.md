# Java-викторина
Вам необходимо создать программу, которая задает пользователю вопросы, запоминает
полученные ответы и выводит отчет на какие вопросы пользователь ответил верно, а в каких
ошибся. Правильный ответ всегда один.
Для этого создай класс Question который содержит в качестве параметров текс вопроса, список
вариантами ответа и порядковый номер правильного ответа. В main создайте список вопросов и
заполните его приложенными вопросами.
Создайте класс Answer который содержит в качестве параметров Question и номер полученного от
слушателя ответа. Переопределите метод toString в следующей форме:

Вопрос ____________________

Ваш ответ: _________________

Правильный ответ ___________

В ходе работы программа должна спрашивать вопросы, а полученный ответ записывать в список
объектов Answer. После чего вывести итоговый результат, например так “Вы ответили на 3 из 5
вопросов. Вы ошиблись в следующих вопросах:” далее список тех вопросов на которые
пользователь ответ неправильно
