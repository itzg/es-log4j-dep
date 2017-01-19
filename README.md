# ONLY FOR EXAMPLE

## To Verify

Start a local Elasticsearch instance, such as

```
docker run -it --rm -p 9200:9200 -p 9300:9300 itzg/elasticsearch:5.1.2
```

Start the application creating an index `testing`

```
./mvnw spring-boot:run -Drun.arguments=testing
```

