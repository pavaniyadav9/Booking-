# Online Hall Booking - Java + JDBC

Complete learning-project structure for an online function-hall booking application using Java Servlets, JSP, JDBC and MySQL.

Features: registration, login/logout, hall listing/search, booking, date availability, duplicate-booking protection, booking history, cancellation, and DAO/MVC structure.

Setup: run database/schema.sql; edit DBConnection.java credentials; run `mvn clean package`; deploy target/online-hall-booking.war to Tomcat 10.1+.

For admin: after registering a user, run `UPDATE users SET role='ADMIN' WHERE email='your@email.com';` in MySQL. Extend with an admin controller/JSP as needed.
