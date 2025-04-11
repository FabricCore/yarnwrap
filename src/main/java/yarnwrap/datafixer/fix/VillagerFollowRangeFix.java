package yarnwrap.datafixer.fix;
public class VillagerFollowRangeFix { public net.minecraft.datafixer.fix.VillagerFollowRangeFix wrapperContained; public VillagerFollowRangeFix(net.minecraft.datafixer.fix.VillagerFollowRangeFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public double OLD_RANGE() { return wrapperContained.OLD_RANGE; }
// public void OLD_RANGE(double value) { wrapperContained.OLD_RANGE = value; }
// public double NEW_RANGE() { return wrapperContained.NEW_RANGE; }
// public void NEW_RANGE(double value) { wrapperContained.NEW_RANGE = value; }
public VillagerFollowRangeFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.VillagerFollowRangeFix(outputSchema); }
// public com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic villagerDynamic) { return wrapperContained.fix(villagerDynamic); }
// public com.mojang.serialization.Dynamic method_28263(com.mojang.serialization.Dynamic attributesDynamic) { return wrapperContained.method_28263(attributesDynamic); }
// public com.mojang.serialization.Dynamic method_28264(com.mojang.serialization.Dynamic attributeDynamic) { return wrapperContained.method_28264(attributeDynamic); }

}