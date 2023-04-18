# java-web-servlet
belajar java web servlet

### Run tomcat
```shell
$ chmod +x apache-tomcat-10.1.7/bin/catalina.sh

### deploy
$ ./apache-tomcat-10.1.7/bin/catalina.sh run

### undeploy
hapus folder project dan juga War File nya, 
jangan hanya foldernya saja yang dihapus, 
nanti WAR nya akan di extract lagi sama apache tomcat
```

### Build WAR
```shell
$ mvn package
```

### Access Endpoint
```shell
### tomcat
http://localhost:8080/belajar/hello

### embeded tomcat
http://localhost:8080/hello
http://localhost:8080/unsafe?name=Dani&sleep=3000
http://localhost:8080/unsafe?name=Maya&sleep=30000
http://localhost:8080/counter
http://localhost:8080/safe?name=Dani&sleep=3000
http://localhost:8080/safe?name=Maya&sleep=30000
http://localhost:8080/todolist?todo=Belajar Java web servlet
http://localhost:8080/todolist
```

