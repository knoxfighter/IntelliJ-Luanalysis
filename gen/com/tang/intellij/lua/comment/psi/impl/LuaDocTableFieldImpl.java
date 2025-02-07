// This is a generated file. Not intended for manual editing.
package com.tang.intellij.lua.comment.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tang.intellij.lua.comment.psi.LuaDocTypes.*;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.tang.intellij.lua.stubs.LuaDocTableFieldStub;
import com.tang.intellij.lua.comment.psi.*;
import com.tang.intellij.lua.psi.Visibility;
import com.tang.intellij.lua.search.SearchContext;
import com.tang.intellij.lua.ty.ITy;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class LuaDocTableFieldImpl extends StubBasedPsiElementBase<LuaDocTableFieldStub> implements LuaDocTableField {

  public LuaDocTableFieldImpl(@NotNull LuaDocTableFieldStub stub, @NotNull IStubElementType type) {
    super(stub, type);
  }

  public LuaDocTableFieldImpl(@NotNull ASTNode node) {
    super(node);
  }

  public LuaDocTableFieldImpl(LuaDocTableFieldStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull LuaDocVisitor visitor) {
    visitor.visitTableField(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaDocVisitor) accept((LuaDocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LuaDocTy> getTyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LuaDocTy.class);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

  @Override
  @NotNull
  public ITy guessParentType(@NotNull SearchContext context) {
    return LuaDocPsiImplUtilKt.guessParentType(context, this);
  }

  @Override
  @NotNull
  public Visibility getVisibility() {
    return LuaDocPsiImplUtilKt.getVisibility(this);
  }

  @Override
  @NotNull
  public PsiElement setName(@NotNull String newName) {
    return LuaDocPsiImplUtilKt.setName(this, newName);
  }

  @Override
  @Nullable
  public String getName() {
    return LuaDocPsiImplUtilKt.getName(this);
  }

  @Override
  @Nullable
  public PsiElement getNameIdentifier() {
    return LuaDocPsiImplUtilKt.getNameIdentifier(this);
  }

  @Override
  @Nullable
  public LuaDocTy getIndexType() {
    return LuaDocPsiImplUtilKt.getIndexType(this);
  }

  @Override
  @Nullable
  public LuaDocTy getValueType() {
    return LuaDocPsiImplUtilKt.getValueType(this);
  }

  @Override
  @Nullable
  public ITy guessIndexType(@NotNull SearchContext context) {
    return LuaDocPsiImplUtilKt.guessIndexType(context, this);
  }

  @Override
  @NotNull
  public ITy guessType(@NotNull SearchContext context) {
    return LuaDocPsiImplUtilKt.guessType(context, this);
  }

  @Override
  public boolean isDeprecated() {
    return LuaDocPsiImplUtilKt.isDeprecated(this);
  }

  @Override
  public boolean isExplicitlyTyped() {
    return LuaDocPsiImplUtilKt.isExplicitlyTyped(this);
  }

  @Override
  @Nullable
  public PsiElement getLbrack() {
    return findChildByType(LBRACK);
  }

}
