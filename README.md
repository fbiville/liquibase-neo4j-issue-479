# Reproducer for https://github.com/liquibase/liquibase-neo4j/issues/479

## Start Neo4j

```shell
docker run --rm \
    --env NEO4J_AUTH='neo4j/letmein!' \
    --env NEO4J_ACCEPT_LICENSE_AGREEMENT=yes \
    --publish=7687:7687 --publish=7474:7474 \
    --health-cmd "cypher-shell -u neo4j -p 'letmein!' 'RETURN 1'" \
    --health-interval 5s \
    --health-timeout 5s \
    --health-retries 5 \
    neo4j:5-enterprise
```

## Run

```shell
mvn spring-boot:run
```

