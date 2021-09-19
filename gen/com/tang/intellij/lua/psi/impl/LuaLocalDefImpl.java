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
import com.tang.intellij.lua.stubs.LuaLocalDefStub;
import com.tang.intellij.lua.psi.*;
import com.intellij.psi.search.SearchScope;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class LuaLocalDefImpl extends StubBasedPsiElementBase<LuaLocalDefStub> implements LuaLocalDef {

  public LuaLocalDefImpl(@NotNull LuaLocalDefStub stub, @NotNull IStubElementType<?, ?> nodeType) {
    super(stub, nodeType);
  }

  public LuaLocalDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public LuaLocalDefImpl(LuaLocalDefStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull LuaVisitor visitor) {
    visitor.visitLocalDef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaVisitor) accept((LuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return notNullChild(findChildByType(ID));
  }

  @Override
  @NotNull
  public String getName() {
    return LuaPsiImplUtilKt.getName(this);
  }

  @Override
  @NotNull
  public PsiElement setName(@NotNull String name) {
    return LuaPsiImplUtilKt.setName(this, name);
  }

  @Override
  @NotNull
  public PsiElement getNameIdentifier() {
    return LuaPsiImplUtilKt.getNameIdentifier(this);
  }

  @Override
  @NotNull
  public SearchScope getUseScope() {
    return LuaPsiImplUtilKt.getUseScope(this);
  }

  @Override
  @Nullable
  public LuaCloseAttribute getClose() {
    return PsiTreeUtil.getChildOfType(this, LuaCloseAttribute.class);
  }

  @Override
  @Nullable
  public LuaConstAttribute getConst() {
    return PsiTreeUtil.getChildOfType(this, LuaConstAttribute.class);
  }

}
