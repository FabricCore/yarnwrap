package yarnwrap.client.render;
public class RenderPhase { public net.minecraft.client.render.RenderPhase wrapperContained; public RenderPhase(net.minecraft.client.render.RenderPhase wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object ENABLE_CULLING() { return wrapperContained.ENABLE_CULLING; }
// // public void ENABLE_CULLING(Object value) { wrapperContained.ENABLE_CULLING = value; }
// public Object DISABLE_CULLING() { return wrapperContained.DISABLE_CULLING; }
// // public void DISABLE_CULLING(Object value) { wrapperContained.DISABLE_CULLING = value; }
// public Object ALWAYS_DEPTH_TEST() { return wrapperContained.ALWAYS_DEPTH_TEST; }
// // public void ALWAYS_DEPTH_TEST(Object value) { wrapperContained.ALWAYS_DEPTH_TEST = value; }
// public Object EQUAL_DEPTH_TEST() { return wrapperContained.EQUAL_DEPTH_TEST; }
// // public void EQUAL_DEPTH_TEST(Object value) { wrapperContained.EQUAL_DEPTH_TEST = value; }
// public Object LEQUAL_DEPTH_TEST() { return wrapperContained.LEQUAL_DEPTH_TEST; }
// // public void LEQUAL_DEPTH_TEST(Object value) { wrapperContained.LEQUAL_DEPTH_TEST = value; }
// public Object ALL_MASK() { return wrapperContained.ALL_MASK; }
// // public void ALL_MASK(Object value) { wrapperContained.ALL_MASK = value; }
// public Object COLOR_MASK() { return wrapperContained.COLOR_MASK; }
// // public void COLOR_MASK(Object value) { wrapperContained.COLOR_MASK = value; }
// public Object DEPTH_MASK() { return wrapperContained.DEPTH_MASK; }
// // public void DEPTH_MASK(Object value) { wrapperContained.DEPTH_MASK = value; }
// public Object NO_LAYERING() { return wrapperContained.NO_LAYERING; }
// // public void NO_LAYERING(Object value) { wrapperContained.NO_LAYERING = value; }
// public Object POLYGON_OFFSET_LAYERING() { return wrapperContained.POLYGON_OFFSET_LAYERING; }
// // public void POLYGON_OFFSET_LAYERING(Object value) { wrapperContained.POLYGON_OFFSET_LAYERING = value; }
// public Object MAIN_TARGET() { return wrapperContained.MAIN_TARGET; }
// // public void MAIN_TARGET(Object value) { wrapperContained.MAIN_TARGET = value; }
// public Object OUTLINE_TARGET() { return wrapperContained.OUTLINE_TARGET; }
// // public void OUTLINE_TARGET(Object value) { wrapperContained.OUTLINE_TARGET = value; }
// public Object FULL_LINE_WIDTH() { return wrapperContained.FULL_LINE_WIDTH; }
// // public void FULL_LINE_WIDTH(Object value) { wrapperContained.FULL_LINE_WIDTH = value; }
// public java.lang.Runnable beginAction() { return wrapperContained.beginAction; }
// public void beginAction(java.lang.Runnable value) { wrapperContained.beginAction = value; }
// public java.lang.Runnable endAction() { return wrapperContained.endAction; }
// public void endAction(java.lang.Runnable value) { wrapperContained.endAction = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public Object NO_TRANSPARENCY() { return wrapperContained.NO_TRANSPARENCY; }
// // public void NO_TRANSPARENCY(Object value) { wrapperContained.NO_TRANSPARENCY = value; }
// public Object ADDITIVE_TRANSPARENCY() { return wrapperContained.ADDITIVE_TRANSPARENCY; }
// // public void ADDITIVE_TRANSPARENCY(Object value) { wrapperContained.ADDITIVE_TRANSPARENCY = value; }
// public Object LIGHTNING_TRANSPARENCY() { return wrapperContained.LIGHTNING_TRANSPARENCY; }
// // public void LIGHTNING_TRANSPARENCY(Object value) { wrapperContained.LIGHTNING_TRANSPARENCY = value; }
// public Object GLINT_TRANSPARENCY() { return wrapperContained.GLINT_TRANSPARENCY; }
// // public void GLINT_TRANSPARENCY(Object value) { wrapperContained.GLINT_TRANSPARENCY = value; }
// public Object CRUMBLING_TRANSPARENCY() { return wrapperContained.CRUMBLING_TRANSPARENCY; }
// // public void CRUMBLING_TRANSPARENCY(Object value) { wrapperContained.CRUMBLING_TRANSPARENCY = value; }
// public Object TRANSLUCENT_TRANSPARENCY() { return wrapperContained.TRANSLUCENT_TRANSPARENCY; }
// // public void TRANSLUCENT_TRANSPARENCY(Object value) { wrapperContained.TRANSLUCENT_TRANSPARENCY = value; }
// public Object MIPMAP_BLOCK_ATLAS_TEXTURE() { return wrapperContained.MIPMAP_BLOCK_ATLAS_TEXTURE; }
// // public void MIPMAP_BLOCK_ATLAS_TEXTURE(Object value) { wrapperContained.MIPMAP_BLOCK_ATLAS_TEXTURE = value; }
// public Object BLOCK_ATLAS_TEXTURE() { return wrapperContained.BLOCK_ATLAS_TEXTURE; }
// // public void BLOCK_ATLAS_TEXTURE(Object value) { wrapperContained.BLOCK_ATLAS_TEXTURE = value; }
// public Object NO_TEXTURE() { return wrapperContained.NO_TEXTURE; }
// // public void NO_TEXTURE(Object value) { wrapperContained.NO_TEXTURE = value; }
// public Object DEFAULT_TEXTURING() { return wrapperContained.DEFAULT_TEXTURING; }
// // public void DEFAULT_TEXTURING(Object value) { wrapperContained.DEFAULT_TEXTURING = value; }
// public Object GLINT_TEXTURING() { return wrapperContained.GLINT_TEXTURING; }
// // public void GLINT_TEXTURING(Object value) { wrapperContained.GLINT_TEXTURING = value; }
// public Object ENTITY_GLINT_TEXTURING() { return wrapperContained.ENTITY_GLINT_TEXTURING; }
// // public void ENTITY_GLINT_TEXTURING(Object value) { wrapperContained.ENTITY_GLINT_TEXTURING = value; }
// public Object ENABLE_LIGHTMAP() { return wrapperContained.ENABLE_LIGHTMAP; }
// // public void ENABLE_LIGHTMAP(Object value) { wrapperContained.ENABLE_LIGHTMAP = value; }
// public Object DISABLE_LIGHTMAP() { return wrapperContained.DISABLE_LIGHTMAP; }
// // public void DISABLE_LIGHTMAP(Object value) { wrapperContained.DISABLE_LIGHTMAP = value; }
// public Object ENABLE_OVERLAY_COLOR() { return wrapperContained.ENABLE_OVERLAY_COLOR; }
// // public void ENABLE_OVERLAY_COLOR(Object value) { wrapperContained.ENABLE_OVERLAY_COLOR = value; }
// public Object DISABLE_OVERLAY_COLOR() { return wrapperContained.DISABLE_OVERLAY_COLOR; }
// // public void DISABLE_OVERLAY_COLOR(Object value) { wrapperContained.DISABLE_OVERLAY_COLOR = value; }
// public Object VIEW_OFFSET_Z_LAYERING() { return wrapperContained.VIEW_OFFSET_Z_LAYERING; }
// // public void VIEW_OFFSET_Z_LAYERING(Object value) { wrapperContained.VIEW_OFFSET_Z_LAYERING = value; }
// public Object TRANSLUCENT_TARGET() { return wrapperContained.TRANSLUCENT_TARGET; }
// // public void TRANSLUCENT_TARGET(Object value) { wrapperContained.TRANSLUCENT_TARGET = value; }
// public Object PARTICLES_TARGET() { return wrapperContained.PARTICLES_TARGET; }
// // public void PARTICLES_TARGET(Object value) { wrapperContained.PARTICLES_TARGET = value; }
// public Object WEATHER_TARGET() { return wrapperContained.WEATHER_TARGET; }
// // public void WEATHER_TARGET(Object value) { wrapperContained.WEATHER_TARGET = value; }
// public Object CLOUDS_TARGET() { return wrapperContained.CLOUDS_TARGET; }
// // public void CLOUDS_TARGET(Object value) { wrapperContained.CLOUDS_TARGET = value; }
// public Object ITEM_ENTITY_TARGET() { return wrapperContained.ITEM_ENTITY_TARGET; }
// // public void ITEM_ENTITY_TARGET(Object value) { wrapperContained.ITEM_ENTITY_TARGET = value; }
// public Object ENTITY_CUTOUT_NONULL_OFFSET_Z_PROGRAM() { return wrapperContained.ENTITY_CUTOUT_NONULL_OFFSET_Z_PROGRAM; }
// // public void ENTITY_CUTOUT_NONULL_OFFSET_Z_PROGRAM(Object value) { wrapperContained.ENTITY_CUTOUT_NONULL_OFFSET_Z_PROGRAM = value; }
// public Object ITEM_ENTITY_TRANSLUCENT_CULL_PROGRAM() { return wrapperContained.ITEM_ENTITY_TRANSLUCENT_CULL_PROGRAM; }
// // public void ITEM_ENTITY_TRANSLUCENT_CULL_PROGRAM(Object value) { wrapperContained.ITEM_ENTITY_TRANSLUCENT_CULL_PROGRAM = value; }
// public Object ENTITY_TRANSLUCENT_CULL_PROGRAM() { return wrapperContained.ENTITY_TRANSLUCENT_CULL_PROGRAM; }
// // public void ENTITY_TRANSLUCENT_CULL_PROGRAM(Object value) { wrapperContained.ENTITY_TRANSLUCENT_CULL_PROGRAM = value; }
// public Object ENTITY_TRANSLUCENT_PROGRAM() { return wrapperContained.ENTITY_TRANSLUCENT_PROGRAM; }
// // public void ENTITY_TRANSLUCENT_PROGRAM(Object value) { wrapperContained.ENTITY_TRANSLUCENT_PROGRAM = value; }
// public Object ENTITY_SMOOTH_CUTOUT_PROGRAM() { return wrapperContained.ENTITY_SMOOTH_CUTOUT_PROGRAM; }
// // public void ENTITY_SMOOTH_CUTOUT_PROGRAM(Object value) { wrapperContained.ENTITY_SMOOTH_CUTOUT_PROGRAM = value; }
// public Object BEACON_BEAM_PROGRAM() { return wrapperContained.BEACON_BEAM_PROGRAM; }
// // public void BEACON_BEAM_PROGRAM(Object value) { wrapperContained.BEACON_BEAM_PROGRAM = value; }
// public Object ENTITY_DECAL_PROGRAM() { return wrapperContained.ENTITY_DECAL_PROGRAM; }
// // public void ENTITY_DECAL_PROGRAM(Object value) { wrapperContained.ENTITY_DECAL_PROGRAM = value; }
// public Object ENTITY_NO_OUTLINE_PROGRAM() { return wrapperContained.ENTITY_NO_OUTLINE_PROGRAM; }
// // public void ENTITY_NO_OUTLINE_PROGRAM(Object value) { wrapperContained.ENTITY_NO_OUTLINE_PROGRAM = value; }
// public Object ENTITY_SHADOW_PROGRAM() { return wrapperContained.ENTITY_SHADOW_PROGRAM; }
// // public void ENTITY_SHADOW_PROGRAM(Object value) { wrapperContained.ENTITY_SHADOW_PROGRAM = value; }
// public Object ENTITY_ALPHA_PROGRAM() { return wrapperContained.ENTITY_ALPHA_PROGRAM; }
// // public void ENTITY_ALPHA_PROGRAM(Object value) { wrapperContained.ENTITY_ALPHA_PROGRAM = value; }
// public Object EYES_PROGRAM() { return wrapperContained.EYES_PROGRAM; }
// // public void EYES_PROGRAM(Object value) { wrapperContained.EYES_PROGRAM = value; }
// public Object ENERGY_SWIRL_PROGRAM() { return wrapperContained.ENERGY_SWIRL_PROGRAM; }
// // public void ENERGY_SWIRL_PROGRAM(Object value) { wrapperContained.ENERGY_SWIRL_PROGRAM = value; }
// public Object LEASH_PROGRAM() { return wrapperContained.LEASH_PROGRAM; }
// // public void LEASH_PROGRAM(Object value) { wrapperContained.LEASH_PROGRAM = value; }
// public Object WATER_MASK_PROGRAM() { return wrapperContained.WATER_MASK_PROGRAM; }
// // public void WATER_MASK_PROGRAM(Object value) { wrapperContained.WATER_MASK_PROGRAM = value; }
// public Object OUTLINE_PROGRAM() { return wrapperContained.OUTLINE_PROGRAM; }
// // public void OUTLINE_PROGRAM(Object value) { wrapperContained.OUTLINE_PROGRAM = value; }
// public Object ARMOR_ENTITY_GLINT_PROGRAM() { return wrapperContained.ARMOR_ENTITY_GLINT_PROGRAM; }
// // public void ARMOR_ENTITY_GLINT_PROGRAM(Object value) { wrapperContained.ARMOR_ENTITY_GLINT_PROGRAM = value; }
// public Object TRANSLUCENT_GLINT_PROGRAM() { return wrapperContained.TRANSLUCENT_GLINT_PROGRAM; }
// // public void TRANSLUCENT_GLINT_PROGRAM(Object value) { wrapperContained.TRANSLUCENT_GLINT_PROGRAM = value; }
// public Object GLINT_PROGRAM() { return wrapperContained.GLINT_PROGRAM; }
// // public void GLINT_PROGRAM(Object value) { wrapperContained.GLINT_PROGRAM = value; }
// public Object ENTITY_GLINT_PROGRAM() { return wrapperContained.ENTITY_GLINT_PROGRAM; }
// // public void ENTITY_GLINT_PROGRAM(Object value) { wrapperContained.ENTITY_GLINT_PROGRAM = value; }
// public Object DIRECT_ENTITY_GLINT_PROGRAM() { return wrapperContained.DIRECT_ENTITY_GLINT_PROGRAM; }
// // public void DIRECT_ENTITY_GLINT_PROGRAM(Object value) { wrapperContained.DIRECT_ENTITY_GLINT_PROGRAM = value; }
// public Object CRUMBLING_PROGRAM() { return wrapperContained.CRUMBLING_PROGRAM; }
// // public void CRUMBLING_PROGRAM(Object value) { wrapperContained.CRUMBLING_PROGRAM = value; }
// public Object TEXT_PROGRAM() { return wrapperContained.TEXT_PROGRAM; }
// // public void TEXT_PROGRAM(Object value) { wrapperContained.TEXT_PROGRAM = value; }
// public Object TRANSPARENT_TEXT_PROGRAM() { return wrapperContained.TRANSPARENT_TEXT_PROGRAM; }
// // public void TRANSPARENT_TEXT_PROGRAM(Object value) { wrapperContained.TRANSPARENT_TEXT_PROGRAM = value; }
// public Object LIGHTNING_PROGRAM() { return wrapperContained.LIGHTNING_PROGRAM; }
// // public void LIGHTNING_PROGRAM(Object value) { wrapperContained.LIGHTNING_PROGRAM = value; }
// public Object TRIPWIRE_PROGRAM() { return wrapperContained.TRIPWIRE_PROGRAM; }
// // public void TRIPWIRE_PROGRAM(Object value) { wrapperContained.TRIPWIRE_PROGRAM = value; }
// public Object END_PORTAL_PROGRAM() { return wrapperContained.END_PORTAL_PROGRAM; }
// // public void END_PORTAL_PROGRAM(Object value) { wrapperContained.END_PORTAL_PROGRAM = value; }
// public Object END_GATEWAY_PROGRAM() { return wrapperContained.END_GATEWAY_PROGRAM; }
// // public void END_GATEWAY_PROGRAM(Object value) { wrapperContained.END_GATEWAY_PROGRAM = value; }
// public Object LINES_PROGRAM() { return wrapperContained.LINES_PROGRAM; }
// // public void LINES_PROGRAM(Object value) { wrapperContained.LINES_PROGRAM = value; }
// public Object NO_PROGRAM() { return wrapperContained.NO_PROGRAM; }
// // public void NO_PROGRAM(Object value) { wrapperContained.NO_PROGRAM = value; }
// public Object POSITION_COLOR_LIGHTMAP_PROGRAM() { return wrapperContained.POSITION_COLOR_LIGHTMAP_PROGRAM; }
// // public void POSITION_COLOR_LIGHTMAP_PROGRAM(Object value) { wrapperContained.POSITION_COLOR_LIGHTMAP_PROGRAM = value; }
// public Object POSITION_PROGRAM() { return wrapperContained.POSITION_PROGRAM; }
// // public void POSITION_PROGRAM(Object value) { wrapperContained.POSITION_PROGRAM = value; }
// public Object POSITION_TEXTURE_PROGRAM() { return wrapperContained.POSITION_TEXTURE_PROGRAM; }
// // public void POSITION_TEXTURE_PROGRAM(Object value) { wrapperContained.POSITION_TEXTURE_PROGRAM = value; }
// public Object POSITION_COLOR_TEXTURE_LIGHTMAP_PROGRAM() { return wrapperContained.POSITION_COLOR_TEXTURE_LIGHTMAP_PROGRAM; }
// // public void POSITION_COLOR_TEXTURE_LIGHTMAP_PROGRAM(Object value) { wrapperContained.POSITION_COLOR_TEXTURE_LIGHTMAP_PROGRAM = value; }
// public Object COLOR_PROGRAM() { return wrapperContained.COLOR_PROGRAM; }
// // public void COLOR_PROGRAM(Object value) { wrapperContained.COLOR_PROGRAM = value; }
// public Object SOLID_PROGRAM() { return wrapperContained.SOLID_PROGRAM; }
// // public void SOLID_PROGRAM(Object value) { wrapperContained.SOLID_PROGRAM = value; }
// public Object CUTOUT_MIPPED_PROGRAM() { return wrapperContained.CUTOUT_MIPPED_PROGRAM; }
// // public void CUTOUT_MIPPED_PROGRAM(Object value) { wrapperContained.CUTOUT_MIPPED_PROGRAM = value; }
// public Object CUTOUT_PROGRAM() { return wrapperContained.CUTOUT_PROGRAM; }
// // public void CUTOUT_PROGRAM(Object value) { wrapperContained.CUTOUT_PROGRAM = value; }
// public Object TRANSLUCENT_PROGRAM() { return wrapperContained.TRANSLUCENT_PROGRAM; }
// // public void TRANSLUCENT_PROGRAM(Object value) { wrapperContained.TRANSLUCENT_PROGRAM = value; }
// public Object TRANSLUCENT_MOVING_BLOCK_PROGRAM() { return wrapperContained.TRANSLUCENT_MOVING_BLOCK_PROGRAM; }
// // public void TRANSLUCENT_MOVING_BLOCK_PROGRAM(Object value) { wrapperContained.TRANSLUCENT_MOVING_BLOCK_PROGRAM = value; }
// public Object ARMOR_CUTOUT_NO_CULL_PROGRAM() { return wrapperContained.ARMOR_CUTOUT_NO_CULL_PROGRAM; }
// // public void ARMOR_CUTOUT_NO_CULL_PROGRAM(Object value) { wrapperContained.ARMOR_CUTOUT_NO_CULL_PROGRAM = value; }
// public Object ENTITY_SOLID_PROGRAM() { return wrapperContained.ENTITY_SOLID_PROGRAM; }
// // public void ENTITY_SOLID_PROGRAM(Object value) { wrapperContained.ENTITY_SOLID_PROGRAM = value; }
// public Object ENTITY_CUTOUT_PROGRAM() { return wrapperContained.ENTITY_CUTOUT_PROGRAM; }
// // public void ENTITY_CUTOUT_PROGRAM(Object value) { wrapperContained.ENTITY_CUTOUT_PROGRAM = value; }
// public Object ENTITY_CUTOUT_NONULL_PROGRAM() { return wrapperContained.ENTITY_CUTOUT_NONULL_PROGRAM; }
// // public void ENTITY_CUTOUT_NONULL_PROGRAM(Object value) { wrapperContained.ENTITY_CUTOUT_NONULL_PROGRAM = value; }
// public float VIEW_OFFSET_Z_LAYERING_SCALE() { return wrapperContained.VIEW_OFFSET_Z_LAYERING_SCALE; }
// public void VIEW_OFFSET_Z_LAYERING_SCALE(float value) { wrapperContained.VIEW_OFFSET_Z_LAYERING_SCALE = value; }
// public Object TEXT_INTENSITY_PROGRAM() { return wrapperContained.TEXT_INTENSITY_PROGRAM; }
// // public void TEXT_INTENSITY_PROGRAM(Object value) { wrapperContained.TEXT_INTENSITY_PROGRAM = value; }
// public Object TRANSPARENT_TEXT_INTENSITY_PROGRAM() { return wrapperContained.TRANSPARENT_TEXT_INTENSITY_PROGRAM; }
// // public void TRANSPARENT_TEXT_INTENSITY_PROGRAM(Object value) { wrapperContained.TRANSPARENT_TEXT_INTENSITY_PROGRAM = value; }
// public Object ENTITY_TRANSLUCENT_EMISSIVE_PROGRAM() { return wrapperContained.ENTITY_TRANSLUCENT_EMISSIVE_PROGRAM; }
// // public void ENTITY_TRANSLUCENT_EMISSIVE_PROGRAM(Object value) { wrapperContained.ENTITY_TRANSLUCENT_EMISSIVE_PROGRAM = value; }
// public Object TEXT_BACKGROUND_PROGRAM() { return wrapperContained.TEXT_BACKGROUND_PROGRAM; }
// // public void TEXT_BACKGROUND_PROGRAM(Object value) { wrapperContained.TEXT_BACKGROUND_PROGRAM = value; }
// public Object TRANSPARENT_TEXT_BACKGROUND_PROGRAM() { return wrapperContained.TRANSPARENT_TEXT_BACKGROUND_PROGRAM; }
// // public void TRANSPARENT_TEXT_BACKGROUND_PROGRAM(Object value) { wrapperContained.TRANSPARENT_TEXT_BACKGROUND_PROGRAM = value; }
// public Object BIGGER_DEPTH_TEST() { return wrapperContained.BIGGER_DEPTH_TEST; }
// // public void BIGGER_DEPTH_TEST(Object value) { wrapperContained.BIGGER_DEPTH_TEST = value; }
// public Object NO_COLOR_LOGIC() { return wrapperContained.NO_COLOR_LOGIC; }
// // public void NO_COLOR_LOGIC(Object value) { wrapperContained.NO_COLOR_LOGIC = value; }
// public Object OR_REVERSE() { return wrapperContained.OR_REVERSE; }
// // public void OR_REVERSE(Object value) { wrapperContained.OR_REVERSE = value; }
// public Object GUI_PROGRAM() { return wrapperContained.GUI_PROGRAM; }
// // public void GUI_PROGRAM(Object value) { wrapperContained.GUI_PROGRAM = value; }
// public Object GUI_OVERLAY_PROGRAM() { return wrapperContained.GUI_OVERLAY_PROGRAM; }
// // public void GUI_OVERLAY_PROGRAM(Object value) { wrapperContained.GUI_OVERLAY_PROGRAM = value; }
// public Object GUI_TEXT_HIGHLIGHT_PROGRAM() { return wrapperContained.GUI_TEXT_HIGHLIGHT_PROGRAM; }
// // public void GUI_TEXT_HIGHLIGHT_PROGRAM(Object value) { wrapperContained.GUI_TEXT_HIGHLIGHT_PROGRAM = value; }
// public Object GUI_GHOST_RECIPE_OVERLAY_PROGRAM() { return wrapperContained.GUI_GHOST_RECIPE_OVERLAY_PROGRAM; }
// // public void GUI_GHOST_RECIPE_OVERLAY_PROGRAM(Object value) { wrapperContained.GUI_GHOST_RECIPE_OVERLAY_PROGRAM = value; }
// public Object BREEZE_WIND_PROGRAM() { return wrapperContained.BREEZE_WIND_PROGRAM; }
// // public void BREEZE_WIND_PROGRAM(Object value) { wrapperContained.BREEZE_WIND_PROGRAM = value; }
// public Object CLOUDS_PROGRAM() { return wrapperContained.CLOUDS_PROGRAM; }
// // public void CLOUDS_PROGRAM(Object value) { wrapperContained.CLOUDS_PROGRAM = value; }
// public RenderPhase(java.lang.String name,java.lang.Runnable beginAction,java.lang.Runnable endAction) { this.wrapperContained = new net.minecraft.client.render.RenderPhase(name,beginAction,endAction); }
public void startDrawing() { wrapperContained.startDrawing(); }
// public void setupGlintTexturing(float scale) { wrapperContained.setupGlintTexturing(scale); }
public void endDrawing() { wrapperContained.endDrawing(); }

}