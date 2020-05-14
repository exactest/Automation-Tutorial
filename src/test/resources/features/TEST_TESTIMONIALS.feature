@TS001_TESTIMONIALS_PAGE,@ALL
Feature: Feature: Verify Testimonials page Contents, HTML links,Buttons and partner creditation Links

  @TC001_TESTIMONIALS_CONTENTS
  Scenario: Navigate to Testimonials page and confirm Text Format, Images, Contents and Spellings are correct.
    Given Browser opened Testimonials
    Then Verify Text Format, Images, Contents, Spellings of Testimonials are correct

  @TC002_TESTIMONIALS_LINKS
  Scenario: Navigate to Testimonials page and confirm all HTML Links and Buttons on the site are working correctly.
    Given Browser opened Testimonials
    Then Verify HTML Links and Buttons on the Testimonials site are linked to correct pages

  @TC003_TESTIMONIALS_CREDITATIONS
  Scenario: Navigate to Testimonials page and confirm PARTNERS & CREDITATIONS links are working.
    Given Browser opened Testimonials
    Then Verify PARTNERS & CREDITATIONS links of Testimonials page are working

 
