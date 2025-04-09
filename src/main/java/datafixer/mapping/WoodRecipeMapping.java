package yarnwrap.datafixer.mapping;
public class WoodRecipeMapping { public net.minecraft.datafixer.mapping.WoodRecipeMapping wrapperContained; public WoodRecipeMapping(net.minecraft.datafixer.mapping.WoodRecipeMapping wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map RECIPES() { return wrapperContained.RECIPES; }

}