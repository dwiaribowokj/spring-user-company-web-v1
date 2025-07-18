# 🌐 user-company-web-v1

Modul web/API yang menyediakan **REST endpoint** untuk fitur pengguna, perusahaan, dan hubungan antar keduanya, berdasarkan logika yang disediakan oleh [`user-company-core-v1`](https://github.com/dwiaribowokj/user-company-core-v1).

---

## 🚀 Fitur

- Register User (`POST /users`)
- Detail User (`GET /users/{id}`)
- Membuat Company (`POST /companies`)
- Detail Company (`GET /companies/{id}`)
- Menambahkan User ke Company (`POST /members`)
- Melihat seluruh Company milik User (`GET /members/user/{userId}`)
- Menghapus User dari Company (`DELETE /members/{companyId}/{userId}`)

---

## 🧩 Dependensi

Proyek ini bergantung pada:

- `user-company-core-v1` → Entity, DTO, Service
- Spring Boot Web
- Jakarta Validation
- Lombok
- Springdoc OpenAPI (Swagger UI)

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

### Lihat Detail Company
```http
GET /companies/{id}
```

### Tambah Anggota Company
```http
POST /members
Content-Type: application/json

{
  "userId": "xxx",
  "companyId": "yyy"
}
```

---

## 🛠 Cara Menjalankan

```bash
mvn clean install
mvn spring-boot:run
```

Akses melalui: [http://localhost:8082/swagger-ui.html](http://localhost:8082/swagger-ui.html)

---

## 📍 Rencana Berikutnya

- [ ] Integrasi ke Eureka
- [ ] Pengamanan dengan JWT
- [ ] Dokumentasi Swagger/OpenAPI lengkap
- [ ] Validasi tambahan & Global Exception

---

## 👨‍💻 Pengembang

Maintainer: [@dwiaribowokj](https://github.com/dwiaribowokj)