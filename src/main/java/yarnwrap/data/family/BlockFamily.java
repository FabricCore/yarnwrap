package yarnwrap.data.family;
public class BlockFamily { public net.minecraft.data.family.BlockFamily wrapperContained; public BlockFamily(net.minecraft.data.family.BlockFamily wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block baseBlock() { return new yarnwrap.block.Block(wrapperContained.baseBlock); }
// public void baseBlock(yarnwrap.block.Block value) { wrapperContained.baseBlock = value.wrapperContained; }
// public static yarnwrap.block.Block baseBlock() { return new yarnwrap.block.Block(net.minecraft.data.family.BlockFamily.baseBlock); }
// public static void baseBlock(yarnwrap.block.Block value, ) { net.minecraft.data.family.BlockFamily.baseBlock = value.wrapperContained; }

// public java.util.Map variants() { return wrapperContained.variants; }
// public void variants(java.util.Map value) { wrapperContained.variants = value; }
// public static java.util.Map variants() { return net.minecraft.data.family.BlockFamily.variants; }
// public static void variants(java.util.Map value, ) { net.minecraft.data.family.BlockFamily.variants = value; }

// public boolean generateModels() { return wrapperContained.generateModels; }
// public void generateModels(boolean value) { wrapperContained.generateModels = value; }
// public static boolean generateModels() { return net.minecraft.data.family.BlockFamily.generateModels; }
// public static void generateModels(boolean value, ) { net.minecraft.data.family.BlockFamily.generateModels = value; }

// public boolean generateRecipes() { return wrapperContained.generateRecipes; }
// public void generateRecipes(boolean value) { wrapperContained.generateRecipes = value; }
// public static boolean generateRecipes() { return net.minecraft.data.family.BlockFamily.generateRecipes; }
// public static void generateRecipes(boolean value, ) { net.minecraft.data.family.BlockFamily.generateRecipes = value; }

// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public static java.lang.String group() { return net.minecraft.data.family.BlockFamily.group; }
// public static void group(java.lang.String value, ) { net.minecraft.data.family.BlockFamily.group = value; }

// public java.lang.String unlockCriterionName() { return wrapperContained.unlockCriterionName; }
// public void unlockCriterionName(java.lang.String value) { wrapperContained.unlockCriterionName = value; }
// public static java.lang.String unlockCriterionName() { return net.minecraft.data.family.BlockFamily.unlockCriterionName; }
// public static void unlockCriterionName(java.lang.String value, ) { net.minecraft.data.family.BlockFamily.unlockCriterionName = value; }

// public BlockFamily(yarnwrap.block.Block baseBlock) { this.wrapperContained = new net.minecraft.data.family.BlockFamily(baseBlock.wrapperContained); }
public yarnwrap.block.Block getBaseBlock() { return new yarnwrap.block.Block(wrapperContained.getBaseBlock()); }
// public static yarnwrap.block.Block getBaseBlock() { return new yarnwrap.block.Block(net.minecraft.data.family.BlockFamily.getBaseBlock()); }
// public yarnwrap.block.Block getVariant(Object variant) { return new yarnwrap.block.Block(wrapperContained.getVariant(variant)); }
// public static yarnwrap.block.Block getVariant(Object variant, ) { return new yarnwrap.block.Block(net.minecraft.data.family.BlockFamily.getVariant(variant)); }
public java.util.Map getVariants() { return wrapperContained.getVariants(); }
// public static java.util.Map getVariants() { return net.minecraft.data.family.BlockFamily.getVariants(); }
public boolean shouldGenerateModels() { return wrapperContained.shouldGenerateModels(); }
// public static boolean shouldGenerateModels() { return net.minecraft.data.family.BlockFamily.shouldGenerateModels(); }
public boolean shouldGenerateRecipes() { return wrapperContained.shouldGenerateRecipes(); }
// public static boolean shouldGenerateRecipes() { return net.minecraft.data.family.BlockFamily.shouldGenerateRecipes(); }
public java.util.Optional getGroup() { return wrapperContained.getGroup(); }
// public static java.util.Optional getGroup() { return net.minecraft.data.family.BlockFamily.getGroup(); }
public java.util.Optional getUnlockCriterionName() { return wrapperContained.getUnlockCriterionName(); }
// public static java.util.Optional getUnlockCriterionName() { return net.minecraft.data.family.BlockFamily.getUnlockCriterionName(); }

}