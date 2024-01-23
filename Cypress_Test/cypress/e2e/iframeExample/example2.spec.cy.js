/// <reference types="cypress" />
// import 'cypress-iframe';


describe('verify frame test', () => {



    it.only('frame test', ()=>{


        cy.visit('https://the-internet.herokuapp.com/iframe')


        

        //plugin

        cy.frameLoaded('#mce_0_ifr')
        cy.iframe('#mce_0_ifr').clear().type('Welcome you all in today session !!').type('{ctrl}A')

        // myFrame.clear().type('Welcome you all in today session !!').type('{ctrl}A')


        //click on bold button inside frame
        cy.get('[title="Bold"]').click()
        cy.get('[title="Italic"]').click()


    })



})