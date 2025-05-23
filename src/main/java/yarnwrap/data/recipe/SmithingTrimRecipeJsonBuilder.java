package yarnwrap.data.recipe;
public class SmithingTrimRecipeJsonBuilder { public net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder wrapperContained; public SmithingTrimRecipeJsonBuilder(net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.category); }
// public static void category(yarnwrap.recipe.book.RecipeCategory value, ) { net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.category = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(wrapperContained.template); }
// public void template(yarnwrap.recipe.Ingredient value) { wrapperContained.template = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.template); }
// public static void template(yarnwrap.recipe.Ingredient value, ) { net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.template = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(wrapperContained.base); }
// public void base(yarnwrap.recipe.Ingredient value) { wrapperContained.base = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.base); }
// public static void base(yarnwrap.recipe.Ingredient value, ) { net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.base = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(wrapperContained.addition); }
// public void addition(yarnwrap.recipe.Ingredient value) { wrapperContained.addition = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.addition); }
// public static void addition(yarnwrap.recipe.Ingredient value, ) { net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.addition = value.wrapperContained; }

// public java.util.Map criteria() { return wrapperContained.criteria; }
// public void criteria(java.util.Map value) { wrapperContained.criteria = value; }
// public static java.util.Map criteria() { return net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.criteria; }
// public static void criteria(java.util.Map value, ) { net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.criteria = value; }

// public yarnwrap.registry.entry.RegistryEntry pattern() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.pattern); }
// public void pattern(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.pattern = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry pattern() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.pattern); }
// public static void pattern(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.pattern = value.wrapperContained; }

public SmithingTrimRecipeJsonBuilder(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.registry.entry.RegistryEntry pattern) { this.wrapperContained = new net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder(category.wrapperContained,template.wrapperContained,base.wrapperContained,addition.wrapperContained,pattern.wrapperContained); }
// public void validate(yarnwrap.registry.RegistryKey recipeKey) { wrapperContained.validate(recipeKey.wrapperContained); }
// public static void validate(yarnwrap.registry.RegistryKey recipeKey, ) { net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.validate(recipeKey.wrapperContained); }
// public yarnwrap.data.recipe.SmithingTrimRecipeJsonBuilder create(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.registry.entry.RegistryEntry pattern,yarnwrap.recipe.book.RecipeCategory category) { return new yarnwrap.data.recipe.SmithingTrimRecipeJsonBuilder(wrapperContained.create(template.wrapperContained,base.wrapperContained,addition.wrapperContained,pattern.wrapperContained,category.wrapperContained)); }
// public static yarnwrap.data.recipe.SmithingTrimRecipeJsonBuilder create(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.registry.entry.RegistryEntry pattern,yarnwrap.recipe.book.RecipeCategory category, ) { return new yarnwrap.data.recipe.SmithingTrimRecipeJsonBuilder(net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.create(template.wrapperContained,base.wrapperContained,addition.wrapperContained,pattern.wrapperContained,category.wrapperContained)); }
public yarnwrap.data.recipe.SmithingTrimRecipeJsonBuilder criterion(java.lang.String name,yarnwrap.advancement.AdvancementCriterion criterion) { return new yarnwrap.data.recipe.SmithingTrimRecipeJsonBuilder(wrapperContained.criterion(name,criterion.wrapperContained)); }
// public static yarnwrap.data.recipe.SmithingTrimRecipeJsonBuilder criterion(java.lang.String name,yarnwrap.advancement.AdvancementCriterion criterion, ) { return new yarnwrap.data.recipe.SmithingTrimRecipeJsonBuilder(net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.criterion(name,criterion.wrapperContained)); }
public void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,yarnwrap.registry.RegistryKey recipeKey) { wrapperContained.offerTo(exporter.wrapperContained,recipeKey.wrapperContained); }
// public static void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,yarnwrap.registry.RegistryKey recipeKey, ) { net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder.offerTo(exporter.wrapperContained,recipeKey.wrapperContained); }

}