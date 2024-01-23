/// <reference types="cypress"/>

describe('tigger test', () => {

    it('double click test', ()=>{


        cy.visit('https://demo.guru99.com/test/simple_context_menu.html')

        
        //double click operation on element

        //app1
        // cy.get('[ondblclick="myFunction()"]').trigger('dblclick')



        //app2
        cy.xpath('//*[@ondblclick="myFunction()"]').dblclick();


        //validate alert

        cy.on('window:alert', (alert)=>{

            expect(alert).to.contain('You double clicked me.. Thank You..')

        })



    })



})