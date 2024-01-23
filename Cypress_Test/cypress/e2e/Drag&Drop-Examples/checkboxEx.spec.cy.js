/// <reference types="cypress" />



describe('verify checkbox test', () => {


    it('checkbox', () => {

        //launch application
        cy.visit('https://only-testing-blog.blogspot.com/2013/11/new-test.html')

        cy.get('[value="Bike"]').should('be.visible')

        cy.get('[value="Bike"]').check().should('be.checked')

        cy.get('[value="Bike"]').uncheck().should('not.be.checked')



        //select multiple checkbox 
        cy.get('[name="vehicle"]').check()



    })


    it.only('radioButton', () => {

        //launch application
        cy.visit('https://only-testing-blog.blogspot.com/2013/11/new-test.html')

        cy.get('[value="female"]').should('be.visible')

        cy.get('[value="female"]').check().should('be.checked')


        cy.get('[value="male"]').should('not.be.checked')

    })

})