Feature: Search by keyword

  Scenario: Searching for a term
    Given User is researching things on the internet
    When User looks up "Linkedin"
    Then User should see search result about "Linkedin"


