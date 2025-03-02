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
import com.tang.intellij.lua.stubs.LuaDocTagFieldStub;
import com.tang.intellij.lua.comment.psi.*;
import com.intellij.navigation.ItemPresentation;
import com.tang.intellij.lua.psi.Visibility;
import com.tang.intellij.lua.search.SearchContext;
import com.tang.intellij.lua.ty.ITy;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class LuaDocTagFieldImpl extends StubBasedPsiElementBase<LuaDocTagFieldStub> implements LuaDocTagField {

  public LuaDocTagFieldImpl(@NotNull LuaDocTagFieldStub stub, @NotNull IStubElementType type) {
    super(stub, type);
  }

  public LuaDocTagFieldImpl(@NotNull ASTNode node) {
    super(node);
  }

  public LuaDocTagFieldImpl(LuaDocTagFieldStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull LuaDocVisitor visitor) {
    visitor.visitTagField(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaDocVisitor) accept((LuaDocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LuaDocAccessModifier getAccessModifier() {
    return PsiTreeUtil.getChildOfType(this, LuaDocAccessModifier.class);
  }

  @Override
  @Nullable
  public LuaDocCommentString getCommentString() {
    return PsiTreeUtil.getChildOfType(this, LuaDocCommentString.class);
  }

  @Override
  @NotNull
  public List<LuaDocTy> getTyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LuaDocTy.class);
  }

  @Override
  @Nullable
  public LuaDocTypeRef getTypeRef() {
    return PsiTreeUtil.getChildOfType(this, LuaDocTypeRef.class);
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
  @Nullable
  public PsiElement getNameIdentifier() {
    return LuaDocPsiImplUtilKt.getNameIdentifier(this);
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
  public LuaDocTy getIndexType() {
    return LuaDocPsiImplUtilKt.getIndexType(this);
  }

  @Override
  @Nullable
  public LuaDocTy getValueType() {
    return LuaDocPsiImplUtilKt.getValueType(this);
  }

  @Override
  public int getTextOffset() {
    return LuaDocPsiImplUtilKt.getTextOffset(this);
  }

  @Override
  @NotNull
  public String toString() {
    return LuaDocPsiImplUtilKt.toString(this);
  }

  @Override
  @NotNull
  public ItemPresentation getPresentation() {
    return LuaDocPsiImplUtilKt.getPresentation(this);
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
