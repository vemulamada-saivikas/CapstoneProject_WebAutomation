///<reference types='cypress'/>

describe('Saucedemo Checkout',()=>{

    it('setup',()=>{

        //switch to URL
        cy.visit('https://www.saucedemo.com/');

        //Enter UserName
        cy.get('[placeholder="Username"]').type('standard_user');

        //Enter Password
        cy.get('[placeholder="Password"]').type('secret_sauce');

        //Click On login Button
        cy.get('[class="submit-button btn_action"]').click();

        //Validatating URL
        cy.url().should('contain','https://www.saucedemo.com/inventory.html');
        //Validatating Title
        cy.title().should('contain','Swag Labs');


        //Added Item to cart
        cy.get('[name="add-to-cart-sauce-labs-backpack"]').click();

        //Click Add to cart Button
        cy.get('[class="shopping_cart_link"]').click();

        //validating Whether added atem as expected title
        cy.get('[class="inventory_item_name"]').should('contain','Sauce');
       
        //click on checkout
        cy.get('[class="btn btn_action btn_medium checkout_button "]').click();

        //Entering First Name
        cy.get('[placeholder="First Name"]').type("Vikas");

        //Entering Last Name
        cy.get('[placeholder="Last Name"]').type("Sai");
        
        //Enter Zipcode
        cy.get('[placeholder="Zip/Postal Code"]').type('123');

        //click on Continue
        cy.get('[type="submit"]').click();
        
        //click on Finish
        cy.get('[data-test="finish"]').click();
        
        
        //validating the confirmation Message
        cy.get('[class="complete-header"]').should('contain','Thank you for your order!')
       

    })



})