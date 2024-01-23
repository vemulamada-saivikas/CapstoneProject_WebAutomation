const {test, expect} = require('@playwright/test')


test('NopComm', async ({page})=>{

    await page.goto('https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F');

    await page.fill('input#Email','admin@yourstore.com');

    await page.fill('input#Password','admin');

    await page.click("button[type='submit']");

    await expect(page).toHaveURL("https://admin-demo.nopcommerce.com/admin/");

    await page.click(a[href="/logout"]);

    await expect(page).toHaveURL("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");



})