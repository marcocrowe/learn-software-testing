Software Testing Assignment 1 

K00283736 – Diarmuid Egan 

Q1 

(a) Black Box Testing: 

Software testing known as black box testing occurs when the tester is not aware of the internal operations, design, or implementation of the system under test. The tester solely focuses on the inputs into the software and the expected outputs, not knowing how the system processes these inputs. The aim is to assess the accuracy, functionality, and performance of the software as seen by the user, who sees it as a black box with no idea how it operates. 

White Box Testing: 

White box testing, sometimes called structural, glass box, or transparent box testing, involves looking at the internal logic, implementation, and code structure of the software. Testers use their in-depth knowledge of the fundamental functions of the system to build test cases. The objective is to ensure that every line of code is tested and that internal structures function as planned. White box testing is especially helpful for finding logical problems, coding errors, and ensuring that all possible code paths are covered.

(b) 

![](Aspose.Words.dde088a6-b0a0-44c3-9df5-0f09dcb356ac.001.jpeg)

Cyclomatic Complexity: 

- E = 17 
- N = 13 
- P = 1 

  Calculate V(G) = E - N + 2P = 17 - 13 + 2(1) = 6 

Branch Table: 



|Decision Point |Outcomes |Actions |
| - | - | - |
|If (x > 0) |True or False  |Print “X is positive” |
|If (y > 0) |True or False |Print “Y is positive” |

Block Table: 



|Block Label |Start Node |End Node |
| - | - | - |
|Start |1 |1 |
|Input x, y |2 |3 |
|If (x > 0) |4 |12 |
|If (y > 0) |8 |11 |
|Output |13 |13 |
|End |14 |14 |

(c) 

Completing part b of the assignment is highly beneficial for several reasons, Improving Testing Ability: 

Important to efficient software testing is static analysis. After doing this assignment, I will have the ability to prioritise testing, create test cases, and spot possible problems early in the development lifecycle. This ability is useful for carrying out more comprehensive and focused testing processes. 

Enhancing Analytical Skills: 

My analytical skills are improved by the analysis required to determine Cyclomatic Complexity and create related tables. It improves my ability to break down complex systems into smaller, more manageable parts, enabling a more logical and successful approach to problem-solving. 

Using Knowledge in Real-World Applications:  

This assignment offers the chance to put the concepts from the course into practice in a practical setting. This real-world application helps me understand more fully the concepts and processes of software testing. 

I would highlight my complete approach to software testing in a work placement job interview by expressing these points. I would show that I understand the value of static analysis in terms of not just finding bugs but also improving the general quality and maintainability of the software. This demonstrates my dedication to demanding and efficient testing procedures, which is a great advantage in the software development sector.
