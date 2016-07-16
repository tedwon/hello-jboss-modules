package com.realtimecep.scalatest

import org.scalatest.FlatSpec

/**
 * Created on 9/23/14.
 * @author <a href="iamtedwon@gmail.com">Ted Won</a>
 * @version 1.0
 */
class MyFlatSpec extends FlatSpec {

  "An empty set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }

}
