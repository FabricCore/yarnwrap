package yarnwrap.block;
public class MossBlock { public net.minecraft.block.MossBlock wrapperContained; public MossBlock(net.minecraft.block.MossBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.MossBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.MossBlock.CODEC = value; }

// public void method_46684(yarnwrap.server.world.ServerWorld entry) { wrapperContained.method_46684(entry.wrapperContained); }
// public static void method_46684(yarnwrap.server.world.ServerWorld entry, ) { net.minecraft.block.MossBlock.method_46684(entry.wrapperContained); }
// public java.util.Optional method_46685(yarnwrap.registry.Registry key) { return wrapperContained.method_46685(key.wrapperContained); }
// public static java.util.Optional method_46685(yarnwrap.registry.Registry key, ) { return net.minecraft.block.MossBlock.method_46685(key.wrapperContained); }

}