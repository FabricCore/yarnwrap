package yarnwrap.world.gen.feature;
public class HugeFungusFeatureConfig { public net.minecraft.world.gen.feature.HugeFungusFeatureConfig wrapperContained; public HugeFungusFeatureConfig(net.minecraft.world.gen.feature.HugeFungusFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.BlockState stemState() { return new yarnwrap.block.BlockState(wrapperContained.stemState); }
public yarnwrap.block.BlockState hatState() { return new yarnwrap.block.BlockState(wrapperContained.hatState); }
public yarnwrap.block.BlockState decorationState() { return new yarnwrap.block.BlockState(wrapperContained.decorationState); }
public boolean planted() { return wrapperContained.planted; }
public yarnwrap.block.BlockState validBaseBlock() { return new yarnwrap.block.BlockState(wrapperContained.validBaseBlock); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.world.gen.blockpredicate.BlockPredicate replaceableBlocks() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.replaceableBlocks); }

}