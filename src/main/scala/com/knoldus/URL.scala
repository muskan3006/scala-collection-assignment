//package com.knoldus
//
//object URL {
//  def apply(protocol: String, domain: String, path: String,
//            params: Map[String, String]): String = {
//
//    protocol + "://" + domain + "/" + path + "?" + params
//
//  }
//
//  def unapply(url: String): Option[(String, String, String, Map[String, String])] = {
//    val parts = url split "?"
//    if (parts.length == 2) {
//      val subParts = parts(0) split "://"
//      if (subParts.length == 2) {
//        val innerParts = subParts(1) split "/"
//
//        if (innerParts.length == 3) {
//
//          val sum = "/" + innerParts(1) + innerParts(2)
//          Some(subParts(0),innerParts(0),sum,parts(1) )
//        } else None
//
//      } else None
//
//    } else None
//
//  }
//  unapply("http://c/c/c?ncn.andjan")
//}
//

