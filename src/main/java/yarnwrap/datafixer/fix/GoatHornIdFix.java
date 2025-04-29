package yarnwrap.datafixer.fix;
public class GoatHornIdFix { public net.minecraft.datafixer.fix.GoatHornIdFix wrapperContained; public GoatHornIdFix(net.minecraft.datafixer.fix.GoatHornIdFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String[] GOAT_HORN_IDS() { return wrapperContained.GOAT_HORN_IDS; }
// public void GOAT_HORN_IDS(java.lang.String[] value) { wrapperContained.GOAT_HORN_IDS = value; }
// public static java.lang.String[] GOAT_HORN_IDS() { return net.minecraft.datafixer.fix.GoatHornIdFix.GOAT_HORN_IDS; }
// public static void GOAT_HORN_IDS(java.lang.String[] value, ) { net.minecraft.datafixer.fix.GoatHornIdFix.GOAT_HORN_IDS = value; }

public GoatHornIdFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.GoatHornIdFix(outputSchema); }
// public boolean method_44191(java.lang.String itemId) { return wrapperContained.method_44191(itemId); }
// public static boolean method_44191(java.lang.String itemId, ) { return net.minecraft.datafixer.fix.GoatHornIdFix.method_44191(itemId); }

}