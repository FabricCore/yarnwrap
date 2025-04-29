package yarnwrap.recipe;
public class RecipeManager { public net.minecraft.recipe.RecipeManager wrapperContained; public RecipeManager(net.minecraft.recipe.RecipeManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public static com.google.gson.Gson GSON() { return net.minecraft.recipe.RecipeManager.GSON; }
// public static void GSON(com.google.gson.Gson value, ) { net.minecraft.recipe.RecipeManager.GSON = value; }

// public java.util.Map recipesById() { return wrapperContained.recipesById; }
// public void recipesById(java.util.Map value) { wrapperContained.recipesById = value; }
// public static java.util.Map recipesById() { return net.minecraft.recipe.RecipeManager.recipesById; }
// public static void recipesById(java.util.Map value, ) { net.minecraft.recipe.RecipeManager.recipesById = value; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
// // public static Object registryLookup() { return net.minecraft.recipe.RecipeManager.registryLookup; }
// // public static void registryLookup(Object value, ) { net.minecraft.recipe.RecipeManager.registryLookup = value; }

// public com.google.common.collect.Multimap recipesByType() { return wrapperContained.recipesByType; }
// public void recipesByType(com.google.common.collect.Multimap value) { wrapperContained.recipesByType = value; }
// public static com.google.common.collect.Multimap recipesByType() { return net.minecraft.recipe.RecipeManager.recipesByType; }
// public static void recipesByType(com.google.common.collect.Multimap value, ) { net.minecraft.recipe.RecipeManager.recipesByType = value; }

// public boolean errored() { return wrapperContained.errored; }
// public void errored(boolean value) { wrapperContained.errored = value; }
// public static boolean errored() { return net.minecraft.recipe.RecipeManager.errored; }
// public static void errored(boolean value, ) { net.minecraft.recipe.RecipeManager.errored = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.recipe.RecipeManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.recipe.RecipeManager.LOGGER = value; }

// public RecipeManager(Object registryLookup) { this.wrapperContained = new net.minecraft.recipe.RecipeManager(registryLookup); }
// public java.util.Collection getAllOfType(yarnwrap.recipe.RecipeType type) { return wrapperContained.getAllOfType(type.wrapperContained); }
// public static java.util.Collection getAllOfType(yarnwrap.recipe.RecipeType type, ) { return net.minecraft.recipe.RecipeManager.getAllOfType(type.wrapperContained); }
// public yarnwrap.recipe.RecipeEntry deserialize(yarnwrap.util.Identifier id,com.google.gson.JsonObject json,Object registryLookup) { return new yarnwrap.recipe.RecipeEntry(wrapperContained.deserialize(id.wrapperContained,json,registryLookup)); }
// public static yarnwrap.recipe.RecipeEntry deserialize(yarnwrap.util.Identifier id,com.google.gson.JsonObject json,Object registryLookup, ) { return new yarnwrap.recipe.RecipeEntry(net.minecraft.recipe.RecipeManager.deserialize(id.wrapperContained,json,registryLookup)); }
// public java.lang.String method_17876(yarnwrap.world.World entry) { return wrapperContained.method_17876(entry.wrapperContained); }
// public static java.lang.String method_17876(yarnwrap.world.World entry, ) { return net.minecraft.recipe.RecipeManager.method_17876(entry.wrapperContained); }
public java.util.List getAllMatches(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world) { return wrapperContained.getAllMatches(type.wrapperContained,input.wrapperContained,world.wrapperContained); }
// public static java.util.List getAllMatches(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world, ) { return net.minecraft.recipe.RecipeManager.getAllMatches(type.wrapperContained,input.wrapperContained,world.wrapperContained); }
public void setRecipes(java.lang.Iterable recipes) { wrapperContained.setRecipes(recipes); }
// public static void setRecipes(java.lang.Iterable recipes, ) { net.minecraft.recipe.RecipeManager.setRecipes(recipes); }
public java.util.List listAllOfType(yarnwrap.recipe.RecipeType type) { return wrapperContained.listAllOfType(type.wrapperContained); }
// public static java.util.List listAllOfType(yarnwrap.recipe.RecipeType type, ) { return net.minecraft.recipe.RecipeManager.listAllOfType(type.wrapperContained); }
public boolean isErrored() { return wrapperContained.isErrored(); }
// public static boolean isErrored() { return net.minecraft.recipe.RecipeManager.isErrored(); }
// public boolean method_42297(yarnwrap.recipe.input.RecipeInput recipe) { return wrapperContained.method_42297(recipe.wrapperContained); }
// public static boolean method_42297(yarnwrap.recipe.input.RecipeInput recipe, ) { return net.minecraft.recipe.RecipeManager.method_42297(recipe.wrapperContained); }
public java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world,yarnwrap.util.Identifier id) { return wrapperContained.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained,id.wrapperContained); }
// public static java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world,yarnwrap.util.Identifier id, ) { return net.minecraft.recipe.RecipeManager.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained,id.wrapperContained); }
// public boolean method_42301(yarnwrap.recipe.input.RecipeInput recipe) { return wrapperContained.method_42301(recipe.wrapperContained); }
// public static boolean method_42301(yarnwrap.recipe.input.RecipeInput recipe, ) { return net.minecraft.recipe.RecipeManager.method_42301(recipe.wrapperContained); }
// public Object createCachedMatchGetter(yarnwrap.recipe.RecipeType type) { return wrapperContained.createCachedMatchGetter(type.wrapperContained); }
// public static Object createCachedMatchGetter(yarnwrap.recipe.RecipeType type, ) { return net.minecraft.recipe.RecipeManager.createCachedMatchGetter(type.wrapperContained); }
// public yarnwrap.recipe.RecipeEntry get(yarnwrap.recipe.RecipeType type,yarnwrap.util.Identifier id) { return new yarnwrap.recipe.RecipeEntry(wrapperContained.get(type.wrapperContained,id.wrapperContained)); }
// public static yarnwrap.recipe.RecipeEntry get(yarnwrap.recipe.RecipeType type,yarnwrap.util.Identifier id, ) { return new yarnwrap.recipe.RecipeEntry(net.minecraft.recipe.RecipeManager.get(type.wrapperContained,id.wrapperContained)); }
public java.util.Collection sortedValues() { return wrapperContained.sortedValues(); }
// public static java.util.Collection sortedValues() { return net.minecraft.recipe.RecipeManager.sortedValues(); }
public java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world,yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained,recipe.wrapperContained); }
// public static java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world,yarnwrap.recipe.RecipeEntry recipe, ) { return net.minecraft.recipe.RecipeManager.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained,recipe.wrapperContained); }
public java.util.Collection values() { return wrapperContained.values(); }
// public static java.util.Collection values() { return net.minecraft.recipe.RecipeManager.values(); }
public java.util.stream.Stream keys() { return wrapperContained.keys(); }
// public static java.util.stream.Stream keys() { return net.minecraft.recipe.RecipeManager.keys(); }
public yarnwrap.util.collection.DefaultedList getRemainingStacks(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world) { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getRemainingStacks(type.wrapperContained,input.wrapperContained,world.wrapperContained)); }
// public static yarnwrap.util.collection.DefaultedList getRemainingStacks(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world, ) { return new yarnwrap.util.collection.DefaultedList(net.minecraft.recipe.RecipeManager.getRemainingStacks(type.wrapperContained,input.wrapperContained,world.wrapperContained)); }
public java.util.Optional get(yarnwrap.util.Identifier id) { return wrapperContained.get(id.wrapperContained); }
// public static java.util.Optional get(yarnwrap.util.Identifier id, ) { return net.minecraft.recipe.RecipeManager.get(id.wrapperContained); }
public java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world) { return wrapperContained.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained); }
// public static java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world, ) { return net.minecraft.recipe.RecipeManager.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained); }

}