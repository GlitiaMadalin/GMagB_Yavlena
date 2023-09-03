Feature:Searching name of Broker and checking informations

  Background:
    Given user should navigate to the link of yavlena

  @TS01
  Scenario Outline:

    When user click to the search box
    And user write broker "<fullName>" in the search box
    Then verify on the search result view searched broker is the only one displayed
    Then verify the informations assigned to the broker are displayed.



      | address   | landline phone   | mobile phone   | number of properties   |
      | <address> | <landline phone> | <mobile phone> | <number of properties> |
    Examples:
      | fullName           | address                         | landline phone   | mobile phone     | number of properties |
      | Desisilava Petrova | Blagoevgrad, Office Blagoevgrad | +359 73 88 20 05 | +359 886 880 290 | (21 Properties)      |
      | Gergana Ivancheva  | Blagoevgrad, Office Blagoevgrad | +359 73 88 20 04 | +359 886 880 290 | (0 Properties)       |
      | Pencho Penkov      | Blagoevgrad, Office Blagoevgrad | +359 73 88 20 05 | +359 886 880 290 | (12 Properties)      |
      | Olga Shmeleva      | Burgas, Office Burgas           | +359 56 878 008  | +359 885 777 730 | (36 Properties)      |

  @TS02
  Scenario: Clicking to "load more" button to see the brokers are loaded
    When user click to the load more button
    Then verify that the number of webelements are increased
