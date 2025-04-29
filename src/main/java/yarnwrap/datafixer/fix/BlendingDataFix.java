package yarnwrap.datafixer.fix;
public class BlendingDataFix { public net.minecraft.datafixer.fix.BlendingDataFix wrapperContained; public BlendingDataFix(net.minecraft.datafixer.fix.BlendingDataFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.datafixer.fix.BlendingDataFix.name; }
// public static void name(java.lang.String value, ) { net.minecraft.datafixer.fix.BlendingDataFix.name = value; }

// public java.util.Set SKIP_BLENDING_STATUSES() { return wrapperContained.SKIP_BLENDING_STATUSES; }
// public void SKIP_BLENDING_STATUSES(java.util.Set value) { wrapperContained.SKIP_BLENDING_STATUSES = value; }
// public static java.util.Set SKIP_BLENDING_STATUSES() { return net.minecraft.datafixer.fix.BlendingDataFix.SKIP_BLENDING_STATUSES; }
// public static void SKIP_BLENDING_STATUSES(java.util.Set value, ) { net.minecraft.datafixer.fix.BlendingDataFix.SKIP_BLENDING_STATUSES = value; }

public BlendingDataFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.BlendingDataFix(outputSchema); }
// public com.mojang.datafixers.Typed method_41311(com.mojang.datafixers.Typed typed) { return wrapperContained.method_41311(typed); }
// public static com.mojang.datafixers.Typed method_41311(com.mojang.datafixers.Typed typed, ) { return net.minecraft.datafixer.fix.BlendingDataFix.method_41311(typed); }
// public com.mojang.serialization.Dynamic update(com.mojang.serialization.Dynamic chunk,com.mojang.serialization.OptionalDynamic context) { return wrapperContained.update(chunk,context); }
// public static com.mojang.serialization.Dynamic update(com.mojang.serialization.Dynamic chunk,com.mojang.serialization.OptionalDynamic context, ) { return net.minecraft.datafixer.fix.BlendingDataFix.update(chunk,context); }
// public com.mojang.serialization.Dynamic setSections(com.mojang.serialization.Dynamic dynamic,int height,int minY) { return wrapperContained.setSections(dynamic,height,minY); }
// public static com.mojang.serialization.Dynamic setSections(com.mojang.serialization.Dynamic dynamic,int height,int minY, ) { return net.minecraft.datafixer.fix.BlendingDataFix.setSections(dynamic,height,minY); }
// public com.mojang.serialization.Dynamic method_44685(com.mojang.serialization.Dynamic chunk) { return wrapperContained.method_44685(chunk); }
// public static com.mojang.serialization.Dynamic method_44685(com.mojang.serialization.Dynamic chunk, ) { return net.minecraft.datafixer.fix.BlendingDataFix.method_44685(chunk); }

}