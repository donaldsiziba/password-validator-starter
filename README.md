# Password Validator
In order to avoid hackers compromising member accounts, your business owner has asked you to implement a password
validation component that satisfies the acceptance criteria detailed below.
##### Acceptance Criteria
1. Password should have at least one uppercase character
2. Password should have at least one lowercase character
3. Password should have at least one digit
4. Password should have at least one special character
5. Password should be at least 12 characters long
6. Password should not have any whitespaces

In the case of a user entering a non-compliant password, the component should return a message notifying the user what
is wrong with the given password. The returned message should be similar to the corresponding description in the
acceptance criteria.

**HINT:**
* This is the complete list of ASCII Special Characters - !"#$%&'()*+,-.\\:;<=>?@[/]^_`{|}~
* This component will be integrated to a Client via an API.