package yarnwrap.structure;
public class StructureLiquidSettings { public net.minecraft.structure.StructureLiquidSettings wrapperContained; public StructureLiquidSettings(net.minecraft.structure.StructureLiquidSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public StructureLiquidSettings(java.lang.String id) { this.wrapperContained = new net.minecraft.structure.StructureLiquidSettings(id); }

}