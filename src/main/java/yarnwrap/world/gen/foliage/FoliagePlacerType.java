package yarnwrap.world.gen.foliage;
public class FoliagePlacerType { public net.minecraft.world.gen.foliage.FoliagePlacerType wrapperContained; public FoliagePlacerType(net.minecraft.world.gen.foliage.FoliagePlacerType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.MapCodec codec() { return net.minecraft.world.gen.foliage.FoliagePlacerType.codec; }
// public static void codec(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.foliage.FoliagePlacerType.codec = value; }

public FoliagePlacerType(com.mojang.serialization.MapCodec codec) { this.wrapperContained = new net.minecraft.world.gen.foliage.FoliagePlacerType(codec); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.world.gen.foliage.FoliagePlacerType.getCodec(); }
// public yarnwrap.world.gen.foliage.FoliagePlacerType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.gen.foliage.FoliagePlacerType(wrapperContained.register(id,codec)); }
// public static yarnwrap.world.gen.foliage.FoliagePlacerType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.world.gen.foliage.FoliagePlacerType(net.minecraft.world.gen.foliage.FoliagePlacerType.register(id,codec)); }

}