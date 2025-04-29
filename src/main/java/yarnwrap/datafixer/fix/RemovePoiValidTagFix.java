package yarnwrap.datafixer.fix;
public class RemovePoiValidTagFix { public net.minecraft.datafixer.fix.RemovePoiValidTagFix wrapperContained; public RemovePoiValidTagFix(net.minecraft.datafixer.fix.RemovePoiValidTagFix wrapperContained) { this.wrapperContained = wrapperContained; }

public RemovePoiValidTagFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.RemovePoiValidTagFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic removeValidTag() { return wrapperContained.removeValidTag(); }
// public static com.mojang.serialization.Dynamic removeValidTag() { return net.minecraft.datafixer.fix.RemovePoiValidTagFix.removeValidTag(); }

}