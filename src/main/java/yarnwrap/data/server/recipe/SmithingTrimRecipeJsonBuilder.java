package yarnwrap.data.server.recipe;
public class SmithingTrimRecipeJsonBuilder { public net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder wrapperContained; public SmithingTrimRecipeJsonBuilder(net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.category); }
// public static void category(yarnwrap.recipe.book.RecipeCategory value, ) { net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.category = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(wrapperContained.template); }
// public void template(yarnwrap.recipe.Ingredient value) { wrapperContained.template = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.template); }
// public static void template(yarnwrap.recipe.Ingredient value, ) { net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.template = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(wrapperContained.base); }
// public void base(yarnwrap.recipe.Ingredient value) { wrapperContained.base = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.base); }
// public static void base(yarnwrap.recipe.Ingredient value, ) { net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.base = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(wrapperContained.addition); }
// public void addition(yarnwrap.recipe.Ingredient value) { wrapperContained.addition = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.addition); }
// public static void addition(yarnwrap.recipe.Ingredient value, ) { net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.addition = value.wrapperContained; }

// public java.util.Map criteria() { return wrapperContained.criteria; }
// public void criteria(java.util.Map value) { wrapperContained.criteria = value; }
// public static java.util.Map criteria() { return net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.criteria; }
// public static void criteria(java.util.Map value, ) { net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.criteria = value; }

public SmithingTrimRecipeJsonBuilder(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition) { this.wrapperContained = new net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder(category.wrapperContained,template.wrapperContained,base.wrapperContained,addition.wrapperContained); }
// public void validate(yarnwrap.util.Identifier recipeId) { wrapperContained.validate(recipeId.wrapperContained); }
// public static void validate(yarnwrap.util.Identifier recipeId, ) { net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.validate(recipeId.wrapperContained); }
// public yarnwrap.data.server.recipe.SmithingTrimRecipeJsonBuilder create(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.recipe.book.RecipeCategory category) { return new yarnwrap.data.server.recipe.SmithingTrimRecipeJsonBuilder(wrapperContained.create(template.wrapperContained,base.wrapperContained,addition.wrapperContained,category.wrapperContained)); }
// public static yarnwrap.data.server.recipe.SmithingTrimRecipeJsonBuilder create(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.recipe.book.RecipeCategory category, ) { return new yarnwrap.data.server.recipe.SmithingTrimRecipeJsonBuilder(net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.create(template.wrapperContained,base.wrapperContained,addition.wrapperContained,category.wrapperContained)); }
public yarnwrap.data.server.recipe.SmithingTrimRecipeJsonBuilder criterion(java.lang.String name,yarnwrap.advancement.AdvancementCriterion criterion) { return new yarnwrap.data.server.recipe.SmithingTrimRecipeJsonBuilder(wrapperContained.criterion(name,criterion.wrapperContained)); }
// public static yarnwrap.data.server.recipe.SmithingTrimRecipeJsonBuilder criterion(java.lang.String name,yarnwrap.advancement.AdvancementCriterion criterion, ) { return new yarnwrap.data.server.recipe.SmithingTrimRecipeJsonBuilder(net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.criterion(name,criterion.wrapperContained)); }
public void offerTo(yarnwrap.data.server.recipe.RecipeExporter exporter,yarnwrap.util.Identifier recipeId) { wrapperContained.offerTo(exporter.wrapperContained,recipeId.wrapperContained); }
// public static void offerTo(yarnwrap.data.server.recipe.RecipeExporter exporter,yarnwrap.util.Identifier recipeId, ) { net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder.offerTo(exporter.wrapperContained,recipeId.wrapperContained); }

}