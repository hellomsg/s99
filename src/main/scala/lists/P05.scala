// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package lists

object P05 {
  def reverseBuiltin[A](ls : List[A]):List[A] =
    ls.reverse

  def reverseRecursive[A](ls : List[A]):List[A] = {
    def reverseRecursiveR[A](result : List[A], ls : List[A]) : List[A] = ls match {
      case Nil => result
      case h :: tail => reverseRecursiveR(h::result,tail)
    }
    reverseRecursiveR(Nil, ls)
  }

  def reverseFunctional[A] (ls : List[A]) : List[A] =
    ls.foldLeft(List[A]())((r, h) => h::r)
}
