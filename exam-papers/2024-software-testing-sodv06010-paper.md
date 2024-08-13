
# Software Testing - SODV06010 - Exam Paper - 2024 - Summer

**Time Allowed**: 2 hours

**Instructions**:  Answer any 3 questions. All questions carry equal marks and marks will be scaled to 100.

The use of programmable or text storing calculators is expressly forbidden.

Please note that where a candidate answers more than the required number of questions, the examiner will mark all questions attempted and then select the highest scoring ones.

There are no additional requirements for this paper.

## Question 1 [Total 33 Marks]

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

#### Question 2.A.2

Suppose software testing has been employed so that TER1 = 0.95, would you recommend further testing and explain your answer.

### Question 2.B (11 Marks)

Develop the branch table for the code shown in Figure 1.

### Question 2.C (11 Marks)

Develop the block table for the code shown in Figure 1.

## Question 3 - (Stubs) - [Total 33 Marks]

A `QuotationLoader` component has a method called `loadQuotations` which contains business logic about processing of quotation data. The code for `loadQuotations` is
shown in `Figure 2` below

```java
package io.github.username.exam.code;
import java.util.Calendar;

public class QuotationLoader {

    public QuotationLoader() {}// Default constructor

    public Boolean loadQuotations(String dataFile) {
        //First piece of business logic is to check the datafile has a valid extension.
        if (dataFile.endsWith(".data"))
        {
            // Next piece of business logic is to check that it is a Monday as this is
            // the only day the quotations should be loaded.
            Calendar cal = Calendar.getInstance();
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY))
            {
                readTheDataFileAndLoadTheQuotations();
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public void readTheDataFileAndLoadTheQuotations() {
        // This code is under construction and is not currently needed
        // to unit test the business logic in the loadQuotations method.
        /* ... */
    }
    /* ... */
}
```

**Figure 2**  

## Question 3.A (12 Marks)

Refactor the QuotationLoader to make it testable by introducing a layer of indirection to avoid the dependency i.e. write code or pseudocode. Your refactoring should include adding an interface which will allow use of a configurable stub in the unit tests.

## Question 3.B (13 Marks)

Write code or pseudocode for three unit tests to test the business logic in the loadQuotations method. Write code or pseudocode for a configurable stub to be used by your tests utilising constructor injection.

## Question 3.C (8 Marks)

Explain what is meant in unit testing by saying that you configured the fake to make happy noises for the test.

## Question 4 [Total 33 Marks]

### Question 4.A (10 Marks)

Explain why consideration of Boundary Value Analysis is useful when determining tests cases for the Equivalence Classes/Partitions you identify. Use a simple example to illustrate your answer.

### Question 4.B (23 Marks)

A shopping website offers different discounts depending upon each transaction made by the customer. The user enters the integer value of the purchase amount in Euro, then presses the Enter button. For example if a purchase amount is in the range €1 to €10 then no discount is displayed, a purchase over €10 and up to €300 have 10% discount calculated and displayed. Purchase amounts between €301 and up to €500 have 15% discount calculated and displayed, and purchases over €500 have a 20% discount calculated and displayed. The maximum purchase amount that can be entered is €1000 and the minimum amount is €1 and invalid input of any kind results in the warning message Invalid Input.

Derive the equivalence classes and determine black box test cases based on these and utilise boundary value analysis.

## Paper College Details

College: Technological University of the Shannon: Midlands Midwest  
Module Title: Software Testing  
Module Code: SODV06010  
Year of Study: 2  
Year: 2024 - Summer  
Code on Paper: 7cde5a5e  
Timestamp: 2024-05-23 14:00
Filename: 2024-software-testing-sodv06010-paper.md

### Programmes

| Code         | Programme                                   |
|--------------|---------------------------------------------|
| LC_KMWCM_KMY | Bsc. (Honours) Mobile and Web Computing     |
| LC_KSOFM_KMY | Bsc. (Honours) Software Development         |
| LC_KCPTM_JMY | Bsc. Computing                              |
| LC_KMWCM_JMY | Bsc. Mobile and Web Computing               |
| LC_KISYM_JMY | Bsc. Internet Systems Development           |
| LC_KISYM_KMY | Bsc. (Honours) Internet Systems Development |

### Examiners

| Examiner           |          |
|--------------------|----------|
| Mr. Brendan Watson | Internal |
| Mr. Andrew Shields | External |
