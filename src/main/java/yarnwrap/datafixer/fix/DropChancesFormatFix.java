package yarnwrap.datafixer.fix;
public class DropChancesFormatFix { public net.minecraft.datafixer.fix.DropChancesFormatFix wrapperContained; public DropChancesFormatFix(net.minecraft.datafixer.fix.DropChancesFormatFix wrapperContained) { this.wrapperContained = wrapperContained; }

public DropChancesFormatFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.DropChancesFormatFix(outputSchema); }

}