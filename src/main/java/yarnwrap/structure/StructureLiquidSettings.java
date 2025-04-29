package yarnwrap.structure;
public class StructureLiquidSettings { public net.minecraft.structure.StructureLiquidSettings wrapperContained; public StructureLiquidSettings(net.minecraft.structure.StructureLiquidSettings wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
public static com.mojang.serialization.Codec codec() { return net.minecraft.structure.StructureLiquidSettings.codec; }
// public static void codec(com.mojang.serialization.Codec value, ) { net.minecraft.structure.StructureLiquidSettings.codec = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.structure.StructureLiquidSettings.id; }
// public static void id(java.lang.String value, ) { net.minecraft.structure.StructureLiquidSettings.id = value; }

// public StructureLiquidSettings(java.lang.String id) { this.wrapperContained = new net.minecraft.structure.StructureLiquidSettings(id); }

}