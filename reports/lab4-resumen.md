# Resumen Lab 4 — SBOM Maven con CycloneDX y SCA con Trivy

## 1. Alcance y Especificación del SBOM
- **Plugin utilizado:** `cyclonedx-maven-plugin:2.9.3`
-  CycloneDX v1.6 JSON (`target/bom.json`)
- **Escaneo SCA:** Trivy CLI v0.74.0 (`sbom`)

## 2. Vulnerabilidad Analizada (SCA)
-  `org.apache.commons:commons-text` (Versión 1.9)
-  CVE-2022-42889 (Text4Shell)
-  CRITICAL (CVSS 9.8)
-  Ejecución remota de código (RCE) mediante interpolación de cadenas inseguras.

## 3. Solución
-  Actualización de la versión de la dependencia en el `pom.xml` de `1.9` a `1.10.0`.