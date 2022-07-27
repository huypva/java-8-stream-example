The hello-world project

<div align="center">
    <img src="./assets/images/stream.png"/>
</div>


## Project structure
```
.
├── stream
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

- Build project  
```shell
$ ./mvnw clean package
[INFO] 
[INFO] Stream ............................................. SUCCESS [  5.907 s]
[INFO] Parent ............................................. SUCCESS [  0.017 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.077 s
[INFO] Finished at: 2022-07-27T09:26:36+07:00
[INFO] ------------------------------------------------------------------------
```


```shell
$ mvn clean package
$ java -jar -stream/target/stream-0.0.1-SNAPSHOT.jar
```

## Reference

- https://topdev.vn/blog/tuot-tuon-tuot-ve-java-8-nhung-thay-doi-lon/
- https://topdev.vn/blog/nhung-ma-xau-ma-java-8-co-the-khu/
- https://gpcoder.com/3923-gioi-thieu-ve-stream-api-trong-java-8/
- https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
- https://www.baeldung.com/java-8-streams