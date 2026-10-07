# Resumen Lab 1 — SAST con Semgrep

## 1. Alcance y Ejecución
- **Ruta analizada:** `src/main/java`
- **Regla aplicada:** `p/java`
- **Total de hallazgos iniciales:** 3 hallazgos bloqueantes.

## 2. Corrección Aplicada
- **Acción:** Se parametrizó la consulta utilizando el marcador de posición ? en JdbcTemplate, delegando el escape de caracteres al motor de la base de datos.
Se reestructuró la respuesta del controlador para retornar texto plano (MediaType.TEXT_PLAIN_VALUE) / respuesta DTO limpia, neutralizando cualquier ejecución de scripts en el navegador del cliente.
- **Validación de Tests:** Ejecución de `mvn test` exitosa sin interrupción del comportamiento esperado.
- **Resultado Posterior:** En `semgrep-after.json` se evidenció la disminución de hallazgos en el análisis estático.