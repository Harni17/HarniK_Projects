# Perform Testing On Your Application With TestNG
 *TestNG* complete separate `Frame Work` from Selenium. 

 > 
## Advantages of using *TestNG*:

- Reports Proper
- Parellel Test
- Writing test suit /group
- Test Parameter

# Configuration Annotation

> `@BeforeSuite` :  Runs before suite execution start

> `@AfterSuite` : Runs after all tests are executed

> `@BeforeTest`: Runs before first test in a <test> tag is executed

> `@AfterTest`: Runs after all the tests in a <test> tag are executed

> `@BeforeGroups`: Runs before first test method of the group(s) is executed

> `@AfterGroups` : Runs after all the test methods of the group(s) are executed

> `@BeforeClass`: Runs before first test in a class is executed

> `@AfterClass`: Runs after all the tests in a class are executed

> `@BeforeMethod`: Runs before each test in a class is executed

>`@AfterMethod`: Runs after each test is executed

```
<Suite Name>
 <test name="">
  <classes>
    <methods>

    </methods>
 </classes>
 </test>
</Suite>
```
# Set Up For TestNG

>Step-1: Create a new `maven Project` 

```
File -> New -> `Maven Project`
> Choose Archetype: `maven-archetype-quickstart `
> Group Id: com.ecom.webapp
> Artifact ID: `phase-5-selenium-testng-05-08-2021`
```
> Step-2: Add a `TestNg PlugIn`. [As `jUnit PlugIn` is already added] 
```
Go to `Help` Section and then `Eclipse Market Place` -> Search `TestNG PlugIn: TestNG for Eclipse` and click on it -> Go all default setup . accept the agreement. Then `Restart Your Eclipse Editor`
```
> Step-3: Open `pom.xml`

> Step-4: Search for `testng maven dependency` in google search.
> Download `TestNG >>7.3.0`

> Add it.

```
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.3.0</version>
    <scope>test</scope>
</dependency>


```

> Remove the `jUnit ` related dependency. 

> Then add, <!--slenium java--> 

```
 <!-- selenium-java -->
   <dependency>
   <groupId>org.seleniumhq.selenium</groupId>
   <artifactId>selenium-java</artifactId>
   <version>3.141.59 </version>
   </dependency>
  </dependencies>

```

>Step - 5: Create a new `class`: `TestNgStandardAnnotationsTest`  or you can create direct `testNg class` by *Right Clicking* on the package name of `src/test/java`  folder -> Other -> choose -> testNg Class ` and after clicking it do check, the right destination path is selected. so as so , configuration annotation. 

>Step-6: Update the project By : `Right Click on Project Name -> Maven -> Update Project`

>Step-7:  Start Writing Code Inside Class. Set up activity is same. We need `Web driver`. Set `siteURL` as `jUnit`.

> Step-8 : You do execute it as `TestNG` 


## ToDo :: [4: 36 :00] Write A Test For TestNG based on previously  junit Test cases into TestNG test. 


