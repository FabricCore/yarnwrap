package yarnwrap.recipe;
public class RecipeMatcher { public net.minecraft.recipe.RecipeMatcher wrapperContained; public RecipeMatcher(net.minecraft.recipe.RecipeMatcher wrapperContained) { this.wrapperContained = wrapperContained; }

public it.unimi.dsi.fastutil.ints.Int2IntMap inputs() { return wrapperContained.inputs; }
// public void inputs(it.unimi.dsi.fastutil.ints.Int2IntMap value) { wrapperContained.inputs = value; }
// public static it.unimi.dsi.fastutil.ints.Int2IntMap inputs() { return net.minecraft.recipe.RecipeMatcher.inputs; }
// public static void inputs(it.unimi.dsi.fastutil.ints.Int2IntMap value, ) { net.minecraft.recipe.RecipeMatcher.inputs = value; }

public void addInput(yarnwrap.item.ItemStack stack,int maxCount) { wrapperContained.addInput(stack.wrapperContained,maxCount); }
// public static void addInput(yarnwrap.item.ItemStack stack,int maxCount, ) { net.minecraft.recipe.RecipeMatcher.addInput(stack.wrapperContained,maxCount); }
public void addInput(yarnwrap.item.ItemStack stack) { wrapperContained.addInput(stack.wrapperContained); }
// public static void addInput(yarnwrap.item.ItemStack stack, ) { net.minecraft.recipe.RecipeMatcher.addInput(stack.wrapperContained); }
// public void addInput(int itemId,int count) { wrapperContained.addInput(itemId,count); }
// public static void addInput(int itemId,int count, ) { net.minecraft.recipe.RecipeMatcher.addInput(itemId,count); }
public boolean match(yarnwrap.recipe.Recipe recipe,it.unimi.dsi.fastutil.ints.IntList output) { return wrapperContained.match(recipe.wrapperContained,output); }
// public static boolean match(yarnwrap.recipe.Recipe recipe,it.unimi.dsi.fastutil.ints.IntList output, ) { return net.minecraft.recipe.RecipeMatcher.match(recipe.wrapperContained,output); }
public int countCrafts(yarnwrap.recipe.RecipeEntry recipe,int limit,it.unimi.dsi.fastutil.ints.IntList output) { return wrapperContained.countCrafts(recipe.wrapperContained,limit,output); }
// public static int countCrafts(yarnwrap.recipe.RecipeEntry recipe,int limit,it.unimi.dsi.fastutil.ints.IntList output, ) { return net.minecraft.recipe.RecipeMatcher.countCrafts(recipe.wrapperContained,limit,output); }
public void addUnenchantedInput(yarnwrap.item.ItemStack stack) { wrapperContained.addUnenchantedInput(stack.wrapperContained); }
// public static void addUnenchantedInput(yarnwrap.item.ItemStack stack, ) { net.minecraft.recipe.RecipeMatcher.addUnenchantedInput(stack.wrapperContained); }
// public yarnwrap.item.ItemStack getStackFromId(int itemId) { return new yarnwrap.item.ItemStack(wrapperContained.getStackFromId(itemId)); }
// public static yarnwrap.item.ItemStack getStackFromId(int itemId, ) { return new yarnwrap.item.ItemStack(net.minecraft.recipe.RecipeMatcher.getStackFromId(itemId)); }
public boolean match(yarnwrap.recipe.Recipe recipe,it.unimi.dsi.fastutil.ints.IntList output,int multiplier) { return wrapperContained.match(recipe.wrapperContained,output,multiplier); }
// public static boolean match(yarnwrap.recipe.Recipe recipe,it.unimi.dsi.fastutil.ints.IntList output,int multiplier, ) { return net.minecraft.recipe.RecipeMatcher.match(recipe.wrapperContained,output,multiplier); }
public int countCrafts(yarnwrap.recipe.RecipeEntry recipe,it.unimi.dsi.fastutil.ints.IntList output) { return wrapperContained.countCrafts(recipe.wrapperContained,output); }
// public static int countCrafts(yarnwrap.recipe.RecipeEntry recipe,it.unimi.dsi.fastutil.ints.IntList output, ) { return net.minecraft.recipe.RecipeMatcher.countCrafts(recipe.wrapperContained,output); }
// public int getItemId(yarnwrap.item.ItemStack stack) { return wrapperContained.getItemId(stack.wrapperContained); }
// public static int getItemId(yarnwrap.item.ItemStack stack, ) { return net.minecraft.recipe.RecipeMatcher.getItemId(stack.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.recipe.RecipeMatcher.clear(); }
// public boolean contains(int itemId) { return wrapperContained.contains(itemId); }
// public static boolean contains(int itemId, ) { return net.minecraft.recipe.RecipeMatcher.contains(itemId); }
// public int consume(int itemId,int count) { return wrapperContained.consume(itemId,count); }
// public static int consume(int itemId,int count, ) { return net.minecraft.recipe.RecipeMatcher.consume(itemId,count); }

}