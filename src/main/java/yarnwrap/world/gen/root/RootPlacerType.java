package yarnwrap.world.gen.root;
public class RootPlacerType { public net.minecraft.world.gen.root.RootPlacerType wrapperContained; public RootPlacerType(net.minecraft.world.gen.root.RootPlacerType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public yarnwrap.world.gen.root.RootPlacerType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.gen.root.RootPlacerType(wrapperContained.register(id,codec)); }

}