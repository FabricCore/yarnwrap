package yarnwrap.world.gen.heightprovider;
public class UniformHeightProvider { public net.minecraft.world.gen.heightprovider.UniformHeightProvider wrapperContained; public UniformHeightProvider(net.minecraft.world.gen.heightprovider.UniformHeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec UNIFORM_CODEC() { return wrapperContained.UNIFORM_CODEC; }
// public void UNIFORM_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.UNIFORM_CODEC = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.world.gen.YOffset minOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.minOffset); }
// public void minOffset(yarnwrap.world.gen.YOffset value) { wrapperContained.minOffset = value.wrapperContained; }
// public yarnwrap.world.gen.YOffset maxOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.maxOffset); }
// public void maxOffset(yarnwrap.world.gen.YOffset value) { wrapperContained.maxOffset = value.wrapperContained; }
// public it.unimi.dsi.fastutil.longs.LongSet warnedEmptyHeightRanges() { return wrapperContained.warnedEmptyHeightRanges; }
// public void warnedEmptyHeightRanges(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.warnedEmptyHeightRanges = value; }
// public UniformHeightProvider(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset) { this.wrapperContained = new net.minecraft.world.gen.heightprovider.UniformHeightProvider(minOffset.wrapperContained,maxOffset.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_35395(Object instance) { return wrapperContained.method_35395(instance); }
public yarnwrap.world.gen.heightprovider.UniformHeightProvider create(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset) { return new yarnwrap.world.gen.heightprovider.UniformHeightProvider(wrapperContained.create(minOffset.wrapperContained,maxOffset.wrapperContained)); }
// public yarnwrap.world.gen.YOffset method_35397(yarnwrap.world.gen.heightprovider.UniformHeightProvider provider) { return new yarnwrap.world.gen.YOffset(wrapperContained.method_35397(provider.wrapperContained)); }
// public yarnwrap.world.gen.YOffset method_35398(yarnwrap.world.gen.heightprovider.UniformHeightProvider provider) { return new yarnwrap.world.gen.YOffset(wrapperContained.method_35398(provider.wrapperContained)); }

}