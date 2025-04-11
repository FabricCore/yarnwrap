package yarnwrap.datafixer.fix;
public class HangingEntityFix { public net.minecraft.datafixer.fix.HangingEntityFix wrapperContained; public HangingEntityFix(net.minecraft.datafixer.fix.HangingEntityFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[][] OFFSETS() { return wrapperContained.OFFSETS; }
// public void OFFSETS(int[][] value) { wrapperContained.OFFSETS = value; }
public HangingEntityFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.HangingEntityFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_15716(com.mojang.datafixers.OpticFinder entityTyped) { return wrapperContained.method_15716(entityTyped); }
// public com.mojang.datafixers.Typed method_15717(com.mojang.datafixers.OpticFinder entityTyped) { return wrapperContained.method_15717(entityTyped); }
// public com.mojang.serialization.Dynamic method_15718(com.mojang.serialization.Dynamic itemFrameDynamic) { return wrapperContained.method_15718(itemFrameDynamic); }
// public com.mojang.serialization.Dynamic fixDecorationPosition(com.mojang.serialization.Dynamic entityDynamic,boolean isPainting,boolean isItemFrame) { return wrapperContained.fixDecorationPosition(entityDynamic,isPainting,isItemFrame); }
// public com.mojang.datafixers.Typed method_15720(com.mojang.datafixers.Typed paintingTyped) { return wrapperContained.method_15720(paintingTyped); }
// public com.mojang.serialization.Dynamic method_15721(com.mojang.serialization.Dynamic paintingDynamic) { return wrapperContained.method_15721(paintingDynamic); }
// public com.mojang.datafixers.Typed method_15722(com.mojang.datafixers.Typed itemFrameTyped) { return wrapperContained.method_15722(itemFrameTyped); }

}