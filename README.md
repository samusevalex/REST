Написать REST сервис без HTML страниц. Везде возвращаются чисто данные.  
Создать class User с полями id, имя, фамилия.  
В сервисе сделать 3-и точки входа (типа /visits):  
первая для создания пользователя,  
вторая для удаления,  
третья возвращает список всех созданных пользователей. Должна выводить разные списки, если перед этим пользователь был удален или добавлен.  
В качестве репозитория использовать List<User>, в который складывать новых пользователей.  
Libs - Spring Boot, Spring Web.
