package yarnwrap.data.server.recipe;
public class ShapelessRecipeJsonBuilder { public net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder wrapperContained; public ShapelessRecipeJsonBuilder(net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map advancementBuilder() { return wrapperContained.advancementBuilder; }
// public void advancementBuilder(java.util.Map value) { wrapperContained.advancementBuilder = value; }
// public static java.util.Map advancementBuilder() { return net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.advancementBuilder; }
// public static void advancementBuilder(java.util.Map value, ) { net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.advancementBuilder = value; }

// public yarnwrap.util.collection.DefaultedList inputs() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inputs); }
// public void inputs(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inputs = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList inputs() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.inputs); }
// public static void inputs(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.inputs = value.wrapperContained; }

// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public static int count() { return net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.count; }
// public static void count(int value, ) { net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.count = value; }

// public yarnwrap.item.Item output() { return new yarnwrap.item.Item(wrapperContained.output); }
// public void output(yarnwrap.item.Item value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.item.Item output() { return new yarnwrap.item.Item(net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.output); }
// public static void output(yarnwrap.item.Item value, ) { net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.output = value.wrapperContained; }

// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public static java.lang.String group() { return net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.group; }
// public static void group(java.lang.String value, ) { net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.group = value; }

// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.category); }
// public static void category(yarnwrap.recipe.book.RecipeCategory value, ) { net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.category = value.wrapperContained; }

public ShapelessRecipeJsonBuilder(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count) { this.wrapperContained = new net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder(category.wrapperContained,output.wrapperContained,count); }
// public void validate(yarnwrap.util.Identifier recipeId) { wrapperContained.validate(recipeId.wrapperContained); }
// public static void validate(yarnwrap.util.Identifier recipeId, ) { net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.validate(recipeId.wrapperContained); }
public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(tag.wrapperContained)); }
// public static yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.registry.tag.TagKey tag, ) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.input(tag.wrapperContained)); }
// public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder create(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.create(category.wrapperContained,output.wrapperContained)); }
// public static yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder create(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output, ) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(category.wrapperContained,output.wrapperContained)); }
// public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder create(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.create(category.wrapperContained,output.wrapperContained,count)); }
// public static yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder create(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count, ) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(category.wrapperContained,output.wrapperContained,count)); }
public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.item.ItemConvertible itemProvider,int size) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(itemProvider.wrapperContained,size)); }
// public static yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.item.ItemConvertible itemProvider,int size, ) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.input(itemProvider.wrapperContained,size)); }
public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.recipe.Ingredient ingredient) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(ingredient.wrapperContained)); }
// public static yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.recipe.Ingredient ingredient, ) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.input(ingredient.wrapperContained)); }
public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.recipe.Ingredient ingredient,int size) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(ingredient.wrapperContained,size)); }
// public static yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.recipe.Ingredient ingredient,int size, ) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.input(ingredient.wrapperContained,size)); }
public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.item.ItemConvertible itemProvider) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(itemProvider.wrapperContained)); }
// public static yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.item.ItemConvertible itemProvider, ) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.input(itemProvider.wrapperContained)); }

}