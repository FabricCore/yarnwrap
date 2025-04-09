package yarnwrap.data.client;
public class TexturedModel { public net.minecraft.data.client.TexturedModel wrapperContained; public TexturedModel(net.minecraft.data.client.TexturedModel wrapperContained) { this.wrapperContained = wrapperContained; }

public Object CUBE_ALL() { return wrapperContained.CUBE_ALL; }
public Object CUBE_MIRRORED_ALL() { return wrapperContained.CUBE_MIRRORED_ALL; }
public Object CUBE_COLUMN() { return wrapperContained.CUBE_COLUMN; }
public Object CUBE_COLUMN_HORIZONTAL() { return wrapperContained.CUBE_COLUMN_HORIZONTAL; }
public Object CUBE_BOTTOM_TOP() { return wrapperContained.CUBE_BOTTOM_TOP; }
public Object CUBE_TOP() { return wrapperContained.CUBE_TOP; }
public Object ORIENTABLE() { return wrapperContained.ORIENTABLE; }
public Object ORIENTABLE_WITH_BOTTOM() { return wrapperContained.ORIENTABLE_WITH_BOTTOM; }
public Object CARPET() { return wrapperContained.CARPET; }
public Object TEMPLATE_GLAZED_TERRACOTTA() { return wrapperContained.TEMPLATE_GLAZED_TERRACOTTA; }
public Object CORAL_FAN() { return wrapperContained.CORAL_FAN; }
public Object PARTICLE() { return wrapperContained.PARTICLE; }
public Object TEMPLATE_ANVIL() { return wrapperContained.TEMPLATE_ANVIL; }
public Object LEAVES() { return wrapperContained.LEAVES; }
public Object TEMPLATE_LANTERN() { return wrapperContained.TEMPLATE_LANTERN; }
public Object TEMPLATE_HANGING_LANTERN() { return wrapperContained.TEMPLATE_HANGING_LANTERN; }
public Object TEMPLATE_SEAGRASS() { return wrapperContained.TEMPLATE_SEAGRASS; }
public Object END_FOR_TOP_CUBE_COLUMN() { return wrapperContained.END_FOR_TOP_CUBE_COLUMN; }
public Object END_FOR_TOP_CUBE_COLUMN_HORIZONTAL() { return wrapperContained.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL; }
public Object SIDE_TOP_BOTTOM_WALL() { return wrapperContained.SIDE_TOP_BOTTOM_WALL; }
// public yarnwrap.data.client.TextureMap textures() { return new yarnwrap.data.client.TextureMap(wrapperContained.textures); }
// public yarnwrap.data.client.Model model() { return new yarnwrap.data.client.Model(wrapperContained.model); }
public Object SIDE_END_WALL() { return wrapperContained.SIDE_END_WALL; }
public Object FLOWERBED_1() { return wrapperContained.FLOWERBED_1; }
public Object FLOWERBED_2() { return wrapperContained.FLOWERBED_2; }
public Object FLOWERBED_3() { return wrapperContained.FLOWERBED_3; }
public Object FLOWERBED_4() { return wrapperContained.FLOWERBED_4; }
public Object CUBE_ALL_INNER_FACES() { return wrapperContained.CUBE_ALL_INNER_FACES; }
public yarnwrap.data.client.Model getModel() { return new yarnwrap.data.client.Model(wrapperContained.getModel()); }
public yarnwrap.util.Identifier upload(yarnwrap.block.Block block,java.lang.String suffix,java.util.function.BiConsumer writer) { return new yarnwrap.util.Identifier(wrapperContained.upload(block.wrapperContained,suffix,writer)); }
public yarnwrap.util.Identifier upload(yarnwrap.block.Block block,java.util.function.BiConsumer writer) { return new yarnwrap.util.Identifier(wrapperContained.upload(block.wrapperContained,writer)); }
public yarnwrap.data.client.TexturedModel textures(java.util.function.Consumer texturesConsumer) { return new yarnwrap.data.client.TexturedModel(wrapperContained.textures(texturesConsumer)); }
// public Object makeFactory(java.util.function.Function texturesGetter,yarnwrap.data.client.Model model) { return wrapperContained.makeFactory(texturesGetter,model.wrapperContained); }
public yarnwrap.data.client.TexturedModel getCubeAll(yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TexturedModel(wrapperContained.getCubeAll(id.wrapperContained)); }
public yarnwrap.data.client.TextureMap getTextures() { return new yarnwrap.data.client.TextureMap(wrapperContained.getTextures()); }

}