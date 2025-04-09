package yarnwrap.world.gen.trunk;
public class TrunkPlacerType { public net.minecraft.world.gen.trunk.TrunkPlacerType wrapperContained; public TrunkPlacerType(net.minecraft.world.gen.trunk.TrunkPlacerType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public yarnwrap.world.gen.trunk.TrunkPlacerType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.gen.trunk.TrunkPlacerType(wrapperContained.register(id,codec)); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }

}