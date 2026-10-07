# Resumen Lab 6 — Policy as Code con Conftest

## 1. Alcance
- **Herramienta:** Open Policy Agent (OPA) / Conftest CLI
- **Archivo Evaluado:** `compose-lab.yaml`
- **Regla:** Bloqueo de la bandera `privileged: true` en servicios de Docker Compose.

## 2. Riesgo
- El servicio `app` tenía activada la bandera `privileged: true`.

## 3. Solución
-  Se modificó la configuración a `privileged: false` en `compose-lab.yaml`.
-  La política fue validada exitosamente en `conftest-after.json` (0 violaciones).