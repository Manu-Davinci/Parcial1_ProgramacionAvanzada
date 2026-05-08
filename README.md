# Sistema de Garage - Programación Avanzada 1

## Descripción

Este proyecto consiste en el desarrollo de un sistema de administración de garage realizado en Java utilizando Programación Orientada a Objetos.

El sistema permite gestionar el ingreso y salida de vehículos dentro de un estacionamiento controlando espacios disponibles y calculando el costo de permanencia según el tipo de vehículo.

---

# Funcionalidades

El sistema permite:

- Registrar ingreso de vehículos
- Registrar salida de vehículos
- Controlar disponibilidad de espacios
- Listar vehículos estacionados
- Mostrar estado del garage
- Generar reportes
- Calcular costos automáticamente
- Manejar errores mediante excepciones

---

# Tipos de Vehículos

| Vehículo | Espacios ocupados | Costo por hora |
|----------|------------------|----------------|
| Moto | 1 | $700 |
| Auto | 2 | $1000 |
| Camión | 4 | $1500 |

---

# Tecnologías Utilizadas

- Java
- Programación Orientada a Objetos
- UML
- Git
- GitHub

---

# Conceptos Aplicados

Durante el desarrollo se aplicaron:

- Herencia
- Polimorfismo
- Clases abstractas
- Interfaces
- Encapsulamiento
- Manejo de excepciones
- Colecciones ArrayList
- UML
- Control de versiones con Git

---

# Estructura del Proyecto

```text
ProyectoGarage/

│
├── src/
│   │
│   ├── interfaces/
│   │   ├── Calculable.java
│   │   └── Mostrable.java
│   │
│   ├── vehiculos/
│   │   ├── Vehiculo.java
│   │   ├── Moto.java
│   │   ├── Auto.java
│   │   └── Camion.java
│   │
│   ├── exceptions/
│   │   ├── GarageLlenoException.java
│   │   ├── PatenteDuplicadaException.java
│   │   ├── VehiculoNoEncontradoException.java
│   │   └── HorasInvalidasException.java
│   │
│   ├── garage/
│   │   └── Garage.java
│   │
│   └── Main.java
│
├── docs/
│   └── uml.pdf
│
├── README.md
│
└── decisiones.txt
```

---

# Clase Vehiculo

La clase Vehiculo es abstracta y representa el concepto general de vehículo.

Contiene:

- patente
- marca
- modelo
- horas estimadas

Además define métodos abstractos que son implementados por cada subclase:

- calcularCosto()
- espacioOcupado()
- mostrarDatos()

---

# Subclases

## Moto
- Ocupa 1 espacio
- Cobra $700 por hora

## Auto
- Ocupa 2 espacios
- Cobra $1000 por hora

## Camion
- Ocupa 4 espacios
- Cobra $1500 por hora

---

# Clase Garage

La clase Garage es la encargada de administrar todos los vehículos.

Funciones principales:

- registrarIngreso()
- registrarSalida()
- listarVehiculos()
- mostrarEstado()
- generarReportes()

También controla:

- Espacios disponibles
- Validaciones
- Recaudación
- Búsqueda de vehículos

---

# Interfaces

## Calculable

```java
public interface Calculable {
    double calcularCosto();
}
```

## Mostrable

```java
public interface Mostrable {
    void mostrarDatos();
}
```

---

# Excepciones Personalizadas

El sistema utiliza excepciones personalizadas para manejar errores.

## Excepciones implementadas

- GarageLlenoException
- PatenteDuplicadaException
- VehiculoNoEncontradoException
- HorasInvalidasException

---

# Validaciones

El sistema valida:

- Patentes duplicadas
- Horas menores o iguales a 0
- Espacio insuficiente
- Vehículos inexistentes
- Opciones inválidas
- Datos vacíos

---

# Reportes

El sistema genera reportes mostrando:

- Cantidad total de vehículos
- Cantidad de motos
- Cantidad de autos
- Cantidad de camiones
- Espacio ocupado
- Espacio libre
- Recaudación total estimada

---

# Menú Principal

```text
=== SISTEMA DE GARAGE ===

1. Registrar ingreso
2. Registrar salida
3. Listar vehículos
4. Estado del garage
5. Reportes
6. Salir
```

---

# UML

La documentación UML se encuentra dentro de la carpeta:

```text
/docs
```

Incluye:

- Diagrama de Clases
- Diagrama de Casos de Uso

---

# Ejecución del Proyecto

## Clonar repositorio

```bash
git clone URL_DEL_REPOSITORIO
```

## Abrir proyecto

Abrir en:

- IntelliJ IDEA
- NetBeans
- Eclipse

## Ejecutar

Ejecutar el archivo:

```text
Main.java
```

---

# Git y Control de Versiones

El proyecto fue desarrollado utilizando Git realizando commits progresivos y descriptivos.

Repositorio utilizado:

```text
PEGAR_LINK_DEL_REPOSITORIO
```

---

# Autor

- Nombre y Apellido
- Programación Avanzada 1
- Escuela Da Vinci
- 2026
