/// <reference types="cypress" />



describe('verify HRM App', ()=>{


    it('TC01: verify login feature', ()=>{

        //launch application
        cy.visit('https://www.amazon.in/')

        cy.get("#twotabsearchtextbox").type('iphone 15 pro')
        
        cy.get('[value = "Go"]').click()
       

        // cy.get('div[id=deliveryRefinements] input').check({force: true})

        cy.get('div[id=deliveryRefinements] input').click({force: true, multiple: true})



    })

})