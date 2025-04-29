package yarnwrap.recipe.input;
public class CraftingRecipeInput { public net.minecraft.recipe.input.CraftingRecipeInput wrapperContained; public CraftingRecipeInput(net.minecraft.recipe.input.CraftingRecipeInput wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.input.CraftingRecipeInput EMPTY() { return new yarnwrap.recipe.input.CraftingRecipeInput(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.recipe.input.CraftingRecipeInput value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.recipe.input.CraftingRecipeInput EMPTY() { return new yarnwrap.recipe.input.CraftingRecipeInput(net.minecraft.recipe.input.CraftingRecipeInput.EMPTY); }
// public static void EMPTY(yarnwrap.recipe.input.CraftingRecipeInput value, ) { net.minecraft.recipe.input.CraftingRecipeInput.EMPTY = value.wrapperContained; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.recipe.input.CraftingRecipeInput.width; }
// public static void width(int value, ) { net.minecraft.recipe.input.CraftingRecipeInput.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.recipe.input.CraftingRecipeInput.height; }
// public static void height(int value, ) { net.minecraft.recipe.input.CraftingRecipeInput.height = value; }

// public java.util.List stacks() { return wrapperContained.stacks; }
// public void stacks(java.util.List value) { wrapperContained.stacks = value; }
// public static java.util.List stacks() { return net.minecraft.recipe.input.CraftingRecipeInput.stacks; }
// public static void stacks(java.util.List value, ) { net.minecraft.recipe.input.CraftingRecipeInput.stacks = value; }

// public yarnwrap.recipe.RecipeMatcher matcher() { return new yarnwrap.recipe.RecipeMatcher(wrapperContained.matcher); }
// public void matcher(yarnwrap.recipe.RecipeMatcher value) { wrapperContained.matcher = value.wrapperContained; }
// public static yarnwrap.recipe.RecipeMatcher matcher() { return new yarnwrap.recipe.RecipeMatcher(net.minecraft.recipe.input.CraftingRecipeInput.matcher); }
// public static void matcher(yarnwrap.recipe.RecipeMatcher value, ) { net.minecraft.recipe.input.CraftingRecipeInput.matcher = value.wrapperContained; }

// public int stackCount() { return wrapperContained.stackCount; }
// public void stackCount(int value) { wrapperContained.stackCount = value; }
// public static int stackCount() { return net.minecraft.recipe.input.CraftingRecipeInput.stackCount; }
// public static void stackCount(int value, ) { net.minecraft.recipe.input.CraftingRecipeInput.stackCount = value; }

// public CraftingRecipeInput(int width,int height,java.util.List stacks) { this.wrapperContained = new net.minecraft.recipe.input.CraftingRecipeInput(width,height,stacks); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.recipe.input.CraftingRecipeInput.equals(o); }
public yarnwrap.item.ItemStack getStackInSlot(int x,int y) { return new yarnwrap.item.ItemStack(wrapperContained.getStackInSlot(x,y)); }
// public static yarnwrap.item.ItemStack getStackInSlot(int x,int y, ) { return new yarnwrap.item.ItemStack(net.minecraft.recipe.input.CraftingRecipeInput.getStackInSlot(x,y)); }
// public yarnwrap.recipe.input.CraftingRecipeInput create(int width,int height,java.util.List stacks) { return new yarnwrap.recipe.input.CraftingRecipeInput(wrapperContained.create(width,height,stacks)); }
// public static yarnwrap.recipe.input.CraftingRecipeInput create(int width,int height,java.util.List stacks, ) { return new yarnwrap.recipe.input.CraftingRecipeInput(net.minecraft.recipe.input.CraftingRecipeInput.create(width,height,stacks)); }
public yarnwrap.recipe.RecipeMatcher getRecipeMatcher() { return new yarnwrap.recipe.RecipeMatcher(wrapperContained.getRecipeMatcher()); }
// public static yarnwrap.recipe.RecipeMatcher getRecipeMatcher() { return new yarnwrap.recipe.RecipeMatcher(net.minecraft.recipe.input.CraftingRecipeInput.getRecipeMatcher()); }
public java.util.List getStacks() { return wrapperContained.getStacks(); }
// public static java.util.List getStacks() { return net.minecraft.recipe.input.CraftingRecipeInput.getStacks(); }
public int getStackCount() { return wrapperContained.getStackCount(); }
// public static int getStackCount() { return net.minecraft.recipe.input.CraftingRecipeInput.getStackCount(); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.recipe.input.CraftingRecipeInput.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.recipe.input.CraftingRecipeInput.getHeight(); }
// public Object createPositioned(int width,int height,java.util.List stacks) { return wrapperContained.createPositioned(width,height,stacks); }
// public static Object createPositioned(int width,int height,java.util.List stacks, ) { return net.minecraft.recipe.input.CraftingRecipeInput.createPositioned(width,height,stacks); }

}