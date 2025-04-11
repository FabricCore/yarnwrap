package yarnwrap.item.trim;
public class ArmorTrim { public net.minecraft.item.trim.ArmorTrim wrapperContained; public ArmorTrim(net.minecraft.item.trim.ArmorTrim wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.text.Text UPGRADE_TEXT() { return new yarnwrap.text.Text(wrapperContained.UPGRADE_TEXT); }
// public void UPGRADE_TEXT(yarnwrap.text.Text value) { wrapperContained.UPGRADE_TEXT = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry material() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.material); }
// public void material(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.material = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry pattern() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.pattern); }
// public void pattern(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.pattern = value.wrapperContained; }
// public java.util.function.Function leggingsModelIdGetter() { return wrapperContained.leggingsModelIdGetter; }
// public void leggingsModelIdGetter(java.util.function.Function value) { wrapperContained.leggingsModelIdGetter = value; }
// public java.util.function.Function genericModelIdGetter() { return wrapperContained.genericModelIdGetter; }
// public void genericModelIdGetter(java.util.function.Function value) { wrapperContained.genericModelIdGetter = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public boolean showInTooltip() { return wrapperContained.showInTooltip; }
// public void showInTooltip(boolean value) { wrapperContained.showInTooltip = value; }
public ArmorTrim(yarnwrap.registry.entry.RegistryEntry material,yarnwrap.registry.entry.RegistryEntry pattern) { this.wrapperContained = new net.minecraft.item.trim.ArmorTrim(material.wrapperContained,pattern.wrapperContained); }
public ArmorTrim(yarnwrap.registry.entry.RegistryEntry material,yarnwrap.registry.entry.RegistryEntry pattern,boolean showInTooltip) { this.wrapperContained = new net.minecraft.item.trim.ArmorTrim(material.wrapperContained,pattern.wrapperContained,showInTooltip); }
// public ArmorTrim(yarnwrap.registry.entry.RegistryEntry material,yarnwrap.registry.entry.RegistryEntry pattern,boolean showInTooltip,java.util.function.Function leggingsModelIdGetter,java.util.function.Function genericModelIdGetter) { this.wrapperContained = new net.minecraft.item.trim.ArmorTrim(material.wrapperContained,pattern.wrapperContained,showInTooltip,leggingsModelIdGetter,genericModelIdGetter); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.registry.entry.RegistryEntry getPattern() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getPattern()); }
public boolean equals(yarnwrap.registry.entry.RegistryEntry pattern,yarnwrap.registry.entry.RegistryEntry material) { return wrapperContained.equals(pattern.wrapperContained,material.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getMaterial() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getMaterial()); }
public yarnwrap.util.Identifier getLeggingsModelId(yarnwrap.registry.entry.RegistryEntry armorMaterial) { return new yarnwrap.util.Identifier(wrapperContained.getLeggingsModelId(armorMaterial.wrapperContained)); }
public yarnwrap.util.Identifier getGenericModelId(yarnwrap.registry.entry.RegistryEntry armorMaterial) { return new yarnwrap.util.Identifier(wrapperContained.getGenericModelId(armorMaterial.wrapperContained)); }
// public java.lang.String getMaterialAssetNameFor(yarnwrap.registry.entry.RegistryEntry material,yarnwrap.registry.entry.RegistryEntry armorMaterial) { return wrapperContained.getMaterialAssetNameFor(material.wrapperContained,armorMaterial.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_57406(Object instance) { return wrapperContained.method_57406(instance); }
// public java.lang.Boolean method_57407(yarnwrap.item.trim.ArmorTrim trim) { return wrapperContained.method_57407(trim.wrapperContained); }
// public java.lang.String method_57408(java.lang.String materialName) { return wrapperContained.method_57408(materialName); }
// public java.lang.Boolean method_57410(yarnwrap.item.trim.ArmorTrim trim) { return wrapperContained.method_57410(trim.wrapperContained); }
// public yarnwrap.util.Identifier method_57411(yarnwrap.registry.entry.RegistryEntry materialEntry) { return new yarnwrap.util.Identifier(wrapperContained.method_57411(materialEntry.wrapperContained)); }
// public java.lang.String method_57412(java.lang.String materialName) { return wrapperContained.method_57412(materialName); }
// public yarnwrap.util.Identifier method_57413(yarnwrap.registry.entry.RegistryEntry materialEntry) { return new yarnwrap.util.Identifier(wrapperContained.method_57413(materialEntry.wrapperContained)); }
public yarnwrap.item.trim.ArmorTrim withShowInTooltip(boolean showInTooltip) { return new yarnwrap.item.trim.ArmorTrim(wrapperContained.withShowInTooltip(showInTooltip)); }

}