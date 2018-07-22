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

object P17 {
  def split[A](n: Int, ls: List[A]): (List[A], List[A]) =
    (ls.slice(0, n), ls.slice(n, ls.length + 1))

  def splitBuiltin[A](n: Int, ls: List[A]): (List[A], List[A]) =
    ls.splitAt(n)

  def splitRecursive[A](n: Int, ls: List[A]): (List[A], List[A]) = (n, ls) match {
    case (_, Nil) => (Nil, Nil)
    case (0, list) => (Nil, list)
    case (n, h :: tail) => {
      val (pre, post) = splitRecursive(n-1, tail)
      (h :: pre, post)
    }
  }

  def splitTailRecursive[A](n: Int, ls: List[A]): (List[A], List[A]) = {
    def splitR(curN: Int, curL: List[A], pre: List[A]): (List[A], List[A]) = (curN, curL) match {
      case (_, Nil) => (pre, Nil)
      case (0, list) => (pre, list)
      case (n, h :: t) => splitR(n - 1, t, pre :+ h)
    }
    splitR(n, ls, Nil)
  }
}