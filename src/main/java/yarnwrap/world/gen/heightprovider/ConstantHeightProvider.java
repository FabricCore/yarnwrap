package yarnwrap.world.gen.heightprovider;
public class ConstantHeightProvider { public net.minecraft.world.gen.heightprovider.ConstantHeightProvider wrapperContained; public ConstantHeightProvider(net.minecraft.world.gen.heightprovider.ConstantHeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.heightprovider.ConstantHeightProvider ZERO() { return new yarnwrap.world.gen.heightprovider.ConstantHeightProvider(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.world.gen.heightprovider.ConstantHeightProvider value) { wrapperContained.ZERO = value.wrapperContained; }
public com.mojang.serialization.MapCodec CONSTANT_CODEC() { return wrapperContained.CONSTANT_CODEC; }
// public void CONSTANT_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CONSTANT_CODEC = value; }
// public yarnwrap.world.gen.YOffset offset() { return new yarnwrap.world.gen.YOffset(wrapperContained.offset); }
// public void offset(yarnwrap.world.gen.YOffset value) { wrapperContained.offset = value.wrapperContained; }
public yarnwrap.world.gen.heightprovider.ConstantHeightProvider create(yarnwrap.world.gen.YOffset offset) { return new yarnwrap.world.gen.heightprovider.ConstantHeightProvider(wrapperContained.create(offset.wrapperContained)); }
public yarnwrap.world.gen.YOffset getOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.getOffset()); }

}