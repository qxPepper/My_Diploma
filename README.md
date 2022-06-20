# My_Diploma
Добрый день!
1. После загрузки проекта делаем сборку: docker-compose build, затем запускаем: docker-compose up. При этом создаётся схема my_database,
а внутри неё создаются две таблицы my_users и blobs, структуры которых соответствуют сущностям в классах MyUser.java и DBFile.java.
Таблица my_users заполняется тестовыми данными пользователей:
    - login: user, password: password, first_name: Katya, last_name: Ivanova, role: USER;
    - login: admin, password: password, first_name: Vasiliy, last_name: Pupkin, role: ADMIN.

2. В браузере вводим http://localhost:8081/, попадаем на страницу, имитирующую облако. Доступ только у выше заданных пользователей,
при вводе login и password. После входа мы можем: видеть первые три файла, добавлять файлы, изменять названия файлов, скачивать файлы и удалять файлы.
