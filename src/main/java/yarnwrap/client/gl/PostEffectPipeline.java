package yarnwrap.client.gl;
public class PostEffectPipeline { public net.minecraft.client.gl.PostEffectPipeline wrapperContained; public PostEffectPipeline(net.minecraft.client.gl.PostEffectPipeline wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.gl.PostEffectPipeline.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.gl.PostEffectPipeline.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_62242(Object instance) { return wrapperContained.method_62242(instance); }
// public static com.mojang.datafixers.kinds.App method_62242(Object instance, ) { return net.minecraft.client.gl.PostEffectPipeline.method_62242(instance); }

}