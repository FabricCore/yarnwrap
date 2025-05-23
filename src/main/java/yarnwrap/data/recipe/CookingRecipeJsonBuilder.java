package yarnwrap.data.recipe;
public class CookingRecipeJsonBuilder { public net.minecraft.data.recipe.CookingRecipeJsonBuilder wrapperContained; public CookingRecipeJsonBuilder(net.minecraft.data.recipe.CookingRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public float experience() { return wrapperContained.experience; }
// public void experience(float value) { wrapperContained.experience = value; }
// public static float experience() { return net.minecraft.data.recipe.CookingRecipeJsonBuilder.experience; }
// public static void experience(float value, ) { net.minecraft.data.recipe.CookingRecipeJsonBuilder.experience = value; }

// public int cookingTime() { return wrapperContained.cookingTime; }
// public void cookingTime(int value) { wrapperContained.cookingTime = value; }
// public static int cookingTime() { return net.minecraft.data.recipe.CookingRecipeJsonBuilder.cookingTime; }
// public static void cookingTime(int value, ) { net.minecraft.data.recipe.CookingRecipeJsonBuilder.cookingTime = value; }

// public yarnwrap.item.Item output() { return new yarnwrap.item.Item(wrapperContained.output); }
// public void output(yarnwrap.item.Item value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.item.Item output() { return new yarnwrap.item.Item(net.minecraft.data.recipe.CookingRecipeJsonBuilder.output); }
// public static void output(yarnwrap.item.Item value, ) { net.minecraft.data.recipe.CookingRecipeJsonBuilder.output = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient input() { return new yarnwrap.recipe.Ingredient(wrapperContained.input); }
// public void input(yarnwrap.recipe.Ingredient value) { wrapperContained.input = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient input() { return new yarnwrap.recipe.Ingredient(net.minecraft.data.recipe.CookingRecipeJsonBuilder.input); }
// public static void input(yarnwrap.recipe.Ingredient value, ) { net.minecraft.data.recipe.CookingRecipeJsonBuilder.input = value.wrapperContained; }

// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public static java.lang.String group() { return net.minecraft.data.recipe.CookingRecipeJsonBuilder.group; }
// public static void group(java.lang.String value, ) { net.minecraft.data.recipe.CookingRecipeJsonBuilder.group = value; }

// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(net.minecraft.data.recipe.CookingRecipeJsonBuilder.category); }
// public static void category(yarnwrap.recipe.book.RecipeCategory value, ) { net.minecraft.data.recipe.CookingRecipeJsonBuilder.category = value.wrapperContained; }

// public yarnwrap.recipe.book.CookingRecipeCategory cookingCategory() { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.cookingCategory); }
// public void cookingCategory(yarnwrap.recipe.book.CookingRecipeCategory value) { wrapperContained.cookingCategory = value.wrapperContained; }
// public static yarnwrap.recipe.book.CookingRecipeCategory cookingCategory() { return new yarnwrap.recipe.book.CookingRecipeCategory(net.minecraft.data.recipe.CookingRecipeJsonBuilder.cookingCategory); }
// public static void cookingCategory(yarnwrap.recipe.book.CookingRecipeCategory value, ) { net.minecraft.data.recipe.CookingRecipeJsonBuilder.cookingCategory = value.wrapperContained; }

// public java.util.Map criteria() { return wrapperContained.criteria; }
// public void criteria(java.util.Map value) { wrapperContained.criteria = value; }
// public static java.util.Map criteria() { return net.minecraft.data.recipe.CookingRecipeJsonBuilder.criteria; }
// public static void criteria(java.util.Map value, ) { net.minecraft.data.recipe.CookingRecipeJsonBuilder.criteria = value; }

// public Object recipeFactory() { return wrapperContained.recipeFactory; }
// // public void recipeFactory(Object value) { wrapperContained.recipeFactory = value; }
// // public static Object recipeFactory() { return net.minecraft.data.recipe.CookingRecipeJsonBuilder.recipeFactory; }
// // public static void recipeFactory(Object value, ) { net.minecraft.data.recipe.CookingRecipeJsonBuilder.recipeFactory = value; }

// public CookingRecipeJsonBuilder(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.recipe.book.CookingRecipeCategory cookingCategory,yarnwrap.item.ItemConvertible output,yarnwrap.recipe.Ingredient input,float experience,int cookingTime,Object recipeFactory) { this.wrapperContained = new net.minecraft.data.recipe.CookingRecipeJsonBuilder(category.wrapperContained,cookingCategory.wrapperContained,output.wrapperContained,input.wrapperContained,experience,cookingTime,recipeFactory); }
// public void validate(yarnwrap.registry.RegistryKey recipeKey) { wrapperContained.validate(recipeKey.wrapperContained); }
// public static void validate(yarnwrap.registry.RegistryKey recipeKey, ) { net.minecraft.data.recipe.CookingRecipeJsonBuilder.validate(recipeKey.wrapperContained); }
// public yarnwrap.data.recipe.CookingRecipeJsonBuilder createBlasting(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime) { return new yarnwrap.data.recipe.CookingRecipeJsonBuilder(wrapperContained.createBlasting(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime)); }
// public static yarnwrap.data.recipe.CookingRecipeJsonBuilder createBlasting(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime, ) { return new yarnwrap.data.recipe.CookingRecipeJsonBuilder(net.minecraft.data.recipe.CookingRecipeJsonBuilder.createBlasting(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime)); }
// public yarnwrap.data.recipe.CookingRecipeJsonBuilder create(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime,yarnwrap.recipe.RecipeSerializer serializer,Object recipeFactory) { return new yarnwrap.data.recipe.CookingRecipeJsonBuilder(wrapperContained.create(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime,serializer.wrapperContained,recipeFactory)); }
// public static yarnwrap.data.recipe.CookingRecipeJsonBuilder create(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime,yarnwrap.recipe.RecipeSerializer serializer,Object recipeFactory, ) { return new yarnwrap.data.recipe.CookingRecipeJsonBuilder(net.minecraft.data.recipe.CookingRecipeJsonBuilder.create(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime,serializer.wrapperContained,recipeFactory)); }
// public yarnwrap.data.recipe.CookingRecipeJsonBuilder createSmelting(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime) { return new yarnwrap.data.recipe.CookingRecipeJsonBuilder(wrapperContained.createSmelting(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime)); }
// public static yarnwrap.data.recipe.CookingRecipeJsonBuilder createSmelting(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime, ) { return new yarnwrap.data.recipe.CookingRecipeJsonBuilder(net.minecraft.data.recipe.CookingRecipeJsonBuilder.createSmelting(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime)); }
// public yarnwrap.data.recipe.CookingRecipeJsonBuilder createCampfireCooking(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime) { return new yarnwrap.data.recipe.CookingRecipeJsonBuilder(wrapperContained.createCampfireCooking(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime)); }
// public static yarnwrap.data.recipe.CookingRecipeJsonBuilder createCampfireCooking(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime, ) { return new yarnwrap.data.recipe.CookingRecipeJsonBuilder(net.minecraft.data.recipe.CookingRecipeJsonBuilder.createCampfireCooking(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime)); }
// public yarnwrap.data.recipe.CookingRecipeJsonBuilder createSmoking(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime) { return new yarnwrap.data.recipe.CookingRecipeJsonBuilder(wrapperContained.createSmoking(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime)); }
// public static yarnwrap.data.recipe.CookingRecipeJsonBuilder createSmoking(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,float experience,int cookingTime, ) { return new yarnwrap.data.recipe.CookingRecipeJsonBuilder(net.minecraft.data.recipe.CookingRecipeJsonBuilder.createSmoking(input.wrapperContained,category.wrapperContained,output.wrapperContained,experience,cookingTime)); }
// public yarnwrap.recipe.book.CookingRecipeCategory getCookingRecipeCategory(yarnwrap.recipe.RecipeSerializer serializer,yarnwrap.item.ItemConvertible output) { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.getCookingRecipeCategory(serializer.wrapperContained,output.wrapperContained)); }
// public static yarnwrap.recipe.book.CookingRecipeCategory getCookingRecipeCategory(yarnwrap.recipe.RecipeSerializer serializer,yarnwrap.item.ItemConvertible output, ) { return new yarnwrap.recipe.book.CookingRecipeCategory(net.minecraft.data.recipe.CookingRecipeJsonBuilder.getCookingRecipeCategory(serializer.wrapperContained,output.wrapperContained)); }
// public yarnwrap.recipe.book.CookingRecipeCategory getSmeltingRecipeCategory(yarnwrap.item.ItemConvertible output) { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.getSmeltingRecipeCategory(output.wrapperContained)); }
// public static yarnwrap.recipe.book.CookingRecipeCategory getSmeltingRecipeCategory(yarnwrap.item.ItemConvertible output, ) { return new yarnwrap.recipe.book.CookingRecipeCategory(net.minecraft.data.recipe.CookingRecipeJsonBuilder.getSmeltingRecipeCategory(output.wrapperContained)); }
// public yarnwrap.recipe.book.CookingRecipeCategory getBlastingRecipeCategory(yarnwrap.item.ItemConvertible output) { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.getBlastingRecipeCategory(output.wrapperContained)); }
// public static yarnwrap.recipe.book.CookingRecipeCategory getBlastingRecipeCategory(yarnwrap.item.ItemConvertible output, ) { return new yarnwrap.recipe.book.CookingRecipeCategory(net.minecraft.data.recipe.CookingRecipeJsonBuilder.getBlastingRecipeCategory(output.wrapperContained)); }

}