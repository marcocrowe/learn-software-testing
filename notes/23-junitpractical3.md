Part A 

There is a problem testing the CompareArrays method, as it calls the Equal method. Self-delegation is where a method in a class calls another method in the same class. It’s not specifically self-delegation that is the problem for unit testing; it’s that a method calls another method. Test this out using the debug facility. Open EasyMaths.java in Netbeans and set a breakpoint in first line of code in CompareArrays. Then open EasyMathsTest and click in the test method you wrote named something like compareArrays\_ArraysHave0Match\_You\_have\_0\_Matching\_nos and right click in the code and click debug focussed test method. Step through the code in debug, you will see that it calls Equal method. 

We want to unit test each method. This means testing just that method (alone). But the tests for CompareArrays such as compareArrays\_ArraysHave0Match\_You\_have\_0\_Matching\_nos listed below causes a call to the Equal method. If we get a fail in a test like this it might be a problem with the code in CompareArrays or it might be a problem with the code in Equal. So a test like compareArrays\_ArraysHave0Match\_You\_have\_0\_Matching\_nos is not a unit test at all. It’s an integration test i.e. we are testing two methods together. The CompareArrays method depends on the Equal method. This is fine as long as we comprehensively tested both units separately first – and we have not done this. We need to figure out a way to test CompareArrays in isolation of the Equal method!!. There is no problem with one production method calling another production method. This is really common and necessary in many situations.  But we need a good strategy to test each method in isolation of any dependencies it may have. 







A good plan to test CompareArrays in isolation of the Equal method is a follows:

Create a subclass of EasyMaths called TestableEasyMaths and override the Equal method to be a fake. The fake just returns ‘happy noises’ (or whatever we specify for it to return). We then instantiate TestableEasyMaths in our test code and test that and as a result have tested EasyMaths.

Add a new class in your production code package called TestableEasyMaths

TestableEasyMaths

import Sample.EasyMaths;

/\*\*

` `\*

` `\* @author Brendan

` `\*/

`  `class TestableEasyMaths extends EasyMaths

{ // I am going to test EasyMaths by testing TestableEasyMaths

`   `private boolean result; 

`   `public boolean equal(int[] array1, int[] array2) // we will override the equal method.

`   `{    /\* This is a fake equal method, as I don't want to call the real equal method. 

`         `The compareArrays method calls the equal method. Its common for one method to call another.  But I only want to test 1 unit (method) at a time. Testing a method calling another method would be  an integration test, not a unit test. 

` `The idea with unit testing is to test each little component and make sure it is ok.  

\*/

`        `System.out.println("running fake equal method");

`        `return result;    

`     `}

`   `public void setResult( boolean theResult){

`    `result=theResult;  // This is configurable. I will configure it from the test code to make 'happy sounds'.

`    `}



}

Add the following test to EasyMathsTest

`    `@Test

`    `public void compareArrays\_FakeEqualArraysHave0Match\_You\_have\_0\_Matching\_nos() {

`        `System.out.println("compareArrays");

`        `int[] array1 = new int[] { 4, 42};

`        `int[] array2 = new int[] { 40, 43};

`        `TestableEasyMaths myFakeEasyMathsObj = new TestableEasyMaths();

`        `myFakeEasyMathsObj.setResult(false); // Goin to make the fake Equal method returns false ie 

// just get it to make happy noises for the test

`        `assertEquals("You have 0 matching numbers.", myFakeEasyMathsObj.compareArrays(array1, array2)); 

`    `}   

Run it in debug to satisfy yourself that the production  Equal method is not called at all. We have removed the dependency that CompareArrays has on the Equal method by overriding SimpleMaths class and overriding the Equal method. We then run our tests against the subclass i.e. TestableEasyMaths. 



Part B

Add a new method to the EasyMaths class called Multiply which takes 2 integers as parameters and returns an integer. The code should multiply the two integers passed to it and return the answer. 

Then modify scalarMultiplication so that it calls the Multiply method when it needs to multiply two integers. So now the scalarMultiplication method depends on the Multiply method. The tests we had for scalarMultiplication are now integration tests as they test two methods working together so rename them with the word integration in the title as part of the state. 

Create a subclass of scalarMultiplication called TestableScalarMultiplication and create suitable unit tests for it. 

