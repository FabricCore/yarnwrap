package yarnwrap.client.render.item;
public class ItemRenderer { public net.minecraft.client.render.item.ItemRenderer wrapperContained; public ItemRenderer(net.minecraft.client.render.item.ItemRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.BuiltinModelItemRenderer builtinModelItemRenderer() { return new yarnwrap.client.render.item.BuiltinModelItemRenderer(wrapperContained.builtinModelItemRenderer); }
// public void builtinModelItemRenderer(yarnwrap.client.render.item.BuiltinModelItemRenderer value) { wrapperContained.builtinModelItemRenderer = value.wrapperContained; }
public float COMPASS_WITH_GLINT_GUI_MODEL_MULTIPLIER() { return wrapperContained.COMPASS_WITH_GLINT_GUI_MODEL_MULTIPLIER; }
// public void COMPASS_WITH_GLINT_GUI_MODEL_MULTIPLIER(float value) { wrapperContained.COMPASS_WITH_GLINT_GUI_MODEL_MULTIPLIER = value; }
public float COMPASS_WITH_GLINT_FIRST_PERSON_MODEL_MULTIPLIER() { return wrapperContained.COMPASS_WITH_GLINT_FIRST_PERSON_MODEL_MULTIPLIER; }
// public void COMPASS_WITH_GLINT_FIRST_PERSON_MODEL_MULTIPLIER(float value) { wrapperContained.COMPASS_WITH_GLINT_FIRST_PERSON_MODEL_MULTIPLIER = value; }
public yarnwrap.client.util.ModelIdentifier TRIDENT_IN_HAND() { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.TRIDENT_IN_HAND); }
// public void TRIDENT_IN_HAND(yarnwrap.client.util.ModelIdentifier value) { wrapperContained.TRIDENT_IN_HAND = value.wrapperContained; }
public yarnwrap.client.util.ModelIdentifier SPYGLASS_IN_HAND() { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.SPYGLASS_IN_HAND); }
// public void SPYGLASS_IN_HAND(yarnwrap.client.util.ModelIdentifier value) { wrapperContained.SPYGLASS_IN_HAND = value.wrapperContained; }
// public yarnwrap.client.util.ModelIdentifier TRIDENT() { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.TRIDENT); }
// public void TRIDENT(yarnwrap.client.util.ModelIdentifier value) { wrapperContained.TRIDENT = value.wrapperContained; }
// public yarnwrap.client.util.ModelIdentifier SPYGLASS() { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.SPYGLASS); }
// public void SPYGLASS(yarnwrap.client.util.ModelIdentifier value) { wrapperContained.SPYGLASS = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
public yarnwrap.util.Identifier ENTITY_ENCHANTMENT_GLINT() { return new yarnwrap.util.Identifier(wrapperContained.ENTITY_ENCHANTMENT_GLINT); }
// public void ENTITY_ENCHANTMENT_GLINT(yarnwrap.util.Identifier value) { wrapperContained.ENTITY_ENCHANTMENT_GLINT = value.wrapperContained; }
public yarnwrap.util.Identifier ITEM_ENCHANTMENT_GLINT() { return new yarnwrap.util.Identifier(wrapperContained.ITEM_ENCHANTMENT_GLINT); }
// public void ITEM_ENCHANTMENT_GLINT(yarnwrap.util.Identifier value) { wrapperContained.ITEM_ENCHANTMENT_GLINT = value.wrapperContained; }
// public java.util.Set WITHOUT_MODELS() { return wrapperContained.WITHOUT_MODELS; }
// public void WITHOUT_MODELS(java.util.Set value) { wrapperContained.WITHOUT_MODELS = value; }
// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public yarnwrap.client.render.item.ItemModels models() { return new yarnwrap.client.render.item.ItemModels(wrapperContained.models); }
// public void models(yarnwrap.client.render.item.ItemModels value) { wrapperContained.models = value.wrapperContained; }
// public yarnwrap.client.color.item.ItemColors colors() { return new yarnwrap.client.color.item.ItemColors(wrapperContained.colors); }
// public void colors(yarnwrap.client.color.item.ItemColors value) { wrapperContained.colors = value.wrapperContained; }
public ItemRenderer(yarnwrap.client.MinecraftClient client,yarnwrap.client.texture.TextureManager manager,yarnwrap.client.render.model.BakedModelManager bakery,yarnwrap.client.color.item.ItemColors colors,yarnwrap.client.render.item.BuiltinModelItemRenderer builtinModelItemRenderer) { this.wrapperContained = new net.minecraft.client.render.item.ItemRenderer(client.wrapperContained,manager.wrapperContained,bakery.wrapperContained,colors.wrapperContained,builtinModelItemRenderer.wrapperContained); }
public void renderItem(yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack item,yarnwrap.client.render.model.json.ModelTransformationMode renderMode,boolean leftHanded,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.world.World world,int light,int overlay,int seed) { wrapperContained.renderItem(entity.wrapperContained,item.wrapperContained,renderMode.wrapperContained,leftHanded,matrices.wrapperContained,vertexConsumers.wrapperContained,world.wrapperContained,light,overlay,seed); }
public void renderItem(yarnwrap.item.ItemStack stack,yarnwrap.client.render.model.json.ModelTransformationMode transformationType,int light,int overlay,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.world.World world,int seed) { wrapperContained.renderItem(stack.wrapperContained,transformationType.wrapperContained,light,overlay,matrices.wrapperContained,vertexConsumers.wrapperContained,world.wrapperContained,seed); }
public void renderItem(yarnwrap.item.ItemStack stack,yarnwrap.client.render.model.json.ModelTransformationMode renderMode,boolean leftHanded,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.client.render.model.BakedModel model) { wrapperContained.renderItem(stack.wrapperContained,renderMode.wrapperContained,leftHanded,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,model.wrapperContained); }
// public void renderBakedItemQuads(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,java.util.List quads,yarnwrap.item.ItemStack stack,int light,int overlay) { wrapperContained.renderBakedItemQuads(matrices.wrapperContained,vertices.wrapperContained,quads,stack.wrapperContained,light,overlay); }
public yarnwrap.client.render.VertexConsumer getItemGlintConsumer(yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.render.RenderLayer layer,boolean solid,boolean glint) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getItemGlintConsumer(vertexConsumers.wrapperContained,layer.wrapperContained,solid,glint)); }
// public void renderBakedItemModel(yarnwrap.client.render.model.BakedModel model,yarnwrap.item.ItemStack stack,int light,int overlay,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices) { wrapperContained.renderBakedItemModel(model.wrapperContained,stack.wrapperContained,light,overlay,matrices.wrapperContained,vertices.wrapperContained); }
public yarnwrap.client.render.VertexConsumer getArmorGlintConsumer(yarnwrap.client.render.VertexConsumerProvider provider,yarnwrap.client.render.RenderLayer layer,boolean glint) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getArmorGlintConsumer(provider.wrapperContained,layer.wrapperContained,glint)); }
public yarnwrap.client.render.VertexConsumer getDirectItemGlintConsumer(yarnwrap.client.render.VertexConsumerProvider provider,yarnwrap.client.render.RenderLayer layer,boolean solid,boolean glint) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getDirectItemGlintConsumer(provider.wrapperContained,layer.wrapperContained,solid,glint)); }
// public yarnwrap.client.render.VertexConsumer getDynamicDisplayGlintConsumer(yarnwrap.client.render.VertexConsumerProvider provider,yarnwrap.client.render.RenderLayer layer,Object entry) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getDynamicDisplayGlintConsumer(provider.wrapperContained,layer.wrapperContained,entry)); }
public yarnwrap.client.render.item.ItemModels getModels() { return new yarnwrap.client.render.item.ItemModels(wrapperContained.getModels()); }
public yarnwrap.client.render.model.BakedModel getModel(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.LivingEntity entity,int seed) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.getModel(stack.wrapperContained,world.wrapperContained,entity.wrapperContained,seed)); }
// public boolean usesDynamicDisplay(yarnwrap.item.ItemStack stack) { return wrapperContained.usesDynamicDisplay(stack.wrapperContained); }

}