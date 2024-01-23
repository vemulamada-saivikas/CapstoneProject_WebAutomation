/// <reference types="cypress" />



describe('verify dropdown test', () => {


    it('dropdown test', () => {

        //launch application
        cy.visit('https://only-testing-blog.blogspot.com/2013/11/new-test.html')

        cy.get('[name="FromLB"]').should('be.visible')

        //select single value

        // cy.get('[name="FromLB"]').select('India')

        


        //select multiple value

        cy.get('[name="FromLB"]').select(['USA', 'Russia', 'India'])


    })


    

})