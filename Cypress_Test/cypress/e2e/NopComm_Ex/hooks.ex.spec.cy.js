/// <reference types="cypress"/>

describe('nop test', () => {


    before(()=>{

        cy.log('==========before==========')
        

    })


    after(()=>{

        cy.log('==========after==========')


    })

    beforeEach(()=>{

        cy.log('==========beforeEach==========')
        cy.visit('https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F')

    })


    afterEach(()=>{

        cy.log('==========afterEach==========')


    })

    it('enter email', ()=>{

        // cy.visit('https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F')

        cy.get('#Email').clear().type('admin123@yourstore.com')


    })

    it('verify title', ()=>{

        

        cy.title().should('eq', 'Your store. Login')


    })




})