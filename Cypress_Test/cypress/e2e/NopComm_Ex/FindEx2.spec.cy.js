/// <reference types="cypress"/>

describe('nop test', () => {


    

    it('login sceanrio with find commands', ()=>{

        cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

        cy.get(':nth-child(2) > .oxd-input-group > :nth-child(2) > .oxd-input').clear().type('Admin')

        cy.get(':nth-child(3) > .oxd-input-group > :nth-child(2) > .oxd-input').clear().type('admin123')

        // cy.get('#RememberMe').click()

        cy.get('.oxd-button').click()


        // //find example
        cy.get('ul.oxd-main-menu').find('[href*="viewMyDetails"]').should('have.length', 1)



        // //click on logout button
        cy.get("[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']").click()
        cy.get("[href='/web/index.php/auth/logout']").click()

    })

    



})