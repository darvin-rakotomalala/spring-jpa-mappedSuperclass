## Spring Data JPA | MappedSuperclass

Dans ce repo, nous allons voir un exemple Spring Data JPA inheritance MappedSuperclass.

### MappedSuperclass

En utilisant `@MappedSuperclass`, vous créez une super classe non-entité et vous pouvez créer des sous-classes d'entité
qui héritent de cette super classe. Avec cette annotation, une table distincte pour chaque sous-classe est créée.
Cependant, une table n'est pas créée pour la super classe elle-même.

### Technologies
---

- Java 17
- Spring Boot 3
- Spring Data JPA
- Lombok
- MapStruct
- Maven 3+
- PostgreSQL