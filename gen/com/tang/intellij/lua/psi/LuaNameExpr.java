// This is a generated file. Not intended for manual editing.
package com.tang.intellij.lua.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.tang.intellij.lua.stubs.LuaNameExprStub;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.StubBasedPsiElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;

public interface LuaNameExpr extends LuaModuleField, LuaExpression<LuaNameExprStub>, PsiNameIdentifierOwner, StubBasedPsiElement<LuaNameExprStub> {

  @NotNull
  PsiElement getId();

  @NotNull
  PsiElement setName(@NotNull String name);

  @NotNull
  String getName();

  @NotNull
  PsiElement getNameIdentifier();

  @NotNull
  ItemPresentation getPresentation();

  @NotNull
  PsiReference[] getReferences();

  boolean isDeprecated();

  boolean isExplicitlyTyped();

}
