package yarnwrap.recipe;
public class RecipeFinder { public net.minecraft.recipe.RecipeFinder wrapperContained; public RecipeFinder(net.minecraft.recipe.RecipeFinder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.RecipeMatcher recipeMatcher() { return new yarnwrap.recipe.RecipeMatcher(wrapperContained.recipeMatcher); }
// public void recipeMatcher(yarnwrap.recipe.RecipeMatcher value) { wrapperContained.recipeMatcher = value.wrapperContained; }
// public static yarnwrap.recipe.RecipeMatcher recipeMatcher() { return new yarnwrap.recipe.RecipeMatcher(net.minecraft.recipe.RecipeFinder.recipeMatcher); }
// public static void recipeMatcher(yarnwrap.recipe.RecipeMatcher value, ) { net.minecraft.recipe.RecipeFinder.recipeMatcher = value.wrapperContained; }

public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.recipe.RecipeFinder.clear(); }
public void addInputIfUsable(yarnwrap.item.ItemStack item) { wrapperContained.addInputIfUsable(item.wrapperContained); }
// public static void addInputIfUsable(yarnwrap.item.ItemStack item, ) { net.minecraft.recipe.RecipeFinder.addInputIfUsable(item.wrapperContained); }
public void addInput(yarnwrap.item.ItemStack item,int maxCount) { wrapperContained.addInput(item.wrapperContained,maxCount); }
// public static void addInput(yarnwrap.item.ItemStack item,int maxCount, ) { net.minecraft.recipe.RecipeFinder.addInput(item.wrapperContained,maxCount); }
// public boolean isCraftable(yarnwrap.recipe.Recipe recipe,int quantity,Object itemCallback) { return wrapperContained.isCraftable(recipe.wrapperContained,quantity,itemCallback); }
// public static boolean isCraftable(yarnwrap.recipe.Recipe recipe,int quantity,Object itemCallback, ) { return net.minecraft.recipe.RecipeFinder.isCraftable(recipe.wrapperContained,quantity,itemCallback); }
// public boolean isCraftable(yarnwrap.recipe.Recipe recipe,Object itemCallback) { return wrapperContained.isCraftable(recipe.wrapperContained,itemCallback); }
// public static boolean isCraftable(yarnwrap.recipe.Recipe recipe,Object itemCallback, ) { return net.minecraft.recipe.RecipeFinder.isCraftable(recipe.wrapperContained,itemCallback); }
public void addInput(yarnwrap.item.ItemStack item) { wrapperContained.addInput(item.wrapperContained); }
// public static void addInput(yarnwrap.item.ItemStack item, ) { net.minecraft.recipe.RecipeFinder.addInput(item.wrapperContained); }
// public int countCrafts(yarnwrap.recipe.Recipe recipe,int max,Object itemCallback) { return wrapperContained.countCrafts(recipe.wrapperContained,max,itemCallback); }
// public static int countCrafts(yarnwrap.recipe.Recipe recipe,int max,Object itemCallback, ) { return net.minecraft.recipe.RecipeFinder.countCrafts(recipe.wrapperContained,max,itemCallback); }
// public int countCrafts(yarnwrap.recipe.Recipe recipe,Object itemCallback) { return wrapperContained.countCrafts(recipe.wrapperContained,itemCallback); }
// public static int countCrafts(yarnwrap.recipe.Recipe recipe,Object itemCallback, ) { return net.minecraft.recipe.RecipeFinder.countCrafts(recipe.wrapperContained,itemCallback); }
// public boolean isCraftable(java.util.List rawIngredients,int quantity,Object itemCallback) { return wrapperContained.isCraftable(rawIngredients,quantity,itemCallback); }
// public static boolean isCraftable(java.util.List rawIngredients,int quantity,Object itemCallback, ) { return net.minecraft.recipe.RecipeFinder.isCraftable(rawIngredients,quantity,itemCallback); }
// public boolean isCraftable(java.util.List rawIngredients,Object itemCallback) { return wrapperContained.isCraftable(rawIngredients,itemCallback); }
// public static boolean isCraftable(java.util.List rawIngredients,Object itemCallback, ) { return net.minecraft.recipe.RecipeFinder.isCraftable(rawIngredients,itemCallback); }

}