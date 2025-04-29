package yarnwrap.datafixer.fix;
public class ChunkStatusFix2 { public net.minecraft.datafixer.fix.ChunkStatusFix2 wrapperContained; public ChunkStatusFix2(net.minecraft.datafixer.fix.ChunkStatusFix2 wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map STATUS_MAP() { return wrapperContained.STATUS_MAP; }
// public void STATUS_MAP(java.util.Map value) { wrapperContained.STATUS_MAP = value; }
// public static java.util.Map STATUS_MAP() { return net.minecraft.datafixer.fix.ChunkStatusFix2.STATUS_MAP; }
// public static void STATUS_MAP(java.util.Map value, ) { net.minecraft.datafixer.fix.ChunkStatusFix2.STATUS_MAP = value; }

public ChunkStatusFix2(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ChunkStatusFix2(outputSchema,changesType); }

}