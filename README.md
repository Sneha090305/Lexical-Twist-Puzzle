# Lexical Twist Puzzle Application

## Overview

The **Lexical Twist Puzzle** is a console-based Java application that processes two input words and performs transformations based on logical conditions.

The application evolves step-by-step using **Use Case (UC)-wise implementation**, finally resulting in a clean, modular, and OOPS-compliant system.

---

## Features

* Accepts two user inputs
* Validates single-word constraint
* Checks reverse relationship (case-insensitive)
* Performs string transformation (vowel replacement)
* Combines and analyzes character distribution
* Rule-based output (vowel vs consonant dominance)
* Fully modular OOPS-based architecture (UC8)

---

## Technologies Used

* Java (Core Programming)
* Git & GitFlow
* IntelliJ IDEA

---
# Use Case Descriptions (UC1 – UC8)

🔹 UC1 — Display Puzzle Title
Displays the system name “Lexical Twist Puzzle” when the program starts.
Introduces the basic class structure and program execution.

---

🔹 UC2 — Accept Word Inputs
Accepts two user inputs:

* First word
* Second word
  Focuses on input handling using Scanner without validation.

---

🔹 UC3 — Validate Single Word Constraint
Validates that each input contains only one word.
Displays an error message for invalid inputs and terminates gracefully.

---

🔹 UC4 — Check Reverse Relationship
Checks whether the second word is the reverse of the first word.
Uses case-insensitive comparison to determine the processing path.

---

🔹 UC5 — Transform Word on Reverse Match
If words are reverse:

* Reverses the word
* Converts to lowercase
* Replaces all vowels with '@'
  Outputs the transformed word.

---

🔹 UC6 — Combine Words and Count Characters
If words are not reverse:

* Combines both words
* Converts to uppercase
* Counts vowels and consonants
  Focuses on character analysis logic.

---

🔹 UC7 — Rule-Based Output
Generates output based on vowel–consonant comparison:

* Prints first 2 unique vowels (if vowels are higher)
* Prints first 2 unique consonants (if consonants are higher)
* Displays message if counts are equal

---

🔹 UC8 — Fully Modular OOPS Design
Refactors the application into multiple classes:

* LexicalTwistPuzzle → Input and output handling
* LexicalAnalyzer → Business logic and processing
* WordValidator → Input validation

Applies OOPS principles like encapsulation, abstraction, and modularity.

---


## GitFlow Strategy

* `main` → Contains stable version & README
* `develop` → Integration branch
* `feature/UCx` → One branch per use case

---

## Sample Test Cases

### ✔ Reverse Case

```
Input:
hello
olleh

Output:
@ll@h
```

---

### ✔ Non-Reverse Case

```
Input:
hello
world

Output:
HL
```

---

### ✔ Invalid Input

```
Input:
hello world

Output:
hello world is an invalid word
```

---

### ✔ Equal Distribution

```
Output:
Vowels and consonants are equal
```



