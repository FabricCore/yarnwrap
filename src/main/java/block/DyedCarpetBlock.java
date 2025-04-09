package yarnwrap.block;
public class DyedCarpetBlock { public net.minecraft.block.DyedCarpetBlock wrapperContained; public DyedCarpetBlock(net.minecraft.block.DyedCarpetBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor dyeColor() { return new yarnwrap.util.DyeColor(wrapperContained.dyeColor); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.util.DyeColor getDyeColor() { return new yarnwrap.util.DyeColor(wrapperContained.getDyeColor()); }

}