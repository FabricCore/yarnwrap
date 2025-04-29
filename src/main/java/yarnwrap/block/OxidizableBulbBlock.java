package yarnwrap.block;
public class OxidizableBulbBlock { public net.minecraft.block.OxidizableBulbBlock wrapperContained; public OxidizableBulbBlock(net.minecraft.block.OxidizableBulbBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.OxidizableBulbBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.OxidizableBulbBlock.CODEC = value; }

// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }
// // public static Object oxidationLevel() { return net.minecraft.block.OxidizableBulbBlock.oxidationLevel; }
// // public static void oxidationLevel(Object value, ) { net.minecraft.block.OxidizableBulbBlock.oxidationLevel = value; }

// public OxidizableBulbBlock(Object oxidationLevel,Object settings) { this.wrapperContained = new net.minecraft.block.OxidizableBulbBlock(oxidationLevel,settings); }
// public com.mojang.datafixers.kinds.App method_54767(Object instance) { return wrapperContained.method_54767(instance); }
// public static com.mojang.datafixers.kinds.App method_54767(Object instance, ) { return net.minecraft.block.OxidizableBulbBlock.method_54767(instance); }

}