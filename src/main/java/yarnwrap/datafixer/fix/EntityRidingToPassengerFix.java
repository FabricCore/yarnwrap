package yarnwrap.datafixer.fix;
public class EntityRidingToPassengerFix { public net.minecraft.datafixer.fix.EntityRidingToPassengerFix wrapperContained; public EntityRidingToPassengerFix(net.minecraft.datafixer.fix.EntityRidingToPassengerFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityRidingToPassengerFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityRidingToPassengerFix(outputSchema,changesType); }
// public com.mojang.datafixers.TypeRewriteRule fixEntityTree(com.mojang.datafixers.schemas.Schema inputSchema,com.mojang.datafixers.schemas.Schema outputSchema,com.mojang.datafixers.types.Type inputEntityTreeType,com.mojang.datafixers.types.Type outputEntityTreeType,com.mojang.datafixers.types.Type inputEntityType) { return wrapperContained.fixEntityTree(inputSchema,outputSchema,inputEntityTreeType,outputEntityTreeType,inputEntityType); }

}