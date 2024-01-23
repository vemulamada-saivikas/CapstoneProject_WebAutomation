describe('verify amazon app', () => {
    it('TC 1: verify login feature', () => {
    // launch amazon application
      cy.visit('https://www.amazon.in/')
    // search for Iphone 15 pro max
      cy.get('[placeholder="Search Amazon.in"]').clear().type("Iphone 15 pro max")
    // click on search button
      cy.get('[value="Go"]').click()
    // verify the title
      cy.title().should('contain','Iphone 15 pro max')
    // verify the url
      cy.url().should('contain','Iphone')
    })
  })