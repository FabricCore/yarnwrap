package yarnwrap.datafixer.fix;
public class WorldUuidFix { public net.minecraft.datafixer.fix.WorldUuidFix wrapperContained; public WorldUuidFix(net.minecraft.datafixer.fix.WorldUuidFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.datafixer.fix.WorldUuidFix.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.datafixer.fix.WorldUuidFix.LOGGER = value; }

public WorldUuidFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.WorldUuidFix(outputSchema); }
// public com.mojang.serialization.Dynamic fixWanderingTraderId(com.mojang.serialization.Dynamic levelDynamic) { return wrapperContained.fixWanderingTraderId(levelDynamic); }
// public static com.mojang.serialization.Dynamic fixWanderingTraderId(com.mojang.serialization.Dynamic levelDynamic, ) { return net.minecraft.datafixer.fix.WorldUuidFix.fixWanderingTraderId(levelDynamic); }
// public com.mojang.serialization.Dynamic fixDragonUuid(com.mojang.serialization.Dynamic levelDynamic) { return wrapperContained.fixDragonUuid(levelDynamic); }
// public static com.mojang.serialization.Dynamic fixDragonUuid(com.mojang.serialization.Dynamic levelDynamic, ) { return net.minecraft.datafixer.fix.WorldUuidFix.fixDragonUuid(levelDynamic); }
// public com.mojang.serialization.Dynamic fixCustomBossEvents(com.mojang.serialization.Dynamic levelDynamic) { return wrapperContained.fixCustomBossEvents(levelDynamic); }
// public static com.mojang.serialization.Dynamic fixCustomBossEvents(com.mojang.serialization.Dynamic levelDynamic, ) { return net.minecraft.datafixer.fix.WorldUuidFix.fixCustomBossEvents(levelDynamic); }
// public com.mojang.datafixers.util.Pair method_28213(com.mojang.datafixers.util.Pair entry) { return wrapperContained.method_28213(entry); }
// public static com.mojang.datafixers.util.Pair method_28213(com.mojang.datafixers.util.Pair entry, ) { return net.minecraft.datafixer.fix.WorldUuidFix.method_28213(entry); }
// public com.mojang.serialization.Dynamic method_28218(com.mojang.serialization.Dynamic dimensionDataDynamic) { return wrapperContained.method_28218(dimensionDataDynamic); }
// public static com.mojang.serialization.Dynamic method_28218(com.mojang.serialization.Dynamic dimensionDataDynamic, ) { return net.minecraft.datafixer.fix.WorldUuidFix.method_28218(dimensionDataDynamic); }
// public com.mojang.serialization.Dynamic method_28219(com.mojang.serialization.Dynamic dimensionDataValueDynamic) { return wrapperContained.method_28219(dimensionDataValueDynamic); }
// public static com.mojang.serialization.Dynamic method_28219(com.mojang.serialization.Dynamic dimensionDataValueDynamic, ) { return net.minecraft.datafixer.fix.WorldUuidFix.method_28219(dimensionDataValueDynamic); }
// public com.mojang.serialization.Dynamic method_28220(com.mojang.serialization.Dynamic dragonFightDynamic) { return wrapperContained.method_28220(dragonFightDynamic); }
// public static com.mojang.serialization.Dynamic method_28220(com.mojang.serialization.Dynamic dragonFightDynamic, ) { return net.minecraft.datafixer.fix.WorldUuidFix.method_28220(dragonFightDynamic); }

}