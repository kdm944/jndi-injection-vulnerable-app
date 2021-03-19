# jndi-injection-vulnerable-app

Spring boot application for weblogic server which performs Initial Context lookup on user provided data.

```
http://127.0.1.1:7001/jndi-injection/lookup?name=<payload>
```
