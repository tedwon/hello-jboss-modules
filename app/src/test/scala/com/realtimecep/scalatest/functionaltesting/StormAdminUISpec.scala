package com.realtimecep.scalatest.functionaltesting

import org.openqa.selenium.WebDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.scalatest.selenium.WebBrowser
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created on 9/23/14.
  * @author <a href="iamtedwon@gmail.com">Ted Won</a>
  * @version 1.0
  */
class StormAdminUISpec extends FlatSpec with Matchers with WebBrowser {

   implicit val webDriver: WebDriver = new HtmlUnitDriver

   val host = "http://10.15.11.146:8088/"

   "The blog app home page" should "have the correct title" in {
     go to (host + "index.html")
     pageTitle should be ("Storm UI")
   }
 }