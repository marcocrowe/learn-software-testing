
# Software Testing - Exam Paper - 2021 - Summer

**Instructions**:  Answer any 3 questions. All questions carry equal marks and marks will be scaled to 100.

**Upload a Word file containing your answers to the  questions.**

## Question 1 (Total 33 Marks)

### Question 1 Part 1 (11 Marks)

Explain in your own words both software testing and software debugging using the following four headings: Objective, Output, Knowledge of Design, Responsibility (who’s job).

### Question 1 Part 2 (11 Marks)

Many of the unit testing practical/computer lab sessions in this module included both the static and dynamic approaches to software testing. Do you think this was useful, explain your answer in your own words.

### Question 1 Part 3 (11 Marks)

Explain in your own words your understanding of Regression testing. What kind of tests would you expect to find in a regression test suite?

## Question 2 (Total 33 Marks)

```java
/* ... */
Grid theGrid = new Grid(12, 12,"MyGrid");
Pie aPie = new Pie(1, 9,"Pie 1");
PieEater aPieEater = new PieEater(3, 3, "PieEater A", "East");
aPieEater.initialise();
for(int i = 1; i <= 12; i++)
{
  if(theGrid.pieInSight(aPieEater) == true)
  {
    aPieEater.eatPie(theGrid);
  }
  else
  {
    aPieEater.walk(theGrid);
  }
}
if(aPieEater.getPieCount() == 1)
{
  aPieEater.spinAndEatPie(theGrid);
}
else
{
  aPieEater.initialise();
}
aPieEater.reportStatus();
/* ... */
```

> Figure 1

### Question 2 Part 1 (7 Marks)

Explain the following Test Effectives Ratios: TER1, TER2. Explain in your own words how determining the value for the complexity metric for a method can help you to achieve complete coverage.  

### Question 2 Part 2 (10 Marks)

Develop the branch table for the code shown in Figure 1. Suppose software testing has been employed so that TER1 = 1 and TER2 = 0.8, would you recommend further testing? Explain your answer in your own words.

### Question 2 Part 3 (6 Marks)

Develop the block table for the code snippet shown in Figure 1.

### Question 2 Part 4 (10 Marks)

Explain in your own words why you think it is useful to develop a block table.

## Question 3 (Total 33 Marks)

A MonthlyStockProcessor component has a method called processStock which contains business logic about processing of monthly stock. The code for the processStock is shown in *Figure 2*.

```java
package io.github.username.stock.system;

import java.util.Calendar;

public class MonthlyStockProcessor
{
  public MonthlyStockProcessor() { }// default constructor

  public Boolean processStock(String dataFile)
  {
    // First piece of business logic is to check that the dataFile has a valid extension.
    if(!dataFile.endsWith(".dat")) {
      return false; //dataFile extension is invalid
    }
    // Next piece of business logic is to check that it's last day of the month
    Calendar cal = Calendar.getInstance();  
    int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    // maxDay stores the number of days in the current month.
    if(cal.get(Calendar.DAY_OF_MONTH) == maxDay) {
      readTheDataFileAndProcessStock();  
      return true;
    }
    else {
      return false;
    }
  }
  public void readTheDataFileAndProcessStock()
  {
    /*
     * This code is under construction and is not currently needed
     * to unit test the business logic in the processStock method.
     */
  }
}
```

> Figure 2

### Question 3 Part 1 (9 Marks)

Refactor the MonthlyStockProcessor to make it testable by introducing a layer of indirection to avoid the dependency i.e. write code or pseudocode. You refactoring should include adding an interface which will allow use of a configurable stub in the unit tests.

### Question 3 Part 2 (9 Marks)

Write code or pseudocode for three unit tests to test the business logic in the processStock method. Write code or pseudocode for a configurable stub to be used by your tests utilising constructor injection.  

### Question 3 Part 3 (15 Marks)

Explain in your own words how you achieved unit test of the code in Figure 2.  

## Question 4 (Total 33 Marks)

### Question 4 Part 1 (3 Marks)

What is the purpose of Black box testing?

### Question 4 Part 2 (8 Marks)

Explain with the use of a simple example why it is necessary to use both functional and structural testing methods when developing software.

### Question 4 Part 3 (8 Marks)

Explain the relationship between Equivalence Classes/Partitions and Boundary Value Analysis. Use a simple example to illustrate your answer.

### Question 4 Part 4 (Total 14 Marks)

A shopping website offers different discounts depending upon each transaction made by the customer. For example if a purchase is in the range €1 to €50 then there is no discount, a purchase over €50 and up to €200 has 5% discount. Purchases between €201 and up to €500 have a 10% discount, and purchases over €501 have a 15% discount.  

1. Identify all relevant equivalence classes. **(4 marks)**
2. Using Boundary Value Analysis identify the boundary values for each Equivalence Class. **(4 marks)**
3. List the Black Box Test Cases using the Equivalence Classes and Boundary Values. **(6 marks)**

## Paper College Details

College: Limerick Institute of Technology  
Module Title: Software Testing  
Module Code: SODV06002  
Year of Study: 2  
Year: 2021 - Summer  

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
| Brendan Watson           | Internal |
| Tom Davis                | Internal |
| Mr. Andrew Shields       | External |
| Dr. Bianca Schoen-Phelan | External |
| Dr. Markus Hofmann       | External |
