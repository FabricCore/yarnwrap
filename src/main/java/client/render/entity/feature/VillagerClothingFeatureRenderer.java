package yarnwrap.client.render.entity.feature;
public class VillagerClothingFeatureRenderer { public net.minecraft.client.render.entity.feature.VillagerClothingFeatureRenderer wrapperContained; public VillagerClothingFeatureRenderer(net.minecraft.client.render.entity.feature.VillagerClothingFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap LEVEL_TO_ID() { return wrapperContained.LEVEL_TO_ID; }
// public it.unimi.dsi.fastutil.objects.Object2ObjectMap villagerTypeToHat() { return wrapperContained.villagerTypeToHat; }
// public it.unimi.dsi.fastutil.objects.Object2ObjectMap professionToHat() { return wrapperContained.professionToHat; }
// public yarnwrap.resource.ResourceManager resourceManager() { return new yarnwrap.resource.ResourceManager(wrapperContained.resourceManager); }
// public java.lang.String entityType() { return wrapperContained.entityType; }
public Object getHatType(it.unimi.dsi.fastutil.objects.Object2ObjectMap hatLookUp,java.lang.String keyType,yarnwrap.registry.DefaultedRegistry registry,java.lang.Object key) { return wrapperContained.getHatType(hatLookUp,keyType,registry.wrapperContained,key); }
// public yarnwrap.util.Identifier findTexture(java.lang.String keyType,yarnwrap.util.Identifier keyId) { return new yarnwrap.util.Identifier(wrapperContained.findTexture(keyType,keyId.wrapperContained)); }

}