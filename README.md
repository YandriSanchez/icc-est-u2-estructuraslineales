# Práctica de Algoritmos de Ordenamiento

## 📌 Información General

- **Título:** Práctica Pilas y Colas
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Yandri Eduardo Sanchez Yanza
- **Fecha:** 05/06/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠 Descripción

Este proyecto implementa y compara estructuras fundamentales de datos usando *pilas y colas* con clases personalizadas en Java, sin utilizar java.util. Además, se incluyen versiones genéricas y no genéricas de nodos, pilas y colas para trabajar con diferentes tipos de datos.

---

### 📦 Pilas (Stacks, StackGeneric<T>)

Estructura LIFO (Last-In, First-Out), donde el último elemento insertado es el primero en salir.

- Stacks: pila especializada para enteros (int). Métodos principales: push, pop, peek, isEmpty, size.
- StackGeneric<T>: pila genérica que permite almacenar cualquier tipo de objeto (T), ideal para trabajar con caracteres, cadenas, etc.

---

### 🌀 Colas (Queue, QueueGeneric<T>)

Estructura FIFO (First-In, First-Out), donde el primer elemento en entrar es el primero en salir.

- Queue: cola específica para enteros, con métodos como enqueue, dequeue, peek, isEmpty.
- QueueGeneric<T>: versión genérica que permite trabajar con cualquier tipo de dato.

---

### 🧱 Nodos (Node, NodeGeneric<T>)

Clases auxiliares que representan cada unidad en las pilas y colas enlazadas:

- Node: almacena un int y una referencia al siguiente nodo.
- NodeGeneric<T>: nodo adaptable a cualquier tipo de dato (T), facilitando estructuras como pilas o colas genéricas.

---


### 📘 Ejercicio 1: Validación de símbolos balanceados

### Enunciado

Implementar un algoritmo que determine si una cadena que solo contiene los caracteres ()[]{} está correctamente balanceada.  
Ejemplos:
- Entrada: ([]){} → Salida: true
- Entrada: `({)} ` → Salida: false

### Lógica del algoritmo

- Se recorre la cadena.
- Si encontramos un símbolo de *apertura*, lo apilamos.
- Si encontramos un símbolo de *cierre*, verificamos:
  - Si la pila está vacía → no hay apertura → inválido.
  - Si el tope de la pila forma pareja válida con el carácter actual.
- Al final, si la pila quedó vacía → la cadena es válida.

---

### 🧩 Ejercicio 2: Ordenar una Pila (Stack)

### 📌 Enunciado

Implementar un algoritmo que ordene una pila (Stacks) de enteros de manera que los elementos más pequeños queden en el tope. Solo se permite utilizar otra pila adicional como ayuda. No se puede usar ninguna otra estructura de datos como listas o arreglos.

### 🧠 Lógica del algoritmo

- Se va extrayendo cada elemento de la pila original (stack) y se coloca ordenadamente en una pila auxiliar (pilaAuxiliar).
- Si el elemento extraído (temp) es menor que los del tope de la auxiliar, estos se devuelven temporalmente a la original.
- Finalmente, los elementos ordenados se transfieren de nuevo a la pila original.


## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada



---

