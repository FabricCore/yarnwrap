package yarnwrap.recipe;
public class RecipeManager { public net.minecraft.recipe.RecipeManager wrapperContained; public RecipeManager(net.minecraft.recipe.RecipeManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public java.util.Map recipesById() { return wrapperContained.recipesById; }
// public Object registryLookup() { return wrapperContained.registryLookup; }
// public com.google.common.collect.Multimap recipesByType() { return wrapperContained.recipesByType; }
// public boolean errored() { return wrapperContained.errored; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Collection getAllOfType(yarnwrap.recipe.RecipeType type) { return wrapperContained.getAllOfType(type.wrapperContained); }
// public yarnwrap.recipe.RecipeEntry deserialize(yarnwrap.util.Identifier id,com.google.gson.JsonObject json,Object registryLookup) { return new yarnwrap.recipe.RecipeEntry(wrapperContained.deserialize(id.wrapperContained,json,registryLookup)); }
public java.util.List getAllMatches(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world) { return wrapperContained.getAllMatches(type.wrapperContained,input.wrapperContained,world.wrapperContained); }
public void setRecipes(java.lang.Iterable recipes) { wrapperContained.setRecipes(recipes); }
public java.util.List listAllOfType(yarnwrap.recipe.RecipeType type) { return wrapperContained.listAllOfType(type.wrapperContained); }
public boolean isErrored() { return wrapperContained.isErrored(); }
public java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world,yarnwrap.util.Identifier id) { return wrapperContained.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained,id.wrapperContained); }
public Object createCachedMatchGetter(yarnwrap.recipe.RecipeType type) { return wrapperContained.createCachedMatchGetter(type.wrapperContained); }
// public yarnwrap.recipe.RecipeEntry get(yarnwrap.recipe.RecipeType type,yarnwrap.util.Identifier id) { return new yarnwrap.recipe.RecipeEntry(wrapperContained.get(type.wrapperContained,id.wrapperContained)); }
public java.util.Collection sortedValues() { return wrapperContained.sortedValues(); }
public java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world,yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained,recipe.wrapperContained); }
public java.util.Collection values() { return wrapperContained.values(); }
public java.util.stream.Stream keys() { return wrapperContained.keys(); }
public yarnwrap.util.collection.DefaultedList getRemainingStacks(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world) { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getRemainingStacks(type.wrapperContained,input.wrapperContained,world.wrapperContained)); }
public java.util.Optional get(yarnwrap.util.Identifier id) { return wrapperContained.get(id.wrapperContained); }
public java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world) { return wrapperContained.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained); }

}