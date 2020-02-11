package com.knoldus

object Email {
  def email(mail:String): String ={
    val email = """(^[A-Za-z0-9][A-Za-z0-9]*)@((?:[A-Za-z0-9]+\.)+[A-Za-z]{2,63}$)""".r
    mail match{
      case email(user,domain) => s"user =$user\n domain =$domain"
      case  _ => "invalid"
    }
  }

  email("muskan@knoldus.com")
}
