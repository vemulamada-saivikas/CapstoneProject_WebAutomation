/// <reference types="cypress" />

import 'cypress-file-upload';


//reference url - https://www.npmjs.com/package/cypress-file-upload


describe('verify drag drop test', () => {



    it('dragdropTest', () => {


        cy.visit('https://cgi-lib.berkeley.edu/ex/fup.html')



        cy.get('[type="file"]').should('be.visible')
        cy.get('[type="file"]').attachFile('sample.pdf')
        cy.get('[type="text"]').type('sample pdf')
        cy.get('[type="submit"]').click()


        cy.wait(3000)

        
    })



})