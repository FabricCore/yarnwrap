package yarnwrap.datafixer.fix;
public class JigsawRotationFix { public net.minecraft.datafixer.fix.JigsawRotationFix wrapperContained; public JigsawRotationFix(net.minecraft.datafixer.fix.JigsawRotationFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map ORIENTATION_UPDATES() { return wrapperContained.ORIENTATION_UPDATES; }
// public void ORIENTATION_UPDATES(java.util.Map value) { wrapperContained.ORIENTATION_UPDATES = value; }
// public static java.util.Map ORIENTATION_UPDATES() { return net.minecraft.datafixer.fix.JigsawRotationFix.ORIENTATION_UPDATES; }
// public static void ORIENTATION_UPDATES(java.util.Map value, ) { net.minecraft.datafixer.fix.JigsawRotationFix.ORIENTATION_UPDATES = value; }

public JigsawRotationFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.JigsawRotationFix(outputSchema); }

}