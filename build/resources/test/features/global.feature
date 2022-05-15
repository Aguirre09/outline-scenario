#Author : Luis Alejandro Aguirre Sossa

Feature: As a User, i want to work inside the page Globalautomation

  @scenario1
  Scenario Outline: Show
    Given user is on Login Page
    When user enters select social network "<SocialNetwork>"
    Then user should able to see the "<Link>"

    Examples:
      | SocialNetwork | Link                                         |
      | Facebook      | https://www.facebook.com/aroraglobalservices |

