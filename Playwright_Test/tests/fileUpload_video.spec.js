// const { test, expect } = require('@playwright/test');
import { test, expect } from '@playwright/test';

//const x = require('./TestData.json')

test.describe('Example to upload files', ()=>{

  //reference link : https://playwright.dev/docs/input#upload-files

  
  test.only('single file upload', async ({page})=>{

    // await page.goto(x.uploadFileURL); //https://the-internet.herokuapp.com/upload
    await page.goto('https://the-internet.herokuapp.com/upload');
    
    await page.setInputFiles('#file-upload','C:/Users/Admin/Downloads/macbook.png')

    await page.click('#file-submit')

    

    //validation file upload 

    //await expect(page.locator('#uploaded-files')).toContainText('macbook')

    //capture screenshot for failure ----attached to report
    // await expect(page.locator('#uploaded-files')).toContainText('macbook.png1')

    await page.waitForTimeout(5000)
    
  })
  


})