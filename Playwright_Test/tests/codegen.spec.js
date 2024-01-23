import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login');
  await page.getByPlaceholder('Username').click();
  await page.getByPlaceholder('Username').fill('Admin');
  await page.getByPlaceholder('Password').click();
  await page.getByPlaceholder('Password').fill('admin123');
  await page.getByRole('button', { name: 'Login' }).click();
  await page.locator('span').filter({ hasText: 'hIHLtxFUSm s' }).locator('i').click();
  await page.getByRole('menuitem', { name: 'Logout' }).click();
  await page.locator('#app div').filter({ hasText: 'LoginUsername : AdminPassword' }).nth(1).click({
    button: 'right'
  });
  await page.locator('#app div').filter({ hasText: 'LoginUsername : AdminPassword' }).nth(3).click();
});