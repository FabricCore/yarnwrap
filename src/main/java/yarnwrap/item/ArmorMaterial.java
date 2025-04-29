package yarnwrap.item;
public class ArmorMaterial { public net.minecraft.item.ArmorMaterial wrapperContained; public ArmorMaterial(net.minecraft.item.ArmorMaterial wrapperContained) { this.wrapperContained = wrapperContained; }

// public int enchantability() { return wrapperContained.enchantability; }
// public void enchantability(int value) { wrapperContained.enchantability = value; }
// public static int enchantability() { return net.minecraft.item.ArmorMaterial.enchantability; }
// public static void enchantability(int value, ) { net.minecraft.item.ArmorMaterial.enchantability = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.ArmorMaterial.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.ArmorMaterial.CODEC = value; }

// public int enchantability() { return wrapperContained.enchantability(); }
// // public static int enchantability() { return net.minecraft.item.ArmorMaterial.enchantability(); }
// public int getProtection(Object type) { return wrapperContained.getProtection(type); }
// public static int getProtection(Object type, ) { return net.minecraft.item.ArmorMaterial.getProtection(type); }

}