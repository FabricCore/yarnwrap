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

}