package yarnwrap.datafixer.mapping;
public class WoodRecipeMapping { public net.minecraft.datafixer.mapping.WoodRecipeMapping wrapperContained; public WoodRecipeMapping(net.minecraft.datafixer.mapping.WoodRecipeMapping wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map RECIPES() { return wrapperContained.RECIPES; }
// public void RECIPES(java.util.Map value) { wrapperContained.RECIPES = value; }
public static java.util.Map RECIPES() { return net.minecraft.datafixer.mapping.WoodRecipeMapping.RECIPES; }
// public static void RECIPES(java.util.Map value, ) { net.minecraft.datafixer.mapping.WoodRecipeMapping.RECIPES = value; }


}