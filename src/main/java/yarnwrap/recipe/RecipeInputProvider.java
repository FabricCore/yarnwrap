package yarnwrap.recipe;
public class RecipeInputProvider { public net.minecraft.recipe.RecipeInputProvider wrapperContained; public RecipeInputProvider(net.minecraft.recipe.RecipeInputProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public void provideRecipeInputs(yarnwrap.recipe.RecipeMatcher finder) { wrapperContained.provideRecipeInputs(finder.wrapperContained); }

}