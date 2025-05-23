package yarnwrap.entity;
public class EquipmentDropChances { public net.minecraft.entity.EquipmentDropChances wrapperContained; public EquipmentDropChances(net.minecraft.entity.EquipmentDropChances wrapperContained) { this.wrapperContained = wrapperContained; }

// public float DEFAULT_CHANCE() { return wrapperContained.DEFAULT_CHANCE; }
// public void DEFAULT_CHANCE(float value) { wrapperContained.DEFAULT_CHANCE = value; }
public static float DEFAULT_CHANCE() { return net.minecraft.entity.EquipmentDropChances.DEFAULT_CHANCE; }
// public static void DEFAULT_CHANCE(float value, ) { net.minecraft.entity.EquipmentDropChances.DEFAULT_CHANCE = value; }

// public float UNHARMED_DROP_THRESHOLD() { return wrapperContained.UNHARMED_DROP_THRESHOLD; }
// public void UNHARMED_DROP_THRESHOLD(float value) { wrapperContained.UNHARMED_DROP_THRESHOLD = value; }
public static float UNHARMED_DROP_THRESHOLD() { return net.minecraft.entity.EquipmentDropChances.UNHARMED_DROP_THRESHOLD; }
// public static void UNHARMED_DROP_THRESHOLD(float value, ) { net.minecraft.entity.EquipmentDropChances.UNHARMED_DROP_THRESHOLD = value; }

// public int GUARANTEED_DROP_CHANCE() { return wrapperContained.GUARANTEED_DROP_CHANCE; }
// public void GUARANTEED_DROP_CHANCE(int value) { wrapperContained.GUARANTEED_DROP_CHANCE = value; }
public static int GUARANTEED_DROP_CHANCE() { return net.minecraft.entity.EquipmentDropChances.GUARANTEED_DROP_CHANCE; }
// public static void GUARANTEED_DROP_CHANCE(int value, ) { net.minecraft.entity.EquipmentDropChances.GUARANTEED_DROP_CHANCE = value; }

// public yarnwrap.entity.EquipmentDropChances DEFAULT() { return new yarnwrap.entity.EquipmentDropChances(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.entity.EquipmentDropChances value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.entity.EquipmentDropChances DEFAULT() { return new yarnwrap.entity.EquipmentDropChances(net.minecraft.entity.EquipmentDropChances.DEFAULT); }
// public static void DEFAULT(yarnwrap.entity.EquipmentDropChances value, ) { net.minecraft.entity.EquipmentDropChances.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.EquipmentDropChances.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.EquipmentDropChances.CODEC = value; }

public yarnwrap.entity.EquipmentDropChances withGuaranteed(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.entity.EquipmentDropChances(wrapperContained.withGuaranteed(slot.wrapperContained)); }
// public static yarnwrap.entity.EquipmentDropChances withGuaranteed(yarnwrap.entity.EquipmentSlot slot, ) { return new yarnwrap.entity.EquipmentDropChances(net.minecraft.entity.EquipmentDropChances.withGuaranteed(slot.wrapperContained)); }
public yarnwrap.entity.EquipmentDropChances withChance(yarnwrap.entity.EquipmentSlot slot,float chance) { return new yarnwrap.entity.EquipmentDropChances(wrapperContained.withChance(slot.wrapperContained,chance)); }
// public static yarnwrap.entity.EquipmentDropChances withChance(yarnwrap.entity.EquipmentSlot slot,float chance, ) { return new yarnwrap.entity.EquipmentDropChances(net.minecraft.entity.EquipmentDropChances.withChance(slot.wrapperContained,chance)); }
// public java.lang.Float method_66236(yarnwrap.entity.EquipmentSlot slotx) { return wrapperContained.method_66236(slotx.wrapperContained); }
// public static java.lang.Float method_66236(yarnwrap.entity.EquipmentSlot slotx, ) { return net.minecraft.entity.EquipmentDropChances.method_66236(slotx.wrapperContained); }
// public boolean method_66237(java.lang.Float chance) { return wrapperContained.method_66237(chance); }
// public static boolean method_66237(java.lang.Float chance, ) { return net.minecraft.entity.EquipmentDropChances.method_66237(chance); }
// public java.util.Map getWithoutDefaultChances(java.util.Map byEquipment) { return wrapperContained.getWithoutDefaultChances(byEquipment); }
// public static java.util.Map getWithoutDefaultChances(java.util.Map byEquipment, ) { return net.minecraft.entity.EquipmentDropChances.getWithoutDefaultChances(byEquipment); }
// public java.lang.Float method_66239(java.util.Map slot) { return wrapperContained.method_66239(slot); }
// public static java.lang.Float method_66239(java.util.Map slot, ) { return net.minecraft.entity.EquipmentDropChances.method_66239(slot); }
public float get(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.get(slot.wrapperContained); }
// public static float get(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.EquipmentDropChances.get(slot.wrapperContained); }
// public java.util.Map getWithDefaultChances(java.util.Map byEquipment) { return wrapperContained.getWithDefaultChances(byEquipment); }
// public static java.util.Map getWithDefaultChances(java.util.Map byEquipment, ) { return net.minecraft.entity.EquipmentDropChances.getWithDefaultChances(byEquipment); }
public boolean dropsExactly(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.dropsExactly(slot.wrapperContained); }
// public static boolean dropsExactly(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.EquipmentDropChances.dropsExactly(slot.wrapperContained); }
// public java.lang.Float method_66243(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.method_66243(slot.wrapperContained); }
// public static java.lang.Float method_66243(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.EquipmentDropChances.method_66243(slot.wrapperContained); }

}