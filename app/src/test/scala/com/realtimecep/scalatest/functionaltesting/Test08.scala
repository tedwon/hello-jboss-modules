package com.realtimecep.scalatest.functionaltesting

import org.openqa.selenium.WebDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.selenium.WebBrowser

/**
 * Created on 9/23/14.
 * @author <a href="iamtedwon@gmail.com">Ted Won</a>
 * @version 1.0
 */
class Test08 extends FlatSpec with Matchers with WebBrowser {

  implicit val webDriver: WebDriver = new HtmlUnitDriver

  val host = "http://www.amazon.com"
  go to host
  click on "twotabsearchtextbox"
  textField("twotabsearchtextbox").value = "Scala"
  submit()
  pageTitle should be ("Amazon.com: Scala")
  pageSource should include ("Scala Cookbook: Recipes")


}
