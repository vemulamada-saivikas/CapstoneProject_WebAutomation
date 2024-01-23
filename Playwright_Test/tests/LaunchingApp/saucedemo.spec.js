const { test, expect } = require('@playwright/test');

test.describe("Saucedemo Checkout ",()=>{

    test("setup", async ({page})=>{

        //switch to URL
        await page.goto("https://www.saucedemo.com/");
        await page.waitForTimeout(2000);
       
        //Enter UserName
        await page.locator('[placeholder="Username"]').fill('standard_user');
        await page.waitForTimeout(2000);
        
        //Enter Password
        await page.locator('[placeholder="Password"]').fill('secret_sauce');
        await page.waitForTimeout(2000);

        //Click On login Button
        await page.locator('[class="submit-button btn_action"]').click();
        await page.waitForTimeout(2000);

        //Validatating URL
        await expect(page).toHaveURL('https://www.saucedemo.com/inventory.html');
        //Validatating Title
        await expect(page).toHaveTitle('Swag Labs');

        //Added Item to cart
        await page.locator('[name="add-to-cart-sauce-labs-backpack"]').click();
        await page.waitForTimeout(2000);
      
        //Click Add to cart Button
        await page.locator('[class="shopping_cart_link"]').click();
        await page.waitForTimeout(2000);

        //validating Whether added atem as expected title
        await expect(page.locator('[class="inventory_item_name"]')).toContainText('Sauce');
        await page.waitForTimeout(2000);

        //click on checkout
        await page.locator('[class="btn btn_action btn_medium checkout_button "]').click();
        await page.waitForTimeout(2000);

        //Entering First Name
        await page.locator('[placeholder="First Name"]').fill("Vikas");
        await page.waitForTimeout(2000);

        //Entering Last Name
        await page.locator('[placeholder="Last Name"]').fill("Sai");
        await page.waitForTimeout(2000);

        //Enter Zipcode
        await page.locator('[placeholder="Zip/Postal Code"]').fill('123');
        await page.waitForTimeout(2000);

        //click on Continue
        await page.locator('[type="submit"]').click();
        await page.waitForTimeout(2000);

        //click on Finish
        await page.locator('[data-test="finish"]').click();
        await page.waitForTimeout(1000);

        //validating the confirmation Message
        await expect(page.locator('[class="complete-header"]')).toHaveText('Thank you for your order!');

       

    })



})