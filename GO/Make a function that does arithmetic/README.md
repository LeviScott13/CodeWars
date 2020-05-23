# CodeWars
My CodeWars solutions

Problem:

Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.

a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.

The four operators are "add", "subtract", "divide", "multiply".

Example:

Arithmetic(5, 2, "add")      => returns 7
Arithmetic(5, 2, "subtract") => returns 3
Arithmetic(5, 2, "multiply") => returns 10
Arithmetic(5, 2, "divide")   => returns 2

Try to do it without using if statements!

Sample Tests:

// TODO: replace with your own tests (TDD). An example to get you started is included below.
// Ginkgo BDD Testing Framework <http://onsi.github.io/ginkgo></http:>
// Gomega Matcher Library <http://onsi.github.io/gomega></http:>

package kata_test
import (
  . "github.com/onsi/ginkgo"
  . "github.com/onsi/gomega"
  . "codewarrior/kata"
)
var _ = Describe("Test Example", func() {
   It("'add' should return the two numbers added together!", func() {
     Expect(Arithmetic(8,2,"add")).To(Equal(10))
   })
   It("'subtract' should return a minus b!", func() {
     Expect(Arithmetic(8,2,"subtract")).To(Equal(6))
   })
   It("'multiply' should return a multiplied by b!", func() {
     Expect(Arithmetic(8,2,"multiply")).To(Equal(16))
   })
   It("'divide' should return a divided by b!", func() {
     Expect(Arithmetic(8,2,"divide")).To(Equal(4))
   })
})