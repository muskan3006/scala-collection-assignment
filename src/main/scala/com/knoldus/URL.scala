package com.knoldus

object URL extends App {
  def apply(protocol: String, domain: String, path: String,
            params: Map[String, String]): String = {

    protocol + "://" + domain + "/" + path + "?" + params

  }

  def unapply(url: String): Option[(String, String, String, Map[String, String])] = {
    val urlParts = url split '?'
    if (urlParts.length == 2) {
      val protocol: String = urlParts(0).split("://")(0)
      val domain: String = urlParts(0).split("://")(1).split("/")(0)
      val path: String = urlParts(0).split("://")(1).split("com")(1)
      val str: String = urlParts(1)
      val list = str split "&"
      val list1 = for {
        l <- list
      } yield (l.split("=")(0), l.split("=")(1))
      val params = list1.toMap
      Some(protocol, domain, path, params)
    } else {
      None
    }
  }

  println(unapply("https://aws.amazon.com/console/home?state=hash&isauthcode=true&code=112"))
}

