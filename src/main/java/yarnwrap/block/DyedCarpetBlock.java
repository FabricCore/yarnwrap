package yarnwrap.block;
public class DyedCarpetBlock { public net.minecraft.block.DyedCarpetBlock wrapperContained; public DyedCarpetBlock(net.minecraft.block.DyedCarpetBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor dyeColor() { return new yarnwrap.util.DyeColor(wrapperContained.dyeColor); }
// public void dyeColor(yarnwrap.util.DyeColor value) { wrapperContained.dyeColor = value.wrapperContained; }
// public static yarnwrap.util.DyeColor dyeColor() { return new yarnwrap.util.DyeColor(net.minecraft.block.DyedCarpetBlock.dyeColor); }
// public static void dyeColor(yarnwrap.util.DyeColor value, ) { net.minecraft.block.DyedCarpetBlock.dyeColor = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.DyedCarpetBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.DyedCarpetBlock.CODEC = value; }

// public DyedCarpetBlock(yarnwrap.util.DyeColor dyeColor,Object settings) { this.wrapperContained = new net.minecraft.block.DyedCarpetBlock(dyeColor.wrapperContained,settings); }
public yarnwrap.util.DyeColor getDyeColor() { return new yarnwrap.util.DyeColor(wrapperContained.getDyeColor()); }
// public static yarnwrap.util.DyeColor getDyeColor() { return new yarnwrap.util.DyeColor(net.minecraft.block.DyedCarpetBlock.getDyeColor()); }
// public com.mojang.datafixers.kinds.App method_54076(Object instance) { return wrapperContained.method_54076(instance); }
// public static com.mojang.datafixers.kinds.App method_54076(Object instance, ) { return net.minecraft.block.DyedCarpetBlock.method_54076(instance); }

}