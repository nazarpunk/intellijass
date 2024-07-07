package raft.war.language.angelscript.lang

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import raft.war.language.angelscript.extapi.psi.AngelScriptPsiFileBase
import raft.war.language.angelscript.lexer.AngelScriptFlexAdapter
import raft.war.language.angelscript.psi.AngelScriptTokenSets

class AngelScriptParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = AngelScriptFlexAdapter()

    override fun getCommentTokens(): TokenSet = AngelScriptTokenSets.COMMENTS

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createParser(project: Project): PsiParser =
        raft.war.language.angelscript.grammar.AngelScriptParser()

    override fun getFileNodeType(): IFileElementType = ANGELSCRIPT_FILE

    override fun createFile(viewProvider: FileViewProvider): PsiFile = AngelScriptPsiFileBase(viewProvider)

    override fun createElement(node: ASTNode): PsiElement = raft.war.language.angelscript.psi.AngelScriptTypes.Factory.createElement(node)

}

val ANGELSCRIPT_FILE: IFileElementType = IFileElementType(AngelScriptLanguage.instance)
