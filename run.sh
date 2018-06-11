#!/bin/sh


-Dcom.sun.management.jmxremote
-Dcom.sun.management.jmxremote.port=9595
-Dcom.sun.management.jmxremote.authenticate=false
-Dcom.sun.management.jmxremote.ssl=false
-Djava.rmi.server.hostname=192.168.136.188



-Dcom.sun.management.jmxremote
-Dcom.sun.management.jmxremote.port=2222
-Dcom.sun.management.jmxremote.authenticate=false
-Dcom.sun.management.jmxremote.ssl=false
-Djava.rmi.server.hostname=<external_IP_of_server>


-Dcom.sun.management.jmxremote
-Dcom.sun.management.jmxremote.port=9595
-Dcom.sun.management.jmxremote.authenticate=false
-Dcom.sun.management.jmxremote.ssl=false
-Djava.rmi.server.hostname=192.168.136.188

java -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=9595 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=192.168.136.188 SimpleAgent