package yarnwrap.data.recipe;
public class ComplexRecipeJsonBuilder { public net.minecraft.data.recipe.ComplexRecipeJsonBuilder wrapperContained; public ComplexRecipeJsonBuilder(net.minecraft.data.recipe.ComplexRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function recipeFactory() { return wrapperContained.recipeFactory; }
// public void recipeFactory(java.util.function.Function value) { wrapperContained.recipeFactory = value; }
// public static java.util.function.Function recipeFactory() { return net.minecraft.data.recipe.ComplexRecipeJsonBuilder.recipeFactory; }
// public static void recipeFactory(java.util.function.Function value, ) { net.minecraft.data.recipe.ComplexRecipeJsonBuilder.recipeFactory = value; }

public ComplexRecipeJsonBuilder(java.util.function.Function recipeFactory) { this.wrapperContained = new net.minecraft.data.recipe.ComplexRecipeJsonBuilder(recipeFactory); }
public void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,yarnwrap.registry.RegistryKey recipeKey) { wrapperContained.offerTo(exporter.wrapperContained,recipeKey.wrapperContained); }
// public static void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,yarnwrap.registry.RegistryKey recipeKey, ) { net.minecraft.data.recipe.ComplexRecipeJsonBuilder.offerTo(exporter.wrapperContained,recipeKey.wrapperContained); }
// public yarnwrap.data.recipe.ComplexRecipeJsonBuilder create(java.util.function.Function recipeFactory) { return new yarnwrap.data.recipe.ComplexRecipeJsonBuilder(wrapperContained.create(recipeFactory)); }
// public static yarnwrap.data.recipe.ComplexRecipeJsonBuilder create(java.util.function.Function recipeFactory, ) { return new yarnwrap.data.recipe.ComplexRecipeJsonBuilder(net.minecraft.data.recipe.ComplexRecipeJsonBuilder.create(recipeFactory)); }
public void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,java.lang.String id) { wrapperContained.offerTo(exporter.wrapperContained,id); }
// public static void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,java.lang.String id, ) { net.minecraft.data.recipe.ComplexRecipeJsonBuilder.offerTo(exporter.wrapperContained,id); }

}