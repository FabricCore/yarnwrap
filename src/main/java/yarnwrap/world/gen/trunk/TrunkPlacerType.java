package yarnwrap.world.gen.trunk;
public class TrunkPlacerType { public net.minecraft.world.gen.trunk.TrunkPlacerType wrapperContained; public TrunkPlacerType(net.minecraft.world.gen.trunk.TrunkPlacerType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.MapCodec codec() { return net.minecraft.world.gen.trunk.TrunkPlacerType.codec; }
// public static void codec(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.trunk.TrunkPlacerType.codec = value; }

public TrunkPlacerType(com.mojang.serialization.MapCodec codec) { this.wrapperContained = new net.minecraft.world.gen.trunk.TrunkPlacerType(codec); }
// public yarnwrap.world.gen.trunk.TrunkPlacerType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.gen.trunk.TrunkPlacerType(wrapperContained.register(id,codec)); }
// public static yarnwrap.world.gen.trunk.TrunkPlacerType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.world.gen.trunk.TrunkPlacerType(net.minecraft.world.gen.trunk.TrunkPlacerType.register(id,codec)); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.world.gen.trunk.TrunkPlacerType.getCodec(); }

}