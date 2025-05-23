package yarnwrap.datafixer.fix;
public class TextComponentHoverAndClickEventFix { public net.minecraft.datafixer.fix.TextComponentHoverAndClickEventFix wrapperContained; public TextComponentHoverAndClickEventFix(net.minecraft.datafixer.fix.TextComponentHoverAndClickEventFix wrapperContained) { this.wrapperContained = wrapperContained; }

public TextComponentHoverAndClickEventFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.TextComponentHoverAndClickEventFix(outputSchema); }

}