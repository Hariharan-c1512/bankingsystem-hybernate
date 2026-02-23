This project is a Java console-based Bank Management System implemented using Hibernate ORM (Object-Relational Mapping) instead of direct JDBC, while still not applying full Object-Oriented Programming (OOP) design patterns such as service layers, DAO patterns, inheritance structures, or enterprise architecture.

The purpose of this project is to demonstrate how core banking operations can be performed using procedural Java logic combined with Hibernate-based database interaction, rather than raw SQL queries through JDBC.

The application communicates directly with a relational database (Oracle) using Hibernate session management and HQL/native queries to perform operations such as:

Account creation

Balance enquiry

Deposit

Withdrawal

Fund transfer

Transaction history

Balance updates

This project focuses on:

Hibernate configuration (hibernate.cfg.xml)

SessionFactory and Session handling

Transaction management

Entity mapping (minimal usage)

Direct database operations using Hibernate APIs
<img width="1059" height="348" alt="image" src="https://github.com/user-attachments/assets/ef9243ee-1cb0-4234-bac3-645a6c62efd7" />


Rather than enterprise-level architecture, the system emphasizes:
Hibernate integration + procedural Java flow + direct database operations, making it suitable for learning ORM-based database connectivity without complex frameworks or layered architecture.
