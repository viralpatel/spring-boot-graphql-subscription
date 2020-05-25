## Spring Boot GraphQL Subscription API

A reference implementation for Realtime GraphQL Subscription API in Spring Boot using GraphQL Java Tools and GraphQL Spring Boot starter.


> Step by step tutorial at: [Spring Boot GraphQL Subscription Realtime API](https://www.viralpatel.net/spring-boot-graphql-subscription-realtime-api/)
>
### Technologies
1. Java 11
2. Spring Boot 2.3.0
3. Gradle 6.3
4. GraphQL Java

### Build and run
`./gradlew bootRun`

Open http://localhost:8080/graphiql for GraphQL introspection.

GraphQL Request
```graphql
subscription {
  stockPrice(symbol:"GOOG") {
    price
    symbol
    timestamp
  }
}
```

Response
```graphql
{
  "stockPrice": {
    "price": "0.7490690579285905",
    "symbol": "GOOG",
    "timestamp": "2020-05-22T22:16:12.092143"
  }
}
```
