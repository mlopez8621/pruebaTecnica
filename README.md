# Servicio REST de Clientes

Este proyecto es un servicio REST para la gestión de información básica de clientes, diseñado con Spring Framework y Maven. Permite consultar la información de clientes basado en el tipo y número de documento.

## Comenzando

Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas.

### Prerrequisitos

Necesitas tener instalado Java JDK 1.8 y Maven. 

### Instalación

1. Clona el repositorio a tu máquina local:

git clone [https://github.com/mlopez8621/pruebaTecnica.git](https://github.com/mlopez8621/pruebaTecnica.git)

2. Navega al directorio del proyecto:

cd pruebaTecnica

3. Construye el proyecto con Maven:

mvn clean package
mvn tomcat7:deploy

4. Ejecuta la aplicación:

El proyecto no utiliza Spring Boot, se necesita desplegar el `.war` generado en un servidor Tomcat. Consulta la sección de despliegue para más detalles.

## Uso

Para consultar la información de un cliente, realiza una petición GET a `/api/cliente` con los parámetros `tipo` y `numero`:

GET /api/cliente?tipo=C&numero=23445322



## Pruebas

Para ejecutar las pruebas unitarias del proyecto:

mvn test



## Despliegue

Para desplegar este proyecto en un servidor Tomcat, sigue estos pasos:

1. Copia el archivo `.war` generado en el directorio `target` al directorio `webapps` de tu servidor Tomcat.

2. Inicia el servidor Tomcat.

3. Accede a la aplicación a través de `http://localhost:8090/pruebaTecnica`.

## Construido con

- [Spring Framework](https://spring.io/projects/spring-framework) - El framework utilizado.
- [Maven](https://maven.apache.org/) - Manejador de dependencias.

## Autores

- **Michel Leonardo López Avendaño** - [mlopez8621](https://github.com/mlopez8621)

## Agradecimientos

- Agradecimiento a toda mi familia por su apoyo.
