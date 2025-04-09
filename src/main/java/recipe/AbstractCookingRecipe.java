package yarnwrap.recipe;
public class AbstractCookingRecipe { public net.minecraft.recipe.AbstractCookingRecipe wrapperContained; public AbstractCookingRecipe(net.minecraft.recipe.AbstractCookingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.RecipeType type() { return new yarnwrap.recipe.RecipeType(wrapperContained.type); }
// public yarnwrap.recipe.book.CookingRecipeCategory category() { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.category); }
// public float experience() { return wrapperContained.experience; }
// public int cookingTime() { return wrapperContained.cookingTime; }
// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }
// public yarnwrap.recipe.Ingredient ingredient() { return new yarnwrap.recipe.Ingredient(wrapperContained.ingredient); }
// public java.lang.String group() { return wrapperContained.group; }
public yarnwrap.recipe.book.CookingRecipeCategory getCategory() { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.getCategory()); }
public int getCookingTime() { return wrapperContained.getCookingTime(); }
public float getExperience() { return wrapperContained.getExperience(); }

}