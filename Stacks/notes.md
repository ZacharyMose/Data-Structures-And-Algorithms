# Stack in Java — DSA Notes

## 1. Definition

A **Stack** is a linear data structure that follows:

**LIFO (Last In, First Out)**

The last element added is the first one removed.

Example analogy:

* Stack of plates
* Undo operations
* Browser history

---

## 2. Core Operations

| Operation | Description        | Time Complexity |
| --------- | ------------------ | --------------- |
| push(x)   | Add element to top | O(1)            |
| pop()     | Remove top element | O(1)            |
| peek()    | View top element   | O(1)            |
| isEmpty() | Check if empty     | O(1)            |
| size()    | Number of elements | O(1)            |

---

## 3. Stack Implementation Options in Java

### Option A: Stack class (Legacy)

```
Stack<Integer> stack = new Stack<>();
```

Problems:

* synchronized → slower
* legacy class
* not recommended for modern code

---

### Option B (Recommended): ArrayDeque

```
Deque<Integer> stack = new ArrayDeque<>();
```

Advantages:

* faster
* not synchronized
* recommended by Java documentation
* commonly used in interviews

---

## 4. Basic Stack Operations (ArrayDeque)

```
import java.util.*;

Deque<Integer> stack = new ArrayDeque<>();

// push elements
stack.push(10);
stack.push(20);
stack.push(30);

// peek top element
System.out.println(stack.peek()); // 30

// pop top element
System.out.println(stack.pop()); // 30

// check if empty
System.out.println(stack.isEmpty()); // false

// size of stack
System.out.println(stack.size()); // 2
```

---

## 5. Stack Visualization

```
push(10)
stack: [10]

push(20)
stack: [10, 20]

push(30)
stack: [10, 20, 30]

pop()
returns 30

stack: [10, 20]
```

---

## 6. Stack Methods (ArrayDeque)

| Method    | Description             |
| --------- | ----------------------- |
| push(x)   | add element to top      |
| pop()     | remove top element      |
| peek()    | view top element        |
| isEmpty() | check if stack is empty |
| size()    | number of elements      |

---

## 7. Example: Character Stack

```
import java.util.*;

Deque<Character> stack = new ArrayDeque<>();

stack.push('(');
stack.push('{');

System.out.println(stack.peek()); // {

stack.pop();

System.out.println(stack.peek()); // (
```

---

## 8. When to Use Stack

Use stack when problem involves:

1. Matching symbols

   * Valid Parentheses
   * HTML tag validation

2. Undo operations

   * Text editor undo
   * Browser back button

3. Nested structures

   * ((a + b) * c)

4. Tracking previous elements

   * Next greater element
   * Monotonic stack

5. Expression evaluation

   * Reverse Polish Notation
   * Infix to postfix conversion

---

## 9. Alternative Implementation Using LinkedList

```
Deque<Integer> stack = new LinkedList<>();
```

Works but:

* slower than ArrayDeque
* more memory overhead

---

## 10. Common Mistakes

Mistake 1: Popping empty stack

```
stack.pop(); // error if empty
```

Fix:

```
if(!stack.isEmpty()){
    stack.pop();
}
```

Mistake 2: Using add() instead of push()

```
stack.push(10); // correct
stack.add(10);  // queue style
```

Mistake 3: Using legacy Stack class

```
Stack<Integer> stack = new Stack<>();
```

Better:

```
Deque<Integer> stack = new ArrayDeque<>();
```

---

## 11. Complexity Analysis

| Operation | Complexity |
| --------- | ---------- |
| push      | O(1)       |
| pop       | O(1)       |
| peek      | O(1)       |
| search    | O(n)       |

---

## 12. Template for Stack Problems (Java)

```
Deque<Type> stack = new ArrayDeque<>();

for(Type element : input){

    if(condition){
        stack.push(element);
    }

    else{

        if(stack.isEmpty()){
            return false;
        }

        Type top = stack.pop();

        // logic here
    }
}
```

---

## 13. Key Takeaways

* Stack follows LIFO principle
* ArrayDeque is preferred implementation
* Always check if stack is empty before pop
* Stack is useful for nested structures and matching problems