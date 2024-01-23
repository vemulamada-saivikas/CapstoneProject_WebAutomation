/// <reference types="cypress"/>

describe('nop test', () => {


    

    it('login sceanrio with find commands', ()=>{

        cy.visit('https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F')

        cy.get('#Email').clear().type('admin@yourstore.com')

        cy.get('#Password').clear().type('admin')

        cy.get('#RememberMe').click()

        cy.get('.button-1').click()


        //have.length
        // cy.get('.mt-2 >ul > li').should('have.length', 10)

        //have.length
        cy.get('.mt-2 >ul > li').should('have.length.above', 8)



        //find example
        cy.get('.mt-2 >ul > li').find('[href*="Activity"]').should('have.length', 2)



        //click on logout button
        cy.get('.navbar-nav > :nth-child(3) > .nav-link').click()

    })

    



})