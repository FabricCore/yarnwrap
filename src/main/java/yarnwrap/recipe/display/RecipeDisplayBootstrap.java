package yarnwrap.recipe.display;
public class RecipeDisplayBootstrap { public net.minecraft.recipe.display.RecipeDisplayBootstrap wrapperContained; public RecipeDisplayBootstrap(net.minecraft.recipe.display.RecipeDisplayBootstrap wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
// public static Object registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return net.minecraft.recipe.display.RecipeDisplayBootstrap.registerAndGetDefault(registry.wrapperContained); }

}