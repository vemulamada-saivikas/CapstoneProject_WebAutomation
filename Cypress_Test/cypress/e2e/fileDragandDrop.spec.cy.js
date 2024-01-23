/// <reference types="cypress" />

import 'cypress-file-upload';


//reference url - https://www.npmjs.com/package/cypress-file-upload


describe('verify drag drop test', () => {



    it('dragdropTest', ()=>{


        cy.visit('https://the-internet.herokuapp.com/upload')



        cy.get('#file-upload').should('be.visible')            



        //install packge "file-upload"
        // cy.get('#file-upload').attachFile('sample.txt')     //take file from fixture

        cy.get('div#drag-drop-upload').attachFile('sample.pdf', { subjectType: 'drag-n-drop' })     //take file from fixture



        cy.wait(3000)



    })



})