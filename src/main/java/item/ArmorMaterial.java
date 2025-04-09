package yarnwrap.item;
public class ArmorMaterial { public net.minecraft.item.ArmorMaterial wrapperContained; public ArmorMaterial(net.minecraft.item.ArmorMaterial wrapperContained) { this.wrapperContained = wrapperContained; }

// public int enchantability() { return wrapperContained.enchantability; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public int enchantability() { return wrapperContained.enchantability(); }
// public int getProtection(Object type) { return wrapperContained.getProtection(type); }

}