package yarnwrap.world.gen.heightprovider;
public class UniformHeightProvider { public net.minecraft.world.gen.heightprovider.UniformHeightProvider wrapperContained; public UniformHeightProvider(net.minecraft.world.gen.heightprovider.UniformHeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec UNIFORM_CODEC() { return wrapperContained.UNIFORM_CODEC; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.world.gen.YOffset minOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.minOffset); }
// public yarnwrap.world.gen.YOffset maxOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.maxOffset); }
// public it.unimi.dsi.fastutil.longs.LongSet warnedEmptyHeightRanges() { return wrapperContained.warnedEmptyHeightRanges; }
public yarnwrap.world.gen.heightprovider.UniformHeightProvider create(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset) { return new yarnwrap.world.gen.heightprovider.UniformHeightProvider(wrapperContained.create(minOffset.wrapperContained,maxOffset.wrapperContained)); }

}