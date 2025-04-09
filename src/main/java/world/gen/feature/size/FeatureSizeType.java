package yarnwrap.world.gen.feature.size;
public class FeatureSizeType { public net.minecraft.world.gen.feature.size.FeatureSizeType wrapperContained; public FeatureSizeType(net.minecraft.world.gen.feature.size.FeatureSizeType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public yarnwrap.world.gen.feature.size.FeatureSizeType register(java.lang.String id) { return new yarnwrap.world.gen.feature.size.FeatureSizeType(wrapperContained.register(id)); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }

}