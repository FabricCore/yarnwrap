package yarnwrap.data.server.recipe;
public class CookingRecipeJsonBuilder { public net.minecraft.data.server.recipe.CookingRecipeJsonBuilder wrapperContained; public CookingRecipeJsonBuilder(net.minecraft.data.server.recipe.CookingRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public float experience() { return wrapperContained.experience; }
// public int cookingTime() { return wrapperContained.cookingTime; }
// public yarnwrap.item.Item output() { return new yarnwrap.item.Item(wrapperContained.output); }
// public yarnwrap.recipe.Ingredient input() { return new yarnwrap.recipe.Ingredient(wrapperContained.input); }
// public java.lang.String group() { return wrapperContained.group; }
// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public yarnwrap.recipe.book.CookingRecipeCategory cookingCategory() { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.cookingCategory); }
// public java.util.Map criteria() { return wrapperContained.criteria; }
// public Object recipeFactory() { return wrapperContained.recipeFactory; }
// public void validate(yarnwrap.util.Identifier recipeId) { wrapperContained.validate(recipeId.wrapperContained); }
public yarnwrap.data.server.recipe.CookingRecipeJsonBuilder createBlasting(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime) { return new yarnwrap.data.server.recipe.CookingRecipeJsonBuilder(wrapperContained.createBlasting(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime)); }
// public yarnwrap.data.server.recipe.CookingRecipeJsonBuilder create(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime,yarnwrap.recipe.RecipeSerializer serializer,Object recipeFactory) { return new yarnwrap.data.server.recipe.CookingRecipeJsonBuilder(wrapperContained.create(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime,serializer.wrapperContained,recipeFactory)); }
public yarnwrap.data.server.recipe.CookingRecipeJsonBuilder createSmelting(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime) { return new yarnwrap.data.server.recipe.CookingRecipeJsonBuilder(wrapperContained.createSmelting(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime)); }
public yarnwrap.data.server.recipe.CookingRecipeJsonBuilder createCampfireCooking(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime) { return new yarnwrap.data.server.recipe.CookingRecipeJsonBuilder(wrapperContained.createCampfireCooking(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime)); }
public yarnwrap.data.server.recipe.CookingRecipeJsonBuilder createSmoking(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime) { return new yarnwrap.data.server.recipe.CookingRecipeJsonBuilder(wrapperContained.createSmoking(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime)); }
// public yarnwrap.recipe.book.CookingRecipeCategory getCookingRecipeCategory(yarnwrap.recipe.RecipeSerializer serializer,yarnwrap.item.ItemConvertible output) { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.getCookingRecipeCategory(serializer.wrapperContained,output.wrapperContained)); }
// public yarnwrap.recipe.book.CookingRecipeCategory getSmeltingRecipeCategory(yarnwrap.item.ItemConvertible output) { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.getSmeltingRecipeCategory(output.wrapperContained)); }
// public yarnwrap.recipe.book.CookingRecipeCategory getBlastingRecipeCategory(yarnwrap.item.ItemConvertible output) { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.getBlastingRecipeCategory(output.wrapperContained)); }

}