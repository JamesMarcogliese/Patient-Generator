# Patient-Generator

Supports the creation of randomized patient records using FHIR.
Inspired by the [Mohawk College MEDIC C# Patient Generator.](https://github.com/MohawkMEDIC/patient-generator)

Project consists of:
1. JavaEE Web Service
1. Java Web Client for demonstrating the Web Service.

Web Service allows creation of multiple patient records generated from a random data set, as well as from provided 
patient demographic options. Web Service endpoint can be accessed via `http://localhost:8080/patientgenerator-0.1/generationService?wsdl`.

If a local application needs to be created to access the patient-generation webservice, generated class files from the 
WSDL can be found in `src/main/java/client/classes`.

Records can be returned to the caller via SOAP, or to an alternate http endpoint that can be specified in 
the `config.properties` file. Then `useEndpoint` flag when calling the generator should be set to `true` when an http 
endpoint is preferred. All records are returned in XML format in FHIR DSTU2 specification. 

Javadoc documentation can be found in the `docs` folder.

How to start the Patient-Generator application
---

1. Run `mvn clean install` to build your application
1. Copy warfile from `target` folder to servlet container. (i.e. Tomcat)
1. To check that your application is running enter url `http://localhost:8080`

<p align="center">
 <img src="https://user-images.githubusercontent.com/8539492/31871701-4fdb398a-b784-11e7-9a03-c3c3a627440a.PNG"/>
 <img src="https://user-images.githubusercontent.com/8539492/31871702-52e49356-b784-11e7-9a0b-1aecd6902dba.PNG"/>
</p>
