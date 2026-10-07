# Resumen Lab 3 — Escaneo de Imágenes con Trivy

## 1. Alcance del Análisis
-  Trivy CLI v0.74.0 (Aquasecurity)
-  `nginx:1.24.0` vs. `nginx:stable`
-  Vulnerabilidades en paquetes del sistema operativo e imágenes de contenedor.

## 2. Evaluación del Quality Gate
- **Regla:** `--severity HIGH,CRITICAL --exit-code 1`
- **Resultado:** Interrupción inmediata del pipeline/escaneo al encontrar vulnerabilidades críticas en la imagen base. Guardada en `trivy-gate.txt`.

- **Imagen Actualizada:** `nginx:stable`
- **Resultado:** Se redujo vulnerabilidades críticas luego de actualizar la versión de la imagen base en el contenedor.