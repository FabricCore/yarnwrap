package yarnwrap.block;
public class OxidizableDoorBlock { public net.minecraft.block.OxidizableDoorBlock wrapperContained; public OxidizableDoorBlock(net.minecraft.block.OxidizableDoorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }
// public OxidizableDoorBlock(yarnwrap.block.BlockSetType type,Object oxidationLevel,Object settings) { this.wrapperContained = new net.minecraft.block.OxidizableDoorBlock(type.wrapperContained,oxidationLevel,settings); }
// public com.mojang.datafixers.kinds.App method_54769(Object instance) { return wrapperContained.method_54769(instance); }

}