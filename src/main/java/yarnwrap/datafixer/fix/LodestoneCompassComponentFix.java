package yarnwrap.datafixer.fix;
public class LodestoneCompassComponentFix { public net.minecraft.datafixer.fix.LodestoneCompassComponentFix wrapperContained; public LodestoneCompassComponentFix(net.minecraft.datafixer.fix.LodestoneCompassComponentFix wrapperContained) { this.wrapperContained = wrapperContained; }

public LodestoneCompassComponentFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.LodestoneCompassComponentFix(outputSchema); }

}