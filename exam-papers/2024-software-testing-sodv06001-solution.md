
# Software Testing - Exam Paper - 2024 - Summer

**Time Allowed**: 2 hours

**Instructions**:  Answer any 3 questions. All questions carry equal marks

**Marks and marks will be scaled to 100.**

The use of programmable or text storing calculators is expressly forbidden.

Please note that where a candidate answers more than the required number of questions, the examiner will mark all questions attempted and then select the highest scoring ones.

There are no additional requirements for this paper.

## Question 1 - (Total 33 Marks)

### Question 1.A (11 Marks)

Explain the relevance of the goal of software testing if you are asked about software testing in a work placement interview.

### Question 1.B (11 Marks)

What are the levels of software testing? Explain why you think there are a number of levels of software testing.

### Question 1.C (11 Marks)

Explain your understanding of user acceptance testing. Do you think you will be involved in user acceptance testing in the future, explain your answer?

## Question 2 (Total 33 Marks)

```java
public Integer walkAndEatPies(Grid aGrid)
{
  initialise();
  turn("Right");
  for(int i=1; i <= 10; i++)
  {
    if(aGrid.pieInSight(this) == true)
    {
      eatPie(aGrid);
    }
    else
    {
      if(aGrid.clearAhead(this) == true)
      {
        walk(aGrid);
      }
      else
      {
        break;
      }
    }
  }
  return pieCount;
}
```

**Figure 1**  

### Question 2.A (11 Marks)

#### Question 2.A.1

Develop a control flow-graph for the code shown in Figure 1 and determine the complexity.

#### Answer 2.A.1

The control flow-graph for the code shown in Figure 1 is as follows:

```mermaid
flowchart TD;
    initialise([Initialise])
    turnRight([Turn Right])
    Loop1((Loop i))
    LoopIf1{"i <= 10"}
    IfPieInSight{Pie in Sight?}
    codeEatPie([Eat Pie])
    IfClearAhead{Clear Ahead?}
    codeWalk([Walk])
    codeBreak([Break])
    returnPieCount([Return pieCount])
    endCode([End])
    
    initialise -- 1 -->  turnRight
    turnRight --2--> Loop1
    Loop1 --3--> LoopIf1
    LoopIf1 -- Yes (4) --> IfPieInSight
    LoopIf1 -- No (5) --> returnPieCount
    IfPieInSight -- Yes (6) --> codeEatPie
    codeEatPie --7--> Loop1
    IfPieInSight -- No (8)--> IfClearAhead
    IfClearAhead -- Yes (9)--> codeWalk
    IfClearAhead -- No (10)--> codeBreak
    codeWalk --11--> Loop1
    codeBreak --12--> returnPieCount
    returnPieCount --13--> endCode
```

The complexity of the control flow-graph can be calculated using the formula:

$M = E - N + 2$

where:

- $M$ is the complexity
- $E$ is the number of edges
- $N$ is the number of nodes

$M = 13 - 11 + 2 = 4$

$$\boxed{M = 4}$$

#### Question 2.A.2

Suppose software testing has been employed so that TER1 = 0.95, would you recommend further testing and explain your answer.

#### Answer 2.A.2

Given the testing effectiveness ratio (TER1 = 0.95), which indicates a high level of coverage, further testing may not be necessary. However, it is advisable to consider additional testing to ensure robustness and reliability, especially in critical or complex systems. Further testing can help identify edge cases, boundary conditions, and potential issues that may not have been covered by the initial tests. It is always beneficial to have a comprehensive testing strategy to minimize the risk of undetected defects and ensure the quality of the software product.

### Question 2.B (11 Marks)

Develop the branch table for the code shown in Figure 1.

### Answer 2.B

**Lines**  

No need to number `blank lines`, `lines with curly braces` or `else` statements.

| #  | Code                                 |
|----|--------------------------------------|
| 1  | `initialise();`                      |
| 2  | `turn("Right");`                     |
| 3  | `for(int i=1; i <= 10; i++)`         |
| 4  | `if(aGrid.pieInSight(this) == true)` |
| 5  | `eatPie(aGrid);`                     |
| 6  | `if(aGrid.clearAhead(this) == true)` |
| 7  | `walk(aGrid);`                       |
| 8  | `break;`                             |
| 9  | `return pieCount;`                   |
| 10 | **END**                              |

**Branch Table**  

| Branch No. | From Line # | To Line # | Branch Type        | From Line                                     | To Line                              |
|:-----------|:------------|:----------|:-------------------|:----------------------------------------------|:-------------------------------------|
| 1          | 1           | 2         | Unconditional      | `initialise();`                               | `turn("Right");`                     |
| 2          | 2           | 3         | Unconditional      | `turn("Right");`                              | `for(int i=1; i <= 10; i++)`         |
| 3          | 3           | 4         | Conditional Loop   | `for(int i=1; i <= 10; i++)` is True          | `if(aGrid.pieInSight(this) == true)` |
| 4          | 3           | 9         | Conditional Loop   | `for(int i=1; i <= 10; i++)` is False         | `return pieCount;`                   |
| 5          | 4           | 5         | Conditional Branch | `if(aGrid.pieInSight(this) == true)` is True  | `eatPie(aGrid);`                     |
| 6          | 4           | 6         | Conditional Branch | `if(aGrid.pieInSight(this) == true)` is False | `if(aGrid.clearAhead(this) == true)` |
| 7          | 5           | 3         | Unconditional      | `eatPie(aGrid);`                              | `for(int i=1; i <= 10; i++)`         |
| 8          | 6           | 7         | Conditional Branch | `if(aGrid.clearAhead(this) == true)` is True  | `walk(aGrid);`                       |
| 9          | 6           | 8         | Conditional Branch | `if(aGrid.clearAhead(this) == true)` is False | `break;`                             |
| 10         | 7           | 3         | Unconditional      | `walk(aGrid);`                                | `for(int i=1; i <= 10; i++)`         |
| 11         | 8           | 9         | Unconditional      | `break;`                                      | `return pieCount;`                   |
| 12         | 9           | 10        | Unconditional      | `return pieCount;`                            | **END**                              |

### Question 2.C (11 Marks)

Develop the block table for the code shown in Figure 1.

### Answer 2.C

Using my **Lines** table from **Answer 2.B**:

| Block Number | Start Line | End Line | Start Line Code              | End Line Code    |        |
|--------------|------------|----------|------------------------------|------------------|--------|
| 1            | 1          | 2        | `initialise();`              | `turn("Right");` |        |
| 2            | 3          | 8        | `for(int i=1; i <= 10; i++)` | `break;`         | Note 1 |
| 3            | 9          | 10       | `return pieCount;`           | **END**          |        |
|              |            |          |                              |                  |        |
| 4            | 5          | 5        | `eatPie(aGrid);`             | `eatPie(aGrid);` | Note 2 |
| 5            | 7          | 7        | `walk(aGrid);`               | `walk(aGrid);`   | Note 2 |

**Notes**:

1. The `break;` statement makes it impossible to break up the code into smaller blocks because the `break;` statement is part of the loop.
2. Stricter interpretation of the block table would have the same start and end line code for blocks 4 and 5, but It would be pointless to block to call the same function.

## Question 3 - (Total 33 Marks)

# Missing

## Question 4

### Question 4.A (10 Marks)

Explain why consideration of Boundary Value Analysis is useful when determining tests cases for the Equivalence Classes/Partitions you identify. Use a simple example to illustrate your answer.

### Answer 4.A

Boundary Value Analysis (BVA) is a crucial technique in software testing that focuses on the values at the boundaries of equivalence classes or partitions. This method is particularly useful because defects are more likely to occur at the edges of input ranges rather than in the middle. By testing these boundary values, we can more effectively identify potential issues in the software.

BVA aligns with the principles of functional testing and structural testing. Functional testing checks the system's functionality from the user's perspective, while structural testing ensures that every part of the code is executed. BVA helps achieve these goals by ensuring that boundary conditions, which are critical for both functional correctness and structural integrity, are thoroughly tested.

**Why BVA is Useful:**

1. **Error Detection:** Boundary values are more prone to errors. Testing these values helps in detecting defects that might not be found when testing within the middle of the range.
2. **Efficiency:** It reduces the number of test cases needed while still maintaining a high probability of finding defects.
3. **Coverage:** Ensures that all edge cases are tested, providing better coverage of the input domain.

**Example:**
Consider a software application that accepts an integer input between 1 and 100 (inclusive).

- **Equivalence Classes:**
  - Valid input: 1 to 100
  - Invalid input: less than 1, greater than 100

- **Boundary Values:**
  - Lower boundary: 1
  - Just below the lower boundary: 0
  - Just above the lower boundary: 2
  - Upper boundary: 100
  - Just below the upper boundary: 99
  - Just above the upper boundary: 101

**Test Cases:**

1. Test with the value 1 (lower boundary).
2. Test with the value 0 (just below the lower boundary).
3. Test with the value 2 (just above the lower boundary).
4. Test with the value 100 (upper boundary).
5. Test with the value 99 (just below the upper boundary).
6. Test with the value 101 (just above the upper boundary).

**Additional Considerations:**
While BVA primarily focuses on boundary values, it can also be useful to consider other types of test cases such as:

- **Negative Values:** Testing with negative values (e.g., -1) can help ensure that the application correctly handles invalid inputs.
- **Even/Odd Values:** Testing with even and odd values within the valid range (e.g., 2, 3, 98, 99) can help identify any issues related to specific types of inputs.
- **Non-Integer Values:** Testing with non-integer values (e.g., 1.5) can help verify the application's handling of non-integer inputs.

By focusing on these boundary values and additional considerations, we can ensure that the application correctly handles the edge cases, thereby improving the reliability and robustness of the software.

### Question 4.B (23 Marks)

A shopping website offers different discounts depending upon each transaction
made by the customer. The user enters the integer value of the purchase amount in Euro, then presses the Enter button. For example if a purchase amount is in the range €1 to €10 then no discount is displayed, a purchase over €10 and up to €300 have 10% discount calculated and displayed. Purchase amounts between €301 and up to €500 have 15% discount calculated and displayed, and purchases over €500 have a 20% discount calculated and displayed. The maximum purchase amount that can be entered is €1000 and the minimum amount is €1 and invalid input of any kind results in the warning message Invalid Input.

Derive the equivalence classes and determine black box test cases based on these and utilise boundary value analysis.

### Equivalence Classes

1. **Valid Input:**
   - Class 1: €1 to €10 (No discount)
   - Class 2: €11 to €300 (10% discount)
   - Class 3: €301 to €500 (15% discount)
   - Class 4: €501 to €1000 (20% discount)

2. **Invalid Input:**
   - Class 5: Less than €1
   - Class 6: Greater than €1000
   - Class 7: Non-integer values (e.g., strings, special characters)

### Boundary Value Analysis

For each equivalence class, we will identify the boundary values and create test cases accordingly.

#### Test Cases

1. **Class 1: €1 to €10 (No discount)**
   - Lower boundary: €1
   - Just above the lower boundary: €2
   - Upper boundary: €10
   - Just below the upper boundary: €9

2. **Class 2: €11 to €300 (10% discount)**
   - Lower boundary: €11
   - Just above the lower boundary: €12
   - Upper boundary: €300
   - Just below the upper boundary: €299

3. **Class 3: €301 to €500 (15% discount)**
   - Lower boundary: €301
   - Just above the lower boundary: €302
   - Upper boundary: €500
   - Just below the upper boundary: €499

4. **Class 4: €501 to €1000 (20% discount)**
   - Lower boundary: €501
   - Just above the lower boundary: €502
   - Upper boundary: €1000
   - Just below the upper boundary: €999

5. **Class 5: Less than €1 (Invalid Input)**
   - Just below the lower boundary: €0
   - Negative value: -€1

6. **Class 6: Greater than €1000 (Invalid Input)**
   - Just above the upper boundary: €1001

7. **Class 7: Non-integer values (Invalid Input)**
   - String input: "abc"
   - Special character input: "@#$"

**Equivalence Classes:**  

| Equiv classes | Criteria           | Valid/Invalid |
|---------------|--------------------|---------------|
| E1            | €1 to €10          | Valid         |
| E2            | €11 to €300        | Valid         |
| E3            | €301 to €500       | Valid         |
| E4            | €501 to €1000      | Valid         |
| E5            | Less than €1       | Invalid       |
| E6            | Greater than €1000 | Invalid       |
| E7            | Non-integer values | Invalid       |

**Black Box Test Cases:**  

| Test case |   Input | Output        | Equivalence class covered |
|-----------|--------:|---------------|---------------------------|
| TC1       |      €1 | No discount   | E1                        |
| TC2       |      €2 | No discount   | E1                        |
| TC3       |     €10 | No discount   | E1                        |
| TC4       |      €9 | No discount   | E1                        |
| TC5       |     €11 | 10% discount  | E2                        |
| TC6       |     €12 | 10% discount  | E2                        |
| TC7       |    €300 | 10% discount  | E2                        |
| TC8       |    €299 | 10% discount  | E2                        |
| TC9       |    €301 | 15% discount  | E3                        |
| TC10      |    €302 | 15% discount  | E3                        |
| TC11      |    €500 | 15% discount  | E3                        |
| TC12      |    €499 | 15% discount  | E3                        |
| TC13      |    €501 | 20% discount  | E4                        |
| TC14      |    €502 | 20% discount  | E4                        |
| TC15      |   €1000 | 20% discount  | E4                        |
| TC16      |    €999 | 20% discount  | E4                        |
| TC17      |      €0 | Invalid Input | E5                        |
| TC18      |     -€1 | Invalid Input | E5                        |
| TC19      |   €1001 | Invalid Input | E6                        |
| TC20      |   "abc" | Invalid Input | E7                        |
| TC21      |   "@#$" | Invalid Input | E7                        |
| TC22      |    €1.5 | No discount?  | E1                        |
| TC23      |  €1.525 | No discount?  | E1                        |
| TC24      | €500.50 | 20% discount? | E4                        |

By focusing on these boundary values and equivalence classes, we can ensure that the application correctly handles the edge cases, thereby improving the reliability and robustness of the software.
