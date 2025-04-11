package yarnwrap.datafixer.fix;
public class BedItemColorFix { public net.minecraft.datafixer.fix.BedItemColorFix wrapperContained; public BedItemColorFix(net.minecraft.datafixer.fix.BedItemColorFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BedItemColorFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.BedItemColorFix(outputSchema,changesType); }

}