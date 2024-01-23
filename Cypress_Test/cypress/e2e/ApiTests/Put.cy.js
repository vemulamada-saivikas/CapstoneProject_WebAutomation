/// <reference types="cypress" />

describe("Create Tourist Test", () => {

    it('PUT - create Tourist', () => {
    
      //  cy.visit('http://localhost:3000')

    


        let resquestBody = {
            "last_name": "kumar_S",
            "first_name": "vinith"
                            }


        cy.request({

            method: 'PUT',
            url: ' https://reqres.in/api/users/2',
            body: resquestBody



        }).then( (resp)=>{


            //validation step

            console.log(resp.body);
           expect(resp.status).to.eq(200)              //verify status code ---200

            expect(resp.body.last_name).to.eq(resquestBody.last_name) 
            expect(resp.body.first_name).to.eq(resquestBody.first_name) 
         
        })




    })




})