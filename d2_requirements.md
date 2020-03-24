# Requirements ( *Deliverable-02* )

## 1. Positioning
  1. ### Problem Statement
     Young adults frequently have issues with over-spending related to limited experience with their new luxury of entering the working world: ***Disposable Income***  

  1. ### Problem Position Statement
     Directed at young adults who need to keep track of spending, the Impluse Tracker mobile app provides an easy and intuitive way to track your impluse spending habits, helping you make the right choice with every purchase. 
    

  1. ### Value Proposition 
      This app will help users build healthier spending habits that prevent: 
        * Regret
        * Impulse
        * Under-planning
        * Unsustainable purchases.

## 2. Stakeholders
   Project Manager ——  Keil Hubbard
  *  Responsible for product design and division of staff, as well as character arrangements and resource integration for the next week.
    
   Application Developers ——  Bailey Erickson, Chenhao Li, Robin Applegate,Oshan Wijesooriya 
  * Develop different parts of the product and Gather information and acquire necessary knowledge，developers should also test the software.
  
   Testers/Users —— NAU students 
  * The users will test and use the application and make feedback so that we can improve the application and make it better able to meet user needs.
  
   Competitors —— Drnkpay, Urge, finder.com's Icebox 
  * These competitors have the same aim like our product—— help people avoid impulse shopping, however the Drnkpay can only help people who are drunk, and finder.com's Icebox is a plugin which can only apply for online shopping. We will make our application based on these competitors and make more differences.
## 3. Functional Requirements ( *features* )
  1. Add Purchases
  2. Add Personal Information
  3. Add Financial Information
  4. View Purchases
  5. View Graphical Representations of Purchases
  6. Search Spending History

## 4. Non-Funtional Requirements
  1. Performance  
    * load purchase list in less than 3 seconds
  2. Availability  
    * be able to see list or graph in 2 taps or less
  3. Capacity  
    * be able to store 500 purchases

## 5. MVP ( *Minimum Viable Product* )
  We as a group are going to makesure that we keep the app very simple and then build up from there. We will do a lot of testing and only make sure that we are pushing code that is functional to the GitHub Repository. We want to also make sure we keep track of who is doing what so we can have an easier way to track issues back to the creator. For our requirements we will make sure that we start with the requirements that matter most to us to integrate into the application and then if we have the time and resources we will work on the ore complex features in our application. 

## 6. Use Cases
  ### 1. Use Case Diagram
![USE Case Diagram](/img/use-cases.jpg)  
  ### 2. Use Case Descriptions
  * **Use-Cases**
    * Use-Case: Delete a past purchase
    * Actor: User
    * Description: Remove a previously entered purchase from the app
    * Pre-Conditions: Purchase is entered into app
    * Post Conditions: Purchase is no longer in app
    * Flow:
      1. User navigates to list of purchases
      2. User selects purchase to be deleted
      3. System shows details of the purchase
      4. User chooses to delete purchase
      5. System asks for confirmation
      6. User confirms
      7. System deletes purchase
      8. System returns user to list of purchases
    * Alternative Flows:
      * 6.1 User cancels
          1. System return user to list of purchases
          <hr/>
    * Use-Case: Edit a past purchase
    * Actor: User
    * Description: Change the details of a previously entered purchase
    * Pre-Conditions: Purchase is entered into app
    * Post Conditions: Purchase details changed
    * Flow:
      1. User navigates to list of purchases
      2. User selects purchase to be edited
      3. System shows details of the purchase
      4. User chooses to edit purchase
      5. System shows details of purchase with editable fields
      6. User makes desired changes
      7. User saves changes
      8. System returns user to purchase details
    * Alternative Flows:
      * 7.1 User exits without saving
          1. System asks for confirmation
          2. User confirms
          3. System returns user to purchase details, without saving changees
      * 7.1.2.1 User cancels
          1. System returns user to edit screen, preserving any changes
          <hr/>
    * Use-Case: Add Past Purchase
    * Actor: General User
    * Description: User adds a purchase that they have made in the past to be evaluated.
    * Pre-Conditions: User Has Installed the App and created a basic profile, App is open.
    * Post Conditions: The User confirms the details have been submitted and closes the app.
    * Flow:  
      1. User selects the add purchase option
      2. User chooses "past" from the time options
      3. User enters the cost of the item
      4. User Answers given comparison questions
      5. App does value comparison calculation 
      6. App displays final value calculations
      7. User accepts the final value
      8. Purchase is added to User History
      9. Purchase is added to history graph
      <hr/>
    * Use-Case: Create A Personal Profile
    * Actor: General User
    * Description: User creates a personal profile to be user for later comparisons.
    * Pre-Conditions: User Has Installed the App, App is open.
    * Post Conditions: User confirms their personal info is correct and close the app or continue to adding a purchase
    * Flow:  
      1. User Opens the app for the first time
      2. App prompts user to create their profile
      3. User accepts the on screen prompt
      4. App prompts user for basic info (Name, age...)
      5. User enters information as promted
      6. User enters simplified financial information
      7. App prompts user to define their "value item"
      8. User defines "value item"
      9. App stores value item and all info for later use  
      <hr/>

## 7. User Stories
  * High priority
    * As a user I want to add past purchases so I can track them (5 hours)
    * As a user I want to delete a past purchase I've entered (1 hour)
    * As a user I want to see a list of the purchases that I have been making (2 hours)
    * As a user I want to see a graph of the purchases that I have been making (3 hours)
    <hr/>
  * Medium priority
    * As a user I want to edit a past purchase I've entered (1 hour)
    * As a user I want to update my profile information (1 hour)
    * As a user I want to update my financial information (1 hour)
    <hr/>
  * Low priority
    * As a user I want help deciding whether I should make a particular purchase (4 hours)
    * As a user I want to use the app to weigh the benefits of buying in the future vs now (2 hours)
    * As a user I want to get advice on how to better manage these purchases (3 hours)
    * As a user I want to search my spending history using keywords (4 hours)

## 8. Trello
* [MobileApp](https://trello.com/b/X2UE7Wrn/impulse-app)
* [Server](https://trello.com/b/PRMQZK8a/impulse-server)
