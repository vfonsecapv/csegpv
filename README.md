# csegpv
CSEG PROJ PV

POC for Caixa Seguradora

Using Springboot and Springcloud

What you need to install to run it?

Local  |
------------- |
Redis |
Gradle |
Java 8 |
Groovy |

Cloud  |
------------- |
Pivotal Cloud Foundry (http://run.pivotal.io) |
Redis bind service |

To run on Pivotal Cloud Foundry you need to change one file:

go to caixaseguradora-ui>src>main>groovy>resources>application.yml

```
produto-service:
 ribbon:
  listOfServers: {end point for produto-service app with http: // and without / at the end of the URI}
pessoa-service:
 ribbon:
  listOfServers: {end point for pessoa-service app with http: // and without / at the end of the URI}
```