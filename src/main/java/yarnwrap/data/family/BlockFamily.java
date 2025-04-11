package yarnwrap.data.family;
public class BlockFamily { public net.minecraft.data.family.BlockFamily wrapperContained; public BlockFamily(net.minecraft.data.family.BlockFamily wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block baseBlock() { return new yarnwrap.block.Block(wrapperContained.baseBlock); }
// public void baseBlock(yarnwrap.block.Block value) { wrapperContained.baseBlock = value.wrapperContained; }
// public java.util.Map variants() { return wrapperContained.variants; }
// public void variants(java.util.Map value) { wrapperContained.variants = value; }
// public boolean generateModels() { return wrapperContained.generateModels; }
// public void generateModels(boolean value) { wrapperContained.generateModels = value; }
// public boolean generateRecipes() { return wrapperContained.generateRecipes; }
// public void generateRecipes(boolean value) { wrapperContained.generateRecipes = value; }
// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public java.lang.String unlockCriterionName() { return wrapperContained.unlockCriterionName; }
// public void unlockCriterionName(java.lang.String value) { wrapperContained.unlockCriterionName = value; }
// public BlockFamily(yarnwrap.block.Block baseBlock) { this.wrapperContained = new net.minecraft.data.family.BlockFamily(baseBlock.wrapperContained); }
public yarnwrap.block.Block getBaseBlock() { return new yarnwrap.block.Block(wrapperContained.getBaseBlock()); }
// public yarnwrap.block.Block getVariant(Object variant) { return new yarnwrap.block.Block(wrapperContained.getVariant(variant)); }
public java.util.Map getVariants() { return wrapperContained.getVariants(); }
public boolean shouldGenerateModels() { return wrapperContained.shouldGenerateModels(); }
public boolean shouldGenerateRecipes() { return wrapperContained.shouldGenerateRecipes(); }
public java.util.Optional getGroup() { return wrapperContained.getGroup(); }
public java.util.Optional getUnlockCriterionName() { return wrapperContained.getUnlockCriterionName(); }

}