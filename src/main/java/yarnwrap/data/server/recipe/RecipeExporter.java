package yarnwrap.data.server.recipe;
public class RecipeExporter { public net.minecraft.data.server.recipe.RecipeExporter wrapperContained; public RecipeExporter(net.minecraft.data.server.recipe.RecipeExporter wrapperContained) { this.wrapperContained = wrapperContained; }

public Object getAdvancementBuilder() { return wrapperContained.getAdvancementBuilder(); }
// public static Object getAdvancementBuilder() { return net.minecraft.data.server.recipe.RecipeExporter.getAdvancementBuilder(); }
public void accept(yarnwrap.util.Identifier recipeId,yarnwrap.recipe.Recipe recipe,yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.accept(recipeId.wrapperContained,recipe.wrapperContained,advancement.wrapperContained); }
// public static void accept(yarnwrap.util.Identifier recipeId,yarnwrap.recipe.Recipe recipe,yarnwrap.advancement.AdvancementEntry advancement, ) { net.minecraft.data.server.recipe.RecipeExporter.accept(recipeId.wrapperContained,recipe.wrapperContained,advancement.wrapperContained); }

}