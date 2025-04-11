package yarnwrap.world.gen.feature;
public class HugeFungusFeatureConfig { public net.minecraft.world.gen.feature.HugeFungusFeatureConfig wrapperContained; public HugeFungusFeatureConfig(net.minecraft.world.gen.feature.HugeFungusFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.BlockState stemState() { return new yarnwrap.block.BlockState(wrapperContained.stemState); }
// public void stemState(yarnwrap.block.BlockState value) { wrapperContained.stemState = value.wrapperContained; }
public yarnwrap.block.BlockState hatState() { return new yarnwrap.block.BlockState(wrapperContained.hatState); }
// public void hatState(yarnwrap.block.BlockState value) { wrapperContained.hatState = value.wrapperContained; }
public yarnwrap.block.BlockState decorationState() { return new yarnwrap.block.BlockState(wrapperContained.decorationState); }
// public void decorationState(yarnwrap.block.BlockState value) { wrapperContained.decorationState = value.wrapperContained; }
public boolean planted() { return wrapperContained.planted; }
// public void planted(boolean value) { wrapperContained.planted = value; }
public yarnwrap.block.BlockState validBaseBlock() { return new yarnwrap.block.BlockState(wrapperContained.validBaseBlock); }
// public void validBaseBlock(yarnwrap.block.BlockState value) { wrapperContained.validBaseBlock = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.world.gen.blockpredicate.BlockPredicate replaceableBlocks() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.replaceableBlocks); }
// public void replaceableBlocks(yarnwrap.world.gen.blockpredicate.BlockPredicate value) { wrapperContained.replaceableBlocks = value.wrapperContained; }
public HugeFungusFeatureConfig(yarnwrap.block.BlockState validBaseBlock,yarnwrap.block.BlockState stemState,yarnwrap.block.BlockState hatState,yarnwrap.block.BlockState decorationState,yarnwrap.world.gen.blockpredicate.BlockPredicate replaceableBlocks,boolean planted) { this.wrapperContained = new net.minecraft.world.gen.feature.HugeFungusFeatureConfig(validBaseBlock.wrapperContained,stemState.wrapperContained,hatState.wrapperContained,decorationState.wrapperContained,replaceableBlocks.wrapperContained,planted); }
// public java.lang.Boolean method_28630(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config) { return wrapperContained.method_28630(config.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28631(Object instance) { return wrapperContained.method_28631(instance); }
// public yarnwrap.block.BlockState method_28632(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config) { return new yarnwrap.block.BlockState(wrapperContained.method_28632(config.wrapperContained)); }
// public yarnwrap.block.BlockState method_28633(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config) { return new yarnwrap.block.BlockState(wrapperContained.method_28633(config.wrapperContained)); }
// public yarnwrap.block.BlockState method_28634(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config) { return new yarnwrap.block.BlockState(wrapperContained.method_28634(config.wrapperContained)); }
// public yarnwrap.block.BlockState method_28635(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config) { return new yarnwrap.block.BlockState(wrapperContained.method_28635(config.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate method_51528(yarnwrap.world.gen.feature.HugeFungusFeatureConfig config) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.method_51528(config.wrapperContained)); }

}