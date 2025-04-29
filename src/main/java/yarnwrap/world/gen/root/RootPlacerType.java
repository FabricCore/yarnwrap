package yarnwrap.world.gen.root;
public class RootPlacerType { public net.minecraft.world.gen.root.RootPlacerType wrapperContained; public RootPlacerType(net.minecraft.world.gen.root.RootPlacerType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.MapCodec codec() { return net.minecraft.world.gen.root.RootPlacerType.codec; }
// public static void codec(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.root.RootPlacerType.codec = value; }

public RootPlacerType(com.mojang.serialization.MapCodec codec) { this.wrapperContained = new net.minecraft.world.gen.root.RootPlacerType(codec); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.world.gen.root.RootPlacerType.getCodec(); }
// public yarnwrap.world.gen.root.RootPlacerType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.gen.root.RootPlacerType(wrapperContained.register(id,codec)); }
// public static yarnwrap.world.gen.root.RootPlacerType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.world.gen.root.RootPlacerType(net.minecraft.world.gen.root.RootPlacerType.register(id,codec)); }

}