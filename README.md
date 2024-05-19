# Swag Labs Website Automation Testing By B3

## Daftar Isi
- [Deskripsi](#deskripsi)
- [Prasyarat](#prasyarat)
- [Cara Menjalankan](#cara-menjalankan)
- [Struktur Folder Project Setelah Program Dijalankan](#struktur-folder-project-setelah-program-dijalankan)
- [Pengujian dan Generate Report dengan TestNG](#pengujian-dan-generate-report-dengan-testng)
- [Pengembang](#pengembang)
- [Alat](#alat)

## Deskripsi
Proyek ini adalah aplikasi pengujian otomatis untuk Web Swag Labs (https://www.saucedemo.com/) menggunakan Java, Maven, Cucumber, Selenium, dan JUnit. Pengujian dilakukan untuk memastikan setiap fitur berjalan sesuai dengan spesifikasi requirement dan desainnya.

Proyek ini terdiri dari 5 bagian utama: 
1. **Feature:** Berisi file-file gherkin yang berisi skenario pengujian yang ditulis dalam bahasa manusia yang mudah dimengerti oleh semua pihak terlibat, termasuk pengembang, analis bisnis, dan penguji. Ini terdapat di `src/test/resources`
2. **StepDefinitions:** Berisi file-file yang terdapat definisi langkah-langkah (steps) yang sesuai dengan pernyataan-pernyataan dalam file fitur. Anotasi @Given, @When, dan @Then menandai langkah-langkah yang sesuai dengan langkah-langkah fitur.
3. **Actions:** Berisi file-file yang terdapat code interaksi atau operasi yang dilakukan pada elemen-elemen web.
4. **Locator:** Berisi file-file yang terdapat code untuk menemukan elemen di halaman web agar bisa diinteraksikan oleh skrip pengujian.
5. **Runner:** Berisi file untuk menjalankan web automation testing.

## Prasyarat

1. Pastikan untuk mengklon repository ini ke dalam direktori lokal Anda dengan perintah:
    ```
    git clone https://github.com/mentarialysias/webAutomationProject.git
    ```
   Ini akan mendownload salinan proyek ke komputer Anda.

2. Pastikan Anda telah menginstal Java JDK versi 17. Anda dapat mengunduh dan menginstal Java JDK dari situs resminya: [Java SE Development Kit 16 Downloads](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).

   Untuk memeriksa apakah Java JDK sudah terinstal, jalankan perintah berikut di terminal:
    ```
    java -version
    ``` 

3. Pastikan sudah terinstal Gradle. Anda dapat mengunduh dan menginstal Gradle dari situs resminya: [Gradle Installation Guide](https://gradle.org/install/).

   Untuk memeriksa apakah Gradle sudah terinstal, jalankan perintah berikut di terminal:
    ```
    gradle -v
    ```

4. (Opsional) Proyek ini menggunakan TestNG untuk melakukan pengujian otomatis, Anda dapat menginstalnya dengan cara:
    - Untuk pengguna Eclipse, Anda bisa mendownload dan menginstal TestNG dari Eclipse Marketplace.
    - IntelliJ IDEA biasanya sudah menyertakan dukungan untuk TestNG tanpa instalasi tambahan

6. Pastikan telah mengonfigurasi RestAssured. Tambahkan dependensi RestAssured ke dalam file build.gradle:
   gradle :
    ```
    implementation group: 'io.rest-assured', name: 'rest-assured', version: '4.4.0'
    }
    ```
## Cara Menjalankan

1. Buka proyek dengan IDE favorit Anda. Disarankan untuk menggunakan IntelliJ IDEA untuk kenyamanan pengembangan.

2. Lakukan build proyek untuk menyiapkan aplikasi dengan perintah build di IDE Anda atau dengan perintah:
    ```
    npm run build
    ```

3. Generate file-file Gradle yang diperlukan dengan perintah:
    ```
    npm run wrapper
    ```

4. Jalankan program untuk melakukan pengujian manual dengan perintah:
    ```
    npm start
    ```
   Ini akan menjalankan program dalam mode pengembangan atau sesuai dengan skrip start yang telah dikonfigurasi.

5. Lakukan pengujian otomatis dengan perintah:
    ```
    npm test
    ```
   Ini akan menjalankan skrip pengujian otomatis yang telah disiapkan untuk proyek.

## Struktur Folder Project Setelah Program Dijalankan
Berikut struktur folder project setelah program dijalankan hingga step npm test:
```
├── .gradle
├── build
│   ├── ...
│   ├── reports
|   |   └── tests
|   │   |    ├── ...
|   │   |    ├── index.html
|   |   │    └── testng-results.xml
|   └── ...
├── gradle
└── src
    ├── main
    │   └── java
    │       └── org
    │           └── Main.java
    └── test
        ├── java
        │   ├── CreateTest.java
        │   ├── DeleteTest.java
        │   ├── GetTest.java
        │   ├── TestHelper.java
        │   ├── UpdateTest.java
        └── resources
            └── testng.xml
```

## Pengujian dan Generate Report dengan TestNG
Pengujian dilakukan menggunakan TestNG dan RestAssured untuk memastikan fungsi-fungsi API bekerja sesuai yang diharapkan.Laporan hasil pengujian akan digenerate secara otomatis. Laporan ini terletak pada file berikut: `build/reports/tests/index.html`. Hasil pengujiannya sebagai berikut:

- Total test: <span style="color:#2196F3; font-weight:bold;">21</span>
- Successful: <span style="color:#4CAF50; font-weight:bold;">15 (71%)</span>
- Failures: <span style="color:#F44336; font-weight:bold;">6 (29%)</span>
- Igroned: <span style="color:#FFC107; font-weight:bold;">0</span>

<img src="src/test/img.png" width="500">

## Pengembang
[<img src="https://github.com/delvitord.png" width="50" style="border-radius:50%">](https://github.com/delvitord)
[<img src="https://github.com/mentarialysias.png" width="50" style="border-radius:50%">](https://github.com/mentarialysias)
[<img src="https://github.com/yasminazizahtuhfah.png" width="50" style="border-radius:50%">](https://github.com/yasminazizahtuhfah)


<b>Delvito Rahim Derivansyah - 211524039 ([@delvitord](https://github.com/delvitord))
<br> Mentari Ayu Alysia Sudrajat - 211524047 ([@mentarialysias](https://github.com/mentarialysias))
<br> Yasmin Azizah Tuhfah - 211524064 ([@yasminazizahtuhfah](https://github.com/yasminazizahtuhfah))
<b>
## Alat
- ![](https://img.shields.io/badge/Gradle-Versi_7.4-%2383afd7)
  <br>Digunakan sebagai alat pembangunan untuk mengelola proyek Java dengan efisien. Kunjungi [situs web Gradle](https://gradle.org/) untuk informasi lebih lanjut.


- ![](https://img.shields.io/badge/Java-Versi_16-%23ffcc80)
  <br>Versi 16 atau yang lebih baru</span>. Bahasa pemrograman Java digunakan dalam proyek ini. Pastikan untuk menginstal versi Java yang sesuai. Kunjungi [situs web Java](https://www.java.com/) untuk informasi lebih lanjut.


- ![](https://img.shields.io/badge/TestNG-Framework_Pengujian-%23a5d6a7)
  <br>Framework pengujian</span> yang digunakan untuk menulis dan menjalankan unit tes dalam proyek Java. Kunjungi [situs web TestNG](https://testng.org/) untuk informasi lebih lanjut.


- ![](https://img.shields.io/badge/Node.js-Platform_runtime_JavaScript-%23b39ddb)
  <br>Platform runtime JavaScript</span> yang digunakan untuk menjalankan aplikasi JavaScript di sisi server. Pastikan Node.js telah diinstal untuk menjalankan aplikasi. Kunjungi [situs web Node.js](https://nodejs.org/) untuk informasi lebih lanjut.


- ![](https://img.shields.io/badge/RestAssured-API_Testing_Library-%2300E676)
  <br>RestAssured adalah library Java yang kuat untuk melakukan pengujian API secara otomatis. Dengan RestAssured, Anda dapat dengan mudah melakukan permintaan HTTP ke endpoint API, memeriksa respons, dan memvalidasi data JSON. Kunjungi dokumentasi RestAssured untuk informasi lebih lanjut.
