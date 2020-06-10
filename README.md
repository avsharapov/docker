# Docker example

Установка docker

Linux:  [ссылка](https://www.youtube.com/redirect?v=Sa7uOGczoHc&event=video_description&redir_token=N5TLNDdBFyn2g-VeXH3q4gA6M6x8MTU3NjMyNzExOEAxNTc2MjQwNzE4&q=https%3A%2F%2Fdocs.docker.com%2Finstall%2Flinux%2Fdocker-ce%2Fubuntu%2F)

MacOS: [ссылка](https://www.youtube.com/redirect?v=Sa7uOGczoHc&event=video_description&redir_token=N5TLNDdBFyn2g-VeXH3q4gA6M6x8MTU3NjMyNzExOEAxNTc2MjQwNzE4&q=https%3A%2F%2Fdocs.docker.com%2Fdocker-for-mac%2Finstall%2F)

Windows: [ссылка](https://www.youtube.com/redirect?v=Sa7uOGczoHc&event=video_description&redir_token=N5TLNDdBFyn2g-VeXH3q4gA6M6x8MTU3NjMyNzExOEAxNTc2MjQwNzE4&q=https%3A%2F%2Fdocs.docker.com%2Fdocker-for-windows%2Finstall%2F)

---
Запуск докер образа с собранным проектом 

`docker build -t docex -f Dockerfile.ext .`

`docker run -it docex .`

---
Запуск докер образа с исходниками

`docker build -t docin -f Dockerfile.int .`

`docker run -it docin .`

---
Для запуска контейнера с postgresql требуется выполнить комманду:
`docker run -d -p 5434:5432 -e POSTGRES_PASSWORD=qwerty -e POSTGRES_USER=postgres -e POSTGRES_DB=mobile --name pde postgres`
