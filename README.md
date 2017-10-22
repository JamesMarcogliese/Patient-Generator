# Patient-Generator

Supports the creation of randomized patient records using FHIR.
Inspired by the[Mohawk College MEDIC C# Patient Generator.](https://github.com/MohawkMEDIC/patient-generator)

Project consists of:
1. JavaEE Web Service
1. Java Web Client for demonstrating the Web Service.

Web Service allows creation of multiple patient records generated from a random data set, as well as from provided 
patient demographic options. 

Records can be returned via SOAP to a web or standalone application, or to an http endpoint that can be specified in 
the `config.properties` file. Then `useEndpoint` flag when calling the generator should be set to `true` when an http 
endpoint is preferred. All records are returned in XML format in FHIR DSTU2 specification. 

If a local application needs to be created to access the patient-generation webservice, generated class files from the 
WSDL can be found in `src/main/java/client/classes`.

Source file documentation can be found in the `docs` folder.

How to start the Patient-Generator application
---

1. Run `mvn clean install` to build your application
1. Copy warfile from `target` folder to servlet container. (i.e. Tomcat)
1. To check that your application is running enter url `http://localhost:8080`


