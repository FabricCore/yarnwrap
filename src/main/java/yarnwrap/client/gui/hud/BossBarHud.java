package yarnwrap.client.gui.hud;
public class BossBarHud { public net.minecraft.client.gui.hud.BossBarHud wrapperContained; public BossBarHud(net.minecraft.client.gui.hud.BossBarHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.gui.hud.BossBarHud.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.gui.hud.BossBarHud.client = value.wrapperContained; }

// public java.util.Map bossBars() { return wrapperContained.bossBars; }
// public void bossBars(java.util.Map value) { wrapperContained.bossBars = value; }
// public static java.util.Map bossBars() { return net.minecraft.client.gui.hud.BossBarHud.bossBars; }
// public static void bossBars(java.util.Map value, ) { net.minecraft.client.gui.hud.BossBarHud.bossBars = value; }

// public int WIDTH() { return wrapperContained.WIDTH; }
// public void WIDTH(int value) { wrapperContained.WIDTH = value; }
// public static int WIDTH() { return net.minecraft.client.gui.hud.BossBarHud.WIDTH; }
// public static void WIDTH(int value, ) { net.minecraft.client.gui.hud.BossBarHud.WIDTH = value; }

// public int HEIGHT() { return wrapperContained.HEIGHT; }
// public void HEIGHT(int value) { wrapperContained.HEIGHT = value; }
// public static int HEIGHT() { return net.minecraft.client.gui.hud.BossBarHud.HEIGHT; }
// public static void HEIGHT(int value, ) { net.minecraft.client.gui.hud.BossBarHud.HEIGHT = value; }

// public net.minecraft.util.Identifier[] BACKGROUND_TEXTURES() { return wrapperContained.BACKGROUND_TEXTURES; }
// public void BACKGROUND_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.BACKGROUND_TEXTURES = value; }
// public static net.minecraft.util.Identifier[] BACKGROUND_TEXTURES() { return net.minecraft.client.gui.hud.BossBarHud.BACKGROUND_TEXTURES; }
// public static void BACKGROUND_TEXTURES(net.minecraft.util.Identifier[] value, ) { net.minecraft.client.gui.hud.BossBarHud.BACKGROUND_TEXTURES = value; }

// public net.minecraft.util.Identifier[] PROGRESS_TEXTURES() { return wrapperContained.PROGRESS_TEXTURES; }
// public void PROGRESS_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.PROGRESS_TEXTURES = value; }
// public static net.minecraft.util.Identifier[] PROGRESS_TEXTURES() { return net.minecraft.client.gui.hud.BossBarHud.PROGRESS_TEXTURES; }
// public static void PROGRESS_TEXTURES(net.minecraft.util.Identifier[] value, ) { net.minecraft.client.gui.hud.BossBarHud.PROGRESS_TEXTURES = value; }

// public net.minecraft.util.Identifier[] NOTCHED_BACKGROUND_TEXTURES() { return wrapperContained.NOTCHED_BACKGROUND_TEXTURES; }
// public void NOTCHED_BACKGROUND_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.NOTCHED_BACKGROUND_TEXTURES = value; }
// public static net.minecraft.util.Identifier[] NOTCHED_BACKGROUND_TEXTURES() { return net.minecraft.client.gui.hud.BossBarHud.NOTCHED_BACKGROUND_TEXTURES; }
// public static void NOTCHED_BACKGROUND_TEXTURES(net.minecraft.util.Identifier[] value, ) { net.minecraft.client.gui.hud.BossBarHud.NOTCHED_BACKGROUND_TEXTURES = value; }

// public net.minecraft.util.Identifier[] NOTCHED_PROGRESS_TEXTURES() { return wrapperContained.NOTCHED_PROGRESS_TEXTURES; }
// public void NOTCHED_PROGRESS_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.NOTCHED_PROGRESS_TEXTURES = value; }
// public static net.minecraft.util.Identifier[] NOTCHED_PROGRESS_TEXTURES() { return net.minecraft.client.gui.hud.BossBarHud.NOTCHED_PROGRESS_TEXTURES; }
// public static void NOTCHED_PROGRESS_TEXTURES(net.minecraft.util.Identifier[] value, ) { net.minecraft.client.gui.hud.BossBarHud.NOTCHED_PROGRESS_TEXTURES = value; }

public BossBarHud(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.gui.hud.BossBarHud(client.wrapperContained); }
public void handlePacket(yarnwrap.network.packet.s2c.play.BossBarS2CPacket packet) { wrapperContained.handlePacket(packet.wrapperContained); }
// public static void handlePacket(yarnwrap.network.packet.s2c.play.BossBarS2CPacket packet, ) { net.minecraft.client.gui.hud.BossBarHud.handlePacket(packet.wrapperContained); }
public void render(yarnwrap.client.gui.DrawContext context) { wrapperContained.render(context.wrapperContained); }
// public static void render(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.hud.BossBarHud.render(context.wrapperContained); }
public boolean shouldDarkenSky() { return wrapperContained.shouldDarkenSky(); }
// public static boolean shouldDarkenSky() { return net.minecraft.client.gui.hud.BossBarHud.shouldDarkenSky(); }
public boolean shouldPlayDragonMusic() { return wrapperContained.shouldPlayDragonMusic(); }
// public static boolean shouldPlayDragonMusic() { return net.minecraft.client.gui.hud.BossBarHud.shouldPlayDragonMusic(); }
// public void renderBossBar(yarnwrap.client.gui.DrawContext context,int x,int y,yarnwrap.entity.boss.BossBar bossBar) { wrapperContained.renderBossBar(context.wrapperContained,x,y,bossBar.wrapperContained); }
// public static void renderBossBar(yarnwrap.client.gui.DrawContext context,int x,int y,yarnwrap.entity.boss.BossBar bossBar, ) { net.minecraft.client.gui.hud.BossBarHud.renderBossBar(context.wrapperContained,x,y,bossBar.wrapperContained); }
public boolean shouldThickenFog() { return wrapperContained.shouldThickenFog(); }
// public static boolean shouldThickenFog() { return net.minecraft.client.gui.hud.BossBarHud.shouldThickenFog(); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.gui.hud.BossBarHud.clear(); }
// public void renderBossBar(yarnwrap.client.gui.DrawContext context,int x,int y,yarnwrap.entity.boss.BossBar bossBar,int width,net.minecraft.util.Identifier[] textures,net.minecraft.util.Identifier[] notchedTextures) { wrapperContained.renderBossBar(context.wrapperContained,x,y,bossBar.wrapperContained,width,textures,notchedTextures); }
// public static void renderBossBar(yarnwrap.client.gui.DrawContext context,int x,int y,yarnwrap.entity.boss.BossBar bossBar,int width,net.minecraft.util.Identifier[] textures,net.minecraft.util.Identifier[] notchedTextures, ) { net.minecraft.client.gui.hud.BossBarHud.renderBossBar(context.wrapperContained,x,y,bossBar.wrapperContained,width,textures,notchedTextures); }

}