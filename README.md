# Password Validator
In order to avoid hackers compromising member accounts, your business owner has asked you to implement a password
validation component that satisfies the acceptance criteria detailed below.
##### Acceptance Criteria
1. The password should have at least one uppercase character
2. The password should have at least one lowercase character
3. The password should have at least one digit
4. The password should have at least one special character
5. The password should be at least 12 characters long
6. The password should not have any whitespaces

If a user enters a non-compliant password, the component should return a message notifying the user of what is wrong 
with the given password. The returned message should be similar to the corresponding description in the acceptance 
criteria.

**HINT:**
* This is the complete list of ASCII Special Character - !"#$%&'()*+,-.\:;<=>?@[/]^_`{|}~ and this can be 
  represented by the following regular expression [^a-zA-Z0–9]