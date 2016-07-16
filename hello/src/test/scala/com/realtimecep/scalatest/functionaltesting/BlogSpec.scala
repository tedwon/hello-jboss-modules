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
class BlogSpec extends FlatSpec with Matchers with WebBrowser {

  implicit val webDriver: WebDriver = new HtmlUnitDriver

  val host = "http://localhost:9000/"

  "The blog app home page" should "have the correct title" in {
    go to (host + "index.html")
    pageTitle should be ("Awesome Blog")
  }
}