# javaee starter

## Updates
- Configuration with Glassfish JDBC resources (23 Aug 2017)
- Webserices/APIs (23 Aug 2017)

## Requirement
- Java (7 or 8)
- Netbeans IDE (8.0 or higher) with Glassfish
- Database:
    + Local or cloud jdbc-compatiable databases. MySQL is preferred.
    + Get the following parameters prepared: **host**, **port**, **database name**, **user name** and **passowrd**. Make sure all rights are granted for the dabases to the user.
    + Create proper JDBC connection pool in Glassfish server admin console (by default can be accessed by [localhost:4848](http://localhost:4848/)) with the parameter above. Click 'Ping' button on the page to test connectivity.
    + Create proper JDBC resource with the connection pool created in previous step. Conventionally, JDBC resource should name like 'jdbc/XXXX'.

## Deploy
1. Clone the repo to your local and open in Netbeans IDE (prefered):
    ```
    git clone https://github.com/vislx/javaee-starter.git
    ```
    or download the repo as .zip file
2. Under ```javaee-starter/javaee-starter-ejb/src/conf/``` in your file system (or ```javaee-starter-ejb/Configuration Files``` in Netbeans IDE project browser), find ```persistence.xml```. Change 'Data Source' to the JDBC resources created in the previous step.
3. In Netbeans IDE, start Glassfish server. Then in project browser, right click the triangle icon for **javaee-starter** and click 'Deploy'.

## Test
- Access a default web index page by [localhost:8080/javaee-starter-war](http://localhost:8080/javaee-starter-war/)
- Access a default webservice by [localhost:8080/javaee-starter-war/api/hello](http://localhost:8080/javaee-starter-war/api/hello)




