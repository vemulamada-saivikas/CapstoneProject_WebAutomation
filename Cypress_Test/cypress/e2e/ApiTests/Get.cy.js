/// <reference types="cypress" />

describe("Tourist Deatils Test", () => {


    it('Get Tourist', () => {



        cy.request('GET', '/posts').then((resp) => {



            //expect
            cy.log(resp.status)
            cy.log(resp.duration)
            cy.log('status text: ' + resp.statusText)

            cy.log(JSON.stringify(resp.body))
            expect(resp.status).to.eq(200)


        })





    })




    



})