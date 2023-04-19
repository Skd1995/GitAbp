package com.tyss.abp.selectlanguage.scripts;

import org.testng.annotations.Test;

import com.tyss.abp.baseutil.BaseTest;
import com.tyss.abp.dataproviders.DataProviderFactory;

/*
 * TestCaseId: Select_Language_001
 * TestScript Name: TYSS_Select_Language_001
 * Description: Verify whether user is able to select language from the select language dropdrown.
 * 
 * Author: Manjappa 
 */
public class TYSS_Select_Language_001 extends BaseTest {

	@Test(dataProviderClass = DataProviderFactory.class, description = "Verify whether user is able to select language from the select language dropdrown.")
	public void TC_TYSS_Select_Language_001() {

		/* Validate Home Page */
		pages.homePage.validateHomePage();
		
		/* Click on Any Article */
		pages.homePage.setLanguage();
		
		/* Validate Language */
		pages.homePage.validateLanguage("होम");
	}
}
