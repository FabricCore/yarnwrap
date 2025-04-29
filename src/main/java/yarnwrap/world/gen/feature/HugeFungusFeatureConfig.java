package yarnwrap.world.gen.feature;
public class HugeFungusFeatureConfig { public net.minecraft.world.gen.feature.HugeFungusFeatureConfig wrapperContained; public HugeFungusFeatureConfig(net.minecraft.world.gen.feature.HugeFungusFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.BlockState stemState() { return new yarnwrap.block.BlockState(wrapperContained.stemState); }
// public void stemState(yarnwrap.block.BlockState value) { wrapperContained.stemState = value.wrapperContained; }
// public static yarnwrap.block.BlockState stemState() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.HugeFungusFeatureConfig.stemState); }
// public static void stemState(yarnwrap.block.BlockState value, ) { net.minecraft.world.gen.feature.HugeFungusFeatureConfig.stemState = value.wrapperContained; }

public yarnwrap.block.BlockState hatState() { return new yarnwrap.block.BlockState(wrapperContained.hatState); }
// public void hatState(yarnwrap.block.BlockState value) { wrapperContained.hatState = value.wrapperContained; }
// public static yarnwrap.block.BlockState hatState() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.HugeFungusFeatureConfig.hatState); }
// public static void hatState(yarnwrap.block.BlockState value, ) { net.minecraft.world.gen.feature.HugeFungusFeatureConfig.hatState = value.wrapperContained; }

public yarnwrap.block.BlockState decorationState() { return new yarnwrap.block.BlockState(wrapperContained.decorationState); }
// public void decorationState(yarnwrap.block.BlockState value) { wrapperContained.decorationState = value.wrapperContained; }
// public static yarnwrap.block.BlockState decorationState() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.HugeFungusFeatureConfig.decorationState); }
// public static void decorationState(yarnwrap.block.BlockState value, ) { net.minecraft.world.gen.feature.HugeFungusFeatureConfig.decorationState = value.wrapperContained; }

public boolean planted() { return wrapperContained.planted; }
// public void planted(boolean value) { wrapperContained.planted = value; }
// public static boolean planted() { return net.minecraft.world.gen.feature.HugeFungusFeatureConfig.planted; }
// public static void planted(boolean value, ) { net.minecraft.world.gen.feature.HugeFungusFeatureConfig.planted = value; }

public yarnwrap.block.BlockState validBaseBlock() { return new yarnwrap.block.BlockState(wrapperContained.validBaseBlock); }
// public void validBaseBlock(yarnwrap.block.BlockState value) { wrapperContained.validBaseBlock = value.wrapperContained; }
// public static yarnwrap.block.BlockState validBaseBlock() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.HugeFungusFeatureConfig.validBaseBlock); }
// public static void validBaseBlock(yarnwrap.block.BlockState value, ) { net.minecraft.world.gen.feature.HugeFungusFeatureConfig.validBaseBlock = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.HugeFungusFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.HugeFungusFeatureConfig.CODEC = value; }

public yarnwrap.world.gen.blockpredicate.BlockPredicate replaceableBlocks() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.replaceableBlocks); }
// public void replaceableBlocks(yarnwrap.world.gen.blockpredicate.BlockPredicate value) { wrapperContained.replaceableBlocks = value.wrapperContained; }
// public static yarnwrap.world.gen.blockpredicate.BlockPredicate replaceableBlocks() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(net.minecraft.world.gen.feature.HugeFungusFeatureConfig.replaceableBlocks); }
// public static void replaceableBlocks(yarnwrap.world.gen.blockpredicate.BlockPredicate value, ) { net.minecraft.world.gen.feature.HugeFungusFeatureConfig.replaceableBlocks = value.wrapperContained; }

public HugeFungusFeatureConfig(yarnwrap.block.BlockState validBaseBlock,yarnwrap.block.BlockState stemState,yarnwrap.block.BlockState hatState,yarnwrap.block.BlockState decorationState,yarnwrap.world.gen.blockpredicate.BlockPredicate replaceableBlocks,boolean planted) { this.wrapperContained = new net.minecraft.world.gen.feature.HugeFungusFeatureConfig(validBaseBlock.wrapperContained,stemState.wrapperContained,hatState.wrapperContained,decorationState.wrapperContained,replaceableBlocks.wrapperContained,planted); }
// public java.lang.Boolean method_28630(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config) { return wrapperContained.method_28630(config.wrapperContained); }
// public static java.lang.Boolean method_28630(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config, ) { return net.minecraft.world.gen.feature.HugeFungusFeatureConfig.method_28630(config.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28631(Object instance) { return wrapperContained.method_28631(instance); }
// public static com.mojang.datafixers.kinds.App method_28631(Object instance, ) { return net.minecraft.world.gen.feature.HugeFungusFeatureConfig.method_28631(instance); }
// public yarnwrap.block.BlockState method_28632(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config) { return new yarnwrap.block.BlockState(wrapperContained.method_28632(config.wrapperContained)); }
// public static yarnwrap.block.BlockState method_28632(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.HugeFungusFeatureConfig.method_28632(config.wrapperContained)); }
// public yarnwrap.block.BlockState method_28633(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config) { return new yarnwrap.block.BlockState(wrapperContained.method_28633(config.wrapperContained)); }
// public static yarnwrap.block.BlockState method_28633(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.HugeFungusFeatureConfig.method_28633(config.wrapperContained)); }
// public yarnwrap.block.BlockState method_28634(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config) { return new yarnwrap.block.BlockState(wrapperContained.method_28634(config.wrapperContained)); }
// public static yarnwrap.block.BlockState method_28634(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.HugeFungusFeatureConfig.method_28634(config.wrapperContained)); }
// public yarnwrap.block.BlockState method_28635(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config) { return new yarnwrap.block.BlockState(wrapperContained.method_28635(config.wrapperContained)); }
// public static yarnwrap.block.BlockState method_28635(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.HugeFungusFeatureConfig.method_28635(config.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate method_51528(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.method_51528(config.wrapperContained)); }
// public static yarnwrap.world.gen.blockpredicate.BlockPredicate method_51528(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config, ) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(net.minecraft.world.gen.feature.HugeFungusFeatureConfig.method_51528(config.wrapperContained)); }

}