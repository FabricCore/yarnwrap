package yarnwrap.world.gen.heightprovider;
public class TrapezoidHeightProvider { public net.minecraft.world.gen.heightprovider.TrapezoidHeightProvider wrapperContained; public TrapezoidHeightProvider(net.minecraft.world.gen.heightprovider.TrapezoidHeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.world.gen.YOffset minOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.minOffset); }
// public void minOffset(yarnwrap.world.gen.YOffset value) { wrapperContained.minOffset = value.wrapperContained; }
// public yarnwrap.world.gen.YOffset maxOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.maxOffset); }
// public void maxOffset(yarnwrap.world.gen.YOffset value) { wrapperContained.maxOffset = value.wrapperContained; }
// public int plateau() { return wrapperContained.plateau; }
// public void plateau(int value) { wrapperContained.plateau = value; }
// public TrapezoidHeightProvider(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset,int plateau) { this.wrapperContained = new net.minecraft.world.gen.heightprovider.TrapezoidHeightProvider(minOffset.wrapperContained,maxOffset.wrapperContained,plateau); }
// public com.mojang.datafixers.kinds.App method_36306(Object instance) { return wrapperContained.method_36306(instance); }
public yarnwrap.world.gen.heightprovider.TrapezoidHeightProvider create(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset) { return new yarnwrap.world.gen.heightprovider.TrapezoidHeightProvider(wrapperContained.create(minOffset.wrapperContained,maxOffset.wrapperContained)); }
public yarnwrap.world.gen.heightprovider.TrapezoidHeightProvider create(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset,int plateau) { return new yarnwrap.world.gen.heightprovider.TrapezoidHeightProvider(wrapperContained.create(minOffset.wrapperContained,maxOffset.wrapperContained,plateau)); }
// public yarnwrap.world.gen.YOffset method_36310(yarnwrap.world.gen.heightprovider.TrapezoidHeightProvider provider) { return new yarnwrap.world.gen.YOffset(wrapperContained.method_36310(provider.wrapperContained)); }
// public yarnwrap.world.gen.YOffset method_36311(yarnwrap.world.gen.heightprovider.TrapezoidHeightProvider provider) { return new yarnwrap.world.gen.YOffset(wrapperContained.method_36311(provider.wrapperContained)); }

}