package yarnwrap.datafixer.fix;
public class RemoveGolemGossipFix { public net.minecraft.datafixer.fix.RemoveGolemGossipFix wrapperContained; public RemoveGolemGossipFix(net.minecraft.datafixer.fix.RemoveGolemGossipFix wrapperContained) { this.wrapperContained = wrapperContained; }

public RemoveGolemGossipFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesTyped) { this.wrapperContained = new net.minecraft.datafixer.fix.RemoveGolemGossipFix(outputSchema,changesTyped); }
// public com.mojang.serialization.Dynamic updateGossipsList(com.mojang.serialization.Dynamic villagerData) { return wrapperContained.updateGossipsList(villagerData); }
// public com.mojang.serialization.Dynamic method_30327(com.mojang.serialization.Dynamic gossipsDynamic) { return wrapperContained.method_30327(gossipsDynamic); }
// public boolean method_30328(com.mojang.serialization.Dynamic gossipDynamic) { return wrapperContained.method_30328(gossipDynamic); }

}