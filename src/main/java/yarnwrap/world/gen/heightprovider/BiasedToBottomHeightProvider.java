package yarnwrap.world.gen.heightprovider;
public class BiasedToBottomHeightProvider { public net.minecraft.world.gen.heightprovider.BiasedToBottomHeightProvider wrapperContained; public BiasedToBottomHeightProvider(net.minecraft.world.gen.heightprovider.BiasedToBottomHeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec BIASED_TO_BOTTOM_CODEC() { return wrapperContained.BIASED_TO_BOTTOM_CODEC; }
// public void BIASED_TO_BOTTOM_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.BIASED_TO_BOTTOM_CODEC = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.world.gen.YOffset minOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.minOffset); }
// public void minOffset(yarnwrap.world.gen.YOffset value) { wrapperContained.minOffset = value.wrapperContained; }
// public yarnwrap.world.gen.YOffset maxOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.maxOffset); }
// public void maxOffset(yarnwrap.world.gen.YOffset value) { wrapperContained.maxOffset = value.wrapperContained; }
// public int inner() { return wrapperContained.inner; }
// public void inner(int value) { wrapperContained.inner = value; }
// public BiasedToBottomHeightProvider(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset,int inner) { this.wrapperContained = new net.minecraft.world.gen.heightprovider.BiasedToBottomHeightProvider(minOffset.wrapperContained,maxOffset.wrapperContained,inner); }
// public com.mojang.datafixers.kinds.App method_35376(Object instance) { return wrapperContained.method_35376(instance); }
public yarnwrap.world.gen.heightprovider.BiasedToBottomHeightProvider create(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset,int inner) { return new yarnwrap.world.gen.heightprovider.BiasedToBottomHeightProvider(wrapperContained.create(minOffset.wrapperContained,maxOffset.wrapperContained,inner)); }
// public java.lang.Integer method_35378(yarnwrap.world.gen.heightprovider.BiasedToBottomHeightProvider provider) { return wrapperContained.method_35378(provider.wrapperContained); }
// public yarnwrap.world.gen.YOffset method_35379(yarnwrap.world.gen.heightprovider.BiasedToBottomHeightProvider provider) { return new yarnwrap.world.gen.YOffset(wrapperContained.method_35379(provider.wrapperContained)); }
// public yarnwrap.world.gen.YOffset method_35380(yarnwrap.world.gen.heightprovider.BiasedToBottomHeightProvider provider) { return new yarnwrap.world.gen.YOffset(wrapperContained.method_35380(provider.wrapperContained)); }

}