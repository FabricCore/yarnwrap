package yarnwrap.datafixer.fix;
public class EntityHorseSaddleFix { public net.minecraft.datafixer.fix.EntityHorseSaddleFix wrapperContained; public EntityHorseSaddleFix(net.minecraft.datafixer.fix.EntityHorseSaddleFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityHorseSaddleFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityHorseSaddleFix(outputSchema,changesType); }

}