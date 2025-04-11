package yarnwrap.block;
public class OxidizableBulbBlock { public net.minecraft.block.OxidizableBulbBlock wrapperContained; public OxidizableBulbBlock(net.minecraft.block.OxidizableBulbBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }
// public OxidizableBulbBlock(Object oxidationLevel,Object settings) { this.wrapperContained = new net.minecraft.block.OxidizableBulbBlock(oxidationLevel,settings); }
// public com.mojang.datafixers.kinds.App method_54767(Object instance) { return wrapperContained.method_54767(instance); }

}