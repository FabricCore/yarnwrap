package yarnwrap.datafixer.fix;
public class AdvancementRenameFix { public net.minecraft.datafixer.fix.AdvancementRenameFix wrapperContained; public AdvancementRenameFix(net.minecraft.datafixer.fix.AdvancementRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.datafixer.fix.AdvancementRenameFix.name; }
// public static void name(java.lang.String value, ) { net.minecraft.datafixer.fix.AdvancementRenameFix.name = value; }

// public java.util.function.Function renamer() { return wrapperContained.renamer; }
// public void renamer(java.util.function.Function value) { wrapperContained.renamer = value; }
// public static java.util.function.Function renamer() { return net.minecraft.datafixer.fix.AdvancementRenameFix.renamer; }
// public static void renamer(java.util.function.Function value, ) { net.minecraft.datafixer.fix.AdvancementRenameFix.renamer = value; }

public AdvancementRenameFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType,java.lang.String name,java.util.function.Function renamer) { this.wrapperContained = new net.minecraft.datafixer.fix.AdvancementRenameFix(outputSchema,changesType,name,renamer); }

}