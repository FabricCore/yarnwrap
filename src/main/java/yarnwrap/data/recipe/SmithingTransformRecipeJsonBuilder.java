package yarnwrap.data.recipe;
public class SmithingTransformRecipeJsonBuilder { public net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder wrapperContained; public SmithingTransformRecipeJsonBuilder(net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(wrapperContained.template); }
// public void template(yarnwrap.recipe.Ingredient value) { wrapperContained.template = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.template); }
// public static void template(yarnwrap.recipe.Ingredient value, ) { net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.template = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(wrapperContained.base); }
// public void base(yarnwrap.recipe.Ingredient value) { wrapperContained.base = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.base); }
// public static void base(yarnwrap.recipe.Ingredient value, ) { net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.base = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(wrapperContained.addition); }
// public void addition(yarnwrap.recipe.Ingredient value) { wrapperContained.addition = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.addition); }
// public static void addition(yarnwrap.recipe.Ingredient value, ) { net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.addition = value.wrapperContained; }

// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.category); }
// public static void category(yarnwrap.recipe.book.RecipeCategory value, ) { net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.category = value.wrapperContained; }

// public yarnwrap.item.Item result() { return new yarnwrap.item.Item(wrapperContained.result); }
// public void result(yarnwrap.item.Item value) { wrapperContained.result = value.wrapperContained; }
// public static yarnwrap.item.Item result() { return new yarnwrap.item.Item(net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.result); }
// public static void result(yarnwrap.item.Item value, ) { net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.result = value.wrapperContained; }

// public java.util.Map criteria() { return wrapperContained.criteria; }
// public void criteria(java.util.Map value) { wrapperContained.criteria = value; }
// public static java.util.Map criteria() { return net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.criteria; }
// public static void criteria(java.util.Map value, ) { net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.criteria = value; }

public SmithingTransformRecipeJsonBuilder(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.Item result) { this.wrapperContained = new net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder(template.wrapperContained,base.wrapperContained,addition.wrapperContained,category.wrapperContained,result.wrapperContained); }
// public void validate(yarnwrap.registry.RegistryKey recipeKey) { wrapperContained.validate(recipeKey.wrapperContained); }
// public static void validate(yarnwrap.registry.RegistryKey recipeKey, ) { net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.validate(recipeKey.wrapperContained); }
// public yarnwrap.data.recipe.SmithingTransformRecipeJsonBuilder create(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.Item result) { return new yarnwrap.data.recipe.SmithingTransformRecipeJsonBuilder(wrapperContained.create(template.wrapperContained,base.wrapperContained,addition.wrapperContained,category.wrapperContained,result.wrapperContained)); }
// public static yarnwrap.data.recipe.SmithingTransformRecipeJsonBuilder create(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.Item result, ) { return new yarnwrap.data.recipe.SmithingTransformRecipeJsonBuilder(net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.create(template.wrapperContained,base.wrapperContained,addition.wrapperContained,category.wrapperContained,result.wrapperContained)); }
public yarnwrap.data.recipe.SmithingTransformRecipeJsonBuilder criterion(java.lang.String name,yarnwrap.advancement.AdvancementCriterion criterion) { return new yarnwrap.data.recipe.SmithingTransformRecipeJsonBuilder(wrapperContained.criterion(name,criterion.wrapperContained)); }
// public static yarnwrap.data.recipe.SmithingTransformRecipeJsonBuilder criterion(java.lang.String name,yarnwrap.advancement.AdvancementCriterion criterion, ) { return new yarnwrap.data.recipe.SmithingTransformRecipeJsonBuilder(net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.criterion(name,criterion.wrapperContained)); }
public void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,yarnwrap.registry.RegistryKey recipeKey) { wrapperContained.offerTo(exporter.wrapperContained,recipeKey.wrapperContained); }
// public static void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,yarnwrap.registry.RegistryKey recipeKey, ) { net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.offerTo(exporter.wrapperContained,recipeKey.wrapperContained); }
public void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,java.lang.String recipeId) { wrapperContained.offerTo(exporter.wrapperContained,recipeId); }
// public static void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,java.lang.String recipeId, ) { net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder.offerTo(exporter.wrapperContained,recipeId); }

}