package yarnwrap.client.gui.hud;
public class InGameOverlayRenderer { public net.minecraft.client.gui.hud.InGameOverlayRenderer wrapperContained; public InGameOverlayRenderer(net.minecraft.client.gui.hud.InGameOverlayRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier UNDERWATER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.UNDERWATER_TEXTURE); }
public void renderOverlays(yarnwrap.client.MinecraftClient client,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.renderOverlays(client.wrapperContained,matrices.wrapperContained); }
// public void renderInWallOverlay(yarnwrap.client.texture.Sprite sprite,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.renderInWallOverlay(sprite.wrapperContained,matrices.wrapperContained); }
// public void renderUnderwaterOverlay(yarnwrap.client.MinecraftClient client,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.renderUnderwaterOverlay(client.wrapperContained,matrices.wrapperContained); }
// public void renderFireOverlay(yarnwrap.client.MinecraftClient client,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.renderFireOverlay(client.wrapperContained,matrices.wrapperContained); }
// public yarnwrap.block.BlockState getInWallBlockState(yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.block.BlockState(wrapperContained.getInWallBlockState(player.wrapperContained)); }

}