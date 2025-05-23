package yarnwrap.recipe;
public class ServerRecipeManager { public net.minecraft.recipe.ServerRecipeManager wrapperContained; public ServerRecipeManager(net.minecraft.recipe.ServerRecipeManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.recipe.ServerRecipeManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.recipe.ServerRecipeManager.LOGGER = value; }

// public Object registries() { return wrapperContained.registries; }
// // public void registries(Object value) { wrapperContained.registries = value; }
// // public static Object registries() { return net.minecraft.recipe.ServerRecipeManager.registries; }
// // public static void registries(Object value, ) { net.minecraft.recipe.ServerRecipeManager.registries = value; }

// public yarnwrap.recipe.PreparedRecipes preparedRecipes() { return new yarnwrap.recipe.PreparedRecipes(wrapperContained.preparedRecipes); }
// public void preparedRecipes(yarnwrap.recipe.PreparedRecipes value) { wrapperContained.preparedRecipes = value.wrapperContained; }
// public static yarnwrap.recipe.PreparedRecipes preparedRecipes() { return new yarnwrap.recipe.PreparedRecipes(net.minecraft.recipe.ServerRecipeManager.preparedRecipes); }
// public static void preparedRecipes(yarnwrap.recipe.PreparedRecipes value, ) { net.minecraft.recipe.ServerRecipeManager.preparedRecipes = value.wrapperContained; }

// public java.util.Map propertySets() { return wrapperContained.propertySets; }
// public void propertySets(java.util.Map value) { wrapperContained.propertySets = value; }
// public static java.util.Map propertySets() { return net.minecraft.recipe.ServerRecipeManager.propertySets; }
// public static void propertySets(java.util.Map value, ) { net.minecraft.recipe.ServerRecipeManager.propertySets = value; }

// public Object stonecutterRecipes() { return wrapperContained.stonecutterRecipes; }
// // public void stonecutterRecipes(Object value) { wrapperContained.stonecutterRecipes = value; }
// // public static Object stonecutterRecipes() { return net.minecraft.recipe.ServerRecipeManager.stonecutterRecipes; }
// // public static void stonecutterRecipes(Object value, ) { net.minecraft.recipe.ServerRecipeManager.stonecutterRecipes = value; }

// public java.util.List recipes() { return wrapperContained.recipes; }
// public void recipes(java.util.List value) { wrapperContained.recipes = value; }
// public static java.util.List recipes() { return net.minecraft.recipe.ServerRecipeManager.recipes; }
// public static void recipes(java.util.List value, ) { net.minecraft.recipe.ServerRecipeManager.recipes = value; }

// public java.util.Map recipesByKey() { return wrapperContained.recipesByKey; }
// public void recipesByKey(java.util.Map value) { wrapperContained.recipesByKey = value; }
// public static java.util.Map recipesByKey() { return net.minecraft.recipe.ServerRecipeManager.recipesByKey; }
// public static void recipesByKey(java.util.Map value, ) { net.minecraft.recipe.ServerRecipeManager.recipesByKey = value; }

// public java.util.Map SOLE_INGREDIENT_GETTERS() { return wrapperContained.SOLE_INGREDIENT_GETTERS; }
// public void SOLE_INGREDIENT_GETTERS(java.util.Map value) { wrapperContained.SOLE_INGREDIENT_GETTERS = value; }
// public static java.util.Map SOLE_INGREDIENT_GETTERS() { return net.minecraft.recipe.ServerRecipeManager.SOLE_INGREDIENT_GETTERS; }
// public static void SOLE_INGREDIENT_GETTERS(java.util.Map value, ) { net.minecraft.recipe.ServerRecipeManager.SOLE_INGREDIENT_GETTERS = value; }

// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
// public static yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(net.minecraft.recipe.ServerRecipeManager.FINDER); }
// public static void FINDER(yarnwrap.resource.ResourceFinder value, ) { net.minecraft.recipe.ServerRecipeManager.FINDER = value.wrapperContained; }

// public ServerRecipeManager(Object registries) { this.wrapperContained = new net.minecraft.recipe.ServerRecipeManager(registries); }
public java.util.Collection values() { return wrapperContained.values(); }
// public static java.util.Collection values() { return net.minecraft.recipe.ServerRecipeManager.values(); }
public java.util.Optional get(yarnwrap.registry.RegistryKey key) { return wrapperContained.get(key.wrapperContained); }
// public static java.util.Optional get(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.recipe.ServerRecipeManager.get(key.wrapperContained); }
public java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world) { return wrapperContained.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained); }
// public static java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world, ) { return net.minecraft.recipe.ServerRecipeManager.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained); }
// public yarnwrap.recipe.RecipeEntry deserialize(yarnwrap.registry.RegistryKey key,com.google.gson.JsonObject json,Object registries) { return new yarnwrap.recipe.RecipeEntry(wrapperContained.deserialize(key.wrapperContained,json,registries)); }
// public static yarnwrap.recipe.RecipeEntry deserialize(yarnwrap.registry.RegistryKey key,com.google.gson.JsonObject json,Object registries, ) { return new yarnwrap.recipe.RecipeEntry(net.minecraft.recipe.ServerRecipeManager.deserialize(key.wrapperContained,json,registries)); }
public java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world,yarnwrap.registry.RegistryKey recipe) { return wrapperContained.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained,recipe.wrapperContained); }
// public static java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world,yarnwrap.registry.RegistryKey recipe, ) { return net.minecraft.recipe.ServerRecipeManager.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained,recipe.wrapperContained); }
// public Object createCachedMatchGetter(yarnwrap.recipe.RecipeType type) { return wrapperContained.createCachedMatchGetter(type.wrapperContained); }
// public static Object createCachedMatchGetter(yarnwrap.recipe.RecipeType type, ) { return net.minecraft.recipe.ServerRecipeManager.createCachedMatchGetter(type.wrapperContained); }
// public yarnwrap.recipe.RecipeEntry get(yarnwrap.recipe.RecipeType type,yarnwrap.registry.RegistryKey key) { return new yarnwrap.recipe.RecipeEntry(wrapperContained.get(type.wrapperContained,key.wrapperContained)); }
// public static yarnwrap.recipe.RecipeEntry get(yarnwrap.recipe.RecipeType type,yarnwrap.registry.RegistryKey key, ) { return new yarnwrap.recipe.RecipeEntry(net.minecraft.recipe.ServerRecipeManager.get(type.wrapperContained,key.wrapperContained)); }
public java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world,yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained,recipe.wrapperContained); }
// public static java.util.Optional getFirstMatch(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world,yarnwrap.recipe.RecipeEntry recipe, ) { return net.minecraft.recipe.ServerRecipeManager.getFirstMatch(type.wrapperContained,input.wrapperContained,world.wrapperContained,recipe.wrapperContained); }
public void forEachRecipeDisplay(yarnwrap.registry.RegistryKey key,java.util.function.Consumer action) { wrapperContained.forEachRecipeDisplay(key.wrapperContained,action); }
// public static void forEachRecipeDisplay(yarnwrap.registry.RegistryKey key,java.util.function.Consumer action, ) { net.minecraft.recipe.ServerRecipeManager.forEachRecipeDisplay(key.wrapperContained,action); }
public void initialize(yarnwrap.resource.featuretoggle.FeatureSet features) { wrapperContained.initialize(features.wrapperContained); }
// public static void initialize(yarnwrap.resource.featuretoggle.FeatureSet features, ) { net.minecraft.recipe.ServerRecipeManager.initialize(features.wrapperContained); }
// public boolean isEnabled(yarnwrap.resource.featuretoggle.FeatureSet features,yarnwrap.recipe.Ingredient ingredient) { return wrapperContained.isEnabled(features.wrapperContained,ingredient.wrapperContained); }
// public static boolean isEnabled(yarnwrap.resource.featuretoggle.FeatureSet features,yarnwrap.recipe.Ingredient ingredient, ) { return net.minecraft.recipe.ServerRecipeManager.isEnabled(features.wrapperContained,ingredient.wrapperContained); }
// public java.util.List filterIngredients(yarnwrap.resource.featuretoggle.FeatureSet features,java.util.List ingredients) { return wrapperContained.filterIngredients(features.wrapperContained,ingredients); }
// public static java.util.List filterIngredients(yarnwrap.resource.featuretoggle.FeatureSet features,java.util.List ingredients, ) { return net.minecraft.recipe.ServerRecipeManager.filterIngredients(features.wrapperContained,ingredients); }
// public boolean method_64684(yarnwrap.resource.featuretoggle.FeatureSet entry) { return wrapperContained.method_64684(entry.wrapperContained); }
// public static boolean method_64684(yarnwrap.resource.featuretoggle.FeatureSet entry, ) { return net.minecraft.recipe.ServerRecipeManager.method_64684(entry.wrapperContained); }
// public yarnwrap.registry.RegistryKey method_64685(Object recipe) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_64685(recipe)); }
// public static yarnwrap.registry.RegistryKey method_64685(Object recipe, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.recipe.ServerRecipeManager.method_64685(recipe)); }
public Object get(yarnwrap.recipe.NetworkRecipeId id) { return wrapperContained.get(id.wrapperContained); }
// public static Object get(yarnwrap.recipe.NetworkRecipeId id, ) { return net.minecraft.recipe.ServerRecipeManager.get(id.wrapperContained); }
// public int method_64687(it.unimi.dsi.fastutil.objects.Object2IntMap group) { return wrapperContained.method_64687(group); }
// public static int method_64687(it.unimi.dsi.fastutil.objects.Object2IntMap group, ) { return net.minecraft.recipe.ServerRecipeManager.method_64687(group); }
// public java.util.List collectServerRecipes(java.lang.Iterable recipes,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return wrapperContained.collectServerRecipes(recipes,enabledFeatures.wrapperContained); }
// public static java.util.List collectServerRecipes(java.lang.Iterable recipes,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures, ) { return net.minecraft.recipe.ServerRecipeManager.collectServerRecipes(recipes,enabledFeatures.wrapperContained); }
// public void method_64689(java.util.List id,yarnwrap.util.Identifier recipe) { wrapperContained.method_64689(id,recipe.wrapperContained); }
// public static void method_64689(java.util.List id,yarnwrap.util.Identifier recipe, ) { net.minecraft.recipe.ServerRecipeManager.method_64689(id,recipe.wrapperContained); }
// public void method_64691(java.util.function.Consumer recipe) { wrapperContained.method_64691(recipe); }
// public static void method_64691(java.util.function.Consumer recipe, ) { net.minecraft.recipe.ServerRecipeManager.method_64691(recipe); }
public java.util.Map getPropertySets() { return wrapperContained.getPropertySets(); }
// public static java.util.Map getPropertySets() { return net.minecraft.recipe.ServerRecipeManager.getPropertySets(); }
// public boolean method_64693(yarnwrap.resource.featuretoggle.FeatureSet ingredient) { return wrapperContained.method_64693(ingredient.wrapperContained); }
// public static boolean method_64693(yarnwrap.resource.featuretoggle.FeatureSet ingredient, ) { return net.minecraft.recipe.ServerRecipeManager.method_64693(ingredient.wrapperContained); }
public Object getStonecutterRecipeForSync() { return wrapperContained.getStonecutterRecipeForSync(); }
// public static Object getStonecutterRecipeForSync() { return net.minecraft.recipe.ServerRecipeManager.getStonecutterRecipeForSync(); }
// public yarnwrap.recipe.RecipePropertySet method_64984(yarnwrap.resource.featuretoggle.FeatureSet builder) { return new yarnwrap.recipe.RecipePropertySet(wrapperContained.method_64984(builder.wrapperContained)); }
// public static yarnwrap.recipe.RecipePropertySet method_64984(yarnwrap.resource.featuretoggle.FeatureSet builder, ) { return new yarnwrap.recipe.RecipePropertySet(net.minecraft.recipe.ServerRecipeManager.method_64984(builder.wrapperContained)); }
// public java.util.Optional method_64985(yarnwrap.recipe.Recipe recipe) { return wrapperContained.method_64985(recipe.wrapperContained); }
// public static java.util.Optional method_64985(yarnwrap.recipe.Recipe recipe, ) { return net.minecraft.recipe.ServerRecipeManager.method_64985(recipe.wrapperContained); }
// public void method_64986(yarnwrap.recipe.Recipe builder) { wrapperContained.method_64986(builder.wrapperContained); }
// public static void method_64986(yarnwrap.recipe.Recipe builder, ) { net.minecraft.recipe.ServerRecipeManager.method_64986(builder.wrapperContained); }
// public yarnwrap.registry.RegistryKey method_64987(Object builder) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_64987(builder)); }
// public static yarnwrap.registry.RegistryKey method_64987(Object builder, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.recipe.ServerRecipeManager.method_64987(builder)); }
// public java.util.Optional method_64988(yarnwrap.recipe.RecipeType recipe) { return wrapperContained.method_64988(recipe.wrapperContained); }
// public static java.util.Optional method_64988(yarnwrap.recipe.RecipeType recipe, ) { return net.minecraft.recipe.ServerRecipeManager.method_64988(recipe.wrapperContained); }
// public void method_64989(java.util.List recipe) { wrapperContained.method_64989(recipe); }
// public static void method_64989(java.util.List recipe, ) { net.minecraft.recipe.ServerRecipeManager.method_64989(recipe); }
// public Object method_64990(Object entry) { return wrapperContained.method_64990(entry); }
// public static Object method_64990(Object entry, ) { return net.minecraft.recipe.ServerRecipeManager.method_64990(entry); }
// public java.util.Optional method_64991(yarnwrap.recipe.Recipe recipe) { return wrapperContained.method_64991(recipe.wrapperContained); }
// public static java.util.Optional method_64991(yarnwrap.recipe.Recipe recipe, ) { return net.minecraft.recipe.ServerRecipeManager.method_64991(recipe.wrapperContained); }
// public Object cookingIngredientGetter(yarnwrap.recipe.RecipeType expectedType) { return wrapperContained.cookingIngredientGetter(expectedType.wrapperContained); }
// public static Object cookingIngredientGetter(yarnwrap.recipe.RecipeType expectedType, ) { return net.minecraft.recipe.ServerRecipeManager.cookingIngredientGetter(expectedType.wrapperContained); }
// public java.util.Optional method_64993(yarnwrap.recipe.Recipe recipe) { return wrapperContained.method_64993(recipe.wrapperContained); }
// public static java.util.Optional method_64993(yarnwrap.recipe.Recipe recipe, ) { return net.minecraft.recipe.ServerRecipeManager.method_64993(recipe.wrapperContained); }

}