# First steps in JEE
## What is JEE
JEE, or Java Platform, Enterprise Edition, is a set of specifications, extending Java SE (Standard Edition) with specifications for enterprise features such as distributed computing and web services. JEE applications are typically layered applications, including a client-side user interface, business logic, and data storage and retrieval functionality.

With JEE, developers can create large-scale, multi-tiered, scalable, reliable, and secure network applications. It is designed to support the development of web services and enterprise applications.

The JEE platform provides various APIs and runtime environments for scripting and running enterprise software, including network and web services, and other large-scale, multi-tiered, scalable, and secure network applications. Here are some key components and APIs included in JEE:

Enterprise JavaBeans (EJB): Server-side components that encapsulate business logic.
* Java Servlets and JavaServer Pages (JSP): For creating web applications.
* Java Messaging Service (JMS): For creating and consuming system or business events.
* Java Persistence API (JPA): For database access and object-relational mapping.
* Java Transaction API (JTA): For managing transactions across multiple resource systems.
* JavaServer Faces (JSF): A framework for building user interfaces for web applications.
* Java API for RESTful Web Services (JAX-RS): For creating RESTful web services.
* Java API for XML Web Services (JAX-WS): For creating SOAP web services.
* Java EE Security API: For securing enterprise applications.
* Over time, JEE has evolved and has been rebranded as Jakarta EE under the Eclipse Foundation's stewardship. This transition marks a continuation and modernization of the platform, which is now developed in an open and collaborative environment.

## JAVA EE vs SPRING  ? 
### What is Spring ? 
Spring is an open-source application framework for the Java platform that provides comprehensive infrastructure support for developing robust Java applications very easily and rapidly. It came to prominence for its dependency injection feature, which promotes loose coupling and modularity in application components. Over time, Spring has grown to encompass a wide range of features and projects, addressing various aspects of enterprise application development such as security, data access, messaging, and more. The framework's core philosophy is to provide choices to developers while staying non-invasive, allowing for the building of applications from "plain old Java objects" (POJOs) and to apply enterprise services non-invasively to POJOs. This approach has made Spring one of the most favored frameworks for Java development, particularly suitable for enterprise-level applications due to its simplicity, testability, and loose coupling.
### what is Spring BOOT 
Spring Boot is an extension of the Spring framework that simplifies the initial setup and development of new Spring applications. It aims to minimize the amount of configuration and setup needed to get a Spring application up and running. By providing a set of starter POMs (Project Object Models for Maven), it allows developers to add dependencies and start building applications with minimal hassle.

*Spring Boot's main features include:*

Auto-configuration: It automatically configures your application based on the added dependencies, assuming you need a fully working setup with minimal need for further configuration.
Standalone: Spring Boot applications are self-contained and can include an embedded web server (like Tomcat, Jetty, or Undertow), which means you can run a Spring Boot application on any Java environment; no need to deploy it on a web server.
Opinionated: It comes with an 'opinionated' setup to get you started quickly without much customization and decision-making on basic configurations.
Production-ready: It provides features like health checks, metrics, and externalized configuration that are essential for running applications in production environments.
Spring Boot has become very popular for microservices development due to these features, allowing for quick, easy, and reliable application development and deployment.
### JEE vs Spring 
Spring and Spring Boot were indeed among the most popular frameworks for enterprise Java application development. The trend of enterprises favoring Spring and Spring Boot over traditional Java EE (now Jakarta EE) was due to several reasons:

1. Simplicity and Productivity: Spring Boot, in particular, provides a lot of "starters" which are ready-made configurations for various development scenarios. This makes it very easy and fast to set up and develop new applications, increasing developer productivity.

2. Microservices Architecture: Spring Boot is designed to support microservices architecture out of the box. Microservices have become a preferred architectural style for building scalable and flexible enterprise applications.

3. Community and Support: Spring has a very strong community and commercial support through Pivotal (now part of VMware), which helps in providing comprehensive documentation, community support, and enterprise services.

4. Integration and Flexibility: Spring integrates well with other technologies, both old and new. It's not tied to any single deployment environment and offers flexibility in terms of database, messaging, and transaction APIs.

5. Innovative and Continuously Evolving: Spring has been at the forefront of embracing and integrating new Java features. It often leads with innovations that later become standard practice in the industry.

6. Comprehensive Ecosystem: The Spring ecosystem includes not only the core framework but also Spring Security, Spring Data, Spring Cloud for building cloud-native applications, and many other projects that address various enterprise needs.

7. Non-Invasive Programming Model: Unlike some Java EE components that enforce certain design patterns or programming models, Spring is non-invasive, and developers are not forced to inherit from specific classes or implement specific interfaces.

8. Dependency Injection and Aspect-Oriented Programming: Spring Framework popularized these concepts in Java, leading to cleaner, more modular, and more testable code.

## THE MVC model 
MVC Model in General
The MVC pattern is a way to organize code in an application to separate the representation of information from the user's interaction with it. The pattern is structured into three main components:

Model: This is the central component of the pattern. It directly manages the data, logic, and rules of the application. The Model can respond to instructions from the Controller to change its state (e.g., updating a database), and it can notify the View of changes so it can update its display.

View: The View renders presentation of the Model in a particular format. It observes the Model and gets updated whenever the Model changes, allowing the user to see the current state of the application represented.

Controller: The Controller acts as an interface between Model and View. It listens to the user input from the View and processes the input (with possible validations), manipulating the data model accordingly. The Controller also selects the View to present the data.

## JEE MVC Model
The Java EE (Jakarta EE) MVC model follows the same principles but is tailored to Java EE technologies:

Model: In Java EE, the Model can be composed of several components like EJBs (Enterprise JavaBeans), JPA (Java Persistence API) entities, or POJOs (Plain Old Java Objects) that represent the application's dynamic data structure.

View: Java EE Views might be implemented using technologies like JSF (JavaServer Faces), JSP (JavaServer Pages), or Facelets. These Views render the user interface, which can range from HTML pages to XML documents or JSON structures sent to the client.

Controller: In the Java EE world, the Controller is usually a servlet. It receives HTTP requests from the client, invokes the business logic, updates the Model if necessary, and decides which View should be rendered based on the current data in the Model.

Using MVC in Java EE promotes clean separation of concerns, which makes the application more maintainable and allows for better division of labor among different roles in a development team.

## JEE components :

The Java Enterprise Edition (JEE), now known as Jakarta EE, is a set of specifications and APIs for building enterprise-level, scalable, and robust Java applications. It provides a framework for developing web and enterprise applications. In JEE, there are several essential components, with Servlets and JSP being among the most important ones:

1. Servlets:
*Role*: Servlets are Java classes that handle HTTP requests and generate HTTP responses. They act as the backbone of a web application and provide a way to process and respond to client requests, making them the foundation of dynamic web applications.
*Functionality*: Servlets are responsible for tasks such as data processing, form handling, database interaction, and session management. They can handle various HTTP methods like GET, POST, PUT, and DELETE and can generate HTML content dynamically.

2. JavaServer Pages (JSP):

*Role*: JSP is a technology used for creating dynamic web pages by embedding Java code within HTML templates. JSP simplifies the development of web applications by allowing developers to mix HTML markup with Java code, making it easier to generate dynamic content.
*Functionality*: JSP pages are compiled into servlets by the container at runtime. They can access Java objects, interact with databases, and perform business logic. JSP is typically used to generate the user interface and presentation layer of a web application.

3. Enterprise JavaBeans (EJB):

*Role*: EJB is a server-side component model that simplifies the development of business logic in enterprise applications. EJBs are used to encapsulate the core business logic of an application and provide services like transaction management, security, and scalability.
*Functionality*: There are three types of EJBs: Session Beans (for business logic), Entity Beans (for data persistence), and Message-Driven Beans (for handling asynchronous messages). EJBs are managed by the application server and provide a standardized way to handle complex, distributed enterprise applications.

4. Java Naming and Directory Interface (JNDI):

*Role*: JNDI is an API that provides a naming and directory service for Java applications. It is used to look up and manage resources, such as database connections, messaging queues, and EJB components.
*Functionality*: JNDI allows applications to access these resources in a consistent and portable manner. It is crucial for obtaining references to objects and services provided by the JEE application server.

5. Java Message Service (JMS):

*Role*: JMS is a messaging API that allows applications to send and receive messages asynchronously. It is used for building robust, loosely coupled, and scalable distributed systems.

*Functionality*: JMS enables applications to communicate through message queues or topics. It is commonly used for implementing messaging patterns like publish-subscribe and point-to-point messaging in enterprise applications.
These components work together to build enterprise-level applications in the Java ecosystem. Servlets and JSP handle the presentation and user interaction, while EJBs, JNDI, and JMS provide the necessary infrastructure for business logic, resource management, and messaging. Combined, these components enable the development of scalable and robust Java enterprise applications.

## how JEE deales with databases :
Java Enterprise Edition (JEE), now known as Jakarta EE, provides various mechanisms for dealing with databases and managing data persistence in enterprise applications. These mechanisms include:

1. Java Persistence API (JPA):

JPA is a standardized Java API for object-relational mapping (ORM). It allows developers to map Java objects to database tables and perform database operations using Java classes and annotations. JPA abstracts away the underlying SQL and provides a more object-oriented approach to database interaction.
JPA entities represent database tables, and developers can use annotations to define the mapping between entity fields and database columns. JPA provides methods for querying, inserting, updating, and deleting records in the database.

2. Java Database Connectivity (JDBC):

 JDBC is a lower-level API that allows Java applications to interact with relational databases directly. While it doesn't provide the same level of abstraction as JPA, it offers more control over database operations.
Developers can use JDBC to establish database connections, execute SQL queries, and manage transactions. It provides a means to work with raw SQL statements and result sets.

3. Connection Pooling:

JEE provides built-in support for connection pooling, which is crucial for improving database performance and resource management. Connection pooling involves creating a pool of database connections that can be reused by multiple clients, reducing the overhead of creating and closing connections for each database operation.
Application servers like Apache Tomcat, WildFly, and GlassFish often come with built-in connection pool management, allowing developers to configure and manage connection pools through server-specific configurations.

4. DataSource and JNDI:

JEE applications typically use a DataSource to obtain database connections. The DataSource is configured in the application server and registered with the Java Naming and Directory Interface (JNDI). Applications can then look up the DataSource through JNDI to access database connections.
This indirection through JNDI and DataSource allows for easier management of database connections and provides a level of abstraction from the specific database vendor or connection details.

5. Container-Managed Persistence (CMP):

In older versions of JEE, there was a concept called Container-Managed Persistence (CMP), where the application server was responsible for managing the persistence of EJB entity beans. However, CMP has become less common with the widespread adoption of JPA, which offers more flexibility and control to developers.

6. Transaction Management:

JEE provides a robust and standardized approach to transaction management. Developers can use annotations or XML configuration to define transaction boundaries for their code. The application server ensures that transactions are properly managed, with support for both local and distributed transactions when dealing with multiple resources like databases and messaging systems.
In summary, JEE provides multiple ways to deal with databases and manage data persistence, with JPA being the most commonly used approach for mapping Java objects to relational databases. Connection pooling, DataSource, and transaction management are important aspects of handling databases in JEE applications, making it easier to build scalable and reliable enterprise systems.