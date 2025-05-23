package yarnwrap.data.recipe;
public class RecipeExporter { public net.minecraft.data.recipe.RecipeExporter wrapperContained; public RecipeExporter(net.minecraft.data.recipe.RecipeExporter wrapperContained) { this.wrapperContained = wrapperContained; }

public Object getAdvancementBuilder() { return wrapperContained.getAdvancementBuilder(); }
// public static Object getAdvancementBuilder() { return net.minecraft.data.recipe.RecipeExporter.getAdvancementBuilder(); }
public void accept(yarnwrap.registry.RegistryKey key,yarnwrap.recipe.Recipe recipe,yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.accept(key.wrapperContained,recipe.wrapperContained,advancement.wrapperContained); }
// public static void accept(yarnwrap.registry.RegistryKey key,yarnwrap.recipe.Recipe recipe,yarnwrap.advancement.AdvancementEntry advancement, ) { net.minecraft.data.recipe.RecipeExporter.accept(key.wrapperContained,recipe.wrapperContained,advancement.wrapperContained); }
public void addRootAdvancement() { wrapperContained.addRootAdvancement(); }
// public static void addRootAdvancement() { net.minecraft.data.recipe.RecipeExporter.addRootAdvancement(); }

}