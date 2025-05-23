package yarnwrap.data.recipe;
public class CraftingRecipeJsonBuilder { public net.minecraft.data.recipe.CraftingRecipeJsonBuilder wrapperContained; public CraftingRecipeJsonBuilder(net.minecraft.data.recipe.CraftingRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier ROOT() { return new yarnwrap.util.Identifier(wrapperContained.ROOT); }
// public void ROOT(yarnwrap.util.Identifier value) { wrapperContained.ROOT = value.wrapperContained; }
public static yarnwrap.util.Identifier ROOT() { return new yarnwrap.util.Identifier(net.minecraft.data.recipe.CraftingRecipeJsonBuilder.ROOT); }
// public static void ROOT(yarnwrap.util.Identifier value, ) { net.minecraft.data.recipe.CraftingRecipeJsonBuilder.ROOT = value.wrapperContained; }

public void offerTo(yarnwrap.data.recipe.RecipeExporter exporter) { wrapperContained.offerTo(exporter.wrapperContained); }
// public static void offerTo(yarnwrap.data.recipe.RecipeExporter exporter, ) { net.minecraft.data.recipe.CraftingRecipeJsonBuilder.offerTo(exporter.wrapperContained); }
public void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,yarnwrap.registry.RegistryKey recipeKey) { wrapperContained.offerTo(exporter.wrapperContained,recipeKey.wrapperContained); }
// public static void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,yarnwrap.registry.RegistryKey recipeKey, ) { net.minecraft.data.recipe.CraftingRecipeJsonBuilder.offerTo(exporter.wrapperContained,recipeKey.wrapperContained); }
public yarnwrap.data.recipe.CraftingRecipeJsonBuilder group(java.lang.String group) { return new yarnwrap.data.recipe.CraftingRecipeJsonBuilder(wrapperContained.group(group)); }
// public static yarnwrap.data.recipe.CraftingRecipeJsonBuilder group(java.lang.String group, ) { return new yarnwrap.data.recipe.CraftingRecipeJsonBuilder(net.minecraft.data.recipe.CraftingRecipeJsonBuilder.group(group)); }
public yarnwrap.data.recipe.CraftingRecipeJsonBuilder criterion(java.lang.String name,yarnwrap.advancement.AdvancementCriterion criterion) { return new yarnwrap.data.recipe.CraftingRecipeJsonBuilder(wrapperContained.criterion(name,criterion.wrapperContained)); }
// public static yarnwrap.data.recipe.CraftingRecipeJsonBuilder criterion(java.lang.String name,yarnwrap.advancement.AdvancementCriterion criterion, ) { return new yarnwrap.data.recipe.CraftingRecipeJsonBuilder(net.minecraft.data.recipe.CraftingRecipeJsonBuilder.criterion(name,criterion.wrapperContained)); }
public yarnwrap.item.Item getOutputItem() { return new yarnwrap.item.Item(wrapperContained.getOutputItem()); }
// public static yarnwrap.item.Item getOutputItem() { return new yarnwrap.item.Item(net.minecraft.data.recipe.CraftingRecipeJsonBuilder.getOutputItem()); }
// public yarnwrap.util.Identifier getItemId(yarnwrap.item.ItemConvertible item) { return new yarnwrap.util.Identifier(wrapperContained.getItemId(item.wrapperContained)); }
// public static yarnwrap.util.Identifier getItemId(yarnwrap.item.ItemConvertible item, ) { return new yarnwrap.util.Identifier(net.minecraft.data.recipe.CraftingRecipeJsonBuilder.getItemId(item.wrapperContained)); }
public void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,java.lang.String recipePath) { wrapperContained.offerTo(exporter.wrapperContained,recipePath); }
// public static void offerTo(yarnwrap.data.recipe.RecipeExporter exporter,java.lang.String recipePath, ) { net.minecraft.data.recipe.CraftingRecipeJsonBuilder.offerTo(exporter.wrapperContained,recipePath); }
// public yarnwrap.recipe.book.CraftingRecipeCategory toCraftingCategory(yarnwrap.recipe.book.RecipeCategory category) { return new yarnwrap.recipe.book.CraftingRecipeCategory(wrapperContained.toCraftingCategory(category.wrapperContained)); }
// public static yarnwrap.recipe.book.CraftingRecipeCategory toCraftingCategory(yarnwrap.recipe.book.RecipeCategory category, ) { return new yarnwrap.recipe.book.CraftingRecipeCategory(net.minecraft.data.recipe.CraftingRecipeJsonBuilder.toCraftingCategory(category.wrapperContained)); }

}