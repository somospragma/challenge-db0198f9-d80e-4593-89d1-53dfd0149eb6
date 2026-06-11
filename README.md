# Implementación de un sistema de procesamiento de eventos en tiempo real

El sistema de procesamiento de eventos en tiempo real debe manejar flujos de eventos provenientes de múltiples orígenes, como sensores de IoT, transacciones financieras y solicitudes de usuarios. El sistema debe ser resiliente, escalable y confiable, y debe mantener la consistencia de los datos a pesar de posibles fallos en los orígenes de eventos. Los eventos deben ser procesados en el orden en que se reciben, y el sistema debe ser capaz de manejar una alta tasa de eventos entrantes sin perder datos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Reactiva |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del entorno de procesamiento de eventos

**Objetivo:** Configurar un entorno de procesamiento de eventos capaz de recibir y almacenar eventos de múltiples orígenes.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identificar los orígenes de eventos y sus características (tasa de eventos, latencia aceptable, posibles modos de falla).
- Configurar un sistema de almacenamiento de eventos que garantice la persistencia y la recuperación de eventos en caso de fallo.
- Establecer un mecanismo de control de flujo que evite la saturación del sistema en caso de picos de eventos.

**Entregable:** Entorno de procesamiento de eventos configurado y capaz de recibir y almacenar eventos de múltiples orígenes.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la latencia aceptable para cada origen de eventos y cómo afecta al diseño del sistema.
- Piensa en posibles modos de falla de los orígenes de eventos y cómo el sistema puede manejarlos.

</details>

### Fase 2: Procesamiento de eventos en tiempo real

**Objetivo:** Implementar un sistema de procesamiento de eventos en tiempo real que maneje flujos de eventos provenientes de múltiples orígenes.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Diseñar un sistema de procesamiento de eventos que garantice el orden de procesamiento de los eventos y la consistencia de los datos.
- Implementar operadores de Project Reactor para manejar los flujos de eventos y garantizar la resiliencia y la escalabilidad del sistema.
- Establecer mecanismos de recuperación automática en caso de fallo de los orígenes de eventos o del sistema de procesamiento.

**Entregable:** Sistema de procesamiento de eventos en tiempo real implementado y capaz de manejar flujos de eventos provenientes de múltiples orígenes.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de operadores de Project Reactor para manejar los flujos de eventos y garantizar la resiliencia y la escalabilidad del sistema.
- Piensa en posibles modos de falla del sistema de procesamiento y cómo el sistema puede recuperarse automáticamente.

</details>

### Fase 3: Optimización y escalabilidad del sistema de procesamiento de eventos

**Objetivo:** Optimizar y escalar el sistema de procesamiento de eventos para manejar una alta tasa de eventos entrantes sin perder datos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analizar el rendimiento del sistema de procesamiento de eventos y identificar posibles cuellos de botella.
- Implementar técnicas de optimización y escalabilidad, como la paralelización de tareas y la distribución de carga.
- Establecer mecanismos de monitoreo y alerta para detectar y responder a posibles problemas de rendimiento o capacidad.

**Entregable:** Sistema de procesamiento de eventos optimizado y escalable, capaz de manejar una alta tasa de eventos entrantes sin perder datos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de técnicas de paralelización de tareas y distribución de carga para optimizar y escalar el sistema de procesamiento de eventos.
- Piensa en posibles problemas de rendimiento o capacidad y cómo el sistema puede monitorearlos y responder a ellos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la programación reactiva y cómo se aplica en el contexto de un sistema de procesamiento de eventos en tiempo real?
- **paraQueSirve**: ¿Para qué sirve la programación reactiva en un sistema de procesamiento de eventos en tiempo real y cómo puede ayudar a mejorar su resiliencia, escalabilidad y confiabilidad?
- **comoSeUsa**: ¿Cómo se utilizan los operadores de Project Reactor en un sistema de procesamiento de eventos en tiempo real y qué ventajas ofrecen en términos de manejo de flujos de eventos y garantía de consistencia de datos?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un sistema de procesamiento de eventos en tiempo real y cómo pueden ser evitados o mitigados?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de un sistema de procesamiento de eventos en tiempo real y cómo pueden afectar su rendimiento, capacidad y confiabilidad?

## Criterios de Evaluacion

- Configuración correcta del entorno de procesamiento de eventos.
- Implementación de un sistema de procesamiento de eventos en tiempo real que maneje flujos de eventos provenientes de múltiples orígenes.
- Uso correcto de operadores de Project Reactor para manejar los flujos de eventos y garantizar la resiliencia y la escalabilidad del sistema.
- Establecimiento de mecanismos de recuperación automática en caso de fallo de los orígenes de eventos o del sistema de procesamiento.
- Optimización y escalabilidad del sistema de procesamiento de eventos para manejar una alta tasa de eventos entrantes sin perder datos.
- Implementación de mecanismos de monitoreo y alerta para detectar y responder a posibles problemas de rendimiento o capacidad.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
