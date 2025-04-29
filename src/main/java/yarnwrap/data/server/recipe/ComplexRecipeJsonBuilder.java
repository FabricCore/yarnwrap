package yarnwrap.data.server.recipe;
public class ComplexRecipeJsonBuilder { public net.minecraft.data.server.recipe.ComplexRecipeJsonBuilder wrapperContained; public ComplexRecipeJsonBuilder(net.minecraft.data.server.recipe.ComplexRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function recipeFactory() { return wrapperContained.recipeFactory; }
// public void recipeFactory(java.util.function.Function value) { wrapperContained.recipeFactory = value; }
// public static java.util.function.Function recipeFactory() { return net.minecraft.data.server.recipe.ComplexRecipeJsonBuilder.recipeFactory; }
// public static void recipeFactory(java.util.function.Function value, ) { net.minecraft.data.server.recipe.ComplexRecipeJsonBuilder.recipeFactory = value; }

public ComplexRecipeJsonBuilder(java.util.function.Function recipeFactory) { this.wrapperContained = new net.minecraft.data.server.recipe.ComplexRecipeJsonBuilder(recipeFactory); }
public void offerTo(yarnwrap.data.server.recipe.RecipeExporter exporter,yarnwrap.util.Identifier id) { wrapperContained.offerTo(exporter.wrapperContained,id.wrapperContained); }
// public static void offerTo(yarnwrap.data.server.recipe.RecipeExporter exporter,yarnwrap.util.Identifier id, ) { net.minecraft.data.server.recipe.ComplexRecipeJsonBuilder.offerTo(exporter.wrapperContained,id.wrapperContained); }
// public yarnwrap.data.server.recipe.ComplexRecipeJsonBuilder create(java.util.function.Function recipeFactory) { return new yarnwrap.data.server.recipe.ComplexRecipeJsonBuilder(wrapperContained.create(recipeFactory)); }
// public static yarnwrap.data.server.recipe.ComplexRecipeJsonBuilder create(java.util.function.Function recipeFactory, ) { return new yarnwrap.data.server.recipe.ComplexRecipeJsonBuilder(net.minecraft.data.server.recipe.ComplexRecipeJsonBuilder.create(recipeFactory)); }
public void offerTo(yarnwrap.data.server.recipe.RecipeExporter exporter,java.lang.String id) { wrapperContained.offerTo(exporter.wrapperContained,id); }
// public static void offerTo(yarnwrap.data.server.recipe.RecipeExporter exporter,java.lang.String id, ) { net.minecraft.data.server.recipe.ComplexRecipeJsonBuilder.offerTo(exporter.wrapperContained,id); }

}