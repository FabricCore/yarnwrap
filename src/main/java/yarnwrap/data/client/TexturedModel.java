package yarnwrap.data.client;
public class TexturedModel { public net.minecraft.data.client.TexturedModel wrapperContained; public TexturedModel(net.minecraft.data.client.TexturedModel wrapperContained) { this.wrapperContained = wrapperContained; }

public Object CUBE_ALL() { return wrapperContained.CUBE_ALL; }
// // public void CUBE_ALL(Object value) { wrapperContained.CUBE_ALL = value; }
public Object CUBE_MIRRORED_ALL() { return wrapperContained.CUBE_MIRRORED_ALL; }
// // public void CUBE_MIRRORED_ALL(Object value) { wrapperContained.CUBE_MIRRORED_ALL = value; }
public Object CUBE_COLUMN() { return wrapperContained.CUBE_COLUMN; }
// // public void CUBE_COLUMN(Object value) { wrapperContained.CUBE_COLUMN = value; }
public Object CUBE_COLUMN_HORIZONTAL() { return wrapperContained.CUBE_COLUMN_HORIZONTAL; }
// // public void CUBE_COLUMN_HORIZONTAL(Object value) { wrapperContained.CUBE_COLUMN_HORIZONTAL = value; }
public Object CUBE_BOTTOM_TOP() { return wrapperContained.CUBE_BOTTOM_TOP; }
// // public void CUBE_BOTTOM_TOP(Object value) { wrapperContained.CUBE_BOTTOM_TOP = value; }
public Object CUBE_TOP() { return wrapperContained.CUBE_TOP; }
// // public void CUBE_TOP(Object value) { wrapperContained.CUBE_TOP = value; }
public Object ORIENTABLE() { return wrapperContained.ORIENTABLE; }
// // public void ORIENTABLE(Object value) { wrapperContained.ORIENTABLE = value; }
public Object ORIENTABLE_WITH_BOTTOM() { return wrapperContained.ORIENTABLE_WITH_BOTTOM; }
// // public void ORIENTABLE_WITH_BOTTOM(Object value) { wrapperContained.ORIENTABLE_WITH_BOTTOM = value; }
public Object CARPET() { return wrapperContained.CARPET; }
// // public void CARPET(Object value) { wrapperContained.CARPET = value; }
public Object TEMPLATE_GLAZED_TERRACOTTA() { return wrapperContained.TEMPLATE_GLAZED_TERRACOTTA; }
// // public void TEMPLATE_GLAZED_TERRACOTTA(Object value) { wrapperContained.TEMPLATE_GLAZED_TERRACOTTA = value; }
public Object CORAL_FAN() { return wrapperContained.CORAL_FAN; }
// // public void CORAL_FAN(Object value) { wrapperContained.CORAL_FAN = value; }
public Object PARTICLE() { return wrapperContained.PARTICLE; }
// // public void PARTICLE(Object value) { wrapperContained.PARTICLE = value; }
public Object TEMPLATE_ANVIL() { return wrapperContained.TEMPLATE_ANVIL; }
// // public void TEMPLATE_ANVIL(Object value) { wrapperContained.TEMPLATE_ANVIL = value; }
public Object LEAVES() { return wrapperContained.LEAVES; }
// // public void LEAVES(Object value) { wrapperContained.LEAVES = value; }
public Object TEMPLATE_LANTERN() { return wrapperContained.TEMPLATE_LANTERN; }
// // public void TEMPLATE_LANTERN(Object value) { wrapperContained.TEMPLATE_LANTERN = value; }
public Object TEMPLATE_HANGING_LANTERN() { return wrapperContained.TEMPLATE_HANGING_LANTERN; }
// // public void TEMPLATE_HANGING_LANTERN(Object value) { wrapperContained.TEMPLATE_HANGING_LANTERN = value; }
public Object TEMPLATE_SEAGRASS() { return wrapperContained.TEMPLATE_SEAGRASS; }
// // public void TEMPLATE_SEAGRASS(Object value) { wrapperContained.TEMPLATE_SEAGRASS = value; }
public Object END_FOR_TOP_CUBE_COLUMN() { return wrapperContained.END_FOR_TOP_CUBE_COLUMN; }
// // public void END_FOR_TOP_CUBE_COLUMN(Object value) { wrapperContained.END_FOR_TOP_CUBE_COLUMN = value; }
public Object END_FOR_TOP_CUBE_COLUMN_HORIZONTAL() { return wrapperContained.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL; }
// // public void END_FOR_TOP_CUBE_COLUMN_HORIZONTAL(Object value) { wrapperContained.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL = value; }
public Object SIDE_TOP_BOTTOM_WALL() { return wrapperContained.SIDE_TOP_BOTTOM_WALL; }
// // public void SIDE_TOP_BOTTOM_WALL(Object value) { wrapperContained.SIDE_TOP_BOTTOM_WALL = value; }
// public yarnwrap.data.client.TextureMap textures() { return new yarnwrap.data.client.TextureMap(wrapperContained.textures); }
// public void textures(yarnwrap.data.client.TextureMap value) { wrapperContained.textures = value.wrapperContained; }
// public yarnwrap.data.client.Model model() { return new yarnwrap.data.client.Model(wrapperContained.model); }
// public void model(yarnwrap.data.client.Model value) { wrapperContained.model = value.wrapperContained; }
public Object SIDE_END_WALL() { return wrapperContained.SIDE_END_WALL; }
// // public void SIDE_END_WALL(Object value) { wrapperContained.SIDE_END_WALL = value; }
public Object FLOWERBED_1() { return wrapperContained.FLOWERBED_1; }
// // public void FLOWERBED_1(Object value) { wrapperContained.FLOWERBED_1 = value; }
public Object FLOWERBED_2() { return wrapperContained.FLOWERBED_2; }
// // public void FLOWERBED_2(Object value) { wrapperContained.FLOWERBED_2 = value; }
public Object FLOWERBED_3() { return wrapperContained.FLOWERBED_3; }
// // public void FLOWERBED_3(Object value) { wrapperContained.FLOWERBED_3 = value; }
public Object FLOWERBED_4() { return wrapperContained.FLOWERBED_4; }
// // public void FLOWERBED_4(Object value) { wrapperContained.FLOWERBED_4 = value; }
public Object CUBE_ALL_INNER_FACES() { return wrapperContained.CUBE_ALL_INNER_FACES; }
// // public void CUBE_ALL_INNER_FACES(Object value) { wrapperContained.CUBE_ALL_INNER_FACES = value; }
// public TexturedModel(yarnwrap.data.client.TextureMap textures,yarnwrap.data.client.Model model) { this.wrapperContained = new net.minecraft.data.client.TexturedModel(textures.wrapperContained,model.wrapperContained); }
public yarnwrap.data.client.Model getModel() { return new yarnwrap.data.client.Model(wrapperContained.getModel()); }
public yarnwrap.util.Identifier upload(yarnwrap.block.Block block,java.lang.String suffix,java.util.function.BiConsumer writer) { return new yarnwrap.util.Identifier(wrapperContained.upload(block.wrapperContained,suffix,writer)); }
public yarnwrap.util.Identifier upload(yarnwrap.block.Block block,java.util.function.BiConsumer writer) { return new yarnwrap.util.Identifier(wrapperContained.upload(block.wrapperContained,writer)); }
public yarnwrap.data.client.TexturedModel textures(java.util.function.Consumer texturesConsumer) { return new yarnwrap.data.client.TexturedModel(wrapperContained.textures(texturesConsumer)); }
// public Object makeFactory(java.util.function.Function texturesGetter,yarnwrap.data.client.Model model) { return wrapperContained.makeFactory(texturesGetter,model.wrapperContained); }
// public yarnwrap.data.client.TexturedModel method_25919(java.util.function.Function block) { return new yarnwrap.data.client.TexturedModel(wrapperContained.method_25919(block)); }
public yarnwrap.data.client.TexturedModel getCubeAll(yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TexturedModel(wrapperContained.getCubeAll(id.wrapperContained)); }
public yarnwrap.data.client.TextureMap getTextures() { return new yarnwrap.data.client.TextureMap(wrapperContained.getTextures()); }

}