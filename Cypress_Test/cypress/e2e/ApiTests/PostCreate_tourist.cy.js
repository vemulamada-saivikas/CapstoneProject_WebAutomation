/// <reference types="cypress" />

describe("Create Tourist Test", () => {

    it('POST - create Tourist', () => {


        cy.fixture('tourist.json').then(   (apirequest)=>{



       


        console.log('***************' +Math.random().toString(5).substring(2));


        let resquestBody = apirequest


        cy.request({

            method: 'POST',
            url: 'http://restapi.adequateshop.com/api/Tourist',
            body: resquestBody



        }).then( (resp)=>{


            //validation step

            console.log(resp.body);

            //print complete response body into cypress console
            cy.log(JSON.stringify(resp.body))


            expect(resp.status).to.eq(201)              //verify status code ---201

            expect(resp.body.tourist_name).to.eq(resquestBody.tourist_name) 
            expect(resp.body.tourist_email).to.eq(resquestBody.tourist_email) 
            expect(resp.body.tourist_location).to.eq('Paris') 


            //response properties

            expect(resp.body).has.property('tourist_name', resquestBody.tourist_name)
            expect(resp.body).to.have.property('tourist_email', resquestBody.tourist_email)

        })


    })

    })




})