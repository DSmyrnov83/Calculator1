Feature: Calculations

  Scenario: Addition
    Given user is navigated to 'https://www.google.com'
    When user enters 'calculator' into search field
    And clicks on search button
    When user enters '1+2' into calculator field
    And clicks '=' button
    Then result is '3'


  Scenario: Substruction
    Given user is navigated to 'https://www.google.com'
    When user enters 'calculator' into search field
    And clicks on search button
    When user enters '4-2' into calculator field
    And clicks '=' button
    Then result is '2'


  Scenario: Multiplication
    Given user is navigated to 'https://www.google.com'
    When user enters 'calculator' into search field
    And clicks on search button
    When user enters '2*3' into calculator field
    And clicks '=' button
    Then result is '6'


  Scenario: Division
    Given user is navigated to 'https://www.google.com'
    When user enters 'calculator' into search field
    And clicks on search button
    When user enters '9/3' into calculator field
    And clicks '=' button
    Then result is '3'


  Scenario: Division by zero
    Given user is navigated to 'https://www.google.com'
    When user enters 'calculator' into search field
    And clicks on search button
    When user enters '1 + 2' into calculator field
    And clicks '=' button
    Then result is 'Infinity'


