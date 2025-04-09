package yarnwrap.datafixer.mapping;
public class FlatteningRecipeMapping { public net.minecraft.datafixer.mapping.FlatteningRecipeMapping wrapperContained; public FlatteningRecipeMapping(net.minecraft.datafixer.mapping.FlatteningRecipeMapping wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map RECIPES() { return wrapperContained.RECIPES; }

}