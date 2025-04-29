package yarnwrap.block;
public class OxidizableGrateBlock { public net.minecraft.block.OxidizableGrateBlock wrapperContained; public OxidizableGrateBlock(net.minecraft.block.OxidizableGrateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.OxidizableGrateBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.OxidizableGrateBlock.CODEC = value; }

// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }
// // public static Object oxidationLevel() { return net.minecraft.block.OxidizableGrateBlock.oxidationLevel; }
// // public static void oxidationLevel(Object value, ) { net.minecraft.block.OxidizableGrateBlock.oxidationLevel = value; }

// public OxidizableGrateBlock(Object oxidationLevel,Object settings) { this.wrapperContained = new net.minecraft.block.OxidizableGrateBlock(oxidationLevel,settings); }
// public com.mojang.datafixers.kinds.App method_54771(Object instance) { return wrapperContained.method_54771(instance); }
// public static com.mojang.datafixers.kinds.App method_54771(Object instance, ) { return net.minecraft.block.OxidizableGrateBlock.method_54771(instance); }

}