package yarnwrap.recipe.input;
public class CraftingRecipeInput { public net.minecraft.recipe.input.CraftingRecipeInput wrapperContained; public CraftingRecipeInput(net.minecraft.recipe.input.CraftingRecipeInput wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.recipe.input.CraftingRecipeInput EMPTY() { return new yarnwrap.recipe.input.CraftingRecipeInput(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.recipe.input.CraftingRecipeInput value) { wrapperContained.EMPTY = value.wrapperContained; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public java.util.List stacks() { return wrapperContained.stacks; }
// public void stacks(java.util.List value) { wrapperContained.stacks = value; }
// public yarnwrap.recipe.RecipeMatcher matcher() { return new yarnwrap.recipe.RecipeMatcher(wrapperContained.matcher); }
// public void matcher(yarnwrap.recipe.RecipeMatcher value) { wrapperContained.matcher = value.wrapperContained; }
// public int stackCount() { return wrapperContained.stackCount; }
// public void stackCount(int value) { wrapperContained.stackCount = value; }
// public CraftingRecipeInput(int width,int height,java.util.List stacks) { this.wrapperContained = new net.minecraft.recipe.input.CraftingRecipeInput(width,height,stacks); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.item.ItemStack getStackInSlot(int x,int y) { return new yarnwrap.item.ItemStack(wrapperContained.getStackInSlot(x,y)); }
public yarnwrap.recipe.input.CraftingRecipeInput create(int width,int height,java.util.List stacks) { return new yarnwrap.recipe.input.CraftingRecipeInput(wrapperContained.create(width,height,stacks)); }
public yarnwrap.recipe.RecipeMatcher getRecipeMatcher() { return new yarnwrap.recipe.RecipeMatcher(wrapperContained.getRecipeMatcher()); }
public java.util.List getStacks() { return wrapperContained.getStacks(); }
public int getStackCount() { return wrapperContained.getStackCount(); }
public int getWidth() { return wrapperContained.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
public Object createPositioned(int width,int height,java.util.List stacks) { return wrapperContained.createPositioned(width,height,stacks); }

}