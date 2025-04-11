package yarnwrap.datafixer.fix;
public class PersistentStateUuidFix { public net.minecraft.datafixer.fix.PersistentStateUuidFix wrapperContained; public PersistentStateUuidFix(net.minecraft.datafixer.fix.PersistentStateUuidFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public PersistentStateUuidFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.PersistentStateUuidFix(outputSchema); }
// public com.mojang.datafixers.Typed method_26073(com.mojang.datafixers.Typed raidsDataTyped) { return wrapperContained.method_26073(raidsDataTyped); }
// public com.mojang.serialization.Dynamic method_26075(com.mojang.serialization.Dynamic raidsDataDynamic) { return wrapperContained.method_26075(raidsDataDynamic); }
// public com.mojang.serialization.Dynamic method_28254(com.mojang.serialization.Dynamic dataDynamic) { return wrapperContained.method_28254(dataDynamic); }
// public com.mojang.serialization.Dynamic method_28255(com.mojang.serialization.Dynamic raidsDynamic) { return wrapperContained.method_28255(raidsDynamic); }
// public com.mojang.serialization.Dynamic method_28256(com.mojang.serialization.Dynamic raidDynamic) { return wrapperContained.method_28256(raidDynamic); }
// public com.mojang.serialization.Dynamic method_28257(com.mojang.serialization.Dynamic heroesOfTheVillageDynamic) { return wrapperContained.method_28257(heroesOfTheVillageDynamic); }
// public com.mojang.serialization.Dynamic method_28258(com.mojang.serialization.Dynamic heroOfTheVillageDynamic) { return wrapperContained.method_28258(heroOfTheVillageDynamic); }

}