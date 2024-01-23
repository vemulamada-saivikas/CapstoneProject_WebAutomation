// const { test, expect } = require('@playwright/test');
import { test, expect } from '@playwright/test';

test('checkbox example', async ({ page }) => {
  await page.goto('https://the-internet.herokuapp.com/checkboxes');

  
  //Assert checkboxes is visible on page
  await expect(page.locator('#checkboxes')).toBeVisible()


  //Assert checkbox 1 is unchecked on page
  //await expect(page.isChecked('')
  //locator ----- css and xpath

  expect(await page.isChecked('input[type="checkbox"]:nth-child(1)')).toBeFalsy()       //false ---- unchecked


  //Assert checkbox 2 is checked on page
  expect(await page.isChecked('(//input[@type="checkbox"])[2]')).toBeTruthy()           //true ---- checked
  

  //check the checkbox1
  await page.check('input[type="checkbox"]:nth-child(1)')


  //uncheck the checkbox2
  await page.uncheck('(//input[@type="checkbox"])[2]')

  //Assert checkbox1 is checked
  expect(await page.isChecked('input[type="checkbox"]:nth-child(1)')).toBeTruthy()
  
  //Assert checkbox2 is unchecked
  expect(await page.isChecked('(//input[@type="checkbox"])[2]')).toBeFalsy()



});
