package yarnwrap.datafixer.fix;
public class PointOfInterestReorganizationFix { public net.minecraft.datafixer.fix.PointOfInterestReorganizationFix wrapperContained; public PointOfInterestReorganizationFix(net.minecraft.datafixer.fix.PointOfInterestReorganizationFix wrapperContained) { this.wrapperContained = wrapperContained; }

public PointOfInterestReorganizationFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.PointOfInterestReorganizationFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic reorganize() { return wrapperContained.reorganize(); }
// public static com.mojang.serialization.Dynamic reorganize() { return net.minecraft.datafixer.fix.PointOfInterestReorganizationFix.reorganize(); }

}