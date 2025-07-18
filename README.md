# 🌐 user-company-web-v1

Modul web/API yang menyediakan **REST endpoint** untuk fitur pengguna, perusahaan, dan hubungan antar keduanya, berdasarkan logika yang disediakan oleh [`user-company-core-v1`](https://github.com/dwiaribowokj/user-company-core-v1).

---

## 🚀 Fitur

- Register User (`POST /users`)
- Membuat Company (`POST /companies`)
- Menambahkan User ke Company (`POST /companies/{id}/members`)
- Melihat seluruh Company milik User (`GET /users/{id}/companies`)
- Menghapus User dari Company (`DELETE /companies/{id}/members/{userId}`)

---

## 🧩 Dependensi

Proyek ini bergantung pada:

- `user-company-core-v1` → Entity, DTO, Service
- Spring Boot Web
- Jakarta Validation
- Lombok

---

## 📦 Struktur

```
src/main/java/com/company/user/web/v1/
├── controller/
│   ├── UserController.java
│   ├── CompanyController.java
│   └── CompanyMemberController.java
└── UserCompanyWebV1Application.java
```

---

## ⚙️ Konfigurasi Dasar (`application.yml`)

```yaml
server:
  port: 8082

spring:
  application:
    name: user-company-web-v1
```

> Nantinya dapat ditambahkan konfigurasi `eureka.client.service-url.defaultZone` dan security jika diintegrasikan.

---

## 🔗 Contoh Endpoint

### Register User
```http
POST /users
Content-Type: application/json

{
  "nama": "Coba User",
  "email": "coba@user.com",
  "password": "secret",
  "noHp": "08123456789"
}
```

---

## 🛠 Cara Menjalankan

```bash
mvn clean install
mvn spring-boot:run
```

Akses melalui: [http://localhost:8082](http://localhost:8082)

---

## 📍 Rencana Berikutnya

- [ ] Integrasi ke Eureka
- [ ] Pengamanan dengan JWT
- [ ] Dokumentasi Swagger/OpenAPI
- [ ] Validasi tambahan & Global Exception

---

## 👨‍💻 Pengembang

Maintainer: [@dwiaribowokj](https://github.com/dwiaribowokj)
