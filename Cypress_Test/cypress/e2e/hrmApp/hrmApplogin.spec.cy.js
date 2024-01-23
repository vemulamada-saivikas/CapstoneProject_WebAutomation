/// <reference types="cypress"/>

// const { describe } = require("mocha");

describe('hrmApp',()=>{

    it('verify login',()=>{
        cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
        cy.title().should('eq','OrangeHRM')
    })
})