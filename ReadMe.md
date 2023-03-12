

## Steps:
Start the docker Container of RabbitMQ
```sudo docker run --hostname localhost -p5672:5672 -p15672:15672 -p15692:15692 -p5671:5671 -p15691:15691 -p25672:25672 rabbitmq:3.9.29-management-alpine```


Start the Publisher and subscriber

Publish Message via REST API

```curl -XPOST -H "Content-Type:application/json"  http://localhost:8080/publish -d '{
 "name" : "tanmay",
 "employeeId" : "1",
 "timestamp"  : "2017-02-03T10:37:30.00Z",
 "isPresent" : "true"

}'
```




