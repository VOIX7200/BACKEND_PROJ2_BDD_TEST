Feature: Evaluate Percentage

  Scenario: Verify 10% offer
    Given Execute DiscountService Business
    When if i enter 5001
    Then we should get ten percentage discount

  Scenario: Verify 15% offer
    Given Execute DiscountService Business
    When if i enter 11000
    Then we should get fifteen percentage discount

   Scenario: Verify 18% offer
    Given Execute DiscountService Business
    When if i enter 20001
    Then we should get eighteen percentage discount
    
    
    Scenario: Verify 20% offer
    Given Execute DiscountService Business
    When if i enter 30001
    Then we should get tweenty percentage discount
    
    Scenario: Verify NA% offer
    Given Execute DiscountService Business
    When if i enter 40001
    Then we should get NA percentage discount