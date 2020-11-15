package com.cybertek.tests.day9_windows_tabs;
/*
September 29th, Tuesday

Announcement #1: First offer B18.
Announcement #2: Two days off: October 10th (Saturday) - October 11th Sunday
		-> In total you will have 4 days of:
			- Friday, Saturday, Sunday, Monday (Columbus Day)


=======================

Today's schedule:
	=> ALERTS - IFRAMES - WINDOWS
	- Recap on Alert-Iframe
	- Learn how to handle windows/tabs

=======================

ALERTS

	How many types of alerts are there?
		- We have 2 types of alerts.

	#1 - HTML ALERT:
	- How do we handle HTML Alert?
		- We handle it just as any other web elements using one of 8 locators of Selenium.
		- Basically, we just locate, click and close.

	#2 - Javascript Alerts:
		- When Javascript alerts are present, user cannot do anything else until they handle this alert.
		- Javascript alerts are not created in the HTML code. Thats why, we cannot locate and handle them as any other web element. We have to use special class that was created for alerts.


	- We have 3 types of JAVASCRIPT ALERTs.

	#1- Warning/Information Alert:
		- User has only one option which is to accept an information alert.
		- This is used to give some info to user.

	#2- Confirmation Alert:
		- User has two options.
		- You can accept or dismiss this alert.

	#3- Prompt Alert:
		- User can put three different types of inputs.
		- User can accept, dismiss, or sendKeys.


	- How do we handle Javascript Alerts?
		- We handle JS alerts, using ALERT class

	Syntax:

	#1 -> We create Alert object and switch to driver to currently open alert.

	Alert alert = driver.switchTo().alert();

	alert.accept();
	alert.dismiss();
	alert.sendKeys("string");

================================================

Iframe (Inline Frame):
	- An iframe is an HTML inside of another HTML.
	- Iframes are used to create independent HTML inside of another HTML
	- It is used to display content from other sources, such as videos, documents, maps etc.

-> How to determine if there is iframe on the page or not?
	- If you have a correct locator that is working in the inspection tool (Chrome dev), and you are certain page is loaded normally, then you should be checking for an <iframe> tag.

-> How do we handle iframes?
	- Selenium can only focus on one thing at a time.
	- Selenium cannot see the web elements inside of another <iframe>
	- Therefore we MUST switch its focus to the inner frame to be able to do any action in there.
	- After we are done in the inner frame, we have to switch the selenium's focus back to the default frame.

-> How many ways we have switching to an iframe?
	- We have 3 ways to switch.
	- driver.switchTo().frame() --> frame method has 3 ways to be overloaded.
		- WebElement
		- Index (int)
		- String

	#1- Locate it as just another web element.
	- We can locate the <iframe> using any 1 of the 8 locators of Selenium. And switch to it.
	- In this option, we are passing a WebElement type.
	Syntax:
		WebElement iframeTag = driver.findElement(By.LOCATOR);
		driver.switchTo().frame(iframeTag);

	#2- We can switch to an iframe using an index number.
	- Index number starts from 0.
	- we use the same method --> frame();
	- In this option, we are passing int.

	Syntax: 	driver.switchTo().frame(0);

	#3- We can switch to an iframe using id or name attribute values.
	- In this option we are passing String.

		driver.switchTo().frame("idValue");
		driver.switchTo().frame("nameValue");

-> After switching to an iframe, and doing the actions that we are supposed to be doing: WE MUST SWITCH BACK TO PREVIOUS FRAME(PARENT FRAME)(DEFAULT FRAME)

	- How do we switch back to main frame?

1		HTML
2			HTML
3				HTML  --> driver.switchTo().parentFrame(); --> This takes driver to line 2
			--> driver.switchTo().defaultContent(); --> This takes driver to main frame(line 1)

-> if we have just one layer of iframe

	EX: like amazon, lets say we have multiple <iframe> s

1	HTML

2		HTML

3		HTML
			HTML --> driver.switchTo().parentFrame(); --> this takes driver to line 3.

4		HTML --> driver.switchTo().parentFrame(); --> this takes driver to line 1.

5		HTML


 */
public class CLASSNOTES {
}
