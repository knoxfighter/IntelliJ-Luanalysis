// This is a generated file. Not intended for manual editing.
package com.tang.intellij.lua.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tang.intellij.lua.psi.LuaTypes.*;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.tang.intellij.lua.stubs.LuaFuncBodyStub;
import com.tang.intellij.lua.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class LuaFuncBodyImpl extends StubBasedPsiElementBase<LuaFuncBodyStub> implements LuaFuncBody {

  public LuaFuncBodyImpl(@NotNull LuaFuncBodyStub stub, @NotNull IStubElementType<?, ?> nodeType) {
    super(stub, nodeType);
  }

  public LuaFuncBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public LuaFuncBodyImpl(LuaFuncBodyStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull LuaVisitor visitor) {
    visitor.visitFuncBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaVisitor) accept((LuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LuaParamDef> getParamDefList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, LuaParamDef.class);
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

  @Override
  @Nullable
  public PsiElement getEllipsis() {
    return findChildByType(ELLIPSIS);
  }

}
