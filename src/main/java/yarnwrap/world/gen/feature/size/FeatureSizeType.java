package yarnwrap.world.gen.feature.size;
public class FeatureSizeType { public net.minecraft.world.gen.feature.size.FeatureSizeType wrapperContained; public FeatureSizeType(net.minecraft.world.gen.feature.size.FeatureSizeType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.MapCodec codec() { return net.minecraft.world.gen.feature.size.FeatureSizeType.codec; }
// public static void codec(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.feature.size.FeatureSizeType.codec = value; }

// public yarnwrap.world.gen.feature.size.FeatureSizeType register(java.lang.String id) { return new yarnwrap.world.gen.feature.size.FeatureSizeType(wrapperContained.register(id)); }
// public static yarnwrap.world.gen.feature.size.FeatureSizeType register(java.lang.String id, ) { return new yarnwrap.world.gen.feature.size.FeatureSizeType(net.minecraft.world.gen.feature.size.FeatureSizeType.register(id)); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.world.gen.feature.size.FeatureSizeType.getCodec(); }

}