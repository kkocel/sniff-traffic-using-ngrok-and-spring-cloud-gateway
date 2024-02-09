# Sniff traffic without certificate manipulation

Let's say that you want to sniff the third-party SDK that you use. 
You can configure it - e.g. by setting it's base URL.
This repository shows you how to achieve this goal without certificate manipulation.

1. Start `ngrok`:

```shell
ngrok http 8090
```

2. Copy the URL from `ngrok` and set it as the base URL for your SDK.
3. Start Spring Cloud Gateway:

```shell
./gradlew :bootRun
```

4. Inspect incoming requests in the `ngrok` dashboard - http://127.0.0.1:4040/

The route of the request from SDK to the target server:
![Request path](http://www.plantuml.com/plantuml/proxy?cache=no&fmt=svg&src=https://raw.githubusercontent.com/kkocel/sniff-traffic-using-ngrok-and-spring-cloud-gateway/main/docs/sniffing-sequence.puml)
