package yarnwrap.recipe;
public class AbstractCookingRecipe { public net.minecraft.recipe.AbstractCookingRecipe wrapperContained; public AbstractCookingRecipe(net.minecraft.recipe.AbstractCookingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public float experience() { return wrapperContained.experience; }
// public void experience(float value) { wrapperContained.experience = value; }
// public static float experience() { return net.minecraft.recipe.AbstractCookingRecipe.experience; }
// public static void experience(float value, ) { net.minecraft.recipe.AbstractCookingRecipe.experience = value; }

// public int cookingTime() { return wrapperContained.cookingTime; }
// public void cookingTime(int value) { wrapperContained.cookingTime = value; }
// public static int cookingTime() { return net.minecraft.recipe.AbstractCookingRecipe.cookingTime; }
// public static void cookingTime(int value, ) { net.minecraft.recipe.AbstractCookingRecipe.cookingTime = value; }

// public yarnwrap.recipe.book.CookingRecipeCategory category() { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.CookingRecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.CookingRecipeCategory category() { return new yarnwrap.recipe.book.CookingRecipeCategory(net.minecraft.recipe.AbstractCookingRecipe.category); }
// public static void category(yarnwrap.recipe.book.CookingRecipeCategory value, ) { net.minecraft.recipe.AbstractCookingRecipe.category = value.wrapperContained; }

// public AbstractCookingRecipe(java.lang.String group,yarnwrap.recipe.book.CookingRecipeCategory category,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result,float experience,int cookingTime) { this.wrapperContained = new net.minecraft.recipe.AbstractCookingRecipe(group,category.wrapperContained,ingredient.wrapperContained,result.wrapperContained,experience,cookingTime); }
public int getCookingTime() { return wrapperContained.getCookingTime(); }
// public static int getCookingTime() { return net.minecraft.recipe.AbstractCookingRecipe.getCookingTime(); }
public float getExperience() { return wrapperContained.getExperience(); }
// public static float getExperience() { return net.minecraft.recipe.AbstractCookingRecipe.getExperience(); }
public yarnwrap.recipe.book.CookingRecipeCategory getCategory() { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.getCategory()); }
// public static yarnwrap.recipe.book.CookingRecipeCategory getCategory() { return new yarnwrap.recipe.book.CookingRecipeCategory(net.minecraft.recipe.AbstractCookingRecipe.getCategory()); }
// public yarnwrap.item.Item getCookerItem() { return new yarnwrap.item.Item(wrapperContained.getCookerItem()); }
// public static yarnwrap.item.Item getCookerItem() { return new yarnwrap.item.Item(net.minecraft.recipe.AbstractCookingRecipe.getCookerItem()); }

}