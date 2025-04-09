package yarnwrap.world.gen.heightprovider;
public class BiasedToBottomHeightProvider { public net.minecraft.world.gen.heightprovider.BiasedToBottomHeightProvider wrapperContained; public BiasedToBottomHeightProvider(net.minecraft.world.gen.heightprovider.BiasedToBottomHeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec BIASED_TO_BOTTOM_CODEC() { return wrapperContained.BIASED_TO_BOTTOM_CODEC; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.world.gen.YOffset minOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.minOffset); }
// public yarnwrap.world.gen.YOffset maxOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.maxOffset); }
// public int inner() { return wrapperContained.inner; }
public yarnwrap.world.gen.heightprovider.BiasedToBottomHeightProvider create(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset,int inner) { return new yarnwrap.world.gen.heightprovider.BiasedToBottomHeightProvider(wrapperContained.create(minOffset.wrapperContained,maxOffset.wrapperContained,inner)); }

}