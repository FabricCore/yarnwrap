package yarnwrap.client.gui.hud;
public class BossBarHud { public net.minecraft.client.gui.hud.BossBarHud wrapperContained; public BossBarHud(net.minecraft.client.gui.hud.BossBarHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.Map bossBars() { return wrapperContained.bossBars; }
// public void bossBars(java.util.Map value) { wrapperContained.bossBars = value; }
// public int WIDTH() { return wrapperContained.WIDTH; }
// public void WIDTH(int value) { wrapperContained.WIDTH = value; }
// public int HEIGHT() { return wrapperContained.HEIGHT; }
// public void HEIGHT(int value) { wrapperContained.HEIGHT = value; }
// public net.minecraft.util.Identifier[] BACKGROUND_TEXTURES() { return wrapperContained.BACKGROUND_TEXTURES; }
// public void BACKGROUND_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.BACKGROUND_TEXTURES = value; }
// public net.minecraft.util.Identifier[] PROGRESS_TEXTURES() { return wrapperContained.PROGRESS_TEXTURES; }
// public void PROGRESS_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.PROGRESS_TEXTURES = value; }
// public net.minecraft.util.Identifier[] NOTCHED_BACKGROUND_TEXTURES() { return wrapperContained.NOTCHED_BACKGROUND_TEXTURES; }
// public void NOTCHED_BACKGROUND_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.NOTCHED_BACKGROUND_TEXTURES = value; }
// public net.minecraft.util.Identifier[] NOTCHED_PROGRESS_TEXTURES() { return wrapperContained.NOTCHED_PROGRESS_TEXTURES; }
// public void NOTCHED_PROGRESS_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.NOTCHED_PROGRESS_TEXTURES = value; }
public BossBarHud(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.gui.hud.BossBarHud(client.wrapperContained); }
public void handlePacket(yarnwrap.network.packet.s2c.play.BossBarS2CPacket packet) { wrapperContained.handlePacket(packet.wrapperContained); }
public void render(yarnwrap.client.gui.DrawContext context) { wrapperContained.render(context.wrapperContained); }
public boolean shouldDarkenSky() { return wrapperContained.shouldDarkenSky(); }
public boolean shouldPlayDragonMusic() { return wrapperContained.shouldPlayDragonMusic(); }
// public void renderBossBar(yarnwrap.client.gui.DrawContext context,int x,int y,yarnwrap.entity.boss.BossBar bossBar) { wrapperContained.renderBossBar(context.wrapperContained,x,y,bossBar.wrapperContained); }
public boolean shouldThickenFog() { return wrapperContained.shouldThickenFog(); }
public void clear() { wrapperContained.clear(); }
// public void renderBossBar(yarnwrap.client.gui.DrawContext context,int x,int y,yarnwrap.entity.boss.BossBar bossBar,int width,net.minecraft.util.Identifier[] textures,net.minecraft.util.Identifier[] notchedTextures) { wrapperContained.renderBossBar(context.wrapperContained,x,y,bossBar.wrapperContained,width,textures,notchedTextures); }

}