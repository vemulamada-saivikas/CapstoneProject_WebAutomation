
/// <reference types="cypress" />

import 'cypress-file-upload';


//reference url - https://www.npmjs.com/package/cypress-file-upload


describe('verify drag drop test', () => {



    it('dragdropTest', ()=>{


        cy.visit('https://the-internet.herokuapp.com/upload')



        cy.get('#file-upload').should('be.visible')            



        //install packge "file-upload"
        cy.get('#file-upload').attachFile('sample.pdf')

        
        //click on upload button
        cy.get('#file-submit').click();


        cy.wait(3000)

        //validation step

        cy.get('h3').should('have.text','File Uploaded!')

    })



})