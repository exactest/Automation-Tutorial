@TS001_CONTACT_PAGE,@ALL
Feature: Verify Contact page Contents, HTML links,Buttons, Partner creditation links and user inquiry

  @TC001_CONTACT_CONTENTS
  Scenario: Navigate to Contact page and confirm Text Format, Images, Contents and Spellings are correct.
    Given Browser opened Contact
    Then Verify Text Format, Images, Contents and Spellings are correct on Contact page

  @TC002_CONTACT_LINKS
  Scenario: Navigate to Contact page and confirm all HTML Links and Buttons on the site are working correctly.
    Given Browser opened Contact
    Then Verify HTML Links and Buttons on the are correct on Contact page  are linked to correct pages 

  @TC003_CONTACT_PARTNERS_CREDITATIONS
  Scenario: Navigate to Contact page and confirm PARTNERS & CREDITATIONS links are working.
    Given Browser opened Contact
    Then Verify PARTNERS & CREDITATIONS links of Contact page are working

  @TC004_CONTACT_READ_FROM_EXCEL
  Scenario: Navigate to Contact page and upload inquiry details from excel
    Given Browser opened Contact
    Then Enter data for inquiry