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
    `git clone`
2. navigate into the rabbitmq directory
    `cd rabbitmq`
3. run docker-compose file to start rabbitmq
    `docker compose up -d`
4. open rabbitmq dashboard from the browser http://localhost:15672
5. log in using default username and password: guest
6. open and run the app in IntelliJ
    `idea .`
7. open postman, import the rabbitmq collection from this repo, run publish and watch the message published and consumed!
