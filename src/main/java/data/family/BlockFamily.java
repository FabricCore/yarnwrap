package yarnwrap.data.family;
public class BlockFamily { public net.minecraft.data.family.BlockFamily wrapperContained; public BlockFamily(net.minecraft.data.family.BlockFamily wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block baseBlock() { return new yarnwrap.block.Block(wrapperContained.baseBlock); }
// public java.util.Map variants() { return wrapperContained.variants; }
// public boolean generateModels() { return wrapperContained.generateModels; }
// public boolean generateRecipes() { return wrapperContained.generateRecipes; }
// public java.lang.String group() { return wrapperContained.group; }
// public java.lang.String unlockCriterionName() { return wrapperContained.unlockCriterionName; }
public yarnwrap.block.Block getBaseBlock() { return new yarnwrap.block.Block(wrapperContained.getBaseBlock()); }
// public yarnwrap.block.Block getVariant(Object variant) { return new yarnwrap.block.Block(wrapperContained.getVariant(variant)); }
public java.util.Map getVariants() { return wrapperContained.getVariants(); }
public boolean shouldGenerateModels() { return wrapperContained.shouldGenerateModels(); }
public boolean shouldGenerateRecipes() { return wrapperContained.shouldGenerateRecipes(); }
public java.util.Optional getGroup() { return wrapperContained.getGroup(); }
public java.util.Optional getUnlockCriterionName() { return wrapperContained.getUnlockCriterionName(); }

}