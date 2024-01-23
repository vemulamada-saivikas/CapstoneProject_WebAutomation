/// <reference types="cypress"/>

describe('tigger test', () => {

    it('double click test', ()=>{


        cy.visit('https://demo.guru99.com/test/simple_context_menu.html')


        //app2
        cy.get('span[class="context-menu-one btn btn-neutral"]').rightclick();

        cy.screenshot("sai")
        
        //validation
        cy.on('window:alert', (alert)=>{

            expect(alert).to.contain('clicked: delete')

        })

        //cy.on('window:alert', (alert)=>{

            //expect(alert).to.contain('You double clicked me.. Thank You..')

        })



    })



