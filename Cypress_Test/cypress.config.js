const { defineConfig } = require("cypress");

module.exports = defineConfig({


  
  projectId: "czreay",
  retries: {
    runMode: 1,
    openMode: 1,
    },


    video: true,

  e2e: {
    //baseUrl: 'http://localhost:3000',
    setupNodeEvents(on, config) {
      
      // implement node event listeners here
    },
  },
});
