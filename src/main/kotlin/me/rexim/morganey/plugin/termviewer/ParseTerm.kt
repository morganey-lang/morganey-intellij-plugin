/*
    The MIT License (MIT)
    
    morganey-intellij-plugin Copyright (c) 2016 thoma
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
*/

package me.rexim.morganey.plugin.termviewer

import me.rexim.morganey.ast.LambdaTerm
import me.rexim.morganey.syntax.LambdaParser
import me.rexim.morganey.util.*
import scala.Option
import scala.Some

/**
 * Created by thoma on 01/10/2016.
 */

object ParseTerm {
    val lambdaParser = LambdaParser()
    @JvmStatic fun parse(term : String) : Option<LambdaTerm>? {
        val termParse = lambdaParser.parse(lambdaParser.term(), term)
        if (termParse != null)
            return Some<LambdaTerm>(termParse.get()) as Option<LambdaTerm>
        else
            return null
    }
}
