package yarnwrap.recipe;
public class RecipeMatcher { public net.minecraft.recipe.RecipeMatcher wrapperContained; public RecipeMatcher(net.minecraft.recipe.RecipeMatcher wrapperContained) { this.wrapperContained = wrapperContained; }

public it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap available() { return wrapperContained.available; }
// public void available(it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap value) { wrapperContained.available = value; }
// public static it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap available() { return net.minecraft.recipe.RecipeMatcher.available; }
// public static void available(it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap value, ) { net.minecraft.recipe.RecipeMatcher.available = value; }

// public void addInput(java.lang.Object input,int count) { wrapperContained.addInput(input,count); }
// public static void addInput(java.lang.Object input,int count, ) { net.minecraft.recipe.RecipeMatcher.addInput(input,count); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.recipe.RecipeMatcher.clear(); }
// public void consume(java.lang.Object input,int count) { wrapperContained.consume(input,count); }
// public static void consume(java.lang.Object input,int count, ) { net.minecraft.recipe.RecipeMatcher.consume(input,count); }
public void add(java.lang.Object input,int count) { wrapperContained.add(input,count); }
// public static void add(java.lang.Object input,int count, ) { net.minecraft.recipe.RecipeMatcher.add(input,count); }
// public boolean match(java.util.List ingredients,int quantity,Object itemCallback) { return wrapperContained.match(ingredients,quantity,itemCallback); }
// public static boolean match(java.util.List ingredients,int quantity,Object itemCallback, ) { return net.minecraft.recipe.RecipeMatcher.match(ingredients,quantity,itemCallback); }
// public boolean hasAtLeast(java.lang.Object input,int minimum) { return wrapperContained.hasAtLeast(input,minimum); }
// public static boolean hasAtLeast(java.lang.Object input,int minimum, ) { return net.minecraft.recipe.RecipeMatcher.hasAtLeast(input,minimum); }
// public int countCrafts(java.util.List ingredients,int max,Object itemCallback) { return wrapperContained.countCrafts(ingredients,max,itemCallback); }
// public static int countCrafts(java.util.List ingredients,int max,Object itemCallback, ) { return net.minecraft.recipe.RecipeMatcher.countCrafts(ingredients,max,itemCallback); }
// public java.util.List createItemRequirementList(java.lang.Iterable ingredients) { return wrapperContained.createItemRequirementList(ingredients); }
// public static java.util.List createItemRequirementList(java.lang.Iterable ingredients, ) { return net.minecraft.recipe.RecipeMatcher.createItemRequirementList(ingredients); }
// public boolean anyAccept(java.lang.Iterable ingredients,java.lang.Object item) { return wrapperContained.anyAccept(ingredients,item); }
// public static boolean anyAccept(java.lang.Iterable ingredients,java.lang.Object item, ) { return net.minecraft.recipe.RecipeMatcher.anyAccept(ingredients,item); }
public int getMaximumCrafts(java.util.List ingredients) { return wrapperContained.getMaximumCrafts(ingredients); }
// public static int getMaximumCrafts(java.util.List ingredients, ) { return net.minecraft.recipe.RecipeMatcher.getMaximumCrafts(ingredients); }

}