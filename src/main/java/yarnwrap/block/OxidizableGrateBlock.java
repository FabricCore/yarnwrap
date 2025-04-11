package yarnwrap.block;
public class OxidizableGrateBlock { public net.minecraft.block.OxidizableGrateBlock wrapperContained; public OxidizableGrateBlock(net.minecraft.block.OxidizableGrateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }
// public OxidizableGrateBlock(Object oxidationLevel,Object settings) { this.wrapperContained = new net.minecraft.block.OxidizableGrateBlock(oxidationLevel,settings); }
// public com.mojang.datafixers.kinds.App method_54771(Object instance) { return wrapperContained.method_54771(instance); }

}