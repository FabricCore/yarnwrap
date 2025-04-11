package yarnwrap.client.render.entity.feature;
public class VillagerClothingFeatureRenderer { public net.minecraft.client.render.entity.feature.VillagerClothingFeatureRenderer wrapperContained; public VillagerClothingFeatureRenderer(net.minecraft.client.render.entity.feature.VillagerClothingFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap LEVEL_TO_ID() { return wrapperContained.LEVEL_TO_ID; }
// public void LEVEL_TO_ID(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.LEVEL_TO_ID = value; }
// public it.unimi.dsi.fastutil.objects.Object2ObjectMap villagerTypeToHat() { return wrapperContained.villagerTypeToHat; }
// public void villagerTypeToHat(it.unimi.dsi.fastutil.objects.Object2ObjectMap value) { wrapperContained.villagerTypeToHat = value; }
// public it.unimi.dsi.fastutil.objects.Object2ObjectMap professionToHat() { return wrapperContained.professionToHat; }
// public void professionToHat(it.unimi.dsi.fastutil.objects.Object2ObjectMap value) { wrapperContained.professionToHat = value; }
// public yarnwrap.resource.ResourceManager resourceManager() { return new yarnwrap.resource.ResourceManager(wrapperContained.resourceManager); }
// public void resourceManager(yarnwrap.resource.ResourceManager value) { wrapperContained.resourceManager = value.wrapperContained; }
// public java.lang.String entityType() { return wrapperContained.entityType; }
// public void entityType(java.lang.String value) { wrapperContained.entityType = value; }
public VillagerClothingFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.resource.ResourceManager resourceManager,java.lang.String entityType) { this.wrapperContained = new net.minecraft.client.render.entity.feature.VillagerClothingFeatureRenderer(context.wrapperContained,resourceManager.wrapperContained,entityType); }
// public void method_17152(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap levelToId) { wrapperContained.method_17152(levelToId); }
public Object getHatType(it.unimi.dsi.fastutil.objects.Object2ObjectMap hatLookUp,java.lang.String keyType,yarnwrap.registry.DefaultedRegistry registry,java.lang.Object key) { return wrapperContained.getHatType(hatLookUp,keyType,registry.wrapperContained,key); }
// public Object method_17154(java.lang.String k) { return wrapperContained.method_17154(k); }
// public yarnwrap.util.Identifier findTexture(java.lang.String keyType,yarnwrap.util.Identifier keyId) { return new yarnwrap.util.Identifier(wrapperContained.findTexture(keyType,keyId.wrapperContained)); }
// public java.util.Optional method_43211(yarnwrap.resource.Resource resource) { return wrapperContained.method_43211(resource.wrapperContained); }
// public java.lang.String method_45803(java.lang.String path) { return wrapperContained.method_45803(path); }

}