package yarnwrap.recipe;
public class AbstractCookingRecipe { public net.minecraft.recipe.AbstractCookingRecipe wrapperContained; public AbstractCookingRecipe(net.minecraft.recipe.AbstractCookingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.RecipeType type() { return new yarnwrap.recipe.RecipeType(wrapperContained.type); }
// public void type(yarnwrap.recipe.RecipeType value) { wrapperContained.type = value.wrapperContained; }
// public yarnwrap.recipe.book.CookingRecipeCategory category() { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.CookingRecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public float experience() { return wrapperContained.experience; }
// public void experience(float value) { wrapperContained.experience = value; }
// public int cookingTime() { return wrapperContained.cookingTime; }
// public void cookingTime(int value) { wrapperContained.cookingTime = value; }
// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }
// public void result(yarnwrap.item.ItemStack value) { wrapperContained.result = value.wrapperContained; }
// public yarnwrap.recipe.Ingredient ingredient() { return new yarnwrap.recipe.Ingredient(wrapperContained.ingredient); }
// public void ingredient(yarnwrap.recipe.Ingredient value) { wrapperContained.ingredient = value.wrapperContained; }
// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public AbstractCookingRecipe(yarnwrap.recipe.RecipeType type,java.lang.String group,yarnwrap.recipe.book.CookingRecipeCategory category,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result,float experience,int cookingTime) { this.wrapperContained = new net.minecraft.recipe.AbstractCookingRecipe(type.wrapperContained,group,category.wrapperContained,ingredient.wrapperContained,result.wrapperContained,experience,cookingTime); }
public yarnwrap.recipe.book.CookingRecipeCategory getCategory() { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.getCategory()); }
public int getCookingTime() { return wrapperContained.getCookingTime(); }
public float getExperience() { return wrapperContained.getExperience(); }

}