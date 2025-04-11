package yarnwrap.datafixer.fix;
public class LeavesFix { public net.minecraft.datafixer.fix.LeavesFix wrapperContained; public LeavesFix(net.minecraft.datafixer.fix.LeavesFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set LOGS_MAP() { return wrapperContained.LOGS_MAP; }
// public void LOGS_MAP(java.util.Set value) { wrapperContained.LOGS_MAP = value; }
// public int[][] AXIAL_OFFSETS() { return wrapperContained.AXIAL_OFFSETS; }
// public void AXIAL_OFFSETS(int[][] value) { wrapperContained.AXIAL_OFFSETS = value; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap LEAVES_MAP() { return wrapperContained.LEAVES_MAP; }
// public void LEAVES_MAP(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.LEAVES_MAP = value; }
public LeavesFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.LeavesFix(outputSchema,changesType); }
// public Object method_5049(Object fixer) { return wrapperContained.method_5049(fixer); }
// public int getZ(int packedLocalPos) { return wrapperContained.getZ(packedLocalPos); }
public int packLocalPos(int localX,int localY,int localZ) { return wrapperContained.packLocalPos(localX,localY,localZ); }
// public int getX(int packedLocalPos) { return wrapperContained.getX(packedLocalPos); }
// public com.mojang.datafixers.Typed method_5054(com.mojang.datafixers.OpticFinder levelTyped) { return wrapperContained.method_5054(levelTyped); }
// public void method_5055(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap map) { wrapperContained.method_5055(map); }
// public com.mojang.datafixers.Typed method_5056(com.mojang.datafixers.OpticFinder chunkTyped) { return wrapperContained.method_5056(chunkTyped); }
// public Object method_5057(com.mojang.datafixers.Typed sectionTyped) { return wrapperContained.method_5057(sectionTyped); }
// public com.mojang.datafixers.Typed method_5058(it.unimi.dsi.fastutil.ints.Int2ObjectMap sectionDynamic) { return wrapperContained.method_5058(sectionDynamic); }
public int getBoundaryClassBit(boolean westernmost,boolean easternmost,boolean northernmost,boolean southernmost) { return wrapperContained.getBoundaryClassBit(westernmost,easternmost,northernmost,southernmost); }
// public int getY(int packedLocalPos) { return wrapperContained.getY(packedLocalPos); }
// public com.mojang.datafixers.Typed method_5063(com.mojang.datafixers.OpticFinder sectionsTyped) { return wrapperContained.method_5063(sectionsTyped); }

}