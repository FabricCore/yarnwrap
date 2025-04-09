package yarnwrap.world.gen.heightprovider;
public class TrapezoidHeightProvider { public net.minecraft.world.gen.heightprovider.TrapezoidHeightProvider wrapperContained; public TrapezoidHeightProvider(net.minecraft.world.gen.heightprovider.TrapezoidHeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.world.gen.YOffset minOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.minOffset); }
// public yarnwrap.world.gen.YOffset maxOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.maxOffset); }
// public int plateau() { return wrapperContained.plateau; }
public yarnwrap.world.gen.heightprovider.TrapezoidHeightProvider create(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset) { return new yarnwrap.world.gen.heightprovider.TrapezoidHeightProvider(wrapperContained.create(minOffset.wrapperContained,maxOffset.wrapperContained)); }
public yarnwrap.world.gen.heightprovider.TrapezoidHeightProvider create(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset,int plateau) { return new yarnwrap.world.gen.heightprovider.TrapezoidHeightProvider(wrapperContained.create(minOffset.wrapperContained,maxOffset.wrapperContained,plateau)); }

}