# Madrona.io A Kotlin Frontend Web Application

Thinkter is an example of a full-stack Web application built with Kotlin. The backend runs on the JVM, and the browser
front-end uses React. The example implements a very simple microblogging application.

## Frontend

The frontend of is built using [React](https://facebook.github.io/react/). To adapt the React APIs to Kotlin,
it incorporates a set of Kotlin wrappers.

The project is built using webpack and the [Kotlin frontend plugin](https://github.com/kotlin/kotlin-frontend-plugin). 

To run the frontend, use `./gradlew -t frontend:run`. This will start a [webpack server on port 8080](http://localhost:8080).
