package yarnwrap.datafixer.fix;
public class RemoveEmptyItemInSuspiciousBlockFix { public net.minecraft.datafixer.fix.RemoveEmptyItemInSuspiciousBlockFix wrapperContained; public RemoveEmptyItemInSuspiciousBlockFix(net.minecraft.datafixer.fix.RemoveEmptyItemInSuspiciousBlockFix wrapperContained) { this.wrapperContained = wrapperContained; }

public RemoveEmptyItemInSuspiciousBlockFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.RemoveEmptyItemInSuspiciousBlockFix(outputSchema); }
// public boolean shouldRemoveItem(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.shouldRemoveItem(dynamic); }

}