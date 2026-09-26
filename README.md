# 📚 Trabalho 1º Bimestre — Estrutura de Dados

Aplicação desenvolvida em **Java** para a manipulação de dados acadêmicos utilizando uma estrutura de **Array de Objetos**.

Este projeto foi desenvolvido como requisito para a disciplina de **Estrutura de Dados**.

## 📋 Sobre o Projeto

O sistema permite cadastrar alunos e gerar diferentes relatórios a partir dos dados armazenados.

A interação com o usuário é realizada pelo terminal utilizando a classe `Scanner`.

Cada aluno possui os seguintes dados:

* **Nome** — `String`
* **RA** — `int`
* **Idade** — `int`
* **Sexo** — `char/String`
* **Média** — `double`
* **Resultado** — `String`

O resultado é definido automaticamente pelo sistema:

* Média maior ou igual a **6,0** → **Aprovado**
* Média menor que **6,0** → **Reprovado**

## ⚙️ Funcionalidades

O sistema possui as seguintes funcionalidades:

1. **Cadastrar Alunos**

   * Permite inserir os dados dos alunos pelo teclado.
   * Os dados são armazenados em um Array de Objetos.

2. **Relatório por Nome**

   * Exibe os alunos em ordem alfabética crescente (A-Z).
   * Utiliza algoritmos de ordenação.

3. **Relatório por RA**

   * Exibe os alunos ordenados pelo RA em ordem decrescente.

4. **Relatório de Aprovados**

   * Exibe somente os alunos aprovados.
   * Os alunos são apresentados em ordem alfabética crescente.

## 🧠 Estruturas e Algoritmos

Durante o desenvolvimento foram utilizados conceitos de:

* Array de Objetos
* Classes e Objetos
* Encapsulamento
* `Scanner`
* Busca Sequencial
* Busca Binária
* Bubble Sort
* Selection Sort
* Merge Sort
* Recursividade

## 🛠️ Tecnologias

* **Java**
* **JDK**
* **IntelliJ IDEA**
* **Git e GitHub**

## 📁 Estrutura do Projeto

```text
Trabalho Estrutura de Dados/
│
├── src/
│   ├── Aluno.java
│   ├── BubbleSort.java
│   ├── BuscaBinaria.java
│   ├── BuscaSequencial.java
│   ├── MergeSort.java
│   ├── ProjetoApp.java
│   ├── Recursividade.java
│   └── SelectionSort.java
│
├── .gitignore
├── Trabalho Estrutura de Dados.iml
└── README.md
```

## 🚀 Como Executar

### Pré-requisitos

É necessário ter o **JDK (Java Development Kit)** instalado.

### Executando pelo terminal

Clone o repositório:

```bash
git clone https://github.com/khelvinw/Trabalho---Estruturas-de-Dados.git
```

Entre na pasta do projeto:

```bash
cd Trabalho---Estruturas-de-Dados
```

Entre na pasta `src`:

```bash
cd src
```

Compile os arquivos Java:

```bash
javac *.java
```

Execute o programa principal:

```bash
java ProjetoApp
```

## 🎓 Objetivo Acadêmico

O projeto tem como objetivo aplicar na prática os conceitos estudados na disciplina de **Estrutura de Dados**, especialmente a utilização de arrays de objetos, algoritmos de busca, algoritmos de ordenação e recursividade.

---

**Projeto desenvolvido para fins acadêmicos.**
