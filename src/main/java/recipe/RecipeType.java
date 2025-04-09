package yarnwrap.recipe;
public class RecipeType { public net.minecraft.recipe.RecipeType wrapperContained; public RecipeType(net.minecraft.recipe.RecipeType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.RecipeType register(java.lang.String id) { return new yarnwrap.recipe.RecipeType(wrapperContained.register(id)); }

}