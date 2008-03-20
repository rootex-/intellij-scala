package org.jetbrains.plugins.scala.lang.psi.impl.toplevel.templates

import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode

import org.jetbrains.plugins.scala.lang.parser.ScalaElementTypes
import org.jetbrains.plugins.scala.lang.lexer._
import org.jetbrains.plugins.scala.lang.psi.ScalaPsiElementImpl
import org.jetbrains.plugins.scala.lang.lexer.ScalaTokenTypes
import org.jetbrains.annotations._
import org.jetbrains.plugins.scala.lang.parser.ScalaElementTypes
import org.jetbrains.plugins.scala.lang.formatting.patterns.indent._
import org.jetbrains.plugins.scala.icons.Icons

import org.jetbrains.plugins.scala.lang.psi.api.toplevel.templates._

/** 
* Created by IntelliJ IDEA.
* User: Alexander.Podkhalyuz
* Date: 20.02.2008
* Time: 19:07:26
* To change this template use File | Settings | File Templates.
*/

class ScRequiresBlockImpl(node: ASTNode) extends ScalaPsiElementImpl(node) with ScRequiresBlock{
  override def toString: String = "RequiresBlock"
}