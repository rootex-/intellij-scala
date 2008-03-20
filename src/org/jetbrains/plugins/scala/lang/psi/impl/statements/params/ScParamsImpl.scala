package org.jetbrains.plugins.scala.lang.psi.impl.statements.params

import org.jetbrains.plugins.scala.lang.lexer.ScalaTokenTypes
import org.jetbrains.plugins.scala.lang.parser.ScalaElementTypes
import org.jetbrains.plugins.scala.lang.psi.ScalaPsiElementImpl





import com.intellij.psi.tree.TokenSet
import com.intellij.lang.ASTNode
import com.intellij.psi.tree.IElementType;
import com.intellij.psi._

import org.jetbrains.annotations._
import org.jetbrains.plugins.scala.lang.formatting.patterns.indent._
import org.jetbrains.plugins.scala.lang.psi.impl.ScalaPsiElementFactory
import org.jetbrains.plugins.scala.icons.Icons


import org.jetbrains.plugins.scala.lang.psi.api.statements.params._


/** 
* Created by IntelliJ IDEA.
* User: Alexander.Podkhalyuz
* Date: 22.02.2008
* Time: 11:22:33
* To change this template use File | Settings | File Templates.
*/

class ScParamsImpl(node: ASTNode) extends ScalaPsiElementImpl(node) with ScParams {
  override def toString: String = "Parameters"
}