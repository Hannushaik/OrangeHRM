Feature:OrangeHRM Application Functionalities Test
Background:
#Given User should open ChromeBrowser in the system
Scenario: OrangeHRM Application LogIn Page Test

When User enters OrangeHrm application Urladdress
Then User should be navigated to OrangeHRM Application LogIn Page
Then User should be close the OrangeHRM Applicatio with the Browser	



#tag
@Smoke
Scenario:OrangeHRM Application LogIn Functionality Test
#Given User should open ChromeBrowser in the system
When User enters OrangeHrm application Url address
Then User should be navigated to OrangeHRM Application LogIn Page
Then User should enter UserName and Password and click on logIn button
Then User sshould be able to navigate to OrangeHRM Application Homepage
Then User should logOut the OrangeHRM Application
#Then User should be close the OrangeHRM Applicatio with the Browser




#tag
@Smile
Scenario Outline:OrangeHRM Application LogIn Functionality Test
#Given User should open ChromeBrowser in the system
When User enters OrangeHrm application Url address
Then User should be navigated to OrangeHRM Application LogIn Page
Then User should enter"<UserName>"and"<Password>" and click on logIn button
Then User sshould be able to navigate to OrangeHRM Application Homepage
Then User should enter PIM HomePage
Then User should go to Add Employee Homepage
#Then User should logOut the OrangeHRM Application
Then User should go First name of Add Emolpyee Homepage
Then User shoulde enter middle name of AddEmployee Homepage
Then User should enter Last name of AddEmploye Homepage
Then User should be close the OrangeHRM Applicatio with the Browser


Examples:
|   UserName  | Password    |

|Hannusk      |Hannu012001@ |

#|kjchj        |lewlef       |

#|Hannusk      |Hannu012001@ |





