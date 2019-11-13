FROM mariadb:10.1.22
ENV MYSQL_ROOT_PASSWORD 123
ENV MYSQL_DATABASE registro

ADD datos/bd.sql /docker-entrypoint-initdb.d/bd.sql
