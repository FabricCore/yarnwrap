package yarnwrap.client.gui.hud;
public class InGameOverlayRenderer { public net.minecraft.client.gui.hud.InGameOverlayRenderer wrapperContained; public InGameOverlayRenderer(net.minecraft.client.gui.hud.InGameOverlayRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier UNDERWATER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.UNDERWATER_TEXTURE); }
// public void UNDERWATER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.UNDERWATER_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier UNDERWATER_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameOverlayRenderer.UNDERWATER_TEXTURE); }
// public static void UNDERWATER_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.UNDERWATER_TEXTURE = value.wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.gui.hud.InGameOverlayRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.client = value.wrapperContained; }

// public yarnwrap.client.render.VertexConsumerProvider vertexConsumers() { return new yarnwrap.client.render.VertexConsumerProvider(wrapperContained.vertexConsumers); }
// public void vertexConsumers(yarnwrap.client.render.VertexConsumerProvider value) { wrapperContained.vertexConsumers = value.wrapperContained; }
// public static yarnwrap.client.render.VertexConsumerProvider vertexConsumers() { return new yarnwrap.client.render.VertexConsumerProvider(net.minecraft.client.gui.hud.InGameOverlayRenderer.vertexConsumers); }
// public static void vertexConsumers(yarnwrap.client.render.VertexConsumerProvider value, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.vertexConsumers = value.wrapperContained; }

// public yarnwrap.item.ItemStack floatingItem() { return new yarnwrap.item.ItemStack(wrapperContained.floatingItem); }
// public void floatingItem(yarnwrap.item.ItemStack value) { wrapperContained.floatingItem = value.wrapperContained; }
// public static yarnwrap.item.ItemStack floatingItem() { return new yarnwrap.item.ItemStack(net.minecraft.client.gui.hud.InGameOverlayRenderer.floatingItem); }
// public static void floatingItem(yarnwrap.item.ItemStack value, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.floatingItem = value.wrapperContained; }

// public int floatingItemTimer() { return wrapperContained.floatingItemTimer; }
// public void floatingItemTimer(int value) { wrapperContained.floatingItemTimer = value; }
// public static int floatingItemTimer() { return net.minecraft.client.gui.hud.InGameOverlayRenderer.floatingItemTimer; }
// public static void floatingItemTimer(int value, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.floatingItemTimer = value; }

// public float floatingItemOffsetX() { return wrapperContained.floatingItemOffsetX; }
// public void floatingItemOffsetX(float value) { wrapperContained.floatingItemOffsetX = value; }
// public static float floatingItemOffsetX() { return net.minecraft.client.gui.hud.InGameOverlayRenderer.floatingItemOffsetX; }
// public static void floatingItemOffsetX(float value, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.floatingItemOffsetX = value; }

// public float floatingItemOffsetY() { return wrapperContained.floatingItemOffsetY; }
// public void floatingItemOffsetY(float value) { wrapperContained.floatingItemOffsetY = value; }
// public static float floatingItemOffsetY() { return net.minecraft.client.gui.hud.InGameOverlayRenderer.floatingItemOffsetY; }
// public static void floatingItemOffsetY(float value, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.floatingItemOffsetY = value; }

// public InGameOverlayRenderer(yarnwrap.client.MinecraftClient client,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { this.wrapperContained = new net.minecraft.client.gui.hud.InGameOverlayRenderer(client.wrapperContained,vertexConsumers.wrapperContained); }
// public void renderOverlays(boolean sleeping,float tickProgress) { wrapperContained.renderOverlays(sleeping,tickProgress); }
// public static void renderOverlays(boolean sleeping,float tickProgress, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.renderOverlays(sleeping,tickProgress); }
// public void renderInWallOverlay(yarnwrap.client.texture.Sprite sprite,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.renderInWallOverlay(sprite.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public static void renderInWallOverlay(yarnwrap.client.texture.Sprite sprite,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.renderInWallOverlay(sprite.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public void renderUnderwaterOverlay(yarnwrap.client.MinecraftClient client,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.renderUnderwaterOverlay(client.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public static void renderUnderwaterOverlay(yarnwrap.client.MinecraftClient client,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.renderUnderwaterOverlay(client.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public void renderFireOverlay(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.renderFireOverlay(matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public static void renderFireOverlay(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.renderFireOverlay(matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public yarnwrap.block.BlockState getInWallBlockState(yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.block.BlockState(wrapperContained.getInWallBlockState(player.wrapperContained)); }
// public static yarnwrap.block.BlockState getInWallBlockState(yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.block.BlockState(net.minecraft.client.gui.hud.InGameOverlayRenderer.getInWallBlockState(player.wrapperContained)); }
// public void tickFloatingItemTimer() { wrapperContained.tickFloatingItemTimer(); }
// public static void tickFloatingItemTimer() { net.minecraft.client.gui.hud.InGameOverlayRenderer.tickFloatingItemTimer(); }
// public void setFloatingItem(yarnwrap.item.ItemStack stack,yarnwrap.util.math.random.Random random) { wrapperContained.setFloatingItem(stack.wrapperContained,random.wrapperContained); }
// public static void setFloatingItem(yarnwrap.item.ItemStack stack,yarnwrap.util.math.random.Random random, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.setFloatingItem(stack.wrapperContained,random.wrapperContained); }
// public void renderFloatingItem(yarnwrap.client.util.math.MatrixStack matrices,float tickProgress) { wrapperContained.renderFloatingItem(matrices.wrapperContained,tickProgress); }
// public static void renderFloatingItem(yarnwrap.client.util.math.MatrixStack matrices,float tickProgress, ) { net.minecraft.client.gui.hud.InGameOverlayRenderer.renderFloatingItem(matrices.wrapperContained,tickProgress); }
// public void clearFloatingItem() { wrapperContained.clearFloatingItem(); }
// public static void clearFloatingItem() { net.minecraft.client.gui.hud.InGameOverlayRenderer.clearFloatingItem(); }

}