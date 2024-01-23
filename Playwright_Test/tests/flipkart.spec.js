import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  //opens flipkart official page
  await page.goto('https://www.flipkart.com/');
  // click on login
  await page.getByRole('link', { name: 'Login Login' }).click();
  // enter mobile number
  await page.locator('form').filter({ hasText: 'Enter Email/Mobile numberBy' }).getByRole('textbox').fill('9515894217');
  // enter otp sent to registered mobile number 
  await page.getByRole('button', { name: 'Request OTP' }).click();
});