package yarnwrap.block;
public class ExperienceDroppingBlock { public net.minecraft.block.ExperienceDroppingBlock wrapperContained; public ExperienceDroppingBlock(net.minecraft.block.ExperienceDroppingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider experienceDropped() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.experienceDropped); }
// public void experienceDropped(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.experienceDropped = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public ExperienceDroppingBlock(yarnwrap.util.math.intprovider.IntProvider experienceDropped,Object settings) { this.wrapperContained = new net.minecraft.block.ExperienceDroppingBlock(experienceDropped.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54011(Object instance) { return wrapperContained.method_54011(instance); }
// public yarnwrap.util.math.intprovider.IntProvider method_54012(yarnwrap.block.ExperienceDroppingBlock block) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_54012(block.wrapperContained)); }

}