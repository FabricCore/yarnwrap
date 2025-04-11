package yarnwrap.datafixer.fix;
public class VillagerGossipFix { public net.minecraft.datafixer.fix.VillagerGossipFix wrapperContained; public VillagerGossipFix(net.minecraft.datafixer.fix.VillagerGossipFix wrapperContained) { this.wrapperContained = wrapperContained; }

public VillagerGossipFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String choiceType) { this.wrapperContained = new net.minecraft.datafixer.fix.VillagerGossipFix(outputSchema,choiceType); }
// public com.mojang.serialization.Dynamic method_26289(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.method_26289(entityDynamic); }
// public java.util.stream.Stream method_26290(java.util.stream.Stream gossips) { return wrapperContained.method_26290(gossips); }
// public com.mojang.serialization.Dynamic method_28200(com.mojang.serialization.Dynamic gossipsDynamic) { return wrapperContained.method_28200(gossipsDynamic); }
// public com.mojang.serialization.Dynamic method_28201(com.mojang.serialization.Dynamic gossipDynamic) { return wrapperContained.method_28201(gossipDynamic); }

}