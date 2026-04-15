# Procesador de Pedidos - Refactorización y CI
Proyecto Java refactorizado aplicando buenas prácticas de diseño, control de calidad y CI con GitHub Actions.
## Refactorización

- Renombrado de métodos y variables
- Extract Method (IVA y gastos de envío)
- Extract Constant (IVA, descuentos, umbrales)
  
## Análisis de calidad
Se ha ejecutado SonarQube para analizar el código y detectar code smells y posibles mejoras.

<img width="855" height="284" alt="Captura de pantalla 2026-04-15 195304" src="https://github.com/user-attachments/assets/8fb95ba7-9000-4ff8-b8be-ebbd589b564a" />

## Integración Continua
Se ha configurado GitHub Actions con Maven para ejecutar tests automáticamente en cada push.

<img width="1653" height="759" alt="Captura de pantalla 2026-04-15 204224" src="https://github.com/user-attachments/assets/abbbdcec-dc90-4557-a513-eb8ece861e79" />

<img width="1338" height="672" alt="Captura de pantalla 2026-04-15 204147" src="https://github.com/user-attachments/assets/47987974-c7df-4bdc-981e-ef1d9c6b85a3" />
