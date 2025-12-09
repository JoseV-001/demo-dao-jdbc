---

# 📌 demo-dao-jdbc

Projeto desenvolvido para estudo de JDBC (Java Database Connectivity) integrando Java com MySQL.
O objetivo é praticar operações básicas de banco de dados utilizando o padrão DAO (Data Access Object).

---

## 🚀 Tecnologias utilizadas

* **Java (JDK 21)**
* **MySQL**
* **JDBC**
* **DAO Pattern**

---

## 📂 Funcionalidades implementadas

O projeto permite realizar operações CRUD nas entidades:

### **Department**

* **Insert** — inserir um novo departamento
* **FindById** — buscar departamento pelo ID
* **FindAll** — listar todos os departamentos (ordenados)
* **Update** — atualizar nome do departamento
* **Delete** — excluir departamento por ID

### **Seller**

* **Insert** — inserir novo vendedor
* **FindById** — buscar vendedor pelo ID
* **FindAll** — listar todos os vendedores
* **FindByDepartment** — listar vendedores de um departamento específico
* **Update** — atualizar dados
* **Delete** — excluir vendedor por ID

---

## 🗄️ Estrutura do projeto

```
src/
 ├── application/
 │    └── Main.java
 ├── db/
 │    ├── DB.java
 │    └── DbException.java
 ├── model/
 │    ├── entities/
 │    │    ├── Seller.java
 │    │    └── Department.java
 │    ├── dao/
 │    │    ├── DepartmentDao.java
 │    │    └── SellerDao.java
 │    └── dao/impl/
 │         ├── DepartmentDaoJDBC.java
 │         └── SellerDaoJDBC.java
```

---

## 🔌 Conexão com MySQL

Certifique-se de ter criado o banco:

```sql
CREATE DATABASE coursejdbc;
USE coursejdbc;
```

E configurado o arquivo de conexão no projeto:

```
db.properties
```

Com algo assim:

```
user=root
password=sua_senha
dburl=jdbc:mysql://localhost:3306/coursejdbc
```

---

## ▶️ Como executar

1. Configure o MySQL e o arquivo **db.properties**
2. Execute a classe `Main` para testar as funções
3. Veja no console cada operação acontecendo (insert, update, delete, consultas…)

---

## 📘 Objetivo do projeto

Projeto criado apenas para **estudo do JDBC e prática do padrão DAO**

---
