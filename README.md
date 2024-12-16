# Kotlin MutableList vs MutableSet: removeIf() Behavior

This repository demonstrates a subtle difference in how the `removeIf()` function behaves when used with `MutableList` and `MutableSet` in Kotlin.  While both modify the collection in place, the iteration and removal process differ subtly.  This can lead to unexpected results if not carefully considered.

## The Problem

The `removeIf()` function is intended to remove elements from a collection that satisfy a given predicate. However, the way it iterates through the collection can vary depending on the collection type.

## Solution

The solution highlights the expected behavior and clarifies the underlying mechanisms. Understanding these differences is crucial for writing correct and predictable code.

## How to run the code

1. Clone this repository.
2. Open the project in your preferred Kotlin IDE (e.g., IntelliJ IDEA).
3. Run the `main` function in `bug.kt` to see the output.
4. Review the comments in `bug.kt` and `bugSolution.kt` for a detailed explanation.
