package com.ma.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Struktur Simulasi:
// 1. Monolith (Spring Boot App) berisi modul JDIH & DIKTUM
// 2. Dipecah menjadi:
//    - Auth Service (Java)
//    - JDIH Service (Java)
//    - DIKTUM Service (Go)

// ---------- 1. MONOLITH (Spring Boot) ----------

// File: MonolithApplication.java
@SpringBootApplication
public class MonolithApplication {
	public static void main(String[] args) {
		SpringApplication.run(MonolithApplication.class, args);
	}
}

// ---------- 2. MICROSERVICES (Split) ----------

// === Auth Service (Spring Boot - Java) ===
// Endpoint: /auth/login (JWT Token)
// Secures other services via Bearer Token

// === JDIH Service (Spring Boot - Java) ===
// Endpoint: /jdih/docs
// Validates JWT Token via Auth Service

// === DIKTUM Service (Golang - Fiber or Gin) ===
// Endpoint: /diktum/rumusan
// Receives token, verifies it with Auth Service

// ---------- SECURITY NOTE ----------
// Use Spring Security with JWT for Java services
// Golang service verifies JWT manually or via middleware

// ---------- COMMUNICATION ----------
// JDIH & DIKTUM services are stateless
// All services expose REST APIs
// Gateway or frontend app consumes them separately

// Demo Simulasi:
// 1. Login via Auth Service → token
// 2. Access /jdih/docs with Authorization: Bearer {token}
// 3. Access /diktum/rumusan with same token

// Jika diperlukan, bisa saya bantu generate kode tiap service secara penuh

