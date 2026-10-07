# Resumen Lab 5 — Detección de Secretos con Gitleaks

## 1. Alcance y Estrategia
- **Herramienta:** Gitleaks CLI (latest)
-  Escaneo de directorio local (`dir`) y análisis de historial de commits (`git`).
-  Inclusión de regla didáctica `demo-token` mediante `.gitleaks-demo.toml`.

## 2. Riesgo
- **Archivo Afectado:** `secret-demo/demo.env`
- **Riesgo:** Exposición de API Tokens hardcodeados en el código fuente.

## 3. Solución
- Reemplazó el secreto estático por el placeholder `API_TOKEN=REPLACE_AT_RUNTIME`.