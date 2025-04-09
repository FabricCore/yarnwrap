package yarnwrap.recipe;
public class RecipeMatcher { public net.minecraft.recipe.RecipeMatcher wrapperContained; public RecipeMatcher(net.minecraft.recipe.RecipeMatcher wrapperContained) { this.wrapperContained = wrapperContained; }

public it.unimi.dsi.fastutil.ints.Int2IntMap inputs() { return wrapperContained.inputs; }
public void addInput(yarnwrap.item.ItemStack stack,int maxCount) { wrapperContained.addInput(stack.wrapperContained,maxCount); }
public void addInput(yarnwrap.item.ItemStack stack) { wrapperContained.addInput(stack.wrapperContained); }
// public void addInput(int itemId,int count) { wrapperContained.addInput(itemId,count); }
public boolean match(yarnwrap.recipe.Recipe recipe,it.unimi.dsi.fastutil.ints.IntList output) { return wrapperContained.match(recipe.wrapperContained,output); }
public int countCrafts(yarnwrap.recipe.RecipeEntry recipe,int limit,it.unimi.dsi.fastutil.ints.IntList output) { return wrapperContained.countCrafts(recipe.wrapperContained,limit,output); }
public void addUnenchantedInput(yarnwrap.item.ItemStack stack) { wrapperContained.addUnenchantedInput(stack.wrapperContained); }
public yarnwrap.item.ItemStack getStackFromId(int itemId) { return new yarnwrap.item.ItemStack(wrapperContained.getStackFromId(itemId)); }
public boolean match(yarnwrap.recipe.Recipe recipe,it.unimi.dsi.fastutil.ints.IntList output,int multiplier) { return wrapperContained.match(recipe.wrapperContained,output,multiplier); }
public int countCrafts(yarnwrap.recipe.RecipeEntry recipe,it.unimi.dsi.fastutil.ints.IntList output) { return wrapperContained.countCrafts(recipe.wrapperContained,output); }
public int getItemId(yarnwrap.item.ItemStack stack) { return wrapperContained.getItemId(stack.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public boolean contains(int itemId) { return wrapperContained.contains(itemId); }
// public int consume(int itemId,int count) { return wrapperContained.consume(itemId,count); }

}