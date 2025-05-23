package yarnwrap.datafixer.fix;
public class CarvingStepRemoveFix { public net.minecraft.datafixer.fix.CarvingStepRemoveFix wrapperContained; public CarvingStepRemoveFix(net.minecraft.datafixer.fix.CarvingStepRemoveFix wrapperContained) { this.wrapperContained = wrapperContained; }

public CarvingStepRemoveFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.CarvingStepRemoveFix(outputSchema); }
// public com.mojang.datafixers.Typed removeCarvingMasks() { return wrapperContained.removeCarvingMasks(); }
// public static com.mojang.datafixers.Typed removeCarvingMasks() { return net.minecraft.datafixer.fix.CarvingStepRemoveFix.removeCarvingMasks(); }

}