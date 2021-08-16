# Pet API Automation Test BDD framework
API Automation Test is RestAssured based Cucumber-Java-maven framework to perform API testing. Data driven using cucumber.
The IDE used is Intellij 

# Getting Started

1. Ensure Project is Copied locally and all the dependencies are build in place(enable auto import in IntelliJ).
2. Navigate to Plugins in IntelliJ and ensure Gherkin is installed/Added.
3. Navigate to feature file and add/update the data accordingly, or can use default data.
4. Ensure environment variables are updated with the latest        	JDK.


# Run project and Generate Report
1.  Navigate to 'TestRunner.java' file right click. 
	Then Run 'TestRunner' or 
   got to 'Run' menu and select  Run 'TestRunner' 
2.  Reports generated in the report folder
3.  Rest logs will be displayed in console

# Reports used
	Cucumber json Report`
	Cucumber HTML Report`

# Project Structure

src
  + test
    + java              Test runners and code
    	+ features		   Feature files
      	+ reports	   json and html reports
	+ stepDefinition   code
    	+ restRunner        runner file

