package yarnwrap.datafixer.fix;
public class VillagerProfessionFix { public net.minecraft.datafixer.fix.VillagerProfessionFix wrapperContained; public VillagerProfessionFix(net.minecraft.datafixer.fix.VillagerProfessionFix wrapperContained) { this.wrapperContained = wrapperContained; }

public VillagerProfessionFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String entity) { this.wrapperContained = new net.minecraft.datafixer.fix.VillagerProfessionFix(outputSchema,entity); }
// public java.lang.String convertProfessionId(int professionId,int careerId) { return wrapperContained.convertProfessionId(professionId,careerId); }

}