package yarnwrap.util.math.floatprovider;
public class FloatProviderType { public net.minecraft.util.math.floatprovider.FloatProviderType wrapperContained; public FloatProviderType(net.minecraft.util.math.floatprovider.FloatProviderType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.floatprovider.FloatProviderType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.util.math.floatprovider.FloatProviderType(wrapperContained.register(id,codec)); }
// public static yarnwrap.util.math.floatprovider.FloatProviderType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.util.math.floatprovider.FloatProviderType(net.minecraft.util.math.floatprovider.FloatProviderType.register(id,codec)); }

}