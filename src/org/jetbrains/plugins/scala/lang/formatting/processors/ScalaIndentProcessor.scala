package org.jetbrains.plugins.scala.lang.formatting.processors

import com.intellij.formatting._;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiComment;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiErrorElement;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import org.jetbrains.plugins.scala.lang.lexer.ScalaTokenTypes;
import org.jetbrains.plugins.scala.lang.psi.ScalaFile;
import org.jetbrains.plugins.scala.lang.parser.ScalaElementTypes;
import org.jetbrains.plugins.scala.lang.formatting.patterns.indent._
import com.intellij.psi.impl.source.tree.PsiErrorElementImpl



object ScalaIndentProcessor extends ScalaTokenTypes {

  def getChildIndent(parent: ScalaBlock, child: ASTNode): Indent =
    parent.getNode.getPsi match {
/*      case _: ScalaFile => Indent.getNoneIndent()
      case _: BlockedIndent => {
        child.getElementType match {
          case ScalaTokenTypes.tLBRACE |
          ScalaTokenTypes.tRBRACE |
          ScalaTokenTypes.kPACKAGE |
          ScalaElementTypes.QUAL_ID =>
            Indent.getNoneIndent()
          case _ => Indent.getNormalIndent()
        }
      }
      case x: ScPatternImpl => Indent.getNormalIndent
      case _: ContiniousIndent => Indent.getContinuationWithoutFirstIndent()
      case _: IfElseIndent => {
        child.getPsi match {
          case _: ScCaseClausesImpl => Indent.getNormalIndent()
          case _: ScalaExpression => {
            if (! child.getPsi.isInstanceOf[ScBlockExprImpl])
              Indent.getNormalIndent()
            else
              Indent.getNoneIndent()
          }
          case _: ScBlockImpl => Indent.getNormalIndent()
          case _ => Indent.getNoneIndent()
        }
      }*/
      case _ => Indent.getNoneIndent()
    }
}