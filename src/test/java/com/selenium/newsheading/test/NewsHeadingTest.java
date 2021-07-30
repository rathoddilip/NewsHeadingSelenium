package com.selenium.newsheading.test;

import com.selenium.newheading.base.BaseClass;
import com.selenium.newheading.utility.NewsHeading;
import org.testng.annotations.Test;

public class NewsHeadingTest extends BaseClass {

    @Test
    public void news_heading_test()
    {
        NewsHeading newsHeading=new NewsHeading(driver);
        newsHeading.new_headings();
    }
}
