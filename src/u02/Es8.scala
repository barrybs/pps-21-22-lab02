package u02

import u02.Optionals.Option
import u02.Optionals.Option.{None, Some}

object Es8 {

  enum Option[A]:
    case Some(a: A)
    case None() // here parens are needed because of genericity

  object Option:

    def isEmpty[A](opt: Option[A]): Boolean = opt match
      case None() => true
      case _ => false

    def orElse[A, B >: A](opt: Option[A], orElse: B): B = opt match
      case Some(a) => a
      case _ => orElse

    def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = opt match
      case Some(a) => f(a)
      case _ => None()

    def filter[A](opt: Option[A])(pred: A => Boolean): Option[A] = opt match
      case Some(n) if pred(n) => Some(n)
      case _ => None()

    def map[A](opt: Option[A])(pred: A => Boolean): Option[Boolean] = opt match
      case Some(n) if pred(n) => Some(true)
      case Some(n) if !pred(n) => Some(false)
      case _ => None()

    def map2[A,B,C](opt1: Option[A])(opt2: Option[B])(f: (A,B) => C) = (opt1,opt2) match
      case (Some(n), Some(m)) => Some(f(n,m))
      case _ => None()
}