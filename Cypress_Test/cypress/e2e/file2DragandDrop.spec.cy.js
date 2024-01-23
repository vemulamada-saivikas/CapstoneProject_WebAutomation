/// <reference types="cypress" />

import 'cypress-file-upload';

describe('Example Of How To Handle Shadow Dom in Cypress', () => {

    before(() => {
    
    cy.visit('https://books-pwakit.appspot.com/')
    
    })
    
    it('Enter some data in text box and search then validate the URL', () => {
    
    cy.get('book-app')
    
    .shadow()
    
    .find('app-header')
    
    .find('.toolbar-bottom')
    
    .find('book-input-decorator')
    
    .find('#input')
    
    .type('Math', { force: true })
    
    .click()
    
    .url('contains', 'explore?q=Math')
    
    })
    
    })