package yarnwrap.block;
public class DyedCarpetBlock { public net.minecraft.block.DyedCarpetBlock wrapperContained; public DyedCarpetBlock(net.minecraft.block.DyedCarpetBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor dyeColor() { return new yarnwrap.util.DyeColor(wrapperContained.dyeColor); }
// public void dyeColor(yarnwrap.util.DyeColor value) { wrapperContained.dyeColor = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public DyedCarpetBlock(yarnwrap.util.DyeColor dyeColor,Object settings) { this.wrapperContained = new net.minecraft.block.DyedCarpetBlock(dyeColor.wrapperContained,settings); }
public yarnwrap.util.DyeColor getDyeColor() { return new yarnwrap.util.DyeColor(wrapperContained.getDyeColor()); }
// public com.mojang.datafixers.kinds.App method_54076(Object instance) { return wrapperContained.method_54076(instance); }

}