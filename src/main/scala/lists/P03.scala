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

object P03 {
	def nthBuiltin[A](ls : List[A], n : Int):A =
		if (n<0 || ls.length < n) throw new NoSuchElementException
		else ls(n)
	
	def nthRecursive[A](ls : List[A], n : Int):A = (n, ls) match {
		case (0, h :: _) => h
		case (n, _ :: tail) => nthRecursive(tail, n-1)
		case (_, Nil) => throw new NoSuchElementException
	}
}
