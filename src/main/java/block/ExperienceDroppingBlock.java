package yarnwrap.block;
public class ExperienceDroppingBlock { public net.minecraft.block.ExperienceDroppingBlock wrapperContained; public ExperienceDroppingBlock(net.minecraft.block.ExperienceDroppingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider experienceDropped() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.experienceDropped); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}