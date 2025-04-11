package yarnwrap.world.gen.foliage;
public class FoliagePlacerType { public net.minecraft.world.gen.foliage.FoliagePlacerType wrapperContained; public FoliagePlacerType(net.minecraft.world.gen.foliage.FoliagePlacerType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public yarnwrap.world.gen.foliage.FoliagePlacerType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.gen.foliage.FoliagePlacerType(wrapperContained.register(id,codec)); }

}