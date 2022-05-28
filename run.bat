set projectLocation="R:\Eclipse_Workspace\Testing_Assignment
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
