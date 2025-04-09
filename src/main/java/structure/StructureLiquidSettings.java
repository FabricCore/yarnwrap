package yarnwrap.structure;
public class StructureLiquidSettings { public net.minecraft.structure.StructureLiquidSettings wrapperContained; public StructureLiquidSettings(net.minecraft.structure.StructureLiquidSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public java.lang.String id() { return wrapperContained.id; }

}