package yarnwrap.datafixer.fix;
public class EntityPaintingMotiveFix { public net.minecraft.datafixer.fix.EntityPaintingMotiveFix wrapperContained; public EntityPaintingMotiveFix(net.minecraft.datafixer.fix.EntityPaintingMotiveFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map RENAMED_MOTIVES() { return wrapperContained.RENAMED_MOTIVES; }
// public void RENAMED_MOTIVES(java.util.Map value) { wrapperContained.RENAMED_MOTIVES = value; }
// public static java.util.Map RENAMED_MOTIVES() { return net.minecraft.datafixer.fix.EntityPaintingMotiveFix.RENAMED_MOTIVES; }
// public static void RENAMED_MOTIVES(java.util.Map value, ) { net.minecraft.datafixer.fix.EntityPaintingMotiveFix.RENAMED_MOTIVES = value; }

public EntityPaintingMotiveFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityPaintingMotiveFix(outputSchema,changesType); }
public com.mojang.serialization.Dynamic renameMotive(com.mojang.serialization.Dynamic paintingdynamic) { return wrapperContained.renameMotive(paintingdynamic); }
// public static com.mojang.serialization.Dynamic renameMotive(com.mojang.serialization.Dynamic paintingdynamic, ) { return net.minecraft.datafixer.fix.EntityPaintingMotiveFix.renameMotive(paintingdynamic); }
// public void method_15724(java.util.HashMap map) { wrapperContained.method_15724(map); }
// public static void method_15724(java.util.HashMap map, ) { net.minecraft.datafixer.fix.EntityPaintingMotiveFix.method_15724(map); }

}