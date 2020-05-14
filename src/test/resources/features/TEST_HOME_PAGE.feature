@TS001_HOME_PAGE,@ALL
Feature: Feature: Verify Home page Contents, HTML links,Buttons, Partner creditation Links and email client

  @TC001_HOME_CONTENTS
  Scenario: Navigate to Home page and confirm Text Format, Images, Contents and Spellings are correct.
    Given Browser opened home
    Then Verify Text Format, Images, Contents and Spellings are correct

  @TC002_HOME_LINKS
  Scenario: Navigate to Home page and confirm all HTML Links and Buttons on the site are working correctly.
    Given Browser opened home
    Then Verify HTML Links and Buttons on the site are linked to correct pages

  @TC003_HOME_PARTNERS_CREDITATIONS
  Scenario: Navigate to Home page and confirm PARTNERS & CREDITATIONS links are working.
    Given Browser opened home
    Then Verify PARTNERS & CREDITATIONS links are working

  @TC004_HOME_EMAIL_LINK
  Scenario: Navigate to Home page and confirm email link will open email client with email populated in to field.
    Given Browser opened home
    Then Verify Email client with email populated in To field
