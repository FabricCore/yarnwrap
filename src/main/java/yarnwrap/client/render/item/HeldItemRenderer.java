package yarnwrap.client.render.item;
public class HeldItemRenderer { public net.minecraft.client.render.item.HeldItemRenderer wrapperContained; public HeldItemRenderer(net.minecraft.client.render.item.HeldItemRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.RenderLayer MAP_BACKGROUND() { return new yarnwrap.client.render.RenderLayer(wrapperContained.MAP_BACKGROUND); }
// public void MAP_BACKGROUND(yarnwrap.client.render.RenderLayer value) { wrapperContained.MAP_BACKGROUND = value.wrapperContained; }
// public yarnwrap.client.render.RenderLayer MAP_BACKGROUND_CHECKERBOARD() { return new yarnwrap.client.render.RenderLayer(wrapperContained.MAP_BACKGROUND_CHECKERBOARD); }
// public void MAP_BACKGROUND_CHECKERBOARD(yarnwrap.client.render.RenderLayer value) { wrapperContained.MAP_BACKGROUND_CHECKERBOARD = value.wrapperContained; }
// public float ARM_HOLDING_ITEM_FIRST_Z_ANGLE_MULTIPLIER() { return wrapperContained.ARM_HOLDING_ITEM_FIRST_Z_ANGLE_MULTIPLIER; }
// public void ARM_HOLDING_ITEM_FIRST_Z_ANGLE_MULTIPLIER(float value) { wrapperContained.ARM_HOLDING_ITEM_FIRST_Z_ANGLE_MULTIPLIER = value; }
// public float ARM_HOLDING_ITEM_TRANSLATE_X() { return wrapperContained.ARM_HOLDING_ITEM_TRANSLATE_X; }
// public void ARM_HOLDING_ITEM_TRANSLATE_X(float value) { wrapperContained.ARM_HOLDING_ITEM_TRANSLATE_X = value; }
// public int ARM_HOLDING_ITEM_X_ANGLE_MULTIPLIER() { return wrapperContained.ARM_HOLDING_ITEM_X_ANGLE_MULTIPLIER; }
// public void ARM_HOLDING_ITEM_X_ANGLE_MULTIPLIER(int value) { wrapperContained.ARM_HOLDING_ITEM_X_ANGLE_MULTIPLIER = value; }
// public int ARM_HOLDING_ITEM_THIRD_Y_ANGLE_MULTIPLIER() { return wrapperContained.ARM_HOLDING_ITEM_THIRD_Y_ANGLE_MULTIPLIER; }
// public void ARM_HOLDING_ITEM_THIRD_Y_ANGLE_MULTIPLIER(int value) { wrapperContained.ARM_HOLDING_ITEM_THIRD_Y_ANGLE_MULTIPLIER = value; }
// public int ARM_HOLDING_ITEM_SECOND_Z_ANGLE_MULTIPLIER() { return wrapperContained.ARM_HOLDING_ITEM_SECOND_Z_ANGLE_MULTIPLIER; }
// public void ARM_HOLDING_ITEM_SECOND_Z_ANGLE_MULTIPLIER(int value) { wrapperContained.ARM_HOLDING_ITEM_SECOND_Z_ANGLE_MULTIPLIER = value; }
// public float ARM_X_ANGLE_MULTIPLIER() { return wrapperContained.ARM_X_ANGLE_MULTIPLIER; }
// public void ARM_X_ANGLE_MULTIPLIER(float value) { wrapperContained.ARM_X_ANGLE_MULTIPLIER = value; }
// public float ARM_Y_ANGLE_MULTIPLIER() { return wrapperContained.ARM_Y_ANGLE_MULTIPLIER; }
// public void ARM_Y_ANGLE_MULTIPLIER(float value) { wrapperContained.ARM_Y_ANGLE_MULTIPLIER = value; }
// public float ARM_Z_ANGLE_MULTIPLIER() { return wrapperContained.ARM_Z_ANGLE_MULTIPLIER; }
// public void ARM_Z_ANGLE_MULTIPLIER(float value) { wrapperContained.ARM_Z_ANGLE_MULTIPLIER = value; }
// public float ARM_TRANSLATE_X() { return wrapperContained.ARM_TRANSLATE_X; }
// public void ARM_TRANSLATE_X(float value) { wrapperContained.ARM_TRANSLATE_X = value; }
// public float ARM_TRANSLATE_Y() { return wrapperContained.ARM_TRANSLATE_Y; }
// public void ARM_TRANSLATE_Y(float value) { wrapperContained.ARM_TRANSLATE_Y = value; }
// public float ARM_TRANSLATE_Z() { return wrapperContained.ARM_TRANSLATE_Z; }
// public void ARM_TRANSLATE_Z(float value) { wrapperContained.ARM_TRANSLATE_Z = value; }
// public float FIRST_PERSON_MAP_FIRST_SCALE() { return wrapperContained.FIRST_PERSON_MAP_FIRST_SCALE; }
// public void FIRST_PERSON_MAP_FIRST_SCALE(float value) { wrapperContained.FIRST_PERSON_MAP_FIRST_SCALE = value; }
// public float FIRST_PERSON_MAP_TRANSLATE_X() { return wrapperContained.FIRST_PERSON_MAP_TRANSLATE_X; }
// public void FIRST_PERSON_MAP_TRANSLATE_X(float value) { wrapperContained.FIRST_PERSON_MAP_TRANSLATE_X = value; }
// public float FIRST_PERSON_MAP_TRANSLATE_Y() { return wrapperContained.FIRST_PERSON_MAP_TRANSLATE_Y; }
// public void FIRST_PERSON_MAP_TRANSLATE_Y(float value) { wrapperContained.FIRST_PERSON_MAP_TRANSLATE_Y = value; }
// public float FIRST_PERSON_MAP_TRANSLATE_Z() { return wrapperContained.FIRST_PERSON_MAP_TRANSLATE_Z; }
// public void FIRST_PERSON_MAP_TRANSLATE_Z(float value) { wrapperContained.FIRST_PERSON_MAP_TRANSLATE_Z = value; }
// public float FIRST_PERSON_MAP_SECOND_SCALE() { return wrapperContained.FIRST_PERSON_MAP_SECOND_SCALE; }
// public void FIRST_PERSON_MAP_SECOND_SCALE(float value) { wrapperContained.FIRST_PERSON_MAP_SECOND_SCALE = value; }
// public float EQUIP_OFFSET_TRANSLATE_X() { return wrapperContained.EQUIP_OFFSET_TRANSLATE_X; }
// public void EQUIP_OFFSET_TRANSLATE_X(float value) { wrapperContained.EQUIP_OFFSET_TRANSLATE_X = value; }
// public float EQUIP_OFFSET_TRANSLATE_Y() { return wrapperContained.EQUIP_OFFSET_TRANSLATE_Y; }
// public void EQUIP_OFFSET_TRANSLATE_Y(float value) { wrapperContained.EQUIP_OFFSET_TRANSLATE_Y = value; }
// public float EQUIP_OFFSET_TRANSLATE_Z() { return wrapperContained.EQUIP_OFFSET_TRANSLATE_Z; }
// public void EQUIP_OFFSET_TRANSLATE_Z(float value) { wrapperContained.EQUIP_OFFSET_TRANSLATE_Z = value; }
// public float EAT_OR_DRINK_X_ANGLE_MULTIPLIER() { return wrapperContained.EAT_OR_DRINK_X_ANGLE_MULTIPLIER; }
// public void EAT_OR_DRINK_X_ANGLE_MULTIPLIER(float value) { wrapperContained.EAT_OR_DRINK_X_ANGLE_MULTIPLIER = value; }
// public float EAT_OR_DRINK_Y_ANGLE_MULTIPLIER() { return wrapperContained.EAT_OR_DRINK_Y_ANGLE_MULTIPLIER; }
// public void EAT_OR_DRINK_Y_ANGLE_MULTIPLIER(float value) { wrapperContained.EAT_OR_DRINK_Y_ANGLE_MULTIPLIER = value; }
// public float EAT_OR_DRINK_Z_ANGLE_MULTIPLIER() { return wrapperContained.EAT_OR_DRINK_Z_ANGLE_MULTIPLIER; }
// public void EAT_OR_DRINK_Z_ANGLE_MULTIPLIER(float value) { wrapperContained.EAT_OR_DRINK_Z_ANGLE_MULTIPLIER = value; }
// public float ARM_HOLDING_ITEM_SECOND_Y_ANGLE_MULTIPLIER() { return wrapperContained.ARM_HOLDING_ITEM_SECOND_Y_ANGLE_MULTIPLIER; }
// public void ARM_HOLDING_ITEM_SECOND_Y_ANGLE_MULTIPLIER(float value) { wrapperContained.ARM_HOLDING_ITEM_SECOND_Y_ANGLE_MULTIPLIER = value; }
// public float equipProgressMainHand() { return wrapperContained.equipProgressMainHand; }
// public void equipProgressMainHand(float value) { wrapperContained.equipProgressMainHand = value; }
// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }
// public yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.entityRenderDispatcher); }
// public void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.entityRenderDispatcher = value.wrapperContained; }
// public yarnwrap.item.ItemStack mainHand() { return new yarnwrap.item.ItemStack(wrapperContained.mainHand); }
// public void mainHand(yarnwrap.item.ItemStack value) { wrapperContained.mainHand = value.wrapperContained; }
// public yarnwrap.item.ItemStack offHand() { return new yarnwrap.item.ItemStack(wrapperContained.offHand); }
// public void offHand(yarnwrap.item.ItemStack value) { wrapperContained.offHand = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public float prevEquipProgressOffHand() { return wrapperContained.prevEquipProgressOffHand; }
// public void prevEquipProgressOffHand(float value) { wrapperContained.prevEquipProgressOffHand = value; }
// public float equipProgressOffHand() { return wrapperContained.equipProgressOffHand; }
// public void equipProgressOffHand(float value) { wrapperContained.equipProgressOffHand = value; }
// public float prevEquipProgressMainHand() { return wrapperContained.prevEquipProgressMainHand; }
// public void prevEquipProgressMainHand(float value) { wrapperContained.prevEquipProgressMainHand = value; }
// public void renderItem(float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,Object vertexConsumers,yarnwrap.client.network.ClientPlayerEntity player,int light) { wrapperContained.renderItem(tickDelta,matrices.wrapperContained,vertexConsumers,player.wrapperContained,light); }
public void resetEquipProgress(yarnwrap.util.Hand hand) { wrapperContained.resetEquipProgress(hand.wrapperContained); }
// public void renderArm(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.util.Arm arm) { wrapperContained.renderArm(matrices.wrapperContained,vertexConsumers.wrapperContained,light,arm.wrapperContained); }
// public void applySwingOffset(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.util.Arm arm,float swingProgress) { wrapperContained.applySwingOffset(matrices.wrapperContained,arm.wrapperContained,swingProgress); }
// public void applyEatOrDrinkTransformation(yarnwrap.client.util.math.MatrixStack matrices,float tickDelta,yarnwrap.util.Arm arm,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.applyEatOrDrinkTransformation(matrices.wrapperContained,tickDelta,arm.wrapperContained,stack.wrapperContained,player.wrapperContained); }
// public void renderArmHoldingItem(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,float equipProgress,float swingProgress,yarnwrap.util.Arm arm) { wrapperContained.renderArmHoldingItem(matrices.wrapperContained,vertexConsumers.wrapperContained,light,equipProgress,swingProgress,arm.wrapperContained); }
public void updateHeldItems() { wrapperContained.updateHeldItems(); }
// public void renderMapInOneHand(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,float equipProgress,yarnwrap.util.Arm arm,float swingProgress,yarnwrap.item.ItemStack stack) { wrapperContained.renderMapInOneHand(matrices.wrapperContained,vertexConsumers.wrapperContained,light,equipProgress,arm.wrapperContained,swingProgress,stack.wrapperContained); }
// public void renderFirstPersonMap(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int swingProgress,yarnwrap.item.ItemStack stack) { wrapperContained.renderFirstPersonMap(matrices.wrapperContained,vertexConsumers.wrapperContained,swingProgress,stack.wrapperContained); }
// public void applyEquipOffset(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.util.Arm arm,float equipProgress) { wrapperContained.applyEquipOffset(matrices.wrapperContained,arm.wrapperContained,equipProgress); }
// public float getMapAngle(float tickDelta) { return wrapperContained.getMapAngle(tickDelta); }
// public void renderFirstPersonItem(yarnwrap.client.network.AbstractClientPlayerEntity player,float tickDelta,float pitch,yarnwrap.util.Hand hand,float swingProgress,yarnwrap.item.ItemStack item,float equipProgress,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.renderFirstPersonItem(player.wrapperContained,tickDelta,pitch,hand.wrapperContained,swingProgress,item.wrapperContained,equipProgress,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public void renderMapInBothHands(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,float pitch,float equipProgress,float swingProgress) { wrapperContained.renderMapInBothHands(matrices.wrapperContained,vertexConsumers.wrapperContained,light,pitch,equipProgress,swingProgress); }
public void renderItem(yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack,yarnwrap.client.render.model.json.ModelTransformationMode renderMode,boolean leftHanded,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.renderItem(entity.wrapperContained,stack.wrapperContained,renderMode.wrapperContained,leftHanded,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public boolean isChargedCrossbow(yarnwrap.item.ItemStack stack) { return wrapperContained.isChargedCrossbow(stack.wrapperContained); }
// public Object getHandRenderType(yarnwrap.client.network.ClientPlayerEntity player) { return wrapperContained.getHandRenderType(player.wrapperContained); }
// public Object getUsingItemHandRenderType(yarnwrap.client.network.ClientPlayerEntity player) { return wrapperContained.getUsingItemHandRenderType(player.wrapperContained); }
// public void applyBrushTransformation(yarnwrap.client.util.math.MatrixStack matrices,float tickDelta,yarnwrap.util.Arm arm,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player,float equipProgress) { wrapperContained.applyBrushTransformation(matrices.wrapperContained,tickDelta,arm.wrapperContained,stack.wrapperContained,player.wrapperContained,equipProgress); }

}