
/// <reference types="cypress" />

describe("University Test", () => {


    it('verify university test',()=>{



        cy.request('GET', 'http://universities.hipolabs.com/search?country=India').then( (resp)=>{



                //expect
                cy.log(resp.status)
                cy.log(resp.duration)
                cy.log('status text: ' + resp.statusText)

                cy.log('**************' + resp.body[11].name)

                expect(resp.status).to.eq(200)


        })
           




    })


    



})