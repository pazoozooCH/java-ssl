SslTester
=========

A simple testing program to test SSL handshaking and certificate validation, e.g.
for self-signed certificates and custom cacerts trustores.

If Java has any issues accessing the provided URL, it will output
the corresponding exception.

Build
-----

Create JAR file with maven: `mvn clean package`

Usage
-----

`java -jar .\java-ssl-1.0.jar https://www.google.com`