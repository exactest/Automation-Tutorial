@TS001_DOMAINS,@ALL
Feature: Verify Exactest site in different Domains

  @TC001_DOMAIN_IE
  Scenario: Navigate to exactest.ie and verify the site is available.
    Given Browser opened and navigate ie "http://www.exactest.ie"
    Then Verify site by site ie "Software Testing Services - Exactest" 

  @TC001_DOMAIN_UK
  Scenario: Navigate to exactest.co.uk and verify the site is available.
    Given Browser opened and navigate uk "http://www.exactest.co.uk"
    Then Verify site by site uk "Software Testing Services - Exactest" 
