package yarnwrap.block;
public class OxidizableBlock { public net.minecraft.block.OxidizableBlock wrapperContained; public OxidizableBlock(net.minecraft.block.OxidizableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }
// // public static Object oxidationLevel() { return net.minecraft.block.OxidizableBlock.oxidationLevel; }
// // public static void oxidationLevel(Object value, ) { net.minecraft.block.OxidizableBlock.oxidationLevel = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.OxidizableBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.OxidizableBlock.CODEC = value; }

// public OxidizableBlock(Object oxidationLevel,Object settings) { this.wrapperContained = new net.minecraft.block.OxidizableBlock(oxidationLevel,settings); }
// public com.mojang.datafixers.kinds.App method_54068(Object instance) { return wrapperContained.method_54068(instance); }
// public static com.mojang.datafixers.kinds.App method_54068(Object instance, ) { return net.minecraft.block.OxidizableBlock.method_54068(instance); }

}