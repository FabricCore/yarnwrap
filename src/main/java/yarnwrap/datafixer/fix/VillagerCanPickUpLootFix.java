package yarnwrap.datafixer.fix;
public class VillagerCanPickUpLootFix { public net.minecraft.datafixer.fix.VillagerCanPickUpLootFix wrapperContained; public VillagerCanPickUpLootFix(net.minecraft.datafixer.fix.VillagerCanPickUpLootFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String FIELD_NAME() { return wrapperContained.FIELD_NAME; }
// public void FIELD_NAME(java.lang.String value) { wrapperContained.FIELD_NAME = value; }
// public static java.lang.String FIELD_NAME() { return net.minecraft.datafixer.fix.VillagerCanPickUpLootFix.FIELD_NAME; }
// public static void FIELD_NAME(java.lang.String value, ) { net.minecraft.datafixer.fix.VillagerCanPickUpLootFix.FIELD_NAME = value; }

public VillagerCanPickUpLootFix(com.mojang.datafixers.schemas.Schema schema) { this.wrapperContained = new net.minecraft.datafixer.fix.VillagerCanPickUpLootFix(schema); }
// public com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fix(dynamic); }
// public static com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.VillagerCanPickUpLootFix.fix(dynamic); }

}