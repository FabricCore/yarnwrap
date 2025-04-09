package yarnwrap.world.gen.heightprovider;
public class VeryBiasedToBottomHeightProvider { public net.minecraft.world.gen.heightprovider.VeryBiasedToBottomHeightProvider wrapperContained; public VeryBiasedToBottomHeightProvider(net.minecraft.world.gen.heightprovider.VeryBiasedToBottomHeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.world.gen.YOffset minOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.minOffset); }
// public yarnwrap.world.gen.YOffset maxOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.maxOffset); }
// public int inner() { return wrapperContained.inner; }
public yarnwrap.world.gen.heightprovider.VeryBiasedToBottomHeightProvider create(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset,int inner) { return new yarnwrap.world.gen.heightprovider.VeryBiasedToBottomHeightProvider(wrapperContained.create(minOffset.wrapperContained,maxOffset.wrapperContained,inner)); }

}