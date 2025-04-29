package yarnwrap.world.gen.heightprovider;
public class ConstantHeightProvider { public net.minecraft.world.gen.heightprovider.ConstantHeightProvider wrapperContained; public ConstantHeightProvider(net.minecraft.world.gen.heightprovider.ConstantHeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.heightprovider.ConstantHeightProvider ZERO() { return new yarnwrap.world.gen.heightprovider.ConstantHeightProvider(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.world.gen.heightprovider.ConstantHeightProvider value) { wrapperContained.ZERO = value.wrapperContained; }
public static yarnwrap.world.gen.heightprovider.ConstantHeightProvider ZERO() { return new yarnwrap.world.gen.heightprovider.ConstantHeightProvider(net.minecraft.world.gen.heightprovider.ConstantHeightProvider.ZERO); }
// public static void ZERO(yarnwrap.world.gen.heightprovider.ConstantHeightProvider value, ) { net.minecraft.world.gen.heightprovider.ConstantHeightProvider.ZERO = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CONSTANT_CODEC() { return wrapperContained.CONSTANT_CODEC; }
// public void CONSTANT_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CONSTANT_CODEC = value; }
public static com.mojang.serialization.MapCodec CONSTANT_CODEC() { return net.minecraft.world.gen.heightprovider.ConstantHeightProvider.CONSTANT_CODEC; }
// public static void CONSTANT_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.heightprovider.ConstantHeightProvider.CONSTANT_CODEC = value; }

// public yarnwrap.world.gen.YOffset offset() { return new yarnwrap.world.gen.YOffset(wrapperContained.offset); }
// public void offset(yarnwrap.world.gen.YOffset value) { wrapperContained.offset = value.wrapperContained; }
// public static yarnwrap.world.gen.YOffset offset() { return new yarnwrap.world.gen.YOffset(net.minecraft.world.gen.heightprovider.ConstantHeightProvider.offset); }
// public static void offset(yarnwrap.world.gen.YOffset value, ) { net.minecraft.world.gen.heightprovider.ConstantHeightProvider.offset = value.wrapperContained; }

// public ConstantHeightProvider(yarnwrap.world.gen.YOffset offset) { this.wrapperContained = new net.minecraft.world.gen.heightprovider.ConstantHeightProvider(offset.wrapperContained); }
// public yarnwrap.world.gen.heightprovider.ConstantHeightProvider create(yarnwrap.world.gen.YOffset offset) { return new yarnwrap.world.gen.heightprovider.ConstantHeightProvider(wrapperContained.create(offset.wrapperContained)); }
// public static yarnwrap.world.gen.heightprovider.ConstantHeightProvider create(yarnwrap.world.gen.YOffset offset, ) { return new yarnwrap.world.gen.heightprovider.ConstantHeightProvider(net.minecraft.world.gen.heightprovider.ConstantHeightProvider.create(offset.wrapperContained)); }
public yarnwrap.world.gen.YOffset getOffset() { return new yarnwrap.world.gen.YOffset(wrapperContained.getOffset()); }
// public static yarnwrap.world.gen.YOffset getOffset() { return new yarnwrap.world.gen.YOffset(net.minecraft.world.gen.heightprovider.ConstantHeightProvider.getOffset()); }

}