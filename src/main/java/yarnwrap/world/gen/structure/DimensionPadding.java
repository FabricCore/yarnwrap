package yarnwrap.world.gen.structure;
public class DimensionPadding { public net.minecraft.world.gen.structure.DimensionPadding wrapperContained; public DimensionPadding(net.minecraft.world.gen.structure.DimensionPadding wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.structure.DimensionPadding.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.structure.DimensionPadding.CODEC = value; }

// public yarnwrap.world.gen.structure.DimensionPadding NONE() { return new yarnwrap.world.gen.structure.DimensionPadding(wrapperContained.NONE); }
// public void NONE(yarnwrap.world.gen.structure.DimensionPadding value) { wrapperContained.NONE = value.wrapperContained; }
public static yarnwrap.world.gen.structure.DimensionPadding NONE() { return new yarnwrap.world.gen.structure.DimensionPadding(net.minecraft.world.gen.structure.DimensionPadding.NONE); }
// public static void NONE(yarnwrap.world.gen.structure.DimensionPadding value, ) { net.minecraft.world.gen.structure.DimensionPadding.NONE = value.wrapperContained; }

// public com.mojang.serialization.Codec OBJECT_CODEC() { return wrapperContained.OBJECT_CODEC; }
// public void OBJECT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.OBJECT_CODEC = value; }
// public static com.mojang.serialization.Codec OBJECT_CODEC() { return net.minecraft.world.gen.structure.DimensionPadding.OBJECT_CODEC; }
// public static void OBJECT_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.structure.DimensionPadding.OBJECT_CODEC = value; }

public DimensionPadding(int value) { this.wrapperContained = new net.minecraft.world.gen.structure.DimensionPadding(value); }
public boolean paddedBySameDistance() { return wrapperContained.paddedBySameDistance(); }
// public static boolean paddedBySameDistance() { return net.minecraft.world.gen.structure.DimensionPadding.paddedBySameDistance(); }
// public yarnwrap.world.gen.structure.DimensionPadding method_60630(com.mojang.datafixers.util.Either either) { return new yarnwrap.world.gen.structure.DimensionPadding(wrapperContained.method_60630(either)); }
// public static yarnwrap.world.gen.structure.DimensionPadding method_60630(com.mojang.datafixers.util.Either either, ) { return new yarnwrap.world.gen.structure.DimensionPadding(net.minecraft.world.gen.structure.DimensionPadding.method_60630(either)); }
// public com.mojang.datafixers.kinds.App method_60631(Object instance) { return wrapperContained.method_60631(instance); }
// public static com.mojang.datafixers.kinds.App method_60631(Object instance, ) { return net.minecraft.world.gen.structure.DimensionPadding.method_60631(instance); }
// public com.mojang.datafixers.util.Either method_60632(yarnwrap.world.gen.structure.DimensionPadding padding) { return wrapperContained.method_60632(padding.wrapperContained); }
// public static com.mojang.datafixers.util.Either method_60632(yarnwrap.world.gen.structure.DimensionPadding padding, ) { return net.minecraft.world.gen.structure.DimensionPadding.method_60632(padding.wrapperContained); }
// public java.lang.Integer method_60633(yarnwrap.world.gen.structure.DimensionPadding padding) { return wrapperContained.method_60633(padding.wrapperContained); }
// public static java.lang.Integer method_60633(yarnwrap.world.gen.structure.DimensionPadding padding, ) { return net.minecraft.world.gen.structure.DimensionPadding.method_60633(padding.wrapperContained); }
// public java.lang.Integer method_60634(yarnwrap.world.gen.structure.DimensionPadding padding) { return wrapperContained.method_60634(padding.wrapperContained); }
// public static java.lang.Integer method_60634(yarnwrap.world.gen.structure.DimensionPadding padding, ) { return net.minecraft.world.gen.structure.DimensionPadding.method_60634(padding.wrapperContained); }

}