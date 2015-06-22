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
  listOfServers: {URI for produto-service ex.: http://your_prod_aap.pivotal.io}
pessoa-service:
 ribbon:
  listOfServers: {URI for produto-service ex.: http://your_serv_aap.pivotal.io}
```