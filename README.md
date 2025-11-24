# lowleveldesign

> Java project to learn, implement, and document classic Low-Level Design (LLD) design patterns — creational, structural, and behavioral — with runnable examples, tests and explanations.

---

---

## Project Overview

`lowleveldesign` is an educational Java project that demonstrates classical design patterns with clean code, explanations, UML-like ASCII diagrams where helpful, and runnable examples. Each pattern will be implemented with:

* A simple core example (minimal code to show the idea)
* A real-world-ish example (a slightly more complex usage)
* Unit tests demonstrating expected behavior
* README / explanation per pattern (motivation, participants, pros/cons, complexity)

The goal is both to learn and to have a reference repository you can link to in interviews or share with teammates.

## Goals

* Implement and document major creational, structural, and behavioral patterns.
* Provide runnable Java examples and unit tests for each pattern.
* Keep code simple and idiomatic to modern Java (Java 11+ in examples; call out if you select a different target).
* Provide clear README for each pattern explaining when and why to use it.
* Provide CI to run tests on PRs.

## Who is this for

* Students learning OOP / design patterns
* Engineers prepping for interviews
* Developers wanting small, self-contained pattern examples

## Design Patterns to Cover (Suggested)

**Creational**

* Singleton
* Factory Method
* Abstract Factory
* Builder
* Prototype

**Structural**

* Adapter
* Composite
* Decorator
* Facade
* Proxy

**Behavioral**

* Strategy
* Observer
* Command
* Chain of Responsibility
* Template Method
* State
* Iterator

(You can add others later: Mediator, Visitor, Memento, Interpreter.)

## Technology Stack

* Java 11 or newer (pick a version and document it)
* Build: Maven (recommended) or Gradle (optional alternative)
* Unit testing: JUnit 5
* CI: GitHub Actions
* Optional: Jacoco for coverage, Spotless or Checkstyle for formatting

## Repository Layout / Package Structure

A suggested top-level layout:

```
lowleveldesign/
├── README.md
├── pom.xml                # or build.gradle
├── .gitignore
├── LICENSE
├── .github/
│   ├── workflows/
│   │   └── maven.yml
│   └── ISSUE_TEMPLATE.md
├── docs/                  # overall project docs or UMLs
├── patterns/
│   ├── creational/
│   │   ├── singleton/
│   │   │   ├── src/main/java/com/yourorg/lowleveldesign/creational/singleton/
│   │   │   ├── src/test/java/...
│   │   │   └── README.md
│   │   └── factorymethod/
│   ├── structural/
│   └── behavioral/
└── examples/              # optional: small runnable apps demonstrating multiple patterns
```
