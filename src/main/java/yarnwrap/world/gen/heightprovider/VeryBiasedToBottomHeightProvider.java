package yarnwrap.world.gen.heightprovider;
public class VeryBiasedToBottomHeightProvider { public net.minecraft.world.gen.heightprovider.VeryBiasedToBottomHeightProvider wrapperContained; public VeryBiasedToBottomHeightProvider(net.minecraft.world.gen.heightprovider.VeryBiasedToBottomHeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.world.gen.YOffset minOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.minOffset); }
// public void minOffset(yarnwrap.world.gen.YOffset value) { wrapperContained.minOffset = value.wrapperContained; }
// public yarnwrap.world.gen.YOffset maxOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.maxOffset); }
// public void maxOffset(yarnwrap.world.gen.YOffset value) { wrapperContained.maxOffset = value.wrapperContained; }
// public int inner() { return wrapperContained.inner; }
// public void inner(int value) { wrapperContained.inner = value; }
public yarnwrap.world.gen.heightprovider.VeryBiasedToBottomHeightProvider create(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset,int inner) { return new yarnwrap.world.gen.heightprovider.VeryBiasedToBottomHeightProvider(wrapperContained.create(minOffset.wrapperContained,maxOffset.wrapperContained,inner)); }

}