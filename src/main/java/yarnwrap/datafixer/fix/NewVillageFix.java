package yarnwrap.datafixer.fix;
public class NewVillageFix { public net.minecraft.datafixer.fix.NewVillageFix wrapperContained; public NewVillageFix(net.minecraft.datafixer.fix.NewVillageFix wrapperContained) { this.wrapperContained = wrapperContained; }

public NewVillageFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.NewVillageFix(outputSchema,changesType); }
// public com.mojang.datafixers.TypeRewriteRule fix() { return wrapperContained.fix(); }
// public static com.mojang.datafixers.TypeRewriteRule fix() { return net.minecraft.datafixer.fix.NewVillageFix.fix(); }

}