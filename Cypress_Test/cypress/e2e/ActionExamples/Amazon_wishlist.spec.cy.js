/// <reference types="cypress"/>

describe('hrmLogin test', () => {

    it('wishlist test', ()=>{


        cy.visit('https://www.amazon.in/')

        cy.get('#nav-link-accountList-nav-line-1').trigger('mouseover')

        cy.xpath("//span[text()='Create a Wish List']").click();

        cy.title().should('eq', 'Wish List')
    })


    it.only('wishlist test --- app2', ()=>{


        cy.visit('https://www.amazon.in/')

        cy.get('#nav-link-accountList-nav-line-1').trigger('mouseover')

        cy.contains("Create a Wish List").trigger('mouseover').click();

        cy.title().should('eq', 'Wish List')
    })



})