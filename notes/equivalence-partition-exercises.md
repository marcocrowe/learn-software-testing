
# Functional Testing

- Functional testing is software testing where the system is tested against the functional requirements/specifications.
- The purpose of functional testing is to assure that the software fulfils the requirements of the stakeholders.
- Functions (or features) are tested by providing them input and examining the output.
  - Eg Add User

- To undertake functional testing you need very good knowledge of what the s/w does and also knowledge on what constitutes valid and invalid
input and output.
- Because of the vast amount of possible input data approaches are needed to manage this.
- Functional testing describes what the system does, as opposed to what the system should do.

## Equivalence partitioning

- In general when executing software, some input is taken, some processing carried out and some output is produced.
- Equivalence partitioning consists of analysing the input into sensible test cases which we can execute.
  - Tackles the problem of the vast amount of possible input which could be supplied to the s/w.
- This involved dividing the input values into equivalent groups
- Segregate the input domain into equivalence partitions that don't overlap, then produce test cases based on these.
- The idea is that any one sample of the equivalence class is representative of the entire class.

## Equivalence partitioning, Part 2

### Example 1

- A quantity field on a form accepts entry of a whole number between 1 and 100. Derive the equivalence classes and determine black box test cases based on these.
- Input conditions: 1 <= input <= 100; input is a whole number; ie 2 input conditions
- Output condition; accepted i.e. 1 output condition

**Equivalence classes:**

*Note: `test-name` is for reference only. It is not part of Equivalence Classes table answer.*

| Equiv classes | `test-name`           | Criteria                            | Valid/Invalid |
|---------------|-----------------------|-------------------------------------|---------------|
| E1            | `isInt`               | `quantityInput is int quantity`     | Valid         |
| *E2*          | `!isInt`              | `quantityInput is not int quantity` | Invalid       |
| E3            | `isInRange`           | `quantity >= 1 && quantity <= 100`  | Valid         |
| *E4*          | `isOutsideLowerBound` | `quantity < 1`                      | Invalid       |
| *E5*          | `isOutsideUpperBound` | `quantity > 100`                    | Invalid       |

**Black box test cases:**  

*Note: `test-name` is for reference only. It is not part of Black Box Test Cases table answer.*

| Test case | Input | Output        | `test-name`                      | Equivalence class covered |
|-----------|-------|---------------|----------------------------------|---------------------------|
| TC1       | 5     | Accepted      | `isInt` && `isInRange`           | E1 && E3                  |
| TC2       | 5.5   | Invalid Input | `!isInt`                         | *E2*                      |
| TC3       | 0     | Invalid Input | `isInt` && `isOutsideLowerBound` | E1 && *E4*                |
| TC4       | 102   | Invalid Input | `isInt` && `isOutsideUpperBound` | E1 && *E5*                |

**To Do:**  

1. Complete Example 2 below ie only 4 equivalence classes identified, identify the others and determine the black box test cases.
2. Complete Example 3

Example 2:  

- A program takes as input a date in the format day, month, year and based on input, outputs the previous day's date or outputs Invalid Date!
- Derive the equivalence classes and determine black box test cases based on these. Assume a default start year of 1900 and end year of 2025

For the purpose of this simple example all months have 31 days.

Answer:

- Input conditions: `1 <= day <= 31`; `1 <= month <= 12`; `1900 <= year <= 2025`;
- day, month, year all whole numbers; ie 4 input conditions
- Output conditions: outputs previous date; Invalid date ie 2 output conditions

**Equivalence classes:**

| Equiv classes | `cover` | `test-name`                | `test-dependance`                  | Criteria                                          | Valid/Invalid |
|---------------|---------|:---------------------------|------------------------------------|---------------------------------------------------|--------------:|
| E1            | x       | `isDayInt`                 |                                    | `dayInput is int day`                             |         Valid |
| *E2*          | x       | `!isDayInt`                |                                    | `dayInput is not int day`                         |       Invalid |
| E3            | x       | `isDayInRange`             | $E3\implies E1$                    | `day >= 1 && day <= 31`                           |         Valid |
| *E4*          | x       | `isDayOutsideLowerBound`   | $E4\implies E1$                    | `day < 1`                                         |       Invalid |
| *E5*          | x       | `isDayOutsideUpperBound`   | $E5\implies E1$                    | `day > 31`                                        |       Invalid |
| E6            | x       | `isMonthInt`               |                                    | `monthInput is int month`                         |         Valid |
| *E7*          | x       | `!isMonthInt`              |                                    | `monthInput is not int month`                     |       Invalid |
| E8            | x       | `isMonthInRange`           | $E8\implies E6$                    | `month >= 1 && month <= 12`                       |         Valid |
| *E9*          | x       | `isMonthOutsideLowerBound` | $E9\implies E6$                    | `month < 1`                                       |       Invalid |
| *E10*         | x       | `isMonthOutsideUpperBound` | $E10\implies E6$                   | `month > 12`                                      |       Invalid |
| E11           | x       | `isYearInt`                |                                    | `yearInput is int year`                           |         Valid |
| *E12*         | x       | `!isYearInt`               |                                    | `yearInput is not int year`                       |       Invalid |
| E13           | x       | `isYearInRange`            | $E13\implies E11$                  | `year >= 1900 && year <= 2025`                    |         Valid |
| *E14*         | x       | `isYearOutsideLowerBound`  | $E14\implies E11$                  | `year < 1900`                                     |       Invalid |
| *E15*         | x       | `isYearOutsideUpperBound`  | $E15\implies E11$                  | `year > 2025`                                     |       Invalid |
| E16           | x       | `isDateValid`              | $E16 \implies E3 \And E8 \And E13$ | `isDayInRange && isMonthInRange && isYearInRange` |         Valid |
| *E17*         |         | `!isDayInRange`            |                                    | `!isDayInRange`                                   |       Invalid |
| *E18*         |         | `!isMonthInRange`          |                                    | `!isMonthInRange`                                 |       Invalid |
| *E19*         |         | `!isYearInRange`           |                                    | `!isYearInRange`                                  |       Invalid |

Note: Why not E99 `year < 1900 || year > 2025` is `Invalid`? Because the two conditions are mutually exclusive. If one is true, the other is false. Therefore, when passing in an input for the test, not all branches will be covered.  Therefore, it is better to have two separate equivalence classes for complete TER2 (Branch Coverage).

**Black Box Test Cases based on the Equivalence Classes:**

*Note: `test-name` is for reference only. It is not part of Black Box Test Cases table answer.*

| Test Case | Input         | Expected Output | `test-name`                | Equivalence class covered                                       |
|-----------|---------------|-----------------|----------------------------|-----------------------------------------------------------------|
| TC1       | "1,1,1900"    | 31,12,1899      | `isDateValid`              | $E16 \implies E3 \And E8 \And E13 \implies E1 \And E6 \And E11$ |
| TC2       | "One,1,1899"  | Invalid day     | `!isDayInt`                | $E2$                                                            |
| TC3       | "1,Jan,1899"  | Invalid month   | `!isMonthInt`              | $E7$                                                            |
| TC4       | "1,1,YearOne" | Invalid year    | `!isYearInt`               | $E12$                                                           |
| TC5       | "0,1,1900"    | Invalid day     | `isDayOutsideLowerBound`   | $E17 \implies E4$                                               |
| TC6       | "32,1,1900"   | Invalid day     | `isDayOutsideUpperBound`   | $E17 \implies E5$                                               |
| TC7       | "1,0,1900"    | Invalid month   | `isMonthOutsideLowerBound` | $E18 \implies E9$                                               |
| TC8       | "1,13,1900"   | Invalid month   | `isMonthOutsideUpperBound` | $E18 \implies E10$                                              |
| TC9       | "1,1,1899"    | Invalid year    | `isYearOutsideLowerBound`  | $E19 \implies E14$                                              |
| TC10      | "1,1,2026"    | Invalid year    | `isYearOutsideUpperBound`  | $E19 \implies E15$                                              |


#### 2. Black Box Test Cases based on the Equivalence Classes

*Note: `test-name` is for reference only. It is not part of Black Box Test Cases table answer.*

| Test Case | Input                      | Expected Output | test-name                                                                                                          | Equivalence class covered                                                     |
|-----------|----------------------------|-----------------|--------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| TC1       | "Apple,1,2,3"              | Valid input     | isInputValid                                                                                                       | E01, E03, E05, E07, E09, E11 **(E13)**                                        |
| TC2       | "A,1,2"                    | Invalid input   | isNameValid, `isNameLengthInValid`, isSizeListValid, isSizeListOrderAsc, isEachSizeWholeNumber, isEachSizeInRange  | E01, `E04`, E05, E07, E09, E11                                                |
| TC3       | "VeryLongItemNameHere,1,2" | Invalid input   | isNameValid, `isNameLengthInValid`, isSizeListValid, isSizeListOrderAsc, isEachSizeWholeNumber, isEachSizeInRange  | E01, `E04`, E05, E07, E09, E11                                                |
| TC4       | "Apple123,1,2"             | Invalid input   | `isNameInvalid` isNameLengthValid, isSizeListValid, isSizeListOrderAsc, isEachSizeWholeNumber, isEachSizeInRange   | `E02`, E03, E06, E09, E11, E13                                                |
| TC5       | "Apple,0,2,3"              | Invalid input   | isNameValid, isNameLengthValid, isSizeListValid, isSizeListOrderAsc, isEachSizeWholeNumber, `isEachSizeNotInRange` | E01, E03, E05, E07, E09, `E12`                                                |
| TC6       | "Apple,1,2,49"             | Invalid input   | isNameValid, isNameLengthValid, isSizeListValid, isSizeListOrderAsc, isEachSizeWholeNumber, `isEachSizeNotInRange` | E01, E03, E05, E07, E09, `E12`                                                |
| TC7       | "Apple,1.5,2,3"            | Invalid input   | isNameValid, isNameLengthValid, isSizeListValid, isSizeListOrderAsc, `isEachSizeNotWholeNumber`, isEachSizeInRange | E01, E03, E05, E07, `E10`, E11                                                |
| TC8       | "Apple,3,2,1"              | Invalid input   | isNameValid, isNameLengthValid, isSizeListValid, `isNotSizeListOrderAsc`, isEachSizeWholeNumber, isEachSizeInRange | E01, E03, E05, `E08`, E09, E11                                                |
| TC9       | "Apple,1,2,3,4,5,6"        | Invalid input   | isNameValid, isNameLengthValid, `isSizeListInValid`, isSizeListOrderAsc, isEachSizeWholeNumber, isEachSizeInRange  | E01, E03, `E06`, E07, E09, E11                                                |
| TC10      | "Apple, 1 , 2 , 3 "        | Valid input     | isInputValid                                                                                                       | E01, E03, E05, E07, E09, E11 **(E13)**  *(Valid input with spaces)*           |
| TC11      | "Banana,10,20,30,40,48"    | Valid input     | isInputValid                                                                                                       | E01, E03, E05, E07, E09, E11 **(E13)**                                        |
| TC12      | "Banana,10,20,30,40,50"    | Invalid input   | isNameValid, isNameLengthValid, isSizeListValid, isSizeListOrderAsc, isEachSizeWholeNumber, `isEachSizeNotInRange` | E01, E03, E05, E07, E09, `E12`                                                |
| TC13      | "Banana,10,20,30,40,40"    | Valid input     | isInputValid                                                                                                       | E01, E03, E05, E07, E09, E11 **(E13)** *(Duplicate sizes in ascending order)* |
| TC14      | "Banana,10,20,30,40,39"    | Invalid input   | isNameValid, isNameLengthValid, isSizeListValid, `isNotSizeListOrderAsc`, isEachSizeWholeNumber, isEachSizeInRange | E01, E03, E05, `E08`, E09, E11                                                |
| TC15      | "Banana,10,20,30,40,41"    | Valid input     | isInputValid                                                                                                       | E01, E03, E05, E07, E09, E11 **(E13)**                                        |


**Example 3**  

 -A mileage rate calculator takes as input engine capacity in CC (cubic centimeters) from 1000 to
3000 and the distance travelled in KM (Kilometers) from 1 to 1000. Based on the information entered, it
outputs the mileage rate based on the following outline pseudocode:

```python
if (cubicCentimeters in the range 1000 to 2000) and (mileage <500):
    print("mileage rate of 50 cent per KM")
elif (cubicCentimeters in the range 2001 to 3000) and (mileage <500):
    print("mileage rate of 60 cent per KM")
else:
    print("mileage rate of 45 cent per KM")
```

Derive the equivalence classes and determine black box
test cases based on these. Engine capacity and distance are
whole numbers
