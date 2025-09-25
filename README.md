# 💊 MediTime

## 📑 Tabla de Contenido
- [💊 MediTime](#-meditime)
  - [📑 Tabla de Contenido](#-tabla-de-contenido)
  - [🌐 Proyecto Web MediTime](#-proyecto-web-meditime)
    - [📋 Descripción del Proyecto](#-descripción-del-proyecto)
      - [🏗️ Estructura del Proyecto](#️-estructura-del-proyecto)
    - [🚀 Ejecutar el Proyecto](#-ejecutar-el-proyecto)
      - [Paso 1: Abrir la Aplicación](#paso-1-abrir-la-aplicación)
        - [Método 1: Abrir Directamente en Navegador (Más Simple)](#método-1-abrir-directamente-en-navegador-más-simple)
        - [Método 2: Abrir con Navegador Específico](#método-2-abrir-con-navegador-específico)
      - [Paso 2: Navegar por la Aplicación](#paso-2-navegar-por-la-aplicación)
    - [👥 Contribuciones del Equipo](#-contribuciones-del-equipo)
  - [📱 Proyecto Android MediTime](#-proyecto-android-meditime)
    - [📋 Descripción del Proyecto](#-descripción-del-proyecto-1)
      - [🏗️ Estructura del Proyecto](#️-estructura-del-proyecto-1)
    - [🛠️ Requisitos Previos e Instalación](#️-requisitos-previos-e-instalación)
      - [Paso 1: Instalar Java Development Kit (JDK)](#paso-1-instalar-java-development-kit-jdk)
      - [Paso 2: Descargar Android Studio](#paso-2-descargar-android-studio)
      - [Paso 3: Instalar Android Studio](#paso-3-instalar-android-studio)
    - [⚙️ Configuración de Android Studio](#️-configuración-de-android-studio)
      - [Paso 4: Configurar SDK y Herramientas](#paso-4-configurar-sdk-y-herramientas)
        - [Plataformas SDK Requeridas:](#plataformas-sdk-requeridas)
        - [Herramientas SDK Requeridas:](#herramientas-sdk-requeridas)
      - [Paso 5: Configurar Dispositivo Virtual (AVD)](#paso-5-configurar-dispositivo-virtual-avd)
    - [🚀 Ejecutar el Proyecto](#-ejecutar-el-proyecto-1)
      - [Paso 6: Abrir Proyecto en Android Studio](#paso-6-abrir-proyecto-en-android-studio)
      - [Paso 7: Esperar la Sincronización del Proyecto](#paso-7-esperar-la-sincronización-del-proyecto)
      - [Paso 8: Ejecutar la Aplicación](#paso-8-ejecutar-la-aplicación)
        - [Opción A: Usando Emulador (Recomendado)](#opción-a-usando-emulador-recomendado)
        - [Opción B: Usando Dispositivo Físico](#opción-b-usando-dispositivo-físico)
    - [👥 Contribuciones del Equipo](#-contribuciones-del-equipo-1)

---

## 🌐 Proyecto Web MediTime

### 📋 Descripción del Proyecto

**MediTime Web** es una aplicación web de gestión de medicamentos construida con:
- **HTML5**: Marcado semántico moderno
- **CSS3**: Estilizado personalizado con tipografía Inter
- **JavaScript**: jQuery 3.7.1 para manipulación del DOM e interacciones
- **Arquitectura**: Aplicación multi-página (MPA) con CSS y JS modular

#### 🏗️ Estructura del Proyecto
```
Web/
├── 📄 Páginas HTML
│   ├── home.html                    # Dashboard principal/página de inicio
│   ├── mis_medicamentos.html        # Gestión de medicamentos
│   ├── calendario.html              # Vista de calendario
│   ├── detalle_medicamento.html     # Detalles de medicamentos
│   ├── guardar_medicamento.html     # Agregar nuevo medicamento
│   ├── seguimiento_medicamento.html # Seguimiento de medicamentos
│   └── reportes.html               # Reportes y análisis
├── 🎨 Estilos CSS
│   ├── style.css                   # Estilos globales y layout
│   ├── mis_medicamentos.css        # Estilos específicos de página de medicamentos
│   ├── calendario.css              # Estilos de página de calendario
│   ├── detalle_medicamento.css     # Estilos de página de detalles
│   ├── guardar_medicamento.css     # Estilos de formularios
│   ├── seguimiento_medicamento.css # Estilos de seguimiento
│   └── reportes.css               # Estilos de reportes
├── 💻 Archivos JavaScript
│   ├── jquery-3.7.1.min.js        # Librería jQuery
│   ├── utils.js                    # Utilidades comunes y menú
│   ├── home.js                     # Interacciones de página de inicio
│   ├── mis_medicamentos.js         # Lógica de gestión de medicamentos
│   ├── detalle_medicamento.js      # Funcionalidad de página de detalles
│   └── guardar_medicamento.js      # Manejo de formularios
├── 🖼️ Imágenes
│   ├── medicamentos.png            # Iconos principales
│   ├── calendario.png
│   ├── reportes.png
│   ├── menu_icon.png               # Iconos de navegación
│   ├── home_icon.png
│   └── [27 otros iconos de UI]
└── 🔤 Fonts
```

### 🚀 Ejecutar el Proyecto

#### Paso 1: Abrir la Aplicación

##### Método 1: Abrir Directamente en Navegador (Más Simple)
1. **Navegar** a la carpeta `Web` descargada
2. **Hacer doble clic** en `home.html`
3. **Tu navegador predeterminado** abrirá la aplicación
4. **¡Comienza a explorar** la app MediTime!

##### Método 2: Abrir con Navegador Específico
1. **Clic derecho** en `home.html`
2. **Seleccionar**: "Abrir con" → Elige tu navegador preferido
3. **La aplicación se carga** inmediatamente

#### Paso 2: Navegar por la Aplicación

**Comenzar con la página de inicio**: Se abre automáticamente con `home.html`
- 🏠 **Dashboard de Inicio**: Visión general con opciones de navegación
- 💊 **Medicamentos**: Sección de gestión de medicamentos
- 📅 **Calendario**: Vista de calendario para programación
- 📊 **Reportes**: Reportes y análisis

**Navegación**:
- Hacer clic en el **icono de menú ☰** (arriba a la izquierda) para abrir navegación lateral
- Hacer clic en **tarjetas/imágenes** para navegar entre secciones
- Usar botones **atrás/adelante del navegador** para navegación

---

### 👥 Contribuciones del Equipo

#### Desarrollo de Páginas Web

##### 🧑‍💻 **Hernán Jiménez**
- **📄 mis_medicamentos.html** - Página de gestión y listado de medicamentos
- **📄 detalle_medicamento.html** - Página de detalles específicos de cada medicamento
- **📄 guardar_medicamento.html** - Formulario para agregar nuevos medicamentos

##### 🧑‍💻 **Héctor Ramírez**
- **📄 seguimiento_medicamento.html** - Página de seguimiento y progreso de medicamentos
- **📄 calendario.html** - Vista de calendario para programación de medicamentos
- **📄 reportes.html** - Página para ver y descargar reportes

<br>

---

<br>

## 📱 Proyecto Android MediTime

### 📋 Descripción del Proyecto

**MediTime** es una aplicación Android de gestión de medicamentos construida con:
- **Lenguaje**: Kotlin
- **Framework de UI**: Material Design 3
- **Min SDK**: Android 11 (API 30)
- **Target SDK**: Android 15 (API 35)
- **Sistema de Build**: Gradle con Kotlin DSL

#### 🏗️ Estructura del Proyecto
```
Mobile/
├── app/
│   ├── src/main/
│   │   ├── java/com/meditime/app/     # Archivos fuente Kotlin
│   │   ├── res/                       # Recursos (layouts, strings, imágenes)
│   │   └── AndroidManifest.xml        # Configuración de la app
│   └── build.gradle.kts               # Configuración de build a nivel de app
├── gradle/
├── build.gradle.kts                   # Configuración de build a nivel de proyecto
└── settings.gradle.kts                # Configuraciones del proyecto
```

### 🛠️ Requisitos Previos e Instalación

#### Paso 1: Instalar Java Development Kit (JDK)
1. **Descargar JDK 17** desde [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) o [OpenJDK](https://openjdk.org/projects/jdk/17/)
2. **Instalar JDK** siguiendo las instrucciones del instalador
3. **Verificar instalación**:
   ```bash
   java -version
   javac -version
   ```
   Deberías ver Java versión 17 o superior.

#### Paso 2: Descargar Android Studio
1. **Visitar**: [Sitio Web Oficial de Android Studio](https://developer.android.com/studio)
2. **Descargar** la última versión estable
3. **Requisitos del Sistema**:
   - **Windows**: Windows 8/10/11 (64-bit)
   - **RAM**: 8 GB mínimo (16 GB recomendado)
   - **Espacio en Disco**: 4 GB mínimo para Android Studio + 4 GB para Android SDK
   - **Resolución de Pantalla**: 1280 x 800 mínimo

#### Paso 3: Instalar Android Studio
1. **Ejecutar el instalador** y seguir el asistente de configuración
2. **Elegir tipo de instalación**: Estándar
3. **Seleccionar tema de UI**: Claro u Oscuro (preferencia personal)
4. **Componentes SDK** se descargarán automáticamente:
   - Android SDK
   - Android SDK Platform-Tools
   - Android SDK Build-Tools
   - Android Emulator
   - Intel x86 Emulator Accelerator (si usas procesador Intel)

---

### ⚙️ Configuración de Android Studio

#### Paso 4: Configurar SDK y Herramientas
1. **Abrir Android Studio**
2. **Ir a**: `File > Settings` (Windows/Linux) o `Android Studio > Preferences` (Mac)
3. **Navegar a**: `Appearance & Behavior > System Settings > Android SDK`

##### Plataformas SDK Requeridas:
- ✅ **Android 15.0 (API 35)** - Target SDK
- ✅ **Android 11.0 (API 30)** - SDK Mínimo

##### Herramientas SDK Requeridas:
- ✅ **Android SDK Build-Tools** (última versión)
- ✅ **Android Emulator**
- ✅ **Android SDK Platform-Tools**
- ✅ **Google Play services**
- ✅ **Intel x86 Emulator Accelerator (HAXM installer)**

#### Paso 5: Configurar Dispositivo Virtual (AVD)
1. **Abrir AVD Manager**: `Tools > AVD Manager`
2. **Crear Dispositivo Virtual**: Clic en "Create Virtual Device"
3. **Elegir Dispositivo**: Seleccionar **Pixel 6** o **Pixel 7** (recomendado)
4. **Seleccionar Imagen del Sistema**: 
   - **Nivel API 35** (Android 15)
   - **Target**: Google APIs (incluye Google Play)
   - **ABI**: x86_64 (para Intel) o arm64-v8a (para Mac Apple Silicon)
5. **Configurar AVD**: 
   - **RAM**: 2048 MB mínimo
   - **VM Heap**: 256 MB
   - **Almacenamiento Interno**: 4 GB mínimo
6. **Finalizar** y tu emulador está listo

---

### 🚀 Ejecutar el Proyecto

#### Paso 6: Abrir Proyecto en Android Studio
1. **Abrir Android Studio**
2. **Seleccionar**: "Open an Existing Project"
3. **Navegar** a la carpeta `Mobile` (no la carpeta raíz)
4. **Seleccionar** la carpeta `Mobile` y hacer clic en "OK"

#### Paso 7: Esperar la Sincronización del Proyecto
- Android Studio **sincronizará automáticamente el proyecto**
- Esto descarga todas las dependencias (puede tomar algunos minutos en la primera ejecución)
- Esperar el mensaje **"Gradle sync finished"**
- Buscar el **botón verde de play** en la barra de herramientas (indica que el proyecto está listo)

#### Paso 8: Ejecutar la Aplicación

##### Opción A: Usando Emulador (Recomendado)
1. **Iniciar tu AVD**: Hacer clic en el triángulo verde junto a tu dispositivo virtual en AVD Manager
2. **Esperar** a que el emulador arranque completamente (muestra la pantalla de inicio)
3. **En Android Studio**: Hacer clic en el **botón verde de play** (Run 'app')
4. **Seleccionar**: Tu emulador en ejecución de la lista de dispositivos
5. **Clic**: "OK"

##### Opción B: Usando Dispositivo Físico
1. **Habilitar Opciones de Desarrollador** en tu dispositivo Android:
   - Ir a `Configuración > Acerca del teléfono`
   - Tocar "Número de compilación" 7 veces
   - Verás "¡Ya eres desarrollador!"

2. **Habilitar Depuración USB**:
   - Ir a `Configuración > Opciones de desarrollador`
   - Habilitar "Depuración USB"

3. **Conectar Dispositivo**:
   - Conectar vía cable USB
   - Permitir depuración USB cuando se solicite
   - El dispositivo debería aparecer en la lista de dispositivos de Android Studio

4. **Ejecutar la App**: Hacer clic en el botón verde de play y seleccionar tu dispositivo

---

### 👥 Contribuciones del Equipo

#### Desarrollo de Aplicación Android

##### 🧑‍💻 **Hernán Jiménez**
- **📱 NewMedicineActivity** - Pantalla para crear y registrar nuevos medicamentos
- **📱 MedicineFollowUpActivity** - Pantalla de seguimiento y progreso de medicamentos
- **📱 AlarmActivity** - Funcionalidad de prueba de alarmas

##### 🧑‍💻 **Héctor Ramírez**
- **📱 MedicineActivity** - Pantalla principal de gestión de medicamentos
- **📱 MedicineDetailActivity** - Pantalla de detalles específicos de cada medicamento
- **📱 SettingsActivity** - Pantalla de configuración de la aplicación
