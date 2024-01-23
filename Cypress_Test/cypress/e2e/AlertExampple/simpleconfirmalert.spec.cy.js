/// <reference types="cypress" />



describe('verify only testing', ()=>{


    it('Alert - simple alert', ()=>{


        cy.visit('https://only-testing-blog.blogspot.com/2013/11/new-test.html')
        //generate an alert
        cy.get('[value="Show Me Alert"]').click();
        //hanle alert -----cypress ---automatically handle an alert -----perform OK button on alert


    })


    it.skip('Alert - confirm alert - click OK bydefault', ()=>{


        cy.visit('https://only-testing-blog.blogspot.com/2013/11/new-test.html')
        //generate an alert
        cy.get('[onclick="myFunction()"]').click();
        //hanle alert -----cypress ---automatically handle an alert -----perform OK button on alert
        
        //validation step
        cy.get('div#demo').should('have.text','You pressed OK!')



    })


    it.skip('Alert - confirm alert - click Cancel', ()=>{


        cy.visit('https://only-testing-blog.blogspot.com/2013/11/new-test.html')
        //generate an alert
        cy.get('[onclick="myFunction()"]').click();
        //hanle alert -----cypress ---automatically handle an alert -----perform OK button on alert
        

        cy.on('window:confirm', ()=> false)             //click on cancel button


        //validation step
        cy.get('div#demo').should('not.have.text','You pressed OK!')



    })



    it.only('Alert - confirm alert - click Cancel and validate', ()=>{


        cy.visit('https://only-testing-blog.blogspot.com/2013/11/new-test.html')
        //generate an alert
        cy.get('[onclick="myFunction()"]').click();
        //hanle alert -----cypress ---automatically handle an alert -----perform OK button on alert
        

        cy.on('window:confirm', (alert)=> {

                expect(alert).to.contain("Press 'OK' or 'Cancel' button!")

                //true---- click on OK button

        //validation step
        cy.get('div#demo').should('have.text','You pressed OK!')


        })             //click on cancel button
        



})
       



    })