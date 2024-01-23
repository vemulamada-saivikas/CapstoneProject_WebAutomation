/// <reference types="cypress" />



describe('verify drag drop test', () => {



    it('dragdropTest', ()=>{


        cy.visit('http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html')



        cy.get('#box6').should('be.visible')            //Rome
        cy.get('#box106').should('be.visible')         //Italy


        cy.get('#box6').drag('#box106',{force:true})





    })



})