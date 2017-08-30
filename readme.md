# Spring MVC Project

This is a [Spring MVC](https://spring.io) project using [Thymeleaf](http://www.thymeleaf.org/) templates for the views, created with the use of the [Spring MVC with Thymeleaf Maven Archetype](https://github.com/Bernardo-MG/spring-mvc-thymeleaf-maven-archetype). It will ease the development of new Spring MVC projects, setting it up for CI through the use of three free services: [Github](https://github.com/), [Travis](https://travis-ci.org) and [Bintray](https://bintray.com/).

Before beginning with the new project there are a few things which should be edited:

- This readme's description has to be adapted to the new project.
- Project info on the POM should be checked.
- The various links on the readme, POM and Maven site (for repositories, issues, etc) should be verified.
- The documentation on the project's [Maven Site](https://maven.apache.org/plugins/maven-site-plugin/) has to be written.
- The license, if not using the MIT one, should be changed. Remember that this is referenced on the POM, readme and LICENSE files.

Note that the Maven site is using the [Docs Maven Skin](https://github.com/Bernardo-MG/docs-maven-skin), which will have a few configuration requirements of its own.

[![Maven Central](https://img.shields.io/maven-central/v/com.wandrell.example/spring-mvc-thymeleaf-maven-archetype-example.svg)][maven-repo]
[![Bintray](https://api.bintray.com/packages/bernardo-mg/maven/spring-mvc-thymeleaf-maven-archetype-example/images/download.svg)][bintray-repo]

[![Release docs](https://img.shields.io/badge/docs-release-blue.svg)][site-release]
[![Development docs](https://img.shields.io/badge/docs-develop-blue.svg)][site-develop]

[![Release javadocs](https://img.shields.io/badge/javadocs-release-blue.svg)][javadoc-release]
[![Development javadocs](https://img.shields.io/badge/javadocs-develop-blue.svg)][javadoc-develop]

## Features

The project by default comes with a useful series of features:

- Preconfigured POM to begin developing a new [Spring MVC](https://spring.io) project.
- Initial sample project including working persistence and exception handling
- Integration with [Thymeleaf](http://www.thymeleaf.org/) for the view templates.
- Using [Bootstrap](http://getbootstrap.com/) for the UI.
- Using [Liquibase](http://www.liquibase.org/) for database versioning.
- Integration with [Jasper Reports](http://community.jaspersoft.com/) for generating PDFs.
- Prepared for [Travis CI](https://travis-ci.org/), including configuration files and deployment scripts. Check the [Archetype documentation](http://docs.wandrell.com/maven/library-maven-archetype) to find out more.
- Unit and integration tests suites ready to be run with [TestNG](http://testng.org/) just by using the Maven test and verify commands.
- A Maven site, using the [Docs Maven Skin](https://github.com/Bernardo-MG/docs-maven-skin), to contain the documentation, the Javadocs and several reports.
- A bunch of useful files, such as readme, gitignore and gitattributes.

## Documentation

Documentation is always generated for the latest release, kept in the 'master' branch:

- The [latest release documentation page][site-release].
- The [latest release Javadoc site][javadoc-release].

Documentation is also generated from the latest snapshot, taken from the 'develop' branch:

- The [the latest snapshot documentation page][site-develop].
- The [latest snapshot Javadoc site][javadoc-develop].

The documentation site is actually a Maven site, and its sources are included in the project. If required it can be generated by using the following Maven command:

```
$ mvn verify site -P h2,jetty
```

The verify phase is required, otherwise some of the reports won't be generated.

## Usage

The application is coded in Java, using Maven to manage the project.

### Prerequisites

The project has been tested on the following Java versions:
* JDK 8

All other dependencies are handled through Maven, and noted in the included POM file.

### Profiles

Maven profiles are included for setting up the database and an embedded server.

| Profile  | Database              |
|----------|-----------------------|
| h2       | H2 in-memory database |
| mysql    | MySQL database        |
| postgres | PostgreSQL database   |

| Profile  | Server                   |
|----------|--------------------------|
| jetty    | Jetty embedded server    |
| tomcat7  | Tomcat 7 embedded server |

### Installing

The project can be installed by creating the war file and deploying it into a server.

### Running

To run the project locally in an embedded server just use the following Maven command for deploying to Jetty with an H2 in-memory database:

```
$ mvn jetty:run-war -P h2,jetty
```

An embedded Tomcat can be used through this other profile:

```
$ mvn tomcat7:run-war -P h2,tomcat7
```

With this the project will be accessible at [http://localhost:8080/spring-mvc-thymeleaf-maven-archetype-example/].

This path is defined in the server.test.path property inside the pom. Change it to use another path.

### Running the tests

The project requires a database and a server for being able to run the integration tests.

Just like running the project, an embedded server with an in-memory database can be used:

```
$ mvn verify -P h2,jetty
```

## Collaborate

Any kind of help with the project will be well received, and there are two main ways to give such help:

- Reporting errors and asking for extensions through the issues management
- or forking the repository and extending the project

### Issues management

Issues are managed at the GitHub [project issues tracker][issues], where any Github user may report bugs or ask for new features.

### Getting the code

If you wish to fork or modify the code, visit the [GitHub project page][scm], where the latest versions are always kept. Check the 'master' branch for the latest release, and the 'develop' for the current, and stable, development version.

## License

The project has been released under the [MIT License][license].

[bintray-repo]: https://bintray.com/bernardo-mg/maven/spring-mvc-thymeleaf-maven-archetype-example/view
[maven-repo]: http://mvnrepository.com/artifact/com.wandrell.example/spring-mvc-thymeleaf-maven-archetype-example
[issues]: https://github.com/bernardo-mg/spring-mvc-thymeleaf-maven-archetype-example/issues
[javadoc-develop]: http://docs.wandrell.com/development/maven/spring-mvc-thymeleaf-maven-archetype-example/apidocs
[javadoc-release]: http://docs.wandrell.com/maven/spring-mvc-thymeleaf-maven-archetype-example/apidocs
[license]: http://www.opensource.org/licenses/mit-license.php
[scm]: https://github.com/bernardo-mg/spring-mvc-thymeleaf-maven-archetype-example
[site-develop]: http://docs.wandrell.com/development/maven/spring-mvc-thymeleaf-maven-archetype-example
[site-release]: http://docs.wandrell.com/maven/spring-mvc-thymeleaf-maven-archetype-example
