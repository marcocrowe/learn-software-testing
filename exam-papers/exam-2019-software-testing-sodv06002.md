
# Software Testing - Exam Paper - 2022 - Summer

**Instructions**:  Answer any 3 questions. All questions carry equal

The use of programmable or text storing calculators is expressly forbidden.

Please note that where a candidate answers more than the required number of questions, the examiner will mark all questions attempted and then select the highest scoring ones.  

## Question 1 (Total 33 Marks)

### Question 1 Part 1 (11 Marks)

The goal of software testing refers to an acceptable level of confidence and to correct system behaviour, explain what both acceptable level of confidence and correct system behaviour mean in this context.

### Question 1 Part 2 [11 Marks]

Explain both the static and dynamic approaches to software testing.  

### Question 1 Part 3 [11 Marks]

Explain system testing. What is the big bang approach to software testing and why do you think some developers actually use this approach.  

## Question 2 (Total 33 Marks)

### Question 2 Part 1 (7 Marks)

Do you agree that professional software developers should test their software so that they achieve complete coverage? Explain your answer.

### Question 2 Part 2 (10 Marks)

Develop a control-flow graph for the code shown in Figure 1 below and determine the complexity. Suppose software testing has been employed so that TER1 = 1 and TER2 = 0.6, would you recommend further testing? Explain your answer.

### Question 2 Part 3 (8 Marks)

Develop the branch table for the code shown in Figure 1.

### Question 2 Part 4 (8 Marks)

Develop the block table for the code shown in Figure 1.

```java
public void walkFirstRowOfGridEatingPies(Grid grid)
{
    initialize();
    for (int i = 0; i < grid.getNumberOfRows(); i++)
    {
        if (grid.isPieInSight(this) == true)
        {
            eatPie(grid);
        }
        else
        {
            walk(grid);
        }
    }
    for(int j =1; j < 2; j++)
    {
        turn("Right");
    }
    walk(grid);
}
```

> Figure 1

## Question 3 (Total 33 Marks)

An HoursWorkedProcessor component has a method called processHoursWorked which contains business logic about processing of hours worked. The code for the processHoursWorked is shown in Figure 2.

```java
package io.github.username.exam.code;
import java.util.Calendar;

public class HoursWorkedProcessor {

    public HoursWorkedProcessor() {}// default constructor

    public Boolean processHoursWorked(String workedHoursFile) {
        //First piece of business logic is to check the workedHoursFile has a valid extension.
        if (workedHoursFile.endsWith(".data"))
        {
            //Next piece of business logic is to check that it is a working day. i.e. Mon to Fri inclusive.
            Calendar cal = Calendar.getInstance();
            if (!(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY))
            {
                readTheWorkedHoursFileAndProcessHoursWorked();
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false; // workedHoursFile extension is invalid
        }
    }
    public void readTheWorkedHoursFileAndProcessHoursWorked() {
        /* 
         * This code is under construction  and is not currently needed
         * to unit test the business logic in the processOvertimeHours method
        */
    }
}
```

> Figure 2

### Question 3 Part 1 (8 Marks)

Explain what a stub is. What are seams in code?

### Question 3 Part 2 (12 Marks)

**Question 3(b)  [12 Marks]** Refactor the HoursWorkedProcessor to make it testable by introducing a layer of indirection to avoid the dependency i.e. write code or pseudocode. You refactoring should include adding an interface which will allow use of a configurable stub in the unit tests.

### Question 3 Part 3 (13 Marks)

 Write code or pseudocode for three unit tests to test the business logic in the processHoursWorked method. Write code or pseudocode for a configurable stub to be used by your tests utilising constructor injection.

## Question 4 (Total 33 Marks)

### Question 4 Part 1 (4 Marks)

What is the purpose of Black box testing?

### Question 4 Part 2 (10 Marks)

Briefly explain the following terms and give an example for each.

1. Equivalence Partitioning.
2. Boundary Value Analysis.

### Question 4 Part 3 (19 Marks)

Consider a software module that is intended to accept the name of a grocery item and a list of the different sizes the item comes in, specified in ounces. The specifications state that the item name is to be alphabetic characters 2 to 15 characters in length. Each size may be a value in the range of 1 to 48, whole numbers only. The sizes are to be entered in ascending order (smaller sizes first). A maximum of five sizes may be entered for each item. The item name is to be entered first, followed by a comma, then followed by a list of sizes. A comma will be used to separate each size. Spaces (blanks) are to be ignored anywhere in the input.

For the module described above:

1. Derive the Equivalence Classes.
2. List the Black Box Test Cases based on the Equivalence Classes.

## Paper College Details

College: Limerick Institute of Technology  
Module Title: Software Testing  
Module Code: SODV06002  
Year of Study: 2  
Year: 2019 - Summer  

### Programmes

| Code           | Programme                                                  |
|----------------|------------------------------------------------------------|
| LC\_KSFDM\_KMY | Bsc. (Honours) Software Development                        |
| LC\_KSFDM\_ITH | Higher Certificate in Science Software Development         |
| LC\_KISYM\_KMY | Bsc. (Honours) Internet Systems Development                |
| LC\_KISYM\_JMY | Bsc. Internet Systems Development                          |
| LC\_KIDMM\_KMY | Bsc. (Honours) Interactive Digital Media                   |
| LC\_KGDVM\_KTH | Bsc. (Honours) Games Design and Development                |
| LC\_KGDVM\_ITH | Higher Certificate in Science Games Design and Development |
| LC\_KCPTM\_JTH | Bsc. Computing                                             |

### Examiners

| Examiner                 |          |
|--------------------------|----------|
| Desmond O Carroll        | Internal |
| William Ward             | Internal |
| Brendan Watson           | Internal |
| Tom Davis                | Internal |
| Mr. Andrew Shields       | External |
| Dr. Bianca Schoen-Phelan | External |
| Dr. Markus Hofmann       | External |
