package yarnwrap.datafixer.mapping;
public class FlatteningRecipeMapping { public net.minecraft.datafixer.mapping.FlatteningRecipeMapping wrapperContained; public FlatteningRecipeMapping(net.minecraft.datafixer.mapping.FlatteningRecipeMapping wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map RECIPES() { return wrapperContained.RECIPES; }
// public void RECIPES(java.util.Map value) { wrapperContained.RECIPES = value; }
public static java.util.Map RECIPES() { return net.minecraft.datafixer.mapping.FlatteningRecipeMapping.RECIPES; }
// public static void RECIPES(java.util.Map value, ) { net.minecraft.datafixer.mapping.FlatteningRecipeMapping.RECIPES = value; }


}