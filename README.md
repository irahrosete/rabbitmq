## RabbitMQ
A simple publisher-subscriber example using Spring Boot and RabbitMQ.

Tutorial from [Spring Boot RabbitMQ by Java Techie](https://www.youtube.com/watch?v=o4qCdBR4gUM).

#### Dependencies
- Java 17
- Gradle
- IntelliJ IDE
- Docker
- RabbitMQ
- Postman

#### How to run locally

1. clone this repo
   `git clone git@github.com:irahrosete/rabbitmq.git`
2. navigate into the rabbitmq directory
   `cd rabbitmq`
3. open the app in IntelliJ
   `idea .`
4. navigate to resources and run docker-compose file to start rabbitmq
   `cd src/main/resources`
   `docker compose up -d`
5. open rabbitmq dashboard from the browser http://localhost:15672
6. log in using default username and password: guest
7. run the app in IntelliJ
8. open postman, import the rabbitmq collection from resources directory, run publish and watch the message published and consumed!

Other Resources:
- [RabbitMQ with Spring Boot](https://www.youtube.com/watch?v=lFqTdjaN_hM) by Infybuzz
- [RabbitMQ Tutorial](https://www.youtube.com/watch?v=nFxjaVmFj5E&t=45s) by Amigoscode
- [Implementing RabbitMQ in Spring Boot](https://www.youtube.com/watch?v=5kxLeR_YuIk) by Daily Code Buffer
