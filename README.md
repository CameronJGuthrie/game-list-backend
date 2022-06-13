# Game List Backend

A Spring Boot server that uses Mapstruct, Lombok and Hibernate.  
I used MYSQL 8.0.29, but any SQL database should work too.  

### Setup Instructions
 - Download maven dependencies
 - Setup an SQL server
 - Create an `application.properties` file in the /src/resources folder
 - Populate that `application.properties` file with the Database details (For an example file, see `application.example.properties` in the same directory)
 - Create an empty Schema called some-games
 - Run the project

### Developer After-Thoughts
1. The spring initializer made it easier, but I still found it challenging to set the project up.  

2. Some cryptic errors slowed me down. One error was caused by having mapstruct before lombok in the preprocessers list.  

3. I may have overengineered this, I would like to know if there is a way to achieve this with less.

4. I hardcoded the CORS to http://localhost:3000 , this should be configurable but I'm not certain how to access environment variables inside Spring Boot yet