@TS001_ABOUT_PAGE,@ALL
Feature: Verify About page Contents, HTML links,Buttons and Partner creditation links

  @TC001_ABOUT_CONTENTS
  Scenario: Navigate to About page and confirm Text Format, Images, Contents and Spellings are correct.
    Given Browser opened about
    Then Verify Text Format, Images, Contents and Spellings are correct on about page


  @TC002_ABOUT_LINKS
  Scenario: Navigate to Home page and confirm all HTML Links and Buttons on the site are working correctly.
    Given Browser opened about
    Then Verify HTML Links and Buttons on the about page are linked to correct pages
    
  @TC003_ABOUT_PARTNERS_CREDITATIONS
  Scenario: Navigate to Home page and confirm PARTNERS & CREDITATIONS links are working. 
    Given Browser opened about
    Then Verify PARTNERS & CREDITATIONS links on the about page are working

   
