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

object P04 {
	def lengthBuildIn[A](ls : List[A]):Int =
		ls.length

	def lengthRecursiveR[A](n : Int)(ls : List[A]):Int = ls match {
		case Nil => n
		case _ :: tail => lengthRecursiveR(n + 1)(tail)
	}

	def lengthRecursive[A](ls : List[A]):Int = lengthRecursiveR(0)(ls)
}
