package yarnwrap.datafixer.fix;
public class LegacyHoverEventFix { public net.minecraft.datafixer.fix.LegacyHoverEventFix wrapperContained; public LegacyHoverEventFix(net.minecraft.datafixer.fix.LegacyHoverEventFix wrapperContained) { this.wrapperContained = wrapperContained; }

public LegacyHoverEventFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.LegacyHoverEventFix(outputSchema); }

}