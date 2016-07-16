package com.realtimecep.scalatest

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 * Created on 9/23/14.
 * @author <a href="iamtedwon@gmail.com">Ted Won</a>
 * @version 1.0
 */
@RunWith(classOf[JUnitRunner])
class MyFunSuite extends FunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }


}
