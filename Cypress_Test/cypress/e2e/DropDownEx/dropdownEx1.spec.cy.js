describe('verify dropdown test', () => {


    it('dropdown test', () => {

        //launch application
        cy.visit('https://www.dummyticket.com/dummy-ticket-for-visa-application/')

        
        let countrySearch = 'Italy'


        cy.get('#select2-billing_country-container').click()


        // cy.get('.select2-search__field').type(countrySearch).type('{enter}')


        cy.get('.select2-search__field').type(`${countrySearch}{enter}`)

        

        cy.get('#select2-billing_country-container').should('have.text',countrySearch )
    })


    

})