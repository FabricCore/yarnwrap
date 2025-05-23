package yarnwrap.recipe;
public class PreparedRecipes { public net.minecraft.recipe.PreparedRecipes wrapperContained; public PreparedRecipes(net.minecraft.recipe.PreparedRecipes wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.PreparedRecipes EMPTY() { return new yarnwrap.recipe.PreparedRecipes(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.recipe.PreparedRecipes value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.recipe.PreparedRecipes EMPTY() { return new yarnwrap.recipe.PreparedRecipes(net.minecraft.recipe.PreparedRecipes.EMPTY); }
// public static void EMPTY(yarnwrap.recipe.PreparedRecipes value, ) { net.minecraft.recipe.PreparedRecipes.EMPTY = value.wrapperContained; }

// public com.google.common.collect.Multimap byType() { return wrapperContained.byType; }
// public void byType(com.google.common.collect.Multimap value) { wrapperContained.byType = value; }
// public static com.google.common.collect.Multimap byType() { return net.minecraft.recipe.PreparedRecipes.byType; }
// public static void byType(com.google.common.collect.Multimap value, ) { net.minecraft.recipe.PreparedRecipes.byType = value; }

// public java.util.Map byKey() { return wrapperContained.byKey; }
// public void byKey(java.util.Map value) { wrapperContained.byKey = value; }
// public static java.util.Map byKey() { return net.minecraft.recipe.PreparedRecipes.byKey; }
// public static void byKey(java.util.Map value, ) { net.minecraft.recipe.PreparedRecipes.byKey = value; }

// public PreparedRecipes(com.google.common.collect.Multimap byType,java.util.Map byKey) { this.wrapperContained = new net.minecraft.recipe.PreparedRecipes(byType,byKey); }
public java.util.Collection recipes() { return wrapperContained.recipes(); }
// public static java.util.Collection recipes() { return net.minecraft.recipe.PreparedRecipes.recipes(); }
public yarnwrap.recipe.RecipeEntry get(yarnwrap.registry.RegistryKey key) { return new yarnwrap.recipe.RecipeEntry(wrapperContained.get(key.wrapperContained)); }
// public static yarnwrap.recipe.RecipeEntry get(yarnwrap.registry.RegistryKey key, ) { return new yarnwrap.recipe.RecipeEntry(net.minecraft.recipe.PreparedRecipes.get(key.wrapperContained)); }
// public boolean method_64697(yarnwrap.recipe.input.RecipeInput entry) { return wrapperContained.method_64697(entry.wrapperContained); }
// public static boolean method_64697(yarnwrap.recipe.input.RecipeInput entry, ) { return net.minecraft.recipe.PreparedRecipes.method_64697(entry.wrapperContained); }
public java.util.Collection getAll(yarnwrap.recipe.RecipeType type) { return wrapperContained.getAll(type.wrapperContained); }
// public static java.util.Collection getAll(yarnwrap.recipe.RecipeType type, ) { return net.minecraft.recipe.PreparedRecipes.getAll(type.wrapperContained); }
public java.util.stream.Stream find(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world) { return wrapperContained.find(type.wrapperContained,input.wrapperContained,world.wrapperContained); }
// public static java.util.stream.Stream find(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world, ) { return net.minecraft.recipe.PreparedRecipes.find(type.wrapperContained,input.wrapperContained,world.wrapperContained); }
// public yarnwrap.recipe.PreparedRecipes of(java.lang.Iterable recipes) { return new yarnwrap.recipe.PreparedRecipes(wrapperContained.of(recipes)); }
// public static yarnwrap.recipe.PreparedRecipes of(java.lang.Iterable recipes, ) { return new yarnwrap.recipe.PreparedRecipes(net.minecraft.recipe.PreparedRecipes.of(recipes)); }

}