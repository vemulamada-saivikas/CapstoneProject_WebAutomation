/// <reference types="cypress"/>

// require('cypress-xpath');


describe('xpath example', ()=>{


    it('verifyLogin using xpath', ()=>{


        cy.visit('https://www.amazon.in/')


        //get ---- CSS
        // cy.get("//input[@placeholder='Search Amazon.in']").type('enterValueUsingXpath')

        //xpath
        cy.xpath("//input[@placeholder='Search Amazon.in']").type('enterValueUsingXpath')

    })


})