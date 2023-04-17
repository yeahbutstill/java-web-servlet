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
http://localhost:8080/belajar/hello
```