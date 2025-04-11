package yarnwrap.datafixer.fix;
public class FurnaceRecipesFix { public net.minecraft.datafixer.fix.FurnaceRecipesFix wrapperContained; public FurnaceRecipesFix(net.minecraft.datafixer.fix.FurnaceRecipesFix wrapperContained) { this.wrapperContained = wrapperContained; }

public FurnaceRecipesFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.FurnaceRecipesFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_24312(com.mojang.datafixers.OpticFinder blockEntityTyped) { return wrapperContained.method_24312(blockEntityTyped); }
// public com.mojang.datafixers.TypeRewriteRule updateBlockEntities(com.mojang.datafixers.types.Type recipeType) { return wrapperContained.updateBlockEntities(recipeType); }
// public com.mojang.datafixers.Typed updateBlockEntityData(com.mojang.datafixers.types.Type recipeType,com.mojang.datafixers.types.Type recipesUsedType,com.mojang.datafixers.Typed smelterTyped) { return wrapperContained.updateBlockEntityData(recipeType,recipesUsedType,smelterTyped); }
// public com.mojang.datafixers.Typed method_24317(com.mojang.datafixers.types.Type smokerTyped) { return wrapperContained.method_24317(smokerTyped); }
// public com.mojang.datafixers.Typed method_24318(com.mojang.datafixers.types.Type blastFurnaceTyped) { return wrapperContained.method_24318(blastFurnaceTyped); }
// public com.mojang.datafixers.Typed method_24319(com.mojang.datafixers.types.Type furnaceTyped) { return wrapperContained.method_24319(furnaceTyped); }

}