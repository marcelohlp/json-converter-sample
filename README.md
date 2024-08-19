# Json Converter Sample (Java)

&nbsp;

## Descrição / Description

Este é um projeto simples que demonstra como converter documentos .json em objetos Java e vice-versa. O projeto é enxuto e inclui apenas as classes necessárias para criar e demonstrar a funcionalidade.

&nbsp;

This is a simple project that demonstrates how to convert .json documents to Java objects and vice versa. The project is streamlined and includes only the necessary classes to create and demonstrate the functionality.

&nbsp;

## Objetivo / Objective

Com a crescente utilização de bancos de dados NoSQL como MongoDB, é cada vez mais importante saber trabalhar com documentos JSON no ambiente de programação.

&nbsp;

With the increasing use of NoSQL databases like MongoDB, it is increasingly important to work with JSON documents in the programming environment.

&nbsp;

## Como funciona / How it works

A classe `JsonConverter` possui dois métodos principais:
- `toJson(Object object)`: Recebe um objeto qualquer e retorna uma String no formato JSON.
- `toObject(String json, Class<T> objectClass)`: Recebe uma String contendo JSON e o tipo de objeto desejado, retornando o objeto correspondente.

Para testes, foi criada uma classe simples `Person`. Foram realizados testes para garantir que o código funcione corretamente.

&nbsp;

The `JsonConverter` class has two main methods:
- `toJson(Object object)`: Takes any object and returns a String in JSON format.
- `toObject(String json, Class<T> objectClass)`: Takes a String containing JSON and the desired object type, returning the corresponding object.

For testing purposes, a simple `Person` class was created. Tests were conducted to ensure that the code works correctly.

&nbsp;

## Tecnologias / Technologies

- Java 21
- IntelliJ IDEA
- Maven

&nbsp;

## Bibliotecas utilizadas / Libraries Used

- Jackson Databind 2.17.2 - [Maven Repository](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind) - [Licença](https://www.apache.org/licenses/LICENSE-2.0.txt)
- JUnit Jupiter API 5.11.0 - [Maven Repository](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.11.0) - [Licença](https://www.eclipse.org/legal/epl-v20.html)

&nbsp;

## Screenshots
![screenshot](https://github.com/user-attachments/assets/6d8b08d6-1ad5-43f6-a8d1-87c3225d4eb7)
![screenshot](https://github.com/user-attachments/assets/76ac0e88-821a-41da-be53-611052fc0c1d)
![screenshot](https://github.com/user-attachments/assets/11ea66a8-1a53-479e-a95f-ebef2f2324b7)
